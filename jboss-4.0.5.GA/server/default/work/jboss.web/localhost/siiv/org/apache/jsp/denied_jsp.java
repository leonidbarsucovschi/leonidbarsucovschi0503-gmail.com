package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class denied_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script  type=\"text/javascript\">\r\n");
      out.write("  var loaded=");
      out.print(request.getParameter("x"));
      out.write(";\r\n");
      out.write("  if(window.parent!=null && loaded==null){\r\n");
      out.write("    window.parent.location=\"");
      out.print(request.getContextPath());
      out.write("/template.jsp?page=denied&x=1\";\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("  <p>\r\n");
      out.write("    &nbsp;\r\n");
      out.write("  </p>\r\n");
      out.write("  <p>\r\n");
      out.write("    &nbsp;\r\n");
      out.write("  </p>\r\n");
      out.write("      <p align=\"center\">\r\n");
      out.write("      <img src=\"images/error32.gif\" title=\"Error\" align=\"right\"/>\r\n");
      out.write("      <b>");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("</b>\r\n");
      out.write("      </p>\r\n");
      out.write("  <p>\r\n");
      out.write("    &nbsp;\r\n");
      out.write("  </p>\r\n");
      out.write("  <p>\r\n");
      out.write("    &nbsp;\r\n");
      out.write("  </p>\r\n");
      out.write("  <p>\r\n");
      out.write("    &nbsp;\r\n");
      out.write("  </p>\r\n");
      out.write("  <p>\r\n");
      out.write("    &nbsp;\r\n");
      out.write("  </p>\r\n");
      out.write("  <p>\r\n");
      out.write("    &nbsp;\r\n");
      out.write("  </p>\r\n");
      out.write("  <p>\r\n");
      out.write("    &nbsp;\r\n");
      out.write("  </p>\r\n");
      out.write("  <p>\r\n");
      out.write("    &nbsp;\r\n");
      out.write("  </p>\r\n");
      out.write("  <p>\r\n");
      out.write("    &nbsp;\r\n");
      out.write("  </p>  \r\n");
      out.write("</div>");
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

  private boolean _jspx_meth_bean_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent(null);
    _jspx_th_bean_message_0.setKey("error.access.denied");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }
}
