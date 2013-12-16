package org.apache.jsp.WEB_002dINF.jsp.contents;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booking_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_date_name_format_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_select_size_required_name_multiple_list_label_headerKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_var_value_status;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_default_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_select_size_required_name_multiple_list_label_id_headerKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_var_action_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_date_name_format_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_select_size_required_name_multiple_list_label_headerKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_var_value_status = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_default_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_select_size_required_name_multiple_list_label_id_headerKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_iterator_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_var_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_date_name_format_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_select_size_required_name_multiple_list_label_headerKey_nobody.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_iterator_var_value_status.release();
    _jspx_tagPool_s_property_value_default_nobody.release();
    _jspx_tagPool_s_text_name_nobody.release();
    _jspx_tagPool_s_select_size_required_name_multiple_list_label_id_headerKey_nobody.release();
    _jspx_tagPool_s_iterator_var_value.release();
    _jspx_tagPool_s_url_var_action_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write(" ");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<style>\n");
      out.write(".type_rooms{\n");
      out.write("display: none;\n");
      out.write("}\n");
      out.write(".yform .type-select select {\n");
      out.write("width:80%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\t<div class=\"validationErrors\"></div>\n");
      out.write("      <form class=\"yform json\" action=\"saveUpdateBooking.action\">\n");
      out.write("        <input type=\"hidden\" name=\"redirect_form\" value=\"home.action?sect=planner\" />\n");
      out.write("                             <input type=\"hidden\" name=\"booking.id\" value=\"");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("                             <div class=\"subcolumns_oldgecko\">\n");
      out.write("                             <fieldset>\n");
      out.write("    \t\t\t\t\t\t\t<legend>");
      if (_jspx_meth_s_text_0(_jspx_page_context))
        return;
      out.write(":</legend>\n");
      out.write("                             <div class=\"c20l\">\n");
      out.write("                             <div class=\"subcl type-select\">\n");
      out.write("               \t\t\t\t <label for=\"sel_rooms_list\">");
      if (_jspx_meth_s_text_1(_jspx_page_context))
        return;
      out.write(" <sup title=\"");
      if (_jspx_meth_s_text_2(_jspx_page_context))
        return;
      out.write(".\">*</sup> </label>\n");
      out.write("                \t\t\t <select size=\"1\" id=\"sel_rooms_list\" class=\"required number\" name=\"booking.room.id\">\n");
      out.write("                  \t\t\t ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    \t\t");
      if (_jspx_meth_s_if_1(_jspx_page_context))
        return;
      out.write("\t\n");
      out.write("                    \t\t</select>\n");
      out.write("            \t\t\t\t</div>\n");
      out.write("            \t\t\t\t</div>\n");
      out.write("            \t\t\t\t<div class=\"c20l\">\n");
      out.write("            \t\t\t\t<div class=\"subcl type-text\">\n");
      out.write("            \t\t\t\t<label for=\"datepicker\">");
      if (_jspx_meth_s_text_4(_jspx_page_context))
        return;
      out.write(": <sup title=\"");
      if (_jspx_meth_s_text_5(_jspx_page_context))
        return;
      out.write(".\">*</sup> </label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"booking.dateIn\" class=\"datepicker required\"  value=\"");
      if (_jspx_meth_s_date_0(_jspx_page_context))
        return;
      out.write("\" style=\"display: inline;\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"c20l\">\n");
      out.write("                             <span id=\"date_booking\" ></span><span id=\"duration\"></span>\n");
      out.write("                             <div class=\"subcl type-select\">\n");
      out.write("                             <label for=\"duration\">");
      if (_jspx_meth_s_text_6(_jspx_page_context))
        return;
      out.write(" <sup title=\"");
      if (_jspx_meth_s_text_7(_jspx_page_context))
        return;
      out.write(".\">*</sup> </label>\n");
      out.write("                             <select name=\"numNights\" class=\"confirm\" id=\"booking_duration\" >\n");
      out.write("                             <option selected=\"selected\" value=\"");
      if (_jspx_meth_s_property_3(_jspx_page_context))
        return;
      out.write('"');
      out.write('>');
      if (_jspx_meth_s_property_4(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("                             <option value=\"1\">1 </option>\n");
      out.write("                             <option value=\"2\">2 </option>\n");
      out.write("                             <option value=\"3\">3 </option>\n");
      out.write("                             <option value=\"4\">4 </option>\n");
      out.write("                             <option value=\"5\">5 </option>\n");
      out.write("                             <option value=\"6\">6 </option>\n");
      out.write("                             <option value=\"7\">7 </option>\n");
      out.write("                             <option value=\"8\">8 </option>\n");
      out.write("                             <option value=\"9\">9 </option>\n");
      out.write("                       \t\t <option value=\"10\">10 </option>\n");
      out.write("                       \t\t <option value=\"11\">11 </option>\n");
      out.write("                       \t\t <option value=\"12\">12 </option>\n");
      out.write("                       \t\t <option value=\"13\">13 </option>\n");
      out.write("                       \t\t <option value=\"14\">14 </option>\n");
      out.write("                       \t\t <option value=\"15\">15 </option>\n");
      out.write("                       \t\t <option value=\"16\">16 </option>\n");
      out.write("                       \t\t <option value=\"17\">17 </option>\n");
      out.write("                       \t\t <option value=\"18\">18 </option>\n");
      out.write("                       \t\t <option value=\"19\">19 </option>\n");
      out.write("                       \t\t <option value=\"20\">20 </option>\n");
      out.write("                       \t\t <option value=\"21\">21 </option>\n");
      out.write("                       \t\t <option value=\"22\">22 </option>\n");
      out.write("                       \t\t <option value=\"23\">23 </option>\n");
      out.write("                       \t\t <option value=\"24\">24 </option>\n");
      out.write("                       \t\t <option value=\"25\">25 </option>\n");
      out.write("                       \t\t <option value=\"26\">26 </option>\n");
      out.write("                       \t\t <option value=\"27\">27 </option>\n");
      out.write("                       \t\t <option value=\"28\">28 </option>\n");
      out.write("                       \t\t <option value=\"29\">29 </option>\n");
      out.write("                       \t\t <option value=\"30\">30 </option>\n");
      out.write("                       \t\t <option value=\"31\">31 </option>\n");
      out.write("                       \t\t <option value=\"32\">32 </option>\n");
      out.write("                       \t\t <option value=\"33\">33 </option>\n");
      out.write("                       \t\t <option value=\"34\">34 </option>\n");
      out.write("                       \t\t <option value=\"35\">35 </option>\n");
      out.write("                       \t\t <option value=\"36\">36 </option>\n");
      out.write("                       \t\t <option value=\"37\">37 </option>\n");
      out.write("                       \t\t <option value=\"38\">38 </option>\n");
      out.write("                       \t\t <option value=\"39\">39 </option>\n");
      out.write("                       \t\t <option value=\"40\">40 </option>\n");
      out.write("                       \t\t <option value=\"41\">41 </option>\n");
      out.write("                       \t\t <option value=\"42\">42 </option>\n");
      out.write("                       \t\t <option value=\"43\">43 </option>\n");
      out.write("                       \t\t <option value=\"44\">44 </option>\n");
      out.write("                       \t\t <option value=\"45\">45 </option>\n");
      out.write("                       \t\t <option value=\"46\">46 </option>\n");
      out.write("                       \t\t <option value=\"47\">47 </option>\n");
      out.write("                       \t\t <option value=\"48\">48 </option>\n");
      out.write("                       \t\t <option value=\"49\">49 </option>\n");
      out.write("                       \t\t <option value=\"50\">50 </option>\n");
      out.write("                       \t\t <option value=\"51\">51 </option>\n");
      out.write("                       \t\t <option value=\"52\">52 </option>\n");
      out.write("                       \t\t <option value=\"53\">53 </option>\n");
      out.write("                       \t\t <option value=\"54\">54 </option>\n");
      out.write("                       \t\t <option value=\"55\">55 </option>\n");
      out.write("                       \t\t <option value=\"56\">56 </option>\n");
      out.write("                       \t\t <option value=\"57\">57 </option>\n");
      out.write("                       \t\t <option value=\"58\">58 </option>\n");
      out.write("                       \t\t <option value=\"59\">59 </option>\n");
      out.write("                       \t\t <option value=\"60\">60 </option>\n");
      out.write("                       \t\t </select>\n");
      out.write("                             </div>\n");
      out.write("                             </div>\n");
      out.write("                            <div class=\"c20l\">\n");
      out.write("            \t\t\t\t<div class=\"subcl type-text\">\n");
      out.write("            \t\t\t\t<label for=\"datepicker\">");
      if (_jspx_meth_s_text_8(_jspx_page_context))
        return;
      out.write(": <sup title=\"");
      if (_jspx_meth_s_text_9(_jspx_page_context))
        return;
      out.write(".\">*</sup> </label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"booking.dateOut\" class=\"datepicker required\"  value=\"");
      if (_jspx_meth_s_date_1(_jspx_page_context))
        return;
      out.write("\" style=\"display: inline;\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"c20l\">\n");
      out.write("                             \n");
      out.write("                             <div class=\"subcl type-select\">\n");
      out.write("                             <!--\n");
      out.write("                             <label for=\"confirm\">");
      if (_jspx_meth_s_text_10(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("                             <select name=\"booking.status\" class=\"confirm\" id=\"confirm\">\n");
      out.write("                             <option selected=\"selected\" value=\"");
      if (_jspx_meth_s_property_5(_jspx_page_context))
        return;
      out.write('"');
      out.write('>');
      if (_jspx_meth_s_text_11(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("                             <option value=\"confirmed\">");
      if (_jspx_meth_s_text_12(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("                             <option value=\"provisional\">");
      if (_jspx_meth_s_text_13(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("                             <option value=\"checkedin\">");
      if (_jspx_meth_s_text_14(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("                             <option value=\"checkedout\">");
      if (_jspx_meth_s_text_15(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("                             </select>\n");
      out.write("                               -->\n");
      out.write("\t                              ");
      if (_jspx_meth_s_select_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                             </div>\n");
      out.write("                 </fieldset>         \n");
      out.write("              </div>\n");
      out.write("              <div class=\"subcolumns_oldgecko\">\n");
      out.write("               <div class=\"c50l\">\n");
      out.write("              <fieldset>\n");
      out.write("    <legend>");
      if (_jspx_meth_s_text_16(_jspx_page_context))
        return;
      out.write(":</legend>\n");
      out.write("                <input type=\"hidden\" name=\"booking.booker.id\" value=\"");
      if (_jspx_meth_s_property_6(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("\t               <div class=\"type-text\"><label for=\"lname\">");
      if (_jspx_meth_s_text_17(_jspx_page_context))
        return;
      out.write(": <sup title=\"");
      if (_jspx_meth_s_text_18(_jspx_page_context))
        return;
      out.write(".\">*</sup> </label> \n");
      out.write("\t               <input type=\"text\" name=\"booking.booker.lastName\" id=\"lname\" value=\"");
      if (_jspx_meth_s_property_7(_jspx_page_context))
        return;
      out.write("\" class=\"required\"/></div>\n");
      out.write("\n");
      out.write("                  <div class=\"type-text\"><label for=\"fname\">");
      if (_jspx_meth_s_text_19(_jspx_page_context))
        return;
      out.write(": <sup title=\"");
      if (_jspx_meth_s_text_20(_jspx_page_context))
        return;
      out.write(".\">*</sup> </label> \n");
      out.write("                  <input type=\"text\" name=\"booking.booker.firstName\" id=\"fname\" value=\"");
      if (_jspx_meth_s_property_8(_jspx_page_context))
        return;
      out.write("\" class=\"required\"/></div>\n");
      out.write("                  \n");
      out.write("                  <a name=\"top_accordion\"></a>\n");
      out.write("               \t<div id=\"accordion\">\n");
      out.write("              \t\t<h2><a href=\"#top_accordion\">");
      if (_jspx_meth_s_text_21(_jspx_page_context))
        return;
      out.write("</a></h2>\n");
      out.write("               \t\t<div>\n");
      out.write("               \t\t\t<div class=\"type-text\">\n");
      out.write("                  \t\t\t\n");
      out.write("                 \t\t</div>\n");
      out.write("               \t\t\t<div class=\"type-text\"><label for=\"phone\">");
      if (_jspx_meth_s_text_22(_jspx_page_context))
        return;
      out.write(":</label> \n");
      out.write("                  \t\t\t<input type=\"text\" name=\"booking.booker.phone\" class=\"validPhone\" id=\"phone\" value=\"");
      if (_jspx_meth_s_property_9(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("                  \t\t</div>\n");
      out.write("               \t\t\t<div class=\"type-text\"><label for=\"email\">");
      if (_jspx_meth_s_text_23(_jspx_page_context))
        return;
      out.write(":</label> \n");
      out.write("                 \t\t\t<input type=\"text\" name=\"booking.booker.email\" class=\"email\" id=\"email\" value=\"");
      if (_jspx_meth_s_property_10(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("                 \t\t</div>\n");
      out.write("                   \t\t<div class=\"type-text\"><label for=\"notes\">Note:</label> \n");
      out.write("                  \t\t  \t<textarea name=\"booking.notes\" id=\"notes\">");
      if (_jspx_meth_s_property_11(_jspx_page_context))
        return;
      out.write("</textarea>\n");
      out.write("                  \t\t  \t<input type=\"hidden\" name=\"booking.booker.address\" class=\"validPhone\" id=\"phone\" value=\"");
      if (_jspx_meth_s_property_12(_jspx_page_context))
        return;
      out.write("\"/>               \t\t\n");
      out.write("                 \t\t\t<input type=\"hidden\" name=\"booking.booker.zipCode\" id=\"zipCode\" value=\"");
      if (_jspx_meth_s_property_13(_jspx_page_context))
        return;
      out.write("\" />              \n");
      out.write("                  \t\t\t<input type=\"hidden\" name=\"booking.booker.country\" id=\"country\" value=\"");
      if (_jspx_meth_s_property_14(_jspx_page_context))
        return;
      out.write("\"/>               \n");
      out.write("                 \t\t\t<input type=\"hidden\" name=\"booking.booker.idNumber\" id=\"idNumber\" value=\"");
      if (_jspx_meth_s_property_15(_jspx_page_context))
        return;
      out.write("\" />                 \t\n");
      out.write("                 \t\t\t<input type=\"hidden\" name=\"booking.booker.birthDate\" id=\"birthDate\" value=\"");
      if (_jspx_meth_s_property_16(_jspx_page_context))
        return;
      out.write("\" />           \n");
      out.write("                 \t\t\t<input type=\"hidden\" name=\"booking.booker.birthPlace\" id=\"birthPlace\" value=\"");
      if (_jspx_meth_s_property_17(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("                  \t  \t</div>\n");
      out.write("               \t\t</div>\n");
      out.write("                </div>\n");
      out.write("                <!--  END ACCORDION  -->\n");
      out.write("                \n");
      out.write("                <!-- START SECOND ACCORDION -->  \n");
      out.write("                      <div class=\"type-select guests-select\">\n");
      out.write("                      \t");
      if (_jspx_meth_s_select_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t        \n");
      out.write("                \t  </div>                 \n");
      out.write("                  \t\n");
      out.write("                  \t  <!--  END SECOND ACCORDION -->\t  \n");
      out.write("                  <div class=\"type-text\"><hr/></div>\t  \n");
      out.write("                  <div class=\"type-select extraCheckList\"><label for=\"\">Extras:</label>\n");
      out.write("                      \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extraQuantity_select.jsp", out, false);
      out.write("     \t  \n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                  <div class=\"type-select\">\n");
      out.write("                  \t<label for=\"convention\">");
      if (_jspx_meth_s_text_24(_jspx_page_context))
        return;
      out.write(": </label> \n");
      out.write("                    <select name=\"booking.convention.id\" id=\"convention\" class=\"required\">\n");
      out.write("                    ");
      if (_jspx_meth_s_iterator_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                   \t</select>\n");
      out.write("                  </div>  \n");
      out.write("                           \n");
      out.write("                </fieldset>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"c5l\">\n");
      out.write("                &nbsp;\n");
      out.write("                </div>\n");
      out.write("                <div class=\"book_details c45l\">\n");
      out.write("                  <fieldset><legend>");
      if (_jspx_meth_s_text_25(_jspx_page_context))
        return;
      out.write("</legend>\n");
      out.write("                  \t<div class=\"type-text\"><span>");
      if (_jspx_meth_s_text_26(_jspx_page_context))
        return;
      out.write(": </span><div class=\"c33r\"><span id=\"price_room\" >");
      if (_jspx_meth_s_property_20(_jspx_page_context))
        return;
      out.write("</span> &euro; </div></div>\n");
      out.write("                  \t<div class=\"type-text\"><span>");
      if (_jspx_meth_s_text_27(_jspx_page_context))
        return;
      out.write(": </span><div class=\"c33r\"><span id=\"extras_room\" >");
      if (_jspx_meth_s_property_21(_jspx_page_context))
        return;
      out.write("</span> &euro; </div></div>\n");
      out.write("                  \t<div class=\"type-text\"><hr/></div>\n");
      out.write("                  \t<div class=\"type-text\">\n");
      out.write("                  \t  <div class=\"c80r\">\n");
      out.write("             \t\t\t<a href=\"#adjustment_anchor\" class=\"add_adjustment\" title=\"add adjustment\"><img src=\"images/add-icon.png\" alt=\"Add Adjustment\" />");
      if (_jspx_meth_s_text_28(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("              \t\t  \t<a name=\"adjustment_anchor\"></a>\n");
      out.write("              \t\t  </div>\n");
      out.write("              \t\t</div>\n");
      out.write("              \t\t");
      if (_jspx_meth_s_iterator_2(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                 \t<div class=\"type-text\">\n");
      out.write("                 \t  <span>");
      if (_jspx_meth_s_text_32(_jspx_page_context))
        return;
      out.write(": </span><div class=\"c33r\"><span class=\"subtotal_room\" >");
      if (_jspx_meth_s_property_28(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                 \t  </span> &euro;<!-- <input type=\"hidden\" id=\"subtotal_room\" name=\"booking.subtotal\" value=\"");
      if (_jspx_meth_s_property_29(_jspx_page_context))
        return;
      out.write("\" /> --></div>\n");
      out.write("                 \t</div>\n");
      out.write("                  \t<div class=\"type-text\"><hr/></div>\n");
      out.write("                    <div class=\"type-text\">\n");
      out.write("                     \t<div class=\"c80r\">\n");
      out.write("             \t\t\t \t<a href=\"#payment_anchor\" class=\"add_payment\" title=\"add payment\"><img src=\"images/add-icon.png\" alt=\"Add Payment\" />");
      if (_jspx_meth_s_text_33(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("              \t\t\t\t<a name=\"payment_anchor\"></a>\n");
      out.write("              \t\t\t</div>\n");
      out.write("              \t\t</div>\n");
      out.write("              \t\t\n");
      out.write("              \t\t\n");
      out.write("              \t\t\n");
      out.write("              \t\t\n");
      out.write("              \t\t\n");
      out.write("              \t\t\n");
      out.write("              \t\t");
      if (_jspx_meth_s_iterator_3(_jspx_page_context))
        return;
      out.write("<!--\n");
      out.write("              \t\t");
      if (_jspx_meth_s_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("              \t\t--><a name=\"bottom_anchor_payment\"></a> \n");
      out.write("              \t\t<div class=\"type-text\">\n");
      out.write("              \t\t\t<span>");
      if (_jspx_meth_s_text_37(_jspx_page_context))
        return;
      out.write(": </span>\n");
      out.write("              \t\t\t<div class=\"c33r\"><span class=\"balance_room\" >");
      if (_jspx_meth_s_property_36(_jspx_page_context))
        return;
      out.write("</span> &euro;<input type=\"hidden\" id=\"balance_room\" value=\"");
      if (_jspx_meth_s_property_37(_jspx_page_context))
        return;
      out.write("\" /></div></div>\n");
      out.write("                  \n");
      out.write("              \t\t\n");
      out.write("              \t\t\n");
      out.write("                      <!--<div class=\"c50r\">\n");
      out.write("                      \t<div class=\"c10r\">&euro;</div>\n");
      out.write("                      \t<div class=\"c40l\"><input type=\"text\" name=\"pay_adjustment[]\" id=\"pay_adjustment\" /></div>\n");
      out.write("                      \t<div class=\"c40r\"><input type=\"text\" name=\"pay_value_adjustment[]\"  id=\"pay_value_adjustment\" class=\"pay_value_adjustment digits\"/></div>\n");
      out.write("                      </div>\n");
      out.write("                    <div class=\"type-text\"><span>Balance Due: </span><div class=\"c33r\"><span class=\"balance_room\" >");
      if (_jspx_meth_s_property_38(_jspx_page_context))
        return;
      out.write("</span> &euro;<input type=\"hidden\" id=\"balance_room\" value=\"");
      if (_jspx_meth_s_property_39(_jspx_page_context))
        return;
      out.write("\" /></div></div>\n");
      out.write("                  \n");
      out.write("                  -->\n");
      out.write("                  </fieldset>\n");
      out.write("              \t  <div class=\"type-button\">\n");
      out.write("               \t\t<button class=\"btn_save\">");
      if (_jspx_meth_s_text_38(_jspx_page_context))
        return;
      out.write("</button>\n");
      out.write("               \t\t<a class=\"canc_booking\" href=\"");
      if (_jspx_meth_s_property_40(_jspx_page_context))
        return;
      out.write("?sect=planner\">");
      if (_jspx_meth_s_text_39(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("               \t\t");
      if (_jspx_meth_s_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \t  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("           \n");
      out.write("                    <div  class=\"subcolumns adjustment_row\" id=\"to_add_adjustment\" style=\"display: none;\">\n");
      out.write("                  \t     <div class=\"c40l\"><div class=\"subcl type-text\"><span>");
      if (_jspx_meth_s_text_41(_jspx_page_context))
        return;
      out.write(":</span><input type=\"text\" name=\"booking.adjustments[__PVALUE__].description\" class=\"require\" style=\"width: 90%;\" /></div></div>\n");
      out.write("                  \t  \t<div class=\"c33l\"><div class=\"subcl type-text\"><span>");
      if (_jspx_meth_s_text_42(_jspx_page_context))
        return;
      out.write("(&euro;):</span><input type=\"text\" name=\"booking.adjustments[__PVALUE__].amount\"  class=\"extra_value_adjustment validPrice\"/></div></div>\n");
      out.write("                  \t  \t <div class=\"c25r\"><label>&nbsp;</label><a href=\"#bottom_anchor\" class=\"erase_adjustment\" title=\"erase\"><img src=\"images/delete.png\" alt=\"Delete Adjustment\" />");
      if (_jspx_meth_s_text_43(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("              \t\t\t</div>\n");
      out.write("                  \t  </div>\n");
      out.write("                  \t  \n");
      out.write("                  \t  <div  class=\"subcolumns payment_row\" id=\"to_add_payment\" style=\"display: none;\" >\n");
      out.write("                  \t     <div class=\"c40l\"><div class=\"subcl type-text\"><span>");
      if (_jspx_meth_s_text_44(_jspx_page_context))
        return;
      out.write(":</span><input type=\"text\" name=\"booking.payments[__PVALUE__].description\" class=\"require\" style=\"width: 90%;\" /></div></div>\n");
      out.write("                  \t  \t<div class=\"c33l\"><div class=\"subcl type-text\"><span>");
      if (_jspx_meth_s_text_45(_jspx_page_context))
        return;
      out.write("(&euro;):</span><input type=\"text\" name=\"booking.payments[__PVALUE__].amount\"  class=\"extra_value_payment validPricePositive\"/></div></div>\n");
      out.write("                  \t  \t <div class=\"c25r\"><label>&nbsp;</label><a href=\"#bottom_anchor_payment\" class=\"erase_payment\" title=\"erase\"><img src=\"images/delete.png\" alt=\"Delete Payment\" />");
      if (_jspx_meth_s_text_46(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("              \t\t\t</div>\n");
      out.write("                  \t  </div>\n");
      out.write("                  \t  \n");
      out.write("                  \t  <div  class=\"subcolumns guest_row\" id=\"to_add_guest\" style=\"display: none;\">\n");
      out.write("              \t\t  <div class=\"c25l\"><div class=\"subcl type-text\"><span>");
      if (_jspx_meth_s_text_47(_jspx_page_context))
        return;
      out.write(":</span><input type=\"text\" name=\"booking.guests[__PVALUE__].firstName\" value=\"\" class=\"required\" /></div></div>\n");
      out.write("                  \t  \t<div class=\"c25l\"><div class=\"subcl type-text\"><span>");
      if (_jspx_meth_s_text_48(_jspx_page_context))
        return;
      out.write(":</span><input type=\"text\" name=\"booking.guests[__PVALUE__].lastName\"  value=\"\" class=\"required\" style=\"width: 90%;\"/></div></div>\n");
      out.write("                  \t  \t<div class=\"c33l\"><div class=\"subcl type-text\"><span>");
      if (_jspx_meth_s_text_49(_jspx_page_context))
        return;
      out.write(":</span><input type=\"text\" name=\"booking.guests[__PVALUE__].idNumber\" value=\"\" class=\"required\" /></div></div> \n");
      out.write("                  \t  \t <div class=\"c10r\"><label>&nbsp;</label><a href=\"#\" class=\"erase_guest\" title=\"erase\"><img src=\"images/delete.png\" alt=\"Delete Guest\" />");
      if (_jspx_meth_s_text_50(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("              \t\t\t</div>\n");
      out.write("                  \t  </div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_var_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent(null);
    _jspx_th_s_url_0.setAction("birt");
    _jspx_th_s_url_0.setVar("url_birt");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_var_action_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_var_action_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("booking.id");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_text_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent(null);
    _jspx_th_s_text_0.setName("resumeBooking");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }

  private boolean _jspx_meth_s_text_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_1 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_1.setPageContext(_jspx_page_context);
    _jspx_th_s_text_1.setParent(null);
    _jspx_th_s_text_1.setName("room");
    int _jspx_eval_s_text_1 = _jspx_th_s_text_1.doStartTag();
    if (_jspx_th_s_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_1);
    return false;
  }

  private boolean _jspx_meth_s_text_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_2 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_2.setPageContext(_jspx_page_context);
    _jspx_th_s_text_2.setParent(null);
    _jspx_th_s_text_2.setName("thisFileMandatory");
    int _jspx_eval_s_text_2 = _jspx_th_s_text_2.doStartTag();
    if (_jspx_th_s_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
    return false;
  }

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("rooms");
    _jspx_th_s_iterator_0.setVar("eachRoom");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                   \t\t\t   <option \n");
        out.write("                   \t\t\t   ");
        if (_jspx_meth_s_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                   \t\t\t   value=\"");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                   \t\t\t   </option>\n");
        out.write("                    \t\t");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_s_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_if_0.setTest("#eachRoom.id == booking.room.id");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_s_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_1.setValue("#eachRoom.id");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_2.setValue("#eachRoom.name");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_1 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_1.setPageContext(_jspx_page_context);
    _jspx_th_s_if_1.setParent(null);
    _jspx_th_s_if_1.setTest("booking.room == null");
    int _jspx_eval_s_if_1 = _jspx_th_s_if_1.doStartTag();
    if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t  <option selected=\"selected\" value=\"\">");
        if (_jspx_meth_s_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write("</option>\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
    return false;
  }

  private boolean _jspx_meth_s_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_3 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_3.setPageContext(_jspx_page_context);
    _jspx_th_s_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_text_3.setName("selectOne");
    int _jspx_eval_s_text_3 = _jspx_th_s_text_3.doStartTag();
    if (_jspx_th_s_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_3);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_3);
    return false;
  }

  private boolean _jspx_meth_s_text_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_4 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_4.setPageContext(_jspx_page_context);
    _jspx_th_s_text_4.setParent(null);
    _jspx_th_s_text_4.setName("dateIn");
    int _jspx_eval_s_text_4 = _jspx_th_s_text_4.doStartTag();
    if (_jspx_th_s_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_4);
    return false;
  }

  private boolean _jspx_meth_s_text_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_5 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_5.setPageContext(_jspx_page_context);
    _jspx_th_s_text_5.setParent(null);
    _jspx_th_s_text_5.setName("thisFileMandatory");
    int _jspx_eval_s_text_5 = _jspx_th_s_text_5.doStartTag();
    if (_jspx_th_s_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_5);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_5);
    return false;
  }

  private boolean _jspx_meth_s_date_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_0 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_name_format_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_0.setPageContext(_jspx_page_context);
    _jspx_th_s_date_0.setParent(null);
    _jspx_th_s_date_0.setName("booking.dateIn");
    _jspx_th_s_date_0.setFormat("%{#session.datePattern}");
    int _jspx_eval_s_date_0 = _jspx_th_s_date_0.doStartTag();
    if (_jspx_th_s_date_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_0);
      return true;
    }
    _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_0);
    return false;
  }

  private boolean _jspx_meth_s_text_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_6 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_6.setPageContext(_jspx_page_context);
    _jspx_th_s_text_6.setParent(null);
    _jspx_th_s_text_6.setName("numNights");
    int _jspx_eval_s_text_6 = _jspx_th_s_text_6.doStartTag();
    if (_jspx_th_s_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_6);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_6);
    return false;
  }

  private boolean _jspx_meth_s_text_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_7 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_7.setPageContext(_jspx_page_context);
    _jspx_th_s_text_7.setParent(null);
    _jspx_th_s_text_7.setName("thisFileMandatory");
    int _jspx_eval_s_text_7 = _jspx_th_s_text_7.doStartTag();
    if (_jspx_th_s_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_7);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_7);
    return false;
  }

  private boolean _jspx_meth_s_property_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent(null);
    _jspx_th_s_property_3.setValue("numNights");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_property_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent(null);
    _jspx_th_s_property_4.setValue("numNights");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_text_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_8 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_8.setPageContext(_jspx_page_context);
    _jspx_th_s_text_8.setParent(null);
    _jspx_th_s_text_8.setName("dateOut");
    int _jspx_eval_s_text_8 = _jspx_th_s_text_8.doStartTag();
    if (_jspx_th_s_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_8);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_8);
    return false;
  }

  private boolean _jspx_meth_s_text_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_9 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_9.setPageContext(_jspx_page_context);
    _jspx_th_s_text_9.setParent(null);
    _jspx_th_s_text_9.setName("thisFileMandatory");
    int _jspx_eval_s_text_9 = _jspx_th_s_text_9.doStartTag();
    if (_jspx_th_s_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_9);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_9);
    return false;
  }

  private boolean _jspx_meth_s_date_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:date
    org.apache.struts2.views.jsp.DateTag _jspx_th_s_date_1 = (org.apache.struts2.views.jsp.DateTag) _jspx_tagPool_s_date_name_format_nobody.get(org.apache.struts2.views.jsp.DateTag.class);
    _jspx_th_s_date_1.setPageContext(_jspx_page_context);
    _jspx_th_s_date_1.setParent(null);
    _jspx_th_s_date_1.setName("booking.dateOut");
    _jspx_th_s_date_1.setFormat("%{#session.datePattern}");
    int _jspx_eval_s_date_1 = _jspx_th_s_date_1.doStartTag();
    if (_jspx_th_s_date_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_1);
      return true;
    }
    _jspx_tagPool_s_date_name_format_nobody.reuse(_jspx_th_s_date_1);
    return false;
  }

  private boolean _jspx_meth_s_text_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_10 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_10.setPageContext(_jspx_page_context);
    _jspx_th_s_text_10.setParent(null);
    _jspx_th_s_text_10.setName("status");
    int _jspx_eval_s_text_10 = _jspx_th_s_text_10.doStartTag();
    if (_jspx_th_s_text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_10);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_10);
    return false;
  }

  private boolean _jspx_meth_s_property_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_default_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent(null);
    _jspx_th_s_property_5.setValue("booking.status");
    _jspx_th_s_property_5.setDefault("confirmed");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_default_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_default_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }

  private boolean _jspx_meth_s_text_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_11 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_11.setPageContext(_jspx_page_context);
    _jspx_th_s_text_11.setParent(null);
    _jspx_th_s_text_11.setName("%{booking.status}");
    int _jspx_eval_s_text_11 = _jspx_th_s_text_11.doStartTag();
    if (_jspx_th_s_text_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_11);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_11);
    return false;
  }

  private boolean _jspx_meth_s_text_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_12 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_12.setPageContext(_jspx_page_context);
    _jspx_th_s_text_12.setParent(null);
    _jspx_th_s_text_12.setName("confirmed");
    int _jspx_eval_s_text_12 = _jspx_th_s_text_12.doStartTag();
    if (_jspx_th_s_text_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_12);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_12);
    return false;
  }

  private boolean _jspx_meth_s_text_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_13 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_13.setPageContext(_jspx_page_context);
    _jspx_th_s_text_13.setParent(null);
    _jspx_th_s_text_13.setName("provisional");
    int _jspx_eval_s_text_13 = _jspx_th_s_text_13.doStartTag();
    if (_jspx_th_s_text_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_13);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_13);
    return false;
  }

  private boolean _jspx_meth_s_text_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_14 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_14.setPageContext(_jspx_page_context);
    _jspx_th_s_text_14.setParent(null);
    _jspx_th_s_text_14.setName("checkedin");
    int _jspx_eval_s_text_14 = _jspx_th_s_text_14.doStartTag();
    if (_jspx_th_s_text_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_14);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_14);
    return false;
  }

  private boolean _jspx_meth_s_text_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_15 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_15.setPageContext(_jspx_page_context);
    _jspx_th_s_text_15.setParent(null);
    _jspx_th_s_text_15.setName("checkedout");
    int _jspx_eval_s_text_15 = _jspx_th_s_text_15.doStartTag();
    if (_jspx_th_s_text_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_15);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_15);
    return false;
  }

  private boolean _jspx_meth_s_select_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_0 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_size_required_name_multiple_list_label_headerKey_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_0.setPageContext(_jspx_page_context);
    _jspx_th_s_select_0.setParent(null);
    _jspx_th_s_select_0.setLabel("%{getText('status')}");
    _jspx_th_s_select_0.setName("booking.status");
    _jspx_th_s_select_0.setList("#{'confirmed':getText('confirmed'), 'provisional':getText('provisional'), 'checkedin': getText('checkedin'), 'checkedout': getText('checkedout')}");
    _jspx_th_s_select_0.setHeaderKey("booking.status");
    _jspx_th_s_select_0.setMultiple("false");
    _jspx_th_s_select_0.setSize("1");
    _jspx_th_s_select_0.setDynamicAttribute(null, "required", new String("true"));
    int _jspx_eval_s_select_0 = _jspx_th_s_select_0.doStartTag();
    if (_jspx_th_s_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_size_required_name_multiple_list_label_headerKey_nobody.reuse(_jspx_th_s_select_0);
      return true;
    }
    _jspx_tagPool_s_select_size_required_name_multiple_list_label_headerKey_nobody.reuse(_jspx_th_s_select_0);
    return false;
  }

  private boolean _jspx_meth_s_text_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_16 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_16.setPageContext(_jspx_page_context);
    _jspx_th_s_text_16.setParent(null);
    _jspx_th_s_text_16.setName("bookingDetails");
    int _jspx_eval_s_text_16 = _jspx_th_s_text_16.doStartTag();
    if (_jspx_th_s_text_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_16);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_16);
    return false;
  }

  private boolean _jspx_meth_s_property_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_6 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_6.setPageContext(_jspx_page_context);
    _jspx_th_s_property_6.setParent(null);
    _jspx_th_s_property_6.setValue("booking.booker.id");
    int _jspx_eval_s_property_6 = _jspx_th_s_property_6.doStartTag();
    if (_jspx_th_s_property_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
    return false;
  }

  private boolean _jspx_meth_s_text_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_17 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_17.setPageContext(_jspx_page_context);
    _jspx_th_s_text_17.setParent(null);
    _jspx_th_s_text_17.setName("lastName");
    int _jspx_eval_s_text_17 = _jspx_th_s_text_17.doStartTag();
    if (_jspx_th_s_text_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_17);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_17);
    return false;
  }

  private boolean _jspx_meth_s_text_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_18 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_18.setPageContext(_jspx_page_context);
    _jspx_th_s_text_18.setParent(null);
    _jspx_th_s_text_18.setName("thisFileMandatory");
    int _jspx_eval_s_text_18 = _jspx_th_s_text_18.doStartTag();
    if (_jspx_th_s_text_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_18);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_18);
    return false;
  }

  private boolean _jspx_meth_s_property_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_7 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_7.setPageContext(_jspx_page_context);
    _jspx_th_s_property_7.setParent(null);
    _jspx_th_s_property_7.setValue("booking.booker.lastName");
    int _jspx_eval_s_property_7 = _jspx_th_s_property_7.doStartTag();
    if (_jspx_th_s_property_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
    return false;
  }

  private boolean _jspx_meth_s_text_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_19 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_19.setPageContext(_jspx_page_context);
    _jspx_th_s_text_19.setParent(null);
    _jspx_th_s_text_19.setName("firstName");
    int _jspx_eval_s_text_19 = _jspx_th_s_text_19.doStartTag();
    if (_jspx_th_s_text_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_19);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_19);
    return false;
  }

  private boolean _jspx_meth_s_text_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_20 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_20.setPageContext(_jspx_page_context);
    _jspx_th_s_text_20.setParent(null);
    _jspx_th_s_text_20.setName("thisFileMandatory");
    int _jspx_eval_s_text_20 = _jspx_th_s_text_20.doStartTag();
    if (_jspx_th_s_text_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_20);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_20);
    return false;
  }

  private boolean _jspx_meth_s_property_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_8 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_8.setPageContext(_jspx_page_context);
    _jspx_th_s_property_8.setParent(null);
    _jspx_th_s_property_8.setValue("booking.booker.firstName");
    int _jspx_eval_s_property_8 = _jspx_th_s_property_8.doStartTag();
    if (_jspx_th_s_property_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
    return false;
  }

  private boolean _jspx_meth_s_text_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_21 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_21.setPageContext(_jspx_page_context);
    _jspx_th_s_text_21.setParent(null);
    _jspx_th_s_text_21.setName("bookerDetails");
    int _jspx_eval_s_text_21 = _jspx_th_s_text_21.doStartTag();
    if (_jspx_th_s_text_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_21);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_21);
    return false;
  }

  private boolean _jspx_meth_s_text_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_22 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_22.setPageContext(_jspx_page_context);
    _jspx_th_s_text_22.setParent(null);
    _jspx_th_s_text_22.setName("phone");
    int _jspx_eval_s_text_22 = _jspx_th_s_text_22.doStartTag();
    if (_jspx_th_s_text_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_22);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_22);
    return false;
  }

  private boolean _jspx_meth_s_property_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_9 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_9.setPageContext(_jspx_page_context);
    _jspx_th_s_property_9.setParent(null);
    _jspx_th_s_property_9.setValue("booking.booker.phone");
    int _jspx_eval_s_property_9 = _jspx_th_s_property_9.doStartTag();
    if (_jspx_th_s_property_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
    return false;
  }

  private boolean _jspx_meth_s_text_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_23 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_23.setPageContext(_jspx_page_context);
    _jspx_th_s_text_23.setParent(null);
    _jspx_th_s_text_23.setName("email");
    int _jspx_eval_s_text_23 = _jspx_th_s_text_23.doStartTag();
    if (_jspx_th_s_text_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_23);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_23);
    return false;
  }

  private boolean _jspx_meth_s_property_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_10 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_10.setPageContext(_jspx_page_context);
    _jspx_th_s_property_10.setParent(null);
    _jspx_th_s_property_10.setValue("booking.booker.email");
    int _jspx_eval_s_property_10 = _jspx_th_s_property_10.doStartTag();
    if (_jspx_th_s_property_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_10);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_10);
    return false;
  }

  private boolean _jspx_meth_s_property_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_11 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_11.setPageContext(_jspx_page_context);
    _jspx_th_s_property_11.setParent(null);
    _jspx_th_s_property_11.setValue("booking.notes");
    int _jspx_eval_s_property_11 = _jspx_th_s_property_11.doStartTag();
    if (_jspx_th_s_property_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_11);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_11);
    return false;
  }

  private boolean _jspx_meth_s_property_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_12 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_12.setPageContext(_jspx_page_context);
    _jspx_th_s_property_12.setParent(null);
    _jspx_th_s_property_12.setValue("booking.booker.address");
    int _jspx_eval_s_property_12 = _jspx_th_s_property_12.doStartTag();
    if (_jspx_th_s_property_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_12);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_12);
    return false;
  }

  private boolean _jspx_meth_s_property_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_13 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_13.setPageContext(_jspx_page_context);
    _jspx_th_s_property_13.setParent(null);
    _jspx_th_s_property_13.setValue("booking.booker.zipCode");
    int _jspx_eval_s_property_13 = _jspx_th_s_property_13.doStartTag();
    if (_jspx_th_s_property_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_13);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_13);
    return false;
  }

  private boolean _jspx_meth_s_property_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_14 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_14.setPageContext(_jspx_page_context);
    _jspx_th_s_property_14.setParent(null);
    _jspx_th_s_property_14.setValue("booking.booker.country");
    int _jspx_eval_s_property_14 = _jspx_th_s_property_14.doStartTag();
    if (_jspx_th_s_property_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_14);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_14);
    return false;
  }

  private boolean _jspx_meth_s_property_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_15 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_15.setPageContext(_jspx_page_context);
    _jspx_th_s_property_15.setParent(null);
    _jspx_th_s_property_15.setValue("booking.booker.idNumber");
    int _jspx_eval_s_property_15 = _jspx_th_s_property_15.doStartTag();
    if (_jspx_th_s_property_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_15);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_15);
    return false;
  }

  private boolean _jspx_meth_s_property_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_16 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_16.setPageContext(_jspx_page_context);
    _jspx_th_s_property_16.setParent(null);
    _jspx_th_s_property_16.setValue("booking.booker.birthDate");
    int _jspx_eval_s_property_16 = _jspx_th_s_property_16.doStartTag();
    if (_jspx_th_s_property_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_16);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_16);
    return false;
  }

  private boolean _jspx_meth_s_property_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_17 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_17.setPageContext(_jspx_page_context);
    _jspx_th_s_property_17.setParent(null);
    _jspx_th_s_property_17.setValue("booking.booker.birthPlace");
    int _jspx_eval_s_property_17 = _jspx_th_s_property_17.doStartTag();
    if (_jspx_th_s_property_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_17);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_17);
    return false;
  }

  private boolean _jspx_meth_s_select_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_1 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_size_required_name_multiple_list_label_id_headerKey_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_1.setPageContext(_jspx_page_context);
    _jspx_th_s_select_1.setParent(null);
    _jspx_th_s_select_1.setLabel("%{getText('guests')}");
    _jspx_th_s_select_1.setName("booking.nrGuests");
    _jspx_th_s_select_1.setList("listNumGuests");
    _jspx_th_s_select_1.setHeaderKey("booking.nrGuests");
    _jspx_th_s_select_1.setMultiple("false");
    _jspx_th_s_select_1.setSize("1");
    _jspx_th_s_select_1.setDynamicAttribute(null, "required", new String("true"));
    _jspx_th_s_select_1.setId("nr_guests");
    int _jspx_eval_s_select_1 = _jspx_th_s_select_1.doStartTag();
    if (_jspx_th_s_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_size_required_name_multiple_list_label_id_headerKey_nobody.reuse(_jspx_th_s_select_1);
      return true;
    }
    _jspx_tagPool_s_select_size_required_name_multiple_list_label_id_headerKey_nobody.reuse(_jspx_th_s_select_1);
    return false;
  }

  private boolean _jspx_meth_s_text_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_24 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_24.setPageContext(_jspx_page_context);
    _jspx_th_s_text_24.setParent(null);
    _jspx_th_s_text_24.setName("convention");
    int _jspx_eval_s_text_24 = _jspx_th_s_text_24.doStartTag();
    if (_jspx_th_s_text_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_24);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_24);
    return false;
  }

  private boolean _jspx_meth_s_iterator_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_1 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_1.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_1.setParent(null);
    _jspx_th_s_iterator_1.setValue("conventions");
    _jspx_th_s_iterator_1.setVar("eachConvention");
    int _jspx_eval_s_iterator_1 = _jspx_th_s_iterator_1.doStartTag();
    if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                   \t  <option \n");
        out.write("                   \t  \t");
        if (_jspx_meth_s_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                   \t\tvalue=\"");
        if (_jspx_meth_s_property_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_property_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                   \t  </option>\n");
        out.write("                   \t");
        int evalDoAfterBody = _jspx_th_s_iterator_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_1);
      return true;
    }
    _jspx_tagPool_s_iterator_var_value.reuse(_jspx_th_s_iterator_1);
    return false;
  }

  private boolean _jspx_meth_s_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_2 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_2.setPageContext(_jspx_page_context);
    _jspx_th_s_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_if_2.setTest("#eachConvention.id == booking.convention.id");
    int _jspx_eval_s_if_2 = _jspx_th_s_if_2.doStartTag();
    if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_2.doInitBody();
      }
      do {
        out.write("selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_s_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_2);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_2);
    return false;
  }

  private boolean _jspx_meth_s_property_18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_18 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_18.setPageContext(_jspx_page_context);
    _jspx_th_s_property_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_property_18.setValue("#eachConvention.id");
    int _jspx_eval_s_property_18 = _jspx_th_s_property_18.doStartTag();
    if (_jspx_th_s_property_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_18);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_18);
    return false;
  }

  private boolean _jspx_meth_s_property_19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_19 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_19.setPageContext(_jspx_page_context);
    _jspx_th_s_property_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_1);
    _jspx_th_s_property_19.setValue("#eachConvention.name");
    int _jspx_eval_s_property_19 = _jspx_th_s_property_19.doStartTag();
    if (_jspx_th_s_property_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_19);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_19);
    return false;
  }

  private boolean _jspx_meth_s_text_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_25 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_25.setPageContext(_jspx_page_context);
    _jspx_th_s_text_25.setParent(null);
    _jspx_th_s_text_25.setName("price");
    int _jspx_eval_s_text_25 = _jspx_th_s_text_25.doStartTag();
    if (_jspx_th_s_text_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_25);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_25);
    return false;
  }

  private boolean _jspx_meth_s_text_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_26 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_26.setPageContext(_jspx_page_context);
    _jspx_th_s_text_26.setParent(null);
    _jspx_th_s_text_26.setName("room");
    int _jspx_eval_s_text_26 = _jspx_th_s_text_26.doStartTag();
    if (_jspx_th_s_text_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_26);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_26);
    return false;
  }

  private boolean _jspx_meth_s_property_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_20 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_20.setPageContext(_jspx_page_context);
    _jspx_th_s_property_20.setParent(null);
    _jspx_th_s_property_20.setValue("booking.roomSubtotal");
    int _jspx_eval_s_property_20 = _jspx_th_s_property_20.doStartTag();
    if (_jspx_th_s_property_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_20);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_20);
    return false;
  }

  private boolean _jspx_meth_s_text_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_27 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_27.setPageContext(_jspx_page_context);
    _jspx_th_s_text_27.setParent(null);
    _jspx_th_s_text_27.setName("extras");
    int _jspx_eval_s_text_27 = _jspx_th_s_text_27.doStartTag();
    if (_jspx_th_s_text_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_27);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_27);
    return false;
  }

  private boolean _jspx_meth_s_property_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_21 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_21.setPageContext(_jspx_page_context);
    _jspx_th_s_property_21.setParent(null);
    _jspx_th_s_property_21.setValue("booking.extraSubtotal");
    int _jspx_eval_s_property_21 = _jspx_th_s_property_21.doStartTag();
    if (_jspx_th_s_property_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_21);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_21);
    return false;
  }

  private boolean _jspx_meth_s_text_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_28 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_28.setPageContext(_jspx_page_context);
    _jspx_th_s_text_28.setParent(null);
    _jspx_th_s_text_28.setName("addNewAdjustment");
    int _jspx_eval_s_text_28 = _jspx_th_s_text_28.doStartTag();
    if (_jspx_th_s_text_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_28);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_28);
    return false;
  }

  private boolean _jspx_meth_s_iterator_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_2 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value_status.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_2.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_2.setParent(null);
    _jspx_th_s_iterator_2.setValue("booking.adjustments");
    _jspx_th_s_iterator_2.setVar("eachAdjust");
    _jspx_th_s_iterator_2.setStatus("adjustStatus");
    int _jspx_eval_s_iterator_2 = _jspx_th_s_iterator_2.doStartTag();
    if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("              \t\t  <div  class=\"subcolumns adjustment_row\">\n");
        out.write("              \t\t  \t<input type=\"hidden\" class=\"idAdjustment\" name=\"booking.adjustments[");
        if (_jspx_meth_s_property_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("].id\" value=\"");
        if (_jspx_meth_s_property_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\"/>\n");
        out.write("              \t\t  \t<div class=\"c40l\">\n");
        out.write("              \t\t  \t  <div class=\"subcl type-text\"><span>");
        if (_jspx_meth_s_text_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write(":</span><input type=\"text\" name=\"booking.adjustments[");
        if (_jspx_meth_s_property_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("].description\" value=\"");
        if (_jspx_meth_s_property_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\" class=\"require\" style=\"width: 90%;\" /></div>\n");
        out.write("              \t\t  \t</div>\n");
        out.write("                  \t  \t<div class=\"c33l\">\n");
        out.write("                  \t  \t  <div class=\"subcl type-text\"><span>");
        if (_jspx_meth_s_text_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write(" (&euro;):</span><input type=\"text\" name=\"booking.adjustments[");
        if (_jspx_meth_s_property_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("].amount\"  value=\"");
        if (_jspx_meth_s_property_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("\" class=\"extra_value_adjustment validPrice\"/></div>\n");
        out.write("                  \t  \t</div>\n");
        out.write("                  \t  \t<div class=\"c25r\"><label>&nbsp;</label><a href=\"#\" class=\"erase_adjustment\" title=\"erase\"><img src=\"images/delete.png\" alt=\"Delete Adjustment\" />");
        if (_jspx_meth_s_text_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_2, _jspx_page_context))
          return true;
        out.write("</a></div>\n");
        out.write("                  \t  </div>\n");
        out.write("              \t\t");
        int evalDoAfterBody = _jspx_th_s_iterator_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_var_value_status.reuse(_jspx_th_s_iterator_2);
      return true;
    }
    _jspx_tagPool_s_iterator_var_value_status.reuse(_jspx_th_s_iterator_2);
    return false;
  }

  private boolean _jspx_meth_s_property_22(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_22 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_22.setPageContext(_jspx_page_context);
    _jspx_th_s_property_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_22.setValue("#adjustStatus.index");
    int _jspx_eval_s_property_22 = _jspx_th_s_property_22.doStartTag();
    if (_jspx_th_s_property_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_22);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_22);
    return false;
  }

  private boolean _jspx_meth_s_property_23(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_23 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_23.setPageContext(_jspx_page_context);
    _jspx_th_s_property_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_23.setValue("#eachAdjust.id");
    int _jspx_eval_s_property_23 = _jspx_th_s_property_23.doStartTag();
    if (_jspx_th_s_property_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_23);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_23);
    return false;
  }

  private boolean _jspx_meth_s_text_29(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_29 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_29.setPageContext(_jspx_page_context);
    _jspx_th_s_text_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_text_29.setName("name");
    int _jspx_eval_s_text_29 = _jspx_th_s_text_29.doStartTag();
    if (_jspx_th_s_text_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_29);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_29);
    return false;
  }

  private boolean _jspx_meth_s_property_24(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_24 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_24.setPageContext(_jspx_page_context);
    _jspx_th_s_property_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_24.setValue("#adjustStatus.index");
    int _jspx_eval_s_property_24 = _jspx_th_s_property_24.doStartTag();
    if (_jspx_th_s_property_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_24);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_24);
    return false;
  }

  private boolean _jspx_meth_s_property_25(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_25 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_25.setPageContext(_jspx_page_context);
    _jspx_th_s_property_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_25.setValue("#eachAdjust.description");
    int _jspx_eval_s_property_25 = _jspx_th_s_property_25.doStartTag();
    if (_jspx_th_s_property_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_25);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_25);
    return false;
  }

  private boolean _jspx_meth_s_text_30(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_30 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_30.setPageContext(_jspx_page_context);
    _jspx_th_s_text_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_text_30.setName("amount");
    int _jspx_eval_s_text_30 = _jspx_th_s_text_30.doStartTag();
    if (_jspx_th_s_text_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_30);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_30);
    return false;
  }

  private boolean _jspx_meth_s_property_26(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_26 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_26.setPageContext(_jspx_page_context);
    _jspx_th_s_property_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_26.setValue("#adjustStatus.index");
    int _jspx_eval_s_property_26 = _jspx_th_s_property_26.doStartTag();
    if (_jspx_th_s_property_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_26);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_26);
    return false;
  }

  private boolean _jspx_meth_s_property_27(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_27 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_27.setPageContext(_jspx_page_context);
    _jspx_th_s_property_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_property_27.setValue("#eachAdjust.amount");
    int _jspx_eval_s_property_27 = _jspx_th_s_property_27.doStartTag();
    if (_jspx_th_s_property_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_27);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_27);
    return false;
  }

  private boolean _jspx_meth_s_text_31(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_31 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_31.setPageContext(_jspx_page_context);
    _jspx_th_s_text_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_2);
    _jspx_th_s_text_31.setName("deleteAdjustment");
    int _jspx_eval_s_text_31 = _jspx_th_s_text_31.doStartTag();
    if (_jspx_th_s_text_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_31);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_31);
    return false;
  }

  private boolean _jspx_meth_s_text_32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_32 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_32.setPageContext(_jspx_page_context);
    _jspx_th_s_text_32.setParent(null);
    _jspx_th_s_text_32.setName("subtotal");
    int _jspx_eval_s_text_32 = _jspx_th_s_text_32.doStartTag();
    if (_jspx_th_s_text_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_32);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_32);
    return false;
  }

  private boolean _jspx_meth_s_property_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_28 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_28.setPageContext(_jspx_page_context);
    _jspx_th_s_property_28.setParent(null);
    _jspx_th_s_property_28.setValue("%{ booking.roomSubtotal + booking.extraSubtotal + adjustmentsSubtotal}");
    int _jspx_eval_s_property_28 = _jspx_th_s_property_28.doStartTag();
    if (_jspx_th_s_property_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_28);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_28);
    return false;
  }

  private boolean _jspx_meth_s_property_29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_29 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_29.setPageContext(_jspx_page_context);
    _jspx_th_s_property_29.setParent(null);
    _jspx_th_s_property_29.setValue("%{ booking.roomSubtotal + booking.extraSubtotal + adjustmentsSubtotal}");
    int _jspx_eval_s_property_29 = _jspx_th_s_property_29.doStartTag();
    if (_jspx_th_s_property_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_29);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_29);
    return false;
  }

  private boolean _jspx_meth_s_text_33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_33 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_33.setPageContext(_jspx_page_context);
    _jspx_th_s_text_33.setParent(null);
    _jspx_th_s_text_33.setName("addNewPayment");
    int _jspx_eval_s_text_33 = _jspx_th_s_text_33.doStartTag();
    if (_jspx_th_s_text_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_33);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_33);
    return false;
  }

  private boolean _jspx_meth_s_iterator_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_3 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_var_value_status.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_3.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_3.setParent(null);
    _jspx_th_s_iterator_3.setValue("booking.payments");
    _jspx_th_s_iterator_3.setVar("eachPayment");
    _jspx_th_s_iterator_3.setStatus("paymentStatus");
    int _jspx_eval_s_iterator_3 = _jspx_th_s_iterator_3.doStartTag();
    if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("              \t\t     <div  class=\"subcolumns payment_row\">\n");
        out.write("              \t\t     <input type=\"hidden\" class=\"idPayment\" name=\"booking.payments[");
        if (_jspx_meth_s_property_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write("].id\" value=\"");
        if (_jspx_meth_s_property_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write("\"/>\n");
        out.write("              \t\t    <div class=\"c40l\"><div class=\"subcl type-text\"><span>");
        if (_jspx_meth_s_text_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write(":</span><input type=\"text\" name=\"booking.payments[");
        if (_jspx_meth_s_property_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write("].description\" value=\"");
        if (_jspx_meth_s_property_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write("\" class=\"require\" style=\"width: 90%;\" /></div></div>\n");
        out.write("                  \t  \t<div class=\"c33l\"><div class=\"subcl type-text\"><span>");
        if (_jspx_meth_s_text_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write("(&euro;):</span><input type=\"text\" name=\"booking.payments[");
        if (_jspx_meth_s_property_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write("].amount\"  value=\"");
        if (_jspx_meth_s_property_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write("\" class=\"extra_value_payment required validPricePositive\"/></div></div>\n");
        out.write("                  \t  \t <div class=\"c25r\"><label>&nbsp;</label><a href=\"#bottom_anchor_payment\" class=\"erase_payment\" title=\"erase\"><img src=\"images/delete.png\" alt=\"Delete Payment\" />");
        if (_jspx_meth_s_text_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_3, _jspx_page_context))
          return true;
        out.write("</a>\n");
        out.write("              \t\t\t</div>\n");
        out.write("                  \t  </div>\n");
        out.write("              \t\t");
        int evalDoAfterBody = _jspx_th_s_iterator_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_var_value_status.reuse(_jspx_th_s_iterator_3);
      return true;
    }
    _jspx_tagPool_s_iterator_var_value_status.reuse(_jspx_th_s_iterator_3);
    return false;
  }

  private boolean _jspx_meth_s_property_30(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_30 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_30.setPageContext(_jspx_page_context);
    _jspx_th_s_property_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_30.setValue("#paymentStatus.index");
    int _jspx_eval_s_property_30 = _jspx_th_s_property_30.doStartTag();
    if (_jspx_th_s_property_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_30);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_30);
    return false;
  }

  private boolean _jspx_meth_s_property_31(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_31 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_31.setPageContext(_jspx_page_context);
    _jspx_th_s_property_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_31.setValue("#eachPayment.id");
    int _jspx_eval_s_property_31 = _jspx_th_s_property_31.doStartTag();
    if (_jspx_th_s_property_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_31);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_31);
    return false;
  }

  private boolean _jspx_meth_s_text_34(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_34 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_34.setPageContext(_jspx_page_context);
    _jspx_th_s_text_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_text_34.setName("name");
    int _jspx_eval_s_text_34 = _jspx_th_s_text_34.doStartTag();
    if (_jspx_th_s_text_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_34);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_34);
    return false;
  }

  private boolean _jspx_meth_s_property_32(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_32 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_32.setPageContext(_jspx_page_context);
    _jspx_th_s_property_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_32.setValue("#paymentStatus.index");
    int _jspx_eval_s_property_32 = _jspx_th_s_property_32.doStartTag();
    if (_jspx_th_s_property_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_32);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_32);
    return false;
  }

  private boolean _jspx_meth_s_property_33(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_33 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_33.setPageContext(_jspx_page_context);
    _jspx_th_s_property_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_33.setValue("#eachPayment.description");
    int _jspx_eval_s_property_33 = _jspx_th_s_property_33.doStartTag();
    if (_jspx_th_s_property_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_33);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_33);
    return false;
  }

  private boolean _jspx_meth_s_text_35(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_35 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_35.setPageContext(_jspx_page_context);
    _jspx_th_s_text_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_text_35.setName("amount");
    int _jspx_eval_s_text_35 = _jspx_th_s_text_35.doStartTag();
    if (_jspx_th_s_text_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_35);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_35);
    return false;
  }

  private boolean _jspx_meth_s_property_34(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_34 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_34.setPageContext(_jspx_page_context);
    _jspx_th_s_property_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_34.setValue("#paymentStatus.index");
    int _jspx_eval_s_property_34 = _jspx_th_s_property_34.doStartTag();
    if (_jspx_th_s_property_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_34);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_34);
    return false;
  }

  private boolean _jspx_meth_s_property_35(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_35 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_35.setPageContext(_jspx_page_context);
    _jspx_th_s_property_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_property_35.setValue("#eachPayment.amount");
    int _jspx_eval_s_property_35 = _jspx_th_s_property_35.doStartTag();
    if (_jspx_th_s_property_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_35);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_35);
    return false;
  }

  private boolean _jspx_meth_s_text_36(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_36 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_36.setPageContext(_jspx_page_context);
    _jspx_th_s_text_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_3);
    _jspx_th_s_text_36.setName("deletePayment");
    int _jspx_eval_s_text_36 = _jspx_th_s_text_36.doStartTag();
    if (_jspx_th_s_text_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_36);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_36);
    return false;
  }

  private boolean _jspx_meth_s_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_3 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_3.setPageContext(_jspx_page_context);
    _jspx_th_s_if_3.setParent(null);
    _jspx_th_s_if_3.setTest("booking.payments.size() == 0");
    int _jspx_eval_s_if_3 = _jspx_th_s_if_3.doStartTag();
    if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_3.doInitBody();
      }
      do {
        out.write(" \n");
        out.write("              \t         <div  class=\"subcolumns payment_row\">\n");
        out.write("                  \t     <div class=\"c40l\"><div class=\"subcl type-text\"><span>Name:</span><input type=\"text\" name=\"booking.payments[0].description\" class=\"require\" style=\"width: 90%;\" /></div></div>\n");
        out.write("                  \t  \t<div class=\"c33l\"><div class=\"subcl type-text\"><span>Amount(&euro;):</span><input type=\"text\" name=\"booking.payments[0].amount\"  class=\"extra_value_payment required\"/></div></div>\n");
        out.write("                  \t  \t <div class=\"c25r\"><label>&nbsp;</label><a href=\"#bottom_anchor_payment\" class=\"erase_payment\" title=\"erase\"><img src=\"images/delete.png\" alt=\"Delete Payment\" />Delete Payment</a>\n");
        out.write("              \t\t\t</div>\n");
        out.write("                  \t  </div>\t\n");
        out.write("              \t\t");
        int evalDoAfterBody = _jspx_th_s_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_3);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_3);
    return false;
  }

  private boolean _jspx_meth_s_text_37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_37 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_37.setPageContext(_jspx_page_context);
    _jspx_th_s_text_37.setParent(null);
    _jspx_th_s_text_37.setName("balanceDue");
    int _jspx_eval_s_text_37 = _jspx_th_s_text_37.doStartTag();
    if (_jspx_th_s_text_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_37);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_37);
    return false;
  }

  private boolean _jspx_meth_s_property_36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_36 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_36.setPageContext(_jspx_page_context);
    _jspx_th_s_property_36.setParent(null);
    _jspx_th_s_property_36.setValue("%{ booking.roomSubtotal + booking.extraSubtotal + adjustmentsSubtotal - paymentsSubtotal}");
    int _jspx_eval_s_property_36 = _jspx_th_s_property_36.doStartTag();
    if (_jspx_th_s_property_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_36);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_36);
    return false;
  }

  private boolean _jspx_meth_s_property_37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_37 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_37.setPageContext(_jspx_page_context);
    _jspx_th_s_property_37.setParent(null);
    _jspx_th_s_property_37.setValue("%{ booking.roomSubtotal + booking.extraSubtotal - paymentsSubtotal}");
    int _jspx_eval_s_property_37 = _jspx_th_s_property_37.doStartTag();
    if (_jspx_th_s_property_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_37);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_37);
    return false;
  }

  private boolean _jspx_meth_s_property_38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_38 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_38.setPageContext(_jspx_page_context);
    _jspx_th_s_property_38.setParent(null);
    _jspx_th_s_property_38.setValue("%{ booking.roomSubtotal + booking.extraSubtotal}");
    int _jspx_eval_s_property_38 = _jspx_th_s_property_38.doStartTag();
    if (_jspx_th_s_property_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_38);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_38);
    return false;
  }

  private boolean _jspx_meth_s_property_39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_39 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_39.setPageContext(_jspx_page_context);
    _jspx_th_s_property_39.setParent(null);
    _jspx_th_s_property_39.setValue("%{ booking.roomSubtotal + booking.extraSubtotal}");
    int _jspx_eval_s_property_39 = _jspx_th_s_property_39.doStartTag();
    if (_jspx_th_s_property_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_39);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_39);
    return false;
  }

  private boolean _jspx_meth_s_text_38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_38 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_38.setPageContext(_jspx_page_context);
    _jspx_th_s_text_38.setParent(null);
    _jspx_th_s_text_38.setName("save");
    int _jspx_eval_s_text_38 = _jspx_th_s_text_38.doStartTag();
    if (_jspx_th_s_text_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_38);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_38);
    return false;
  }

  private boolean _jspx_meth_s_property_40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_40 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_40.setPageContext(_jspx_page_context);
    _jspx_th_s_property_40.setParent(null);
    _jspx_th_s_property_40.setValue("url_home");
    int _jspx_eval_s_property_40 = _jspx_th_s_property_40.doStartTag();
    if (_jspx_th_s_property_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_40);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_40);
    return false;
  }

  private boolean _jspx_meth_s_text_39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_39 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_39.setPageContext(_jspx_page_context);
    _jspx_th_s_text_39.setParent(null);
    _jspx_th_s_text_39.setName("cancel");
    int _jspx_eval_s_text_39 = _jspx_th_s_text_39.doStartTag();
    if (_jspx_th_s_text_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_39);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_39);
    return false;
  }

  private boolean _jspx_meth_s_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_4 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_4.setPageContext(_jspx_page_context);
    _jspx_th_s_if_4.setParent(null);
    _jspx_th_s_if_4.setTest("booking.id != null");
    int _jspx_eval_s_if_4 = _jspx_th_s_if_4.doStartTag();
    if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("               \t\t<a class=\"invoice_booking\" target=\"_blank\" href=\"");
        if (_jspx_meth_s_property_41((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_4, _jspx_page_context))
          return true;
        out.write("?rp=bookinginvoice&bookid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${booking.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        if (_jspx_meth_s_text_40((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_4, _jspx_page_context))
          return true;
        out.write("</a>\n");
        out.write("               \t\t");
        int evalDoAfterBody = _jspx_th_s_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_4);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_4);
    return false;
  }

  private boolean _jspx_meth_s_property_41(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_41 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_41.setPageContext(_jspx_page_context);
    _jspx_th_s_property_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_4);
    _jspx_th_s_property_41.setValue("url_birt");
    int _jspx_eval_s_property_41 = _jspx_th_s_property_41.doStartTag();
    if (_jspx_th_s_property_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_41);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_41);
    return false;
  }

  private boolean _jspx_meth_s_text_40(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_40 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_40.setPageContext(_jspx_page_context);
    _jspx_th_s_text_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_4);
    _jspx_th_s_text_40.setName("invoiceDownload");
    int _jspx_eval_s_text_40 = _jspx_th_s_text_40.doStartTag();
    if (_jspx_th_s_text_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_40);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_40);
    return false;
  }

  private boolean _jspx_meth_s_text_41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_41 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_41.setPageContext(_jspx_page_context);
    _jspx_th_s_text_41.setParent(null);
    _jspx_th_s_text_41.setName("name");
    int _jspx_eval_s_text_41 = _jspx_th_s_text_41.doStartTag();
    if (_jspx_th_s_text_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_41);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_41);
    return false;
  }

  private boolean _jspx_meth_s_text_42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_42 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_42.setPageContext(_jspx_page_context);
    _jspx_th_s_text_42.setParent(null);
    _jspx_th_s_text_42.setName("amount");
    int _jspx_eval_s_text_42 = _jspx_th_s_text_42.doStartTag();
    if (_jspx_th_s_text_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_42);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_42);
    return false;
  }

  private boolean _jspx_meth_s_text_43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_43 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_43.setPageContext(_jspx_page_context);
    _jspx_th_s_text_43.setParent(null);
    _jspx_th_s_text_43.setName("deleteAdjustment");
    int _jspx_eval_s_text_43 = _jspx_th_s_text_43.doStartTag();
    if (_jspx_th_s_text_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_43);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_43);
    return false;
  }

  private boolean _jspx_meth_s_text_44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_44 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_44.setPageContext(_jspx_page_context);
    _jspx_th_s_text_44.setParent(null);
    _jspx_th_s_text_44.setName("name");
    int _jspx_eval_s_text_44 = _jspx_th_s_text_44.doStartTag();
    if (_jspx_th_s_text_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_44);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_44);
    return false;
  }

  private boolean _jspx_meth_s_text_45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_45 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_45.setPageContext(_jspx_page_context);
    _jspx_th_s_text_45.setParent(null);
    _jspx_th_s_text_45.setName("amount");
    int _jspx_eval_s_text_45 = _jspx_th_s_text_45.doStartTag();
    if (_jspx_th_s_text_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_45);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_45);
    return false;
  }

  private boolean _jspx_meth_s_text_46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_46 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_46.setPageContext(_jspx_page_context);
    _jspx_th_s_text_46.setParent(null);
    _jspx_th_s_text_46.setName("deleteAdjustment");
    int _jspx_eval_s_text_46 = _jspx_th_s_text_46.doStartTag();
    if (_jspx_th_s_text_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_46);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_46);
    return false;
  }

  private boolean _jspx_meth_s_text_47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_47 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_47.setPageContext(_jspx_page_context);
    _jspx_th_s_text_47.setParent(null);
    _jspx_th_s_text_47.setName("firstName");
    int _jspx_eval_s_text_47 = _jspx_th_s_text_47.doStartTag();
    if (_jspx_th_s_text_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_47);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_47);
    return false;
  }

  private boolean _jspx_meth_s_text_48(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_48 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_48.setPageContext(_jspx_page_context);
    _jspx_th_s_text_48.setParent(null);
    _jspx_th_s_text_48.setName("lastName");
    int _jspx_eval_s_text_48 = _jspx_th_s_text_48.doStartTag();
    if (_jspx_th_s_text_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_48);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_48);
    return false;
  }

  private boolean _jspx_meth_s_text_49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_49 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_49.setPageContext(_jspx_page_context);
    _jspx_th_s_text_49.setParent(null);
    _jspx_th_s_text_49.setName("idNumber");
    int _jspx_eval_s_text_49 = _jspx_th_s_text_49.doStartTag();
    if (_jspx_th_s_text_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_49);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_49);
    return false;
  }

  private boolean _jspx_meth_s_text_50(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_50 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_50.setPageContext(_jspx_page_context);
    _jspx_th_s_text_50.setParent(null);
    _jspx_th_s_text_50.setName("deleteGuest");
    int _jspx_eval_s_text_50 = _jspx_th_s_text_50.doStartTag();
    if (_jspx_th_s_text_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_50);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_50);
    return false;
  }
}
