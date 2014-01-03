package com.startuphouse.booking.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.FacetField.Count;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.startuphouse.booking.model.Bed;
import com.startuphouse.booking.service.BookingService;
import com.startuphouse.booking.service.FacilityService;
import com.startuphouse.booking.service.ImageService;
import com.startuphouse.booking.service.RoomService;
import com.startuphouse.booking.service.BedTypeService;
import com.sun.jersey.api.NotFoundException;


@Path("/rooms/")
@Component
@Scope("prototype")
public class RoomResource {
	
	@Autowired
    private RoomService roomService = null;
	@Autowired
    private BedTypeService bedTypeService = null;
	@Autowired
    private BookingService bookingService = null;
	@Autowired
	private FacilityService facilityService = null;
	@Autowired
	private ImageService imageService = null;
	@Autowired
    private SolrServer solrServerRoom = null;
	
	
	@PostConstruct
    public void init(){
    	List<Bed> beds = null;
    	
    	beds = this.getRoomService().findAll();
    	try {
			this.getSolrServerRoom().addBeans(beds);
			this.getSolrServerRoom().commit();
		} catch (SolrServerException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	@GET
    @Path("structure/{idStructure}/search/{start}/{rows}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Bed> search(@PathParam("idStructure") Integer idStructure,@PathParam("start") Integer start,@PathParam("rows") Integer rows, @QueryParam("term") String term){
        List<Bed> beds = null;
        SolrQuery query = null;
        QueryResponse rsp = null;
        SolrDocumentList solrDocumentList = null;
        SolrDocument solrDocument = null;
        Bed aRoom = null;
        Integer id;             
       
        if(term.trim().equals("")){
        	term = "*:*";
        }
        term = term + " AND id_structure:" + idStructure.toString();
        query = new SolrQuery();   		
        query.setQuery(term);
        query.setStart(start);
        query.setRows(rows);
              
        try {
			rsp = this.getSolrServerRoom().query(query);
			
		} catch (SolrServerException e) {
			e.printStackTrace();			
		}

        beds = new ArrayList<Bed>();
        if(rsp!=null){
    	   solrDocumentList = rsp.getResults();
           for(int i = 0; i <solrDocumentList.size(); i++){
        	   solrDocument = solrDocumentList.get(i);
        	   id = (Integer)solrDocument.getFieldValue("id");
            // System.out.println("----> "+solrDocument.getFieldValues("text")+" <-----");
        	   aRoom = this.getRoomService().findRoomById(id);
        	   aRoom.setRoomType(this.getRoomTypeService().findRoomTypeById(aRoom.getId_roomType()));
        	   beds.add(aRoom);
           }  
       }       
       return beds;          
    }
    
	 @GET
		@Path("structure/{idStructure}/suggest")
		@Produces({ MediaType.APPLICATION_JSON })
		public List<String> suggest(@PathParam("idStructure") Integer idStructure, @QueryParam("term") String term) {
			SolrQuery query = null;
			QueryResponse rsp = null;
			List<String> ret = null;
			List<Count> values = null;
			
			query = new SolrQuery();
			query.setFacet(true);
			query.setQuery("*:* AND id_structure:" + idStructure.toString());

			query.addFacetField("text");
			term = term.toLowerCase();
			query.setFacetPrefix(term);

			try {
				rsp = this.getSolrServerRoom().query(query);
			} catch (SolrServerException e) {
				e.printStackTrace();
			}
			ret = new ArrayList<String>();

			if (rsp != null) {
				values = rsp.getFacetField("text").getValues();
				if(values!=null){
					for(Count each: values){
						if(each.getCount()>0){
							ret.add(each.getName());
						}
					}	
				}					
			}
			return ret;
		}
	
	@GET
	@Path("{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Bed getRoom(@PathParam("id") Integer id){
		Bed ret = null;
		
		ret = this.getRoomService().findRoomById(id);
		ret.setRoomType(this.getRoomTypeService().findRoomTypeById(ret.getId_roomType()));
		return ret;
	}
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Bed save(Bed bed) {
		Integer idRoomType = 0;

		idRoomType = bed.getId_roomType();
		// if (idRoomType != null) {
		try {
			bed.setRoomType(this.getRoomTypeService().findRoomTypeById(idRoomType));
			this.getRoomService().insertRoom(bed);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			this.getSolrServerRoom().addBean(bed);
			this.getSolrServerRoom().commit();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SolrServerException e) {
			e.printStackTrace();
		}
		return bed;
	}
   
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Bed update(Bed bed) {        
        
    	try {
    	this.getRoomService().updateRoom(bed);
    	}catch(Exception ex){}
    	try {
    		this.getSolrServerRoom().addBean(bed);			
    		this.getSolrServerRoom().commit();			
    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (SolrServerException e) {
    		e.printStackTrace();
    	}
    	bed.setRoomType(this.getRoomTypeService().findRoomTypeById(bed.getId_roomType()));
        return bed;
    }
    
    @DELETE
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})   
    public  Integer delete(@PathParam("id") Integer id){
    	Integer count = 0;
		
    	if(this.getBookingService().countBookingsByIdRoom(id)>0){
    		throw new NotFoundException("The room you are trying to delete has links to one or more bookings." +
					" Please try to delete the associated bookings before.");
		}
		count = this.getRoomService().deleteRoom(id);
		if(count == 0){
			throw new NotFoundException("Error: the room has NOT been deleted");
		}
		try {
			this.getSolrServerRoom().deleteById(id.toString());
			this.getSolrServerRoom().commit();
		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
    }
	
	public RoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	public BedTypeService getRoomTypeService() {
		return bedTypeService;
	}
	public void setRoomTypeService(BedTypeService bedTypeService) {
		this.bedTypeService = bedTypeService;
	}
	public BookingService getBookingService() {
		return bookingService;
	}
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	public FacilityService getFacilityService() {
		return facilityService;
	}
	public void setFacilityService(FacilityService facilityService) {
		this.facilityService = facilityService;
	}
	public ImageService getImageService() {
		return imageService;
	}
	public void setImageService(ImageService imageService) {
		this.imageService = imageService;
	}
	public SolrServer getSolrServerRoom() {
		return solrServerRoom;
	}
	public void setSolrServerRoom(SolrServer solrServerRoom) {
		this.solrServerRoom = solrServerRoom;
	}
	
}