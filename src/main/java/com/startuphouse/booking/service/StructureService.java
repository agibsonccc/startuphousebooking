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

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.startuphouse.booking.model.Booking;
import com.startuphouse.booking.model.Extra;
import com.startuphouse.booking.model.BedType;
import com.startuphouse.booking.model.Structure;
import com.startuphouse.booking.model.listini.Convention;

@Transactional
public interface StructureService {
	public List<Structure> findAll();
	public Double calculateExtraItemUnitaryPrice(Integer id_structure, Date dateIn, Date dateOut, BedType bedType, Convention convention, Extra extra);
	
	public void addPriceListsForSeason(Integer id_structure, Integer id_season);
	public void addPriceListsForRoomType(Integer id_structure, Integer id_roomType);
	public void addPriceListsForConvention(Integer id_structure, Integer id_convention);
	public void modifyPriceListsForExtra(Integer id_structure, Integer id_extra);
	
	public Boolean hasRoomFreeInPeriod(Integer id_structure,Integer roomId, Date dateIn, Date dateOut);
	public Boolean hasRoomFreeForBooking(Integer id_structure,Booking booking);
	
	public Structure findStructureByIdUser(Integer id_user);
	public Structure findStructureById(Integer id);
	public Integer updateStructure(Structure structure);
	public Integer insertStructure(Structure structure);
}