package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exception_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>\r\n");
      out.write("      System Error\r\n");
      out.write("    </title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("     <table>\r\n");
      out.write("        <tr align=\"center\" style=\"color:red;font-size:20;\">\r\n");
      out.write("          <td align=\"center\">\r\n");
      out.write("              EROARE DE SISTEM\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td style=\"height:20px;\">\r\n");
      out.write("              &nbsp;\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr align=\"center\" style=\"color:red;font-size:14;\">\r\n");
      out.write("          <td align=\"center\">\r\n");
      out.write("              Din cauza unor probleme tehnice activitatea site-ului <b>Portal SVM</b> este oprita. Ne cerem scuze pentru inconvenienta.\r\n");
      out.write("              Va rugam sa asteptati pana ce sistemul va fi repus in functiune.\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("     </table>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
