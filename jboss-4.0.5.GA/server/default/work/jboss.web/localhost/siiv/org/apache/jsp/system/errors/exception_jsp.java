package org.apache.jsp.system.errors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exception_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/jportal/sys/sys.tld");
    _jspx_dependants.add("/WEB-INF/tags/jportal/sys/base.tag");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/jstl1.1/c.tld");
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

  String path = request.getContextPath();

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("  <HEAD>\r\n");
      out.write("    <TITLE>\r\n");
      out.write("     Error\r\n");
      out.write("    </TITLE>\r\n");
      out.write("   ");
      if (_jspx_meth_sys_base_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.print(path);
      out.write("/css/global_styles.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.print(path);
      out.write("/css/page_styles.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.print(path);
      out.write("/css/element_styles.css\">\r\n");
      out.write("\r\n");
      out.write("  </HEAD>\r\n");
      out.write("  <BODY class=\"pagebg\" leftMargin=\"0\" topMargin=\"0\" marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("<!-- ################################################### aplicatii disponibile dupa logare #####################-->\r\n");
      out.write("<!-- asta e tabelul pentru intreaga pagina -->\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD><IMG height=\"10\" src=\"");
      out.print(path);
      out.write("/images/b_tl.gif\" width=\"14\" border=\"0\"></TD>\r\n");
      out.write("    <TD bgColor=\"#ffffff\"><IMG height=\"10\" src=\"");
      out.print(path);
      out.write("/images/t.gif\" width=\"1\" border=\"0\"></TD>\r\n");
      out.write("    <TD><IMG height=\"10\" src=\"");
      out.print(path);
      out.write("/images/b_tr.gif\" width=\"14\" border=\"0\"></TD></TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD vAlign=top width=14 background=\"");
      out.print(path);
      out.write("/images/b_l.gif\" rowSpan=2><IMG height=217 src=\"");
      out.print(path);
      out.write("/images/b_l1.gif\" width=14 border=\"0\"></TD>\r\n");
      out.write("    <TD vAlign=top width=\"100%\" bgColor=\"#ffffff\">\r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD vAlign=top bgColor=\"#ffffff\">\r\n");
      out.write("          &nbsp;\r\n");
      out.write("              </TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <TR>\r\n");
      out.write("              <TD vAlign=top bgColor=\"#ffffff\"><IMG height=7 src=\"");
      out.print(path);
      out.write("/images/t.gif\" width=1 border=\"0\"></TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD vAlign=top bgColor=\"#ffffff\">\r\n");
      out.write("\r\n");
      out.write("                    <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" align=left border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    <TR bgcolor=\"#0066CC\" height=\"24\" width=\"100%\">\r\n");
      out.write("                    <td align=\"right\" valign=\"middle\" class=\"label-footer\">\r\n");
      out.write("                    <!-- aici intra meniul daca e bagat ca la ZEUS si se sterge cel de sus-->\r\n");
      out.write("                    </td>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    </TBODY>\r\n");
      out.write("                </TABLE>\r\n");
      out.write("\r\n");
      out.write("               </TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <tr bgcolor=\"#FFFFFF\" height=\"3\"><td></td></tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <tr bgcolor=\"#E8E8E8\">\r\n");
      out.write("                <td>\r\n");
      out.write("                    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td valign=\"top\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD vAlign=top bgColor=\"#e8e8e8\">\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("            <TBODY>\r\n");
      out.write("              <TR vAlign=top>\r\n");
      out.write("                      <TD WIDTH=\"100%\" align=\"center\" valign=\"top\" bgcolor=\"white\" height=\"600\">\r\n");
      out.write("\r\n");
      out.write("                        <h2>System error</h2>\r\n");
      out.write("                        Cererea dvs nu a putut fi procesata. Daca eroarea persista contactati administratorul sistemului.<br>                        \r\n");
      out.write("                        Va multumim pentru intelegere.\r\n");
      out.write("                      </TD>\r\n");
      out.write("                        </TR>\r\n");
      out.write("                        </TBODY></TABLE></TD></TR>\r\n");
      out.write("        <TR><!--marginea de jos a portiunii care tine portletii -->\r\n");
      out.write("          <TD vAlign=top bgColor=\"#ffffff\">\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD width=10><IMG height=10 src=\"");
      out.print(path);
      out.write("/images/f_bl.gif\" width=10></TD>\r\n");
      out.write("                <TD bgColor=\"#e8e8e8\"><IMG height=1 src=\"");
      out.print(path);
      out.write("/images/t.gif\" width=1></TD>\r\n");
      out.write("                <TD width=10><IMG height=10 src=\"");
      out.print(path);
      out.write("/images/f_br.gif\"  width=10></TD>\r\n");
      out.write("              </TR>\r\n");
      out.write("              </TBODY>\r\n");
      out.write("            </TABLE>\r\n");
      out.write("          </TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        </TBODY>\r\n");
      out.write("       </TABLE>\r\n");
      out.write("    </TD>\r\n");
      out.write("    <TD vAlign=top width=14 background=\"");
      out.print(path);
      out.write("/images/b_r.gif\" rowSpan=2><IMG height=217 src=\"");
      out.print(path);
      out.write("/images/b_r1.gif\" width=14>\r\n");
      out.write("    </TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD vAlign=top bgColor=\"#ffffff\"><IMG height=8 src=\"");
      out.print(path);
      out.write("/images/t.gif\" width=1></TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  <TR><!-- ultima margine rotunjita -->\r\n");
      out.write("    <TD width=14><IMG height=15 src=\"");
      out.print(path);
      out.write("/images/b_bl.gif\" width=14></TD>\r\n");
      out.write("    <TD width=744 background=\"");
      out.print(path);
      out.write("/images/b_b.gif\"><IMG height=15 src=\"");
      out.print(path);
      out.write("/images/t.gif\" width=1></TD>\r\n");
      out.write("    <TD width=14><IMG height=15 src=\"");
      out.print(path);
      out.write("/images/b_br.gif\"  width=14></TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("\r\n");
      out.write("    <TD colspan=\"3\" align=\"center\" valign=\"middle\">\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/footer.jsp", out, false);
      out.write("\r\n");
      out.write("    </TD>\r\n");
      out.write("\r\n");
      out.write("   </TR>\r\n");
      out.write("   </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<P></P>\r\n");
      out.write("\r\n");
      out.write("</BODY></HTML>");
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

  private boolean _jspx_meth_sys_base_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sys:base
    org.apache.jsp.tag.web.jportal.sys.base_tag _jspx_th_sys_base_0 = new org.apache.jsp.tag.web.jportal.sys.base_tag();
    _jspx_th_sys_base_0.setJspContext(_jspx_page_context);
    _jspx_th_sys_base_0.doTag();
    return false;
  }
}
