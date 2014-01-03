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

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.startuphouse.booking.model.Bed;

@Transactional
public interface RoomService {
	
	public Integer insertRoom(Bed bed);
	public Integer updateRoom(Bed bed);
	public Integer deleteRoom(Integer id);
	public Integer countRoomsByIdRoomType(Integer id_roomType);
	
	public List<Bed> findAll();
	public List<Bed> findRoomsByIdStructure(Integer id_structure);
	public List<Integer> findRoomIdsByIdStructure(Integer id_structure);
	public List<Bed> findRoomsByIdStructure(Integer id_structure,Integer offset,Integer rownum);
	public List<Bed> findRoomsByIdRoomType(Integer id_roomType);
		
	public Bed findRoomById(Integer id);
	public Bed findRoomByIdStructureAndName(Integer id_structure, String name);
	public Integer findIdStructureByIdRoom(Integer idRoom);
}
