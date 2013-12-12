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
import com.startuphouse.booking.persistence.mybatis.mappers.StructureFacilityMapper;



@Service
public class StructureFacilityServiceImpl implements StructureFacilityService{
	@Autowired
	private StructureFacilityMapper structureFacilityMapper = null;
			
	@Override
	public Integer insert(Integer id_structure,Integer id_facility) {
		Map map = null;
		
		map = new HashMap();
		map.put("id_structure", id_structure);
		map.put("id_facility", id_facility);
		return this.getStructureFacilityMapper().insert(map);
	}
	
	
	
		
	@Override
	public List<Integer> findIdFacilityByIdStructure(Integer id_structure,Integer offset, Integer rownum) {
		List<Integer> ret = null;
		Map map = null;
		
		ret = new ArrayList<Integer>();
		map = new HashMap();
		map.put("id_structure", id_structure);
		map.put("offset", offset);
		map.put("rownum", rownum);
		for(Map each: this.getStructureFacilityMapper().findByIdStructure(map)){
			ret.add((Integer)each.get("id_facility"));
		}
		
		return ret;
	}

	

	@Override
	public Integer findIdByIdStructureAndIdFacility(Integer id_structure,Integer id_facility) {
		Map map = null;
		
		map = new HashMap();
		map.put("id_structure", id_structure);
		map.put("id_facility", id_facility);
		
		return this.getStructureFacilityMapper().findIdByIdStructureAndIdFacility(map);
	}

    


	@Override
	public Integer delete(Integer id) {
		
		return this.getStructureFacilityMapper().delete(id);
	}




	@Override
	public Integer deleteByIdStructure(Integer id_structure) {
		
		return this.getStructureFacilityMapper().deleteByIdStructure(id_structure);
	}




	@Override
	public Integer deleteByIdFacility(Integer id_facility) {
		
		return this.getStructureFacilityMapper().deleteByIdFacility(id_facility);
	}




	
	public StructureFacilityMapper getStructureFacilityMapper() {
		return structureFacilityMapper;
	}

	public void setStructureFacilityMapper(StructureFacilityMapper structureFacilityMapper) {
		this.structureFacilityMapper = structureFacilityMapper;
	}
		
}