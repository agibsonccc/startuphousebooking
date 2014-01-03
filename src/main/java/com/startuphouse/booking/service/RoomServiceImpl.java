/*******************************************************************************
 *
 *  Copyright 2011 - Sardegna Ricerche, Distretto ICT, Pula, Italy
 *
 * Licensed under the EUPL, Version 1.1.
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 *  http://www.osor.eu/eupl
 *
 * Unless required by applicable law or agreed to in  writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 * In case of controversy the competent court is the Court of Cagliari (Italy).
 *******************************************************************************/
package com.startuphouse.booking.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startuphouse.booking.model.Facility;
import com.startuphouse.booking.model.Image;
import com.startuphouse.booking.model.Bed;
import com.startuphouse.booking.model.BedType;
import com.startuphouse.booking.persistence.mybatis.mappers.RoomMapper;
import com.startuphouse.booking.persistence.mybatis.mappers.RoomTypeMapper;


@Service
public class RoomServiceImpl implements RoomService{
	@Autowired
	private RoomMapper roomMapper = null;
	@Autowired
	private RoomTypeMapper roomTypeMapper = null;
	@Autowired
	private FacilityService facilityService = null;
	@Autowired
	private BedFacilityService bedFacilityService = null;
	@Autowired
	private ImageService imageService = null;
	@Autowired
	private BedImageService bedImageService = null;
	@Autowired
	private RoomTypeFacilityService roomTypeFacilityService = null;
	@Autowired
	private RoomTypeImageService roomTypeImageService = null;
	
	
	@Override
	public Integer findIdStructureByIdRoom(Integer idRoom) {
		return this.getRoomMapper().findIdStructureByIdRoom(idRoom);
	}

	@Override
	public Bed findRoomById(Integer id) {	
		Bed bed = null;
		BedType bedType = null;
		//List<Facility> facilities = null;
		//List<Image> images = null;
		
		bed = this.getRoomMapper().findRoomById(id);
		if (bed!=null){
			bedType = this.getRoomTypeMapper().findRoomTypeById(bed.getId_roomType());
			bed.setRoomType(bedType);	
			//facilities = this.getFacilityService().findCheckedByIdRoom(id);
			//room.setFacilities(facilities);
			//images = this.getImageService().findCheckedByIdRoom(id);
			//room.setImages(images);
		}
		return bed;
	}

	@Override
	public Integer updateRoom(Bed bed) {
		return this.getRoomMapper().updateRoom(bed);
	}	

	@Override
	public Integer deleteRoom(Integer id) {		
		Integer ret = 0;		
		
		this.getRoomFacilityService().deleteByIdRoom(id);
		this.getRoomImageService().deleteByIdRoom(id);
		ret = this.getRoomMapper().deleteRoom(id);
		return ret;
	}

	public List<Bed> findAll() {
		return this.getRoomMapper().findAll();
	}
	
	@Override
	public List<Bed> findRoomsByIdStructure(Integer id_structure) {	
		List<Bed> beds = null;
		BedType bedType = null;
		
		beds = this.getRoomMapper().findRoomsByIdStructure(id_structure);
		for(Bed each: beds){
			bedType = this.getRoomTypeMapper().findRoomTypeById(each.getId_roomType());
			//roomType.setImages(this.getImageService().findCheckedByIdRoomType(roomType.getId()));
			each.setRoomType(bedType);
			//each.setImages(this.getImageService().findCheckedByIdRoom(each.getId()));
		}
		return beds;
	}
	
	@Override
	public List<Integer> findRoomIdsByIdStructure(Integer id_structure) {	
		return this.getRoomMapper().findRoomIdsByIdStructure(id_structure);
	}

	@Override
	public List<Bed> findRoomsByIdStructure(Integer id_structure, Integer offset, Integer rownum) {
		Map map = null;
		
		map = new HashMap();
		map.put("id_structure",id_structure );
		map.put("offset", offset);
		map.put("rownum",rownum );
		return this.getRoomMapper().findRoomsByIdStructureAndOffsetAndRownum(map);
	}
	
	public List<Bed> findRoomsByIdRoomType(Integer id_roomType){
		List<Bed> beds = null;
		BedType bedType = null;
		
		beds = this.getRoomMapper().findRoomsByIdRoomType(id_roomType);
		for(Bed each: beds){
			bedType = this.getRoomTypeMapper().findRoomTypeById(each.getId_roomType());
			each.setRoomType(bedType);
		}
		return beds;	
	}

	@Override
	public Bed findRoomByIdStructureAndName(Integer id_structure, String name ){	
		Map map = null;
		
		map = new HashMap();
		map.put("id_structure", id_structure);
		map.put("name", name);		
		
		return this.getRoomMapper().findRoomByIdStructureAndName(map);
	}
	
	@Override
	public Integer countRoomsByIdRoomType(Integer id_roomType) {
		return this.getRoomMapper().countRoomsByIdRoomType(id_roomType);
	}

	@Override
	public Integer insertRoom(Bed bed) {	
		Integer count;
		Integer id_room;
		Integer id_roomType;
				
		count = this.getRoomMapper().insertRoom(bed);
		id_room = bed.getId();
		id_roomType = bed.getRoomType().getId();
		
		for(Integer id_facility: this.getRoomTypeFacilityService().findIdFacilityByIdRoomType(id_roomType, 0, 10000)){
			this.getRoomFacilityService().insert(id_room, id_facility);
			
		}
		for(Integer id_image: this.getRoomTypeImageService().findIdImageByIdRoomType(id_roomType, 0, 10000)){
			this.getRoomImageService().insert(id_room, id_image);
		}
		
		return count;
	}
	
	public RoomMapper getRoomMapper() {
		return roomMapper;
	}
	public void setRoomMapper(RoomMapper roomMapper) {
		this.roomMapper = roomMapper;
	}
	public RoomTypeMapper getRoomTypeMapper() {
		return roomTypeMapper;
	}
	public void setRoomTypeMapper(RoomTypeMapper roomTypeMapper) {
		this.roomTypeMapper = roomTypeMapper;
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
	public BedImageService getRoomImageService() {
		return bedImageService;
	}
	public void setRoomImageService(BedImageService bedImageService) {
		this.bedImageService = bedImageService;
	}
	public BedFacilityService getRoomFacilityService() {
		return bedFacilityService;
	}
	public void setRoomFacilityService(BedFacilityService bedFacilityService) {
		this.bedFacilityService = bedFacilityService;
	}

	public RoomTypeFacilityService getRoomTypeFacilityService() {
		return roomTypeFacilityService;
	}

	public void setRoomTypeFacilityService(	RoomTypeFacilityService roomTypeFacilityService) {
		this.roomTypeFacilityService = roomTypeFacilityService;
	}

	public RoomTypeImageService getRoomTypeImageService() {
		return roomTypeImageService;
	}

	public void setRoomTypeImageService(RoomTypeImageService roomTypeImageService) {
		this.roomTypeImageService = roomTypeImageService;
	}
	
	
	
}