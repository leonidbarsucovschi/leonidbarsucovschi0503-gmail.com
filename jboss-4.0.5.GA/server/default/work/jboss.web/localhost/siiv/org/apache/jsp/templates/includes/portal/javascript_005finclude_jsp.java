package org.apache.jsp.templates.includes.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class javascript_005finclude_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<script type=\"text/javascript\" src=\"jscalendar/calendar.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jscalendar/lang/calendar-en.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jscalendar/lang/calendar-ro.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jscalendar/calendar-setup.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/jportal.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">var pageLoaded=false; var indexPage=false;</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/ajax_jpf_beta/jportal_utils_js.jsp\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/ajax_jpf_beta/jportal_http_request_js.jsp\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/ajax_jpf_beta/jportal_form_submit_js.jsp\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/displaytag/jpdisplaytag_js.jsp\" ></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/sniffer.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/init.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/menu.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/util.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/admmenu.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/jportal.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/dtree.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/firma.js\" language=\"JavaScript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"selectionComponent/script/selectioncomponent.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"selectionComponent/script/hashtable.js\"></script>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
