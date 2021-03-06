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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startuphouse.booking.model.Facility;
import com.startuphouse.booking.model.Image;
import com.startuphouse.booking.persistence.mybatis.mappers.FacilityMapper;
import com.startuphouse.booking.persistence.mybatis.mappers.ImageMapper;
import com.startuphouse.booking.persistence.mybatis.mappers.RoomFacilityMapper;
import com.startuphouse.booking.persistence.mybatis.mappers.RoomTypeFacilityMapper;
import com.startuphouse.booking.persistence.mybatis.mappers.StructureFacilityMapper;



@Service
public class BedFacilityServiceImpl implements BedFacilityService{
	@Autowired
	private RoomFacilityMapper roomFacilityMapper = null;		
			
	@Override
	public Integer insert(Integer id_room,Integer id_facility ) {
		Map map = null;
		
		map = new HashMap();
		map.put("id_room", id_room);
		map.put("id_facility", id_facility);
		return this.getRoomFacilityMapper().insert(map);
		
	}
		
	@Override
	public List<Integer> findIdFacilityByIdRoom(Integer id_room,Integer offset, Integer rownum) {
		List<Integer> ret = null;
		Map map = null;
		
		ret = new ArrayList<Integer>();
		map = new HashMap();
		map.put("id_room",id_room );
		map.put("offset",offset );
		map.put("rownum",rownum );
		for(Map each: this.getRoomFacilityMapper().findByIdRoom(map)){
			ret.add((Integer)each.get("id_facility"));
		}
		return ret;		
	}


	@Override
	public Integer findIdByIdRoomAndIdFacility(Integer id_room,	Integer id_facility) {
		Map map = null;
		
		map = new HashMap();
		map.put("id_room", id_room);
		map.put("id_facility", id_facility);
		
		return this.getRoomFacilityMapper().findIdByIdRoomAndIdFacility(map);
	}

	@Override
	public Integer delete(Integer id) {
		
		return this.getRoomFacilityMapper().delete(id);
	}



	@Override
	public Integer deleteByIdRoom(Integer id_room) {
		
		return this.getRoomFacilityMapper().deleteByIdRoom(id_room);
	}



	@Override
	public Integer deleteByIdFacility(Integer id_facility) {		
		return this.getRoomFacilityMapper().deleteByIdFacility(id_facility);
	}

	
	public RoomFacilityMapper getRoomFacilityMapper() {
		return roomFacilityMapper;
	}


	public void setRoomFacilityMapper(RoomFacilityMapper roomFacilityMapper) {
		this.roomFacilityMapper = roomFacilityMapper;
	}

		
}