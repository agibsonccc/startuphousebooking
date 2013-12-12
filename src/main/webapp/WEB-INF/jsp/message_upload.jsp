<%--
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
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page import="net.sf.json.*" %>
<%@ page import="com.startuphouse.booking.model.internal.Message" %>
<%@ page import="com.startuphouse.booking.model.Image" %>
<%@ page import="com.startuphouse.booking.model.Facility" %>
<% Message message = (Message) request.getAttribute("message");
Image image = (Image) request.getAttribute("image");
Facility roomFacility = (Facility) request.getAttribute("roomFacility");
Facility structureFacility = (Facility) request.getAttribute("structureFacility");
JSONObject obj=new JSONObject();
obj.put("message", message);
obj.put("roomFacility", roomFacility);
obj.put("image", image);
obj.put("structureFacility", structureFacility);
out.print( obj );
//JSONUtil json = new JSONUtil();
//JSONUtil.serialize(roomfac);
//JSONArray jsonArray = JSONArray.fromObject(obj);  
%>