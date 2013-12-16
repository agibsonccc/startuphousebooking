package org.apache.jsp.WEB_002dINF.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class roomType_mustache_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_text_name_nobody.release();
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
      out.write("\n");
      out.write("\t<script id=\"edit-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t<form id=\"edit-form\" class=\"yform json full\" role=\"application\">\n");
      out.write("                <div class=\"c50l\">\n");
      out.write("                  \t<div class=\"type-text\">\t\n");
      out.write("                  \t\t<label for=\"FormName\">");
      if (_jspx_meth_s_text_0(_jspx_page_context))
        return;
      out.write("<sup title=\"");
      if (_jspx_meth_s_text_1(_jspx_page_context))
        return;
      out.write(".\">*</sup></label>\n");
      out.write("                \t\t<input type=\"text\" class=\"required\" name=\"name\" id=\"FormName\" value=\"{{name}}\" aria-required=\"true\"/>\n");
      out.write("                  \t</div>\n");
      out.write("                  \t<div class=\"type-text\">           \n");
      out.write("       \t\t\t\t\t<label for=\"FormMax\">");
      if (_jspx_meth_s_text_2(_jspx_page_context))
        return;
      out.write("<sup title=\"");
      if (_jspx_meth_s_text_3(_jspx_page_context))
        return;
      out.write(".\">*</sup></label>\n");
      out.write("                    \t<input type=\"text\" class=\"required number small_input\" name=\"maxGuests\" id=\"FormMax\" value=\"{{maxGuests}}\" aria-required=\"true\"/>\n");
      out.write("      \t\t      \t</div> \n");
      out.write("\t\t\t\t  \t<div class=\"type-text\">\t\n");
      out.write("                  \t\t<label for=\"FormNotes\">");
      if (_jspx_meth_s_text_4(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("\t\t\t\t\t\t<textarea name=\"notes\" id=\"FormNotes\">{{notes}}</textarea>\t\t \n");
      out.write("                  \t</div>\n");
      out.write("                  \t<div class=\"type-button\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn_save\">");
      if (_jspx_meth_s_text_5(_jspx_page_context))
        return;
      out.write("</button>\n");
      out.write("                \t\t<button class=\"btn_reset btn_cancel_form\">");
      if (_jspx_meth_s_text_6(_jspx_page_context))
        return;
      out.write("</button>\n");
      out.write("                    </div>\t\n");
      out.write("                </div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"view-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t<form id=\"view-form\" class=\"yform json inview\" role=\"application\">\n");
      out.write("            \t<div class=\"c50l\">\n");
      out.write("                  \t<div class=\"type-text\">\t\n");
      out.write("                  \t\t<strong>");
      if (_jspx_meth_s_text_7(_jspx_page_context))
        return;
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<span>{{name}}</span>\n");
      out.write("                  \t</div>\n");
      out.write("                  \t<div class=\"type-text\">           \n");
      out.write("       \t\t\t\t\t<strong>");
      if (_jspx_meth_s_text_8(_jspx_page_context))
        return;
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<span>{{maxGuests}}</span>\n");
      out.write("      \t\t      \t</div> \n");
      out.write("\t\t\t\t  \t<div class=\"type-text\">\t\n");
      out.write("                  \t\t<strong>");
      if (_jspx_meth_s_text_9(_jspx_page_context))
        return;
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<span>{{notes}}</span> \n");
      out.write("                  \t</div>\n");
      out.write("                </div>\n");
      out.write("\t\t\t\t<div class=\"c50l\">\n");
      out.write("                \t<div class=\"type-text\">\t\n");
      out.write("                \t</div>\n");
      out.write("\t\t\t  \t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"row-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t<div class=\"row-item\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><b>");
      if (_jspx_meth_s_text_10(_jspx_page_context))
        return;
      out.write(": </b>{{name}}</li>\n");
      out.write("\t\t\t\t<li><b>");
      if (_jspx_meth_s_text_11(_jspx_page_context))
        return;
      out.write(": </b>{{maxGuests}}</li>\n");
      out.write("\t\t\t\t<li><b>");
      if (_jspx_meth_s_text_12(_jspx_page_context))
        return;
      out.write(": </b>{{sub_description}}</li>\n");
      out.write("\t\t\t\t<li><input type=\"hidden\" name=\"id\" value=\"{{id}}\"/></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<span class=\"row-item-destroy\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"toolbar-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t<li><input id=\"item-autocomplete\" type=\"text\" value=\"\"/>\n");
      out.write("\t\t\t<div id=\"form-filter-container\"></div>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t\t<button id=\"item-filter\">&nbsp;</button>\n");
      out.write("\t\t</li>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("    <script id=\"form-filter-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t<form  id=\"filter-form\" class=\"yform json full\" role=\"application\">\n");
      out.write("\t\t\t<span class=\"filter-close\"></span>          \t\n");
      out.write("  \t\t\t<div class=\"c80l\">\n");
      out.write("               \t<div class=\"type-text\">\t\n");
      out.write("                  \t<label for=\"fFormName\">");
      if (_jspx_meth_s_text_13(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("                \t<input type=\"text\" name=\"name\" id=\"fFormName\" value=\"{{name}}\" aria-required=\"true\"/>\n");
      out.write("               \t</div>\n");
      out.write("               \t<div class=\"type-text\">           \n");
      out.write("       \t\t\t\t<label for=\"fFormMax\">");
      if (_jspx_meth_s_text_14(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("                   \t<input type=\"text\" name=\"maxGuests\" id=\"fFormMax\" value=\"{{maxGuests}}\" aria-required=\"true\"/>\n");
      out.write("      \t\t    </div>\n");
      out.write("                <div class=\"type-button\">\n");
      out.write("\t\t\t\t\t<button class=\"btn_submit\">");
      if (_jspx_meth_s_text_15(_jspx_page_context))
        return;
      out.write("</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"facility-row-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t{{#id}}<span class=\"title-elem\">{{name}}</span><img src=\"");
      out.print(request.getContextPath( ));
      out.write("/rest/file/{{image.file.id}}\"/>{{/id}}\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"facility-row-edit-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t<input class=\"choose-elem\" {{#id}}checked=\"checked\"{{/id}} type=\"checkbox\" name=\"facilities[]\" value=\"{{id}}\"/>\n");
      out.write("\t\t<span class=\"title-elem\">{{facility.name}}</span>\t\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath( ));
      out.write("/rest/file/{{facility.image.file.id}}\"/>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"image-row-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t{{#id}}<span class=\"title-elem\">{{caption}}</span>\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath( ));
      out.write("/rest/file/{{file.id}}\"/>{{/id}}\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"image-row-edit-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t<input class=\"choose-elem\" {{#id}}checked=\"checked\"{{/id}} type=\"checkbox\" name=\"images[]\" value=\"{{id}}\"/>\n");
      out.write("\t\t<span class=\"title-elem\">{{image.caption}}</span>\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath( ));
      out.write("/rest/file/{{image.file.id}}\"/>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"facilities-view-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t<div class=\"wrapper inview\">\n");
      out.write("\t\t\t<ul></ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<span class=\"ui-rcarousel-next\"></span>\n");
      out.write("\t\t<span class=\"ui-rcarousel-prev disable\"></span>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"images-view-template\" type=\"text/x-handlebars-template\">\n");
      out.write("\t\t<div class=\"wrapper inview\">\n");
      out.write("\t\t\t<ul></ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<span class=\"ui-rcarousel-next\"></span>\n");
      out.write("\t\t<span class=\"ui-rcarousel-prev disable\"></span>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"facilities-edit-template\" type=\"text/x-handlebars-template\" >\n");
      out.write("\t\t<div class=\"add-new\">\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath( ));
      out.write("/findAllFacilities.action?sect=settings\" class=\"btn_add\">");
      if (_jspx_meth_s_text_16(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<ul></ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<span class=\"ui-rcarousel-next\"></span>\n");
      out.write("\t\t<span class=\"ui-rcarousel-prev disable\"></span>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script id=\"images-edit-template\" type=\"text/x-handlebars-template\" >\n");
      out.write("\t\t<div class=\"add-new\">\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath( ));
      out.write("/findAllImages.action?sect=settings\" class=\"btn_add\">");
      if (_jspx_meth_s_text_17(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<ul></ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<span class=\"ui-rcarousel-next\"></span>\n");
      out.write("\t\t<span class=\"ui-rcarousel-prev disable\"></span>\n");
      out.write("\t</script>\n");
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

  private boolean _jspx_meth_s_text_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent(null);
    _jspx_th_s_text_0.setName("name");
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
    _jspx_th_s_text_1.setName("thisFileMandatory");
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
    _jspx_th_s_text_2.setName("maxGuests");
    int _jspx_eval_s_text_2 = _jspx_th_s_text_2.doStartTag();
    if (_jspx_th_s_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_2);
    return false;
  }

  private boolean _jspx_meth_s_text_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_3 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_3.setPageContext(_jspx_page_context);
    _jspx_th_s_text_3.setParent(null);
    _jspx_th_s_text_3.setName("thisFileMandatory");
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
    _jspx_th_s_text_4.setName("notes");
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
    _jspx_th_s_text_5.setName("save");
    int _jspx_eval_s_text_5 = _jspx_th_s_text_5.doStartTag();
    if (_jspx_th_s_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_5);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_5);
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
    _jspx_th_s_text_6.setName("cancel");
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
    _jspx_th_s_text_7.setName("name");
    int _jspx_eval_s_text_7 = _jspx_th_s_text_7.doStartTag();
    if (_jspx_th_s_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_7);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_7);
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
    _jspx_th_s_text_8.setName("maxGuests");
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
    _jspx_th_s_text_9.setName("notes");
    int _jspx_eval_s_text_9 = _jspx_th_s_text_9.doStartTag();
    if (_jspx_th_s_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_9);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_9);
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
    _jspx_th_s_text_10.setName("name");
    int _jspx_eval_s_text_10 = _jspx_th_s_text_10.doStartTag();
    if (_jspx_th_s_text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_10);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_10);
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
    _jspx_th_s_text_11.setName("maxGuests");
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
    _jspx_th_s_text_12.setName("notes");
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
    _jspx_th_s_text_13.setName("name");
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
    _jspx_th_s_text_14.setName("maxGuests");
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
    _jspx_th_s_text_15.setName("search");
    int _jspx_eval_s_text_15 = _jspx_th_s_text_15.doStartTag();
    if (_jspx_th_s_text_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_15);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_15);
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
    _jspx_th_s_text_16.setName("facilityEdit");
    int _jspx_eval_s_text_16 = _jspx_th_s_text_16.doStartTag();
    if (_jspx_th_s_text_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_16);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_16);
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
    _jspx_th_s_text_17.setName("editImages");
    int _jspx_eval_s_text_17 = _jspx_th_s_text_17.doStartTag();
    if (_jspx_th_s_text_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_17);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_17);
    return false;
  }
}
