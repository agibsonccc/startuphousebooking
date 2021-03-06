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
package com.startuphouse.booking.persistence.mybatis.mappers;

import java.util.List;
import java.util.Map;

import com.startuphouse.booking.model.BedType;

public interface RoomTypeMapper {
	public Integer insertRoomType(BedType bedType);
	public Integer updateRoomType(BedType bedType);
	public Integer deleteRoomType(Integer id);
	
	public List<BedType> findAll();
	public List<BedType> findRoomTypesByIdStructure(Integer id_structure);
	public List<Integer> findRoomTypeIdsByIdStructure(Integer id_structure);
	public Integer findIdStructureByIdRoomType(Integer idRoomType);
	
	public List<BedType> findRoomTypesByIdStructureAndOffsetAndRownum(Map map);
	public List<BedType> search(Map map);
	
	public BedType findRoomTypeById(Integer id);
	public BedType findRoomTypeByIdStructureAndName(Map map);
}
