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

import com.startuphouse.booking.model.listini.Season;


@Transactional
public interface SeasonService {
	
	public List<Season> findAll();
	public List<Season> findSeasonsByIdStructure(Integer structureId);
	public List<Season> findSeasonsByYear(Integer structureId,Integer year);
	
	public Season findSeasonById(Integer seasonId);
	public Season findSeasonByName(Integer structureId,String name);
	public Season findSeasonByDate(Integer structureId, Date date);
	
	public Boolean checkYears(Season season);
	public Boolean includesDate(Season season, Date date);
	public Integer insertSeason(Season season);
	public Integer updateSeason(Season season);
	public Integer deleteSeason(Integer seasonId);
}