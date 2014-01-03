package com.startuphouse.booking.resources;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;

import javax.ws.rs.core.MediaType;




import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.startuphouse.booking.model.File;
import com.startuphouse.booking.model.Image;
import com.startuphouse.booking.service.FacilityImageService;
import com.startuphouse.booking.service.ImageService;
import com.startuphouse.booking.service.BedImageService;
import com.startuphouse.booking.service.RoomTypeImageService;
import com.startuphouse.booking.service.BedTypeService;
import com.startuphouse.booking.service.StructureImageService;
import com.sun.jersey.api.NotFoundException;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;



@Path("/roomTypeImages/")
@Component
@Scope("prototype")

public class RoomTypeImageResource {
	@Autowired
	private ImageService imageService = null;
	@Autowired
	private RoomTypeImageService roomTypeImageService = null;
	@Autowired
	private BedTypeService bedTypeService = null;	
	
	@GET
	@Path("roomType/{idRoomType}/{offset}/{rownum}")
	@Produces({MediaType.APPLICATION_JSON})	
	public List<Map> getRoomTypeImages(@PathParam("idRoomType") Integer idRoomType,@PathParam("offset") Integer offset,@PathParam("rownum") Integer rownum){
		List<Map> ret = null;
		List<Image> images = null;
		Integer id = null;
		Integer idStructure = null;
		Map map = null; 
					
		ret = new ArrayList<Map>();
		idStructure = this.getRoomTypeService().findIdStructureByIdRoomType(idRoomType);
		images = this.getImageService().findByIdStructure(idStructure,offset,rownum);
		for(Image each: images){
			id = this.getRoomTypeImageService().findIdByIdRoomTypeAndIdImage(idRoomType, each.getId());  
			map = new HashMap();
			map.put("id", id);
			map.put("idRoomType", idRoomType);
			map.put("image", each);
			ret.add(map);
		}		
		return ret;
	}	
	
	@POST	
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	public Map insertRoomTypeImage(Map map){
		Integer id_roomType = null;
		Integer id;
		Integer id_image;
		
		id_roomType = (Integer)map.get("idRoomType");
		id_image = (Integer)((Map)map.get("image")).get("id");
 		
 		this.getRoomTypeImageService().insert(id_roomType, id_image);
		id = this.getRoomTypeImageService().findIdByIdRoomTypeAndIdImage(id_roomType, id_image);
		map.put("id", id);
 		return map;
	}
	
			
	@DELETE
    @Path("{id}")
	@Produces({MediaType.APPLICATION_JSON})   
    public Integer deleteRoomTypeImage(@PathParam("id") Integer id){
    	Integer count = 0;				
		
    	count = this.getRoomTypeImageService().delete(id);
    	if(count == 0){
			throw new NotFoundException("Error: the roomType image has NOT been deleted");
		}			
		return count;
    }   

	public ImageService getImageService() {
		return imageService;
	}

	public void setImageService(ImageService imageService) {
		this.imageService = imageService;
	}

	
	public RoomTypeImageService getRoomTypeImageService() {
		return roomTypeImageService;
	}

	public void setRoomTypeImageService(RoomTypeImageService roomTypeImageService) {
		this.roomTypeImageService = roomTypeImageService;
	}

	public BedTypeService getRoomTypeService() {
		return bedTypeService;
	}

	public void setRoomTypeService(BedTypeService bedTypeService) {
		this.bedTypeService = bedTypeService;
	}	
	
	
	
}
