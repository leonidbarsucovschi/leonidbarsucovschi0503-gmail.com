package org.apache.jsp.composite.script;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.jpf.base.composite.util.CompositePresentationConst;
import ro.uti.jpf.base.composite.util.CompositeConstants;

public final class composite_005flist_005fjs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
  }

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
      response.setContentType("text/javascript; charset=iso-8859-2");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeChangeFilterElementsVisibility(visible) {\r\n");
      out.write("    var elm = document.getElementById(\"");
      out.print(CompositePresentationConst.COMPOSITE_FILTER_ELEMENT_ID);
      out.write("\");\r\n");
      out.write("\r\n");
      out.write("    if (elm == null) {\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    elm.className = visible ? \"\" : \"composite-hidden\";\r\n");
      out.write("\r\n");
      out.write("    if (typeof(document.navigationForm) != \"undefined\") {\r\n");
      out.write("\t\t    document.navigationForm.search.value = visible ? \"1\" : \"0\";\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function compositeExecuteFilter() {\r\n");
      out.write("    var elm = document.getElementById(\"");
      out.print(CompositePresentationConst.FORM_ID);
      out.write("\");\r\n");
      out.write("\r\n");
      out.write("    if (elm == null) {\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    if (typeof(elm.onsubmit) == \"function\") {\r\n");
      out.write("        if (!elm.onsubmit()) {\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    elm.submit();\r\n");
      out.write("}");
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
