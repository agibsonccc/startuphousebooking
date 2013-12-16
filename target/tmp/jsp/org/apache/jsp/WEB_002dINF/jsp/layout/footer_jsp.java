package org.apache.jsp.WEB_002dINF.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Locale;
import com.opensymphony.xwork2.ActionContext;;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div id=\"ie_clearing\">&nbsp;</div>\n");
      out.write("\t\t\t\t<!-- End: IE Column Clearing -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- begin: #footer -->\n");
      out.write("\t\t\t\t<div id=\"footer\" role=\"contentinfo\">\n");
      out.write("\t\t\t\t\t<img src=\"images/labos.png\" id=\"labos\" alt=\"Laboratorio Open Source\" class=\"left\" height=\"7%\" width=\"20%\"/> \n");
      out.write("\t\t\t\t\t<img src=\"images/sardegna_ricerche.png\" alt=\"Sardegna Ricerche\" class=\"left\" height=\"7%\" width=\"7%\" /> \n");
      out.write("\t\t\t\t\t<img src=\"images/european_union.png\" id=\"eu\" alt=\"European Union\" class=\"right\" height=\"7%\" width=\"7%\" /> \n");
      out.write("\t\t\t\t\t<img src=\"images/repubblica.png\" alt=\"Repubblica Italiana\" class=\"right\" height=\"7%\" width=\"7%\"/> \n");
      out.write("\t\t\t\t\t<img src=\"images/regione_sardegna.png\" alt=\"Regione Autonoma della Sardegna\" class=\"right\" height=\"7%\" width=7%/> \n");
      out.write("\t\t\t\t\t<span class=\"center\">Locanda<br/> \n");
      out.write("\t\t\t\t\t\tOpen Source Booking<br/><br/>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- end: #footer -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- end: #col3 -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end: #main -->\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type='text/javascript' src='js/lib/jquery.min.js'></script>\n");
      out.write("<!--<script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/jquery-ui.min.js'></script>-->\n");
      out.write("<script type='text/javascript' src='js/lib/jquery-ui-1.8.9.custom.min.js'></script>\n");
      out.write("<script type='text/javascript' src=\"js/lib/jquerymx-1.0.custom.js\"></script>\n");
      out.write("<script type='text/javascript' src='js/lib/ftod.js'></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/lib/jstree/jquery.jstree.js\"></script>\n");
      out.write("<script type='text/javascript' src='js/lib/jquery.form.js'></script>\n");
      out.write("<script type='text/javascript' src=\"js/lib/jquery.i18n.js\"></script>\n");
      out.write("<script type='text/javascript' src=\"js/lib/underscore-min.js\"></script>\n");
      out.write("<script type='text/javascript' src=\"js/lib/backbone.js\"></script>\n");
      out.write("<script type='text/javascript' src=\"js/lib/mustache.js\"></script>\n");
      out.write("<script type='text/javascript' src='js/lib/jquery.overlay.min.js'></script>\n");
      out.write("\n");

//Locale locale = (locale)request.getSession().getAttribute(Globals.LOCALE_KEY);
String lang ="en";
Locale locale = ActionContext.getContext().getLocale();
if (locale != null){
	
	lang = locale.getLanguage();
}

      out.write("\n");
      out.write("\n");
      out.write("<script type='text/javascript' src='js/lang/jquery.");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write(".json'></script>\n");
      out.write("<script>\n");
      out.write("\t$(document).ready(function () { ");

    	//code for menu tabs activation
    	String dPageDefault = "planner";
   		String dPage = request.getParameter("sect");
    	dPage = (dPage == null) ? dPageDefault : dPage;
    	out.println("\n var section= \'" + dPage + "\';"); 
    	
      out.write("\n");
      out.write("    \tvar text_tab = $(\"#\" + section).children(\"a\").hide().text();\n");
      out.write("    \t$(\"#\" + section).addClass(\"active\").prepend(\"<strong>\" + text_tab + \"</strong>\");\n");
      out.write("    \tI18NSettings = {};\n");
      out.write("    \tI18NSettings.datePattern = '");
      if (_jspx_meth_s_property_1(_jspx_page_context))
        return;
      out.write("'.replace('yyyy', 'yy').toLowerCase();\n");
      out.write("    \t//to avoid undefined warning on pre-login phase...\n");
      out.write("    \tif (typeof I18NSettings.datePattern === 'undefined') {\n");
      out.write("    \t    I18NSettings.datePattern = \"dd/mm/yy\";\n");
      out.write("    \t}\n");
      out.write("    \t//$._.setLocale('");
      if (_jspx_meth_s_property_2(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("    \t$._.setLocale('");
      if (_jspx_meth_s_property_3(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("    \tI18NSettings.language = '");
      if (_jspx_meth_s_property_4(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<script type='text/javascript' src='js/lib/jquery.validate.min.js'></script>\n");
      out.write("<script type='text/javascript' src='js/lib/jquery.metadata.js'></script>\n");
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type='text/javascript' src=\"js/lib/steal/steal.js?loader.js\"></script>\n");
      out.write("<script type='text/javascript' src='js/lib/jquery.jgrowl_minimized.js'></script>\n");
      out.write("<!-- full skiplink functionality in webkit browsers -->\n");
      out.write("<script src=\"yaml/core/js/yaml-focusfix.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--[if IE]>\n");
      out.write("<style>\n");
      out.write(".wc-scrollable-grid {\n");
      out.write("\twidth: 99% !important;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<![endif]-->   \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("#request.locale.getLanguage()");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent(null);
    _jspx_th_s_property_1.setValue("#session.datePattern");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent(null);
    _jspx_th_s_property_2.setValue("#request.locale");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
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
    _jspx_th_s_property_3.setValue("#request.locale.getLanguage()");
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
    _jspx_th_s_property_4.setValue("#request.locale.getLanguage()");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent(null);
    _jspx_th_s_if_0.setTest("#request.locale.getLanguage() != 'en'");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t<script type=\"text/javascript\" src=\"js/lang/messages_");
        if (_jspx_meth_s_property_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write(".js\"></script>\n");
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

  private boolean _jspx_meth_s_property_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_property_5.setValue("#request.locale.getLanguage()");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }
}
