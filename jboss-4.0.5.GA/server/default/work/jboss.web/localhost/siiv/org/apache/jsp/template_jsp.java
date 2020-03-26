package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.waf.util.LanguageUtil;
import ro.uti.apmc.sys.util.SysCfgParam;
import ro.uti.settings.util.Constants;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(9);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/jportal/gui/gui.tld");
    _jspx_dependants.add("/WEB-INF/tld/jportal/sys/sys.tld");
    _jspx_dependants.add("/WEB-INF/tags/jportal/sys/base.tag");
    _jspx_dependants.add("/WEB-INF/tld/jstl1.1/c.tld");
    _jspx_dependants.add("/WEB-INF/tags/jportal/gui/menu.tag");
    _jspx_dependants.add("/WEB-INF/tags/jportal/sys/cmodule.tag");
    _jspx_dependants.add("/WEB-INF/tags/jportal/gui/portlet.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_page_module;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_link_page_module = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_link_page_module.release();
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
      response.setContentType("text/html; charset=iso-8859-2");
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

	LanguageUtil.setLocaleRo(request);
	session.setAttribute(SysCfgParam.REFRESH_MENU, "true");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("    <HEAD>\r\n");
      out.write("        <TITLE>ADMIN Portal SVM</TITLE>\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_sys_base_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <META http-equiv=Content-Type content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/includes/app/style_include.jsp", out, false);
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/includes/app/javascript_include.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </HEAD>\r\n");
      out.write("\r\n");
      out.write("    <BODY class=\"pagebg\" leftMargin=\"0\" topMargin=\"0\" marginheight=\"0\" marginwidth=\"0\" onLoad=\"javascript:pageLoaded=true;\">\r\n");
      out.write("        <!-- ################################################### aplicatii disponibile dupa logare #####################-->\r\n");
      out.write("        <div id=ToolTip style=\"position:absolute;top:0;left:0;background:#FFFFFF;border-color:#65d0e7;border-style:solid;border-width:1px 1px 1px 1px;visibility:hidden;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- asta e tabelul pentru intreaga pagina -->\r\n");
      out.write("        &nbsp;\r\n");
      out.write("        <TABLE cellSpacing=0 cellPadding=0 width=\"980\" align=center border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD><IMG height=\"10\" src=\"images/b_tl.gif\" width=\"14\" border=\"0\"></TD>\r\n");
      out.write("                <TD bgColor=\"#ffffff\"><IMG height=\"10\" src=\"images/t.gif\" width=\"1\" border=\"0\"></TD>\r\n");
      out.write("                <TD><IMG height=\"10\" src=\"images/b_tr.gif\" width=\"14\" border=\"0\"></TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD vAlign=top width=14 background=\"images/b_l.gif\" rowSpan=2>\r\n");
      out.write("                    <IMG height=217 src=\"images/b_l1.gif\" width=14 border=\"0\">\r\n");
      out.write("                </TD>\r\n");
      out.write("                <TD vAlign=top width=\"100%\" bgColor=\"#ffffff\">\r\n");
      out.write("                <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("                <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                        <td>\r\n");
      out.write("                        <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td rowspan=\"2\" width=\"225\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_html_link_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td align=\"right\">\r\n");
      out.write("                                    <div id=\"appDiv\" align=\"right\"\r\n");
      out.write("                                         style=\"z-index: 999; position: relative; right:0px; top: 0px; width: 200px; height:21px;\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_gui_menu_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <TR>\r\n");
      out.write("                                <TD align=\"right\">\r\n");
      out.write("                                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/admin/toolbar_admin.jsp", out, false);
      out.write("\r\n");
      out.write("                                </TD>\r\n");
      out.write("                            </TR>\r\n");
      out.write("                        </table>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                        <TD vAlign=top bgColor=\"#ffffff\"><IMG height=7 src=\"images/t.gif\" width=1 border=\"0\"></TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                        <TD vAlign=top bgColor=\"#ffffff\">\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" align=left border=0>\r\n");
      out.write("                        <TBODY>\r\n");
      out.write("                            <TR bgcolor=\"#0066CC\" height=\"24\">\r\n");
      out.write("                                <td>\r\n");

 //String parameter = request.getParameter("parentMenuId");
  String parameter = String.valueOf(session.getAttribute(Constants.USER_MENU_PARENT));
  if(parameter==null)
    parameter="2";

      out.write("\r\n");
      out.write("                                    ");
      //  gui:menu
      org.apache.jsp.tag.web.jportal.gui.menu_tag _jspx_th_gui_menu_1 = new org.apache.jsp.tag.web.jportal.gui.menu_tag();
      _jspx_th_gui_menu_1.setJspContext(_jspx_page_context);
      _jspx_th_gui_menu_1.setMethod("showMenuTree");
      _jspx_th_gui_menu_1.setParentMenu(parameter);
      _jspx_th_gui_menu_1.doTag();
      out.write("\r\n");
      out.write("                                    <!-- aici intra meniul daca e bagat ca la ZEUS si se sterge cel de sus-->\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </TR>\r\n");
      out.write("                        </TBODY>\r\n");
      out.write("                        </TABLE>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        </TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    <tr bgcolor=\"#FFFFFF\" height=\"3\"><td></td></tr>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <tr bgcolor=\"#E8E8E8\">\r\n");
      out.write("                        <td>\r\n");
      out.write("                        <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td valign=\"top\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <!-------------- asta este table row-ul care contine portletzii...\r\n");
      out.write("                    primii sunt pusi intr-o celula iar ceilalti in alta celula care pare sa se intinda pe tot restul paginii...-->\r\n");
      out.write("                    <TR>\r\n");
      out.write("                        <TD vAlign=top bgColor=\"#e8e8e8\">\r\n");
      out.write("                        <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("                        <TBODY>\r\n");
      out.write("                            <TR vAlign=top>\r\n");
      out.write("                                <TD WIDTH=\"100%\" align=\"center\" valign=\"top\">\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_gui_portlet_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    <!-- sfarsit tabelul cu CONTENT -->\r\n");
      out.write("                                </TD>\r\n");
      out.write("                            </TR>\r\n");
      out.write("                        </TBODY>\r\n");
      out.write("                        </TABLE>\r\n");
      out.write("                        </TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    <TR>");
      out.write("\r\n");
      out.write("                        <TD vAlign=top bgColor=\"#ffffff\">\r\n");
      out.write("                        <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("                        <TBODY>\r\n");
      out.write("                            <TR>\r\n");
      out.write("                                <TD width=10><IMG height=10 src=\"images/f_bl.gif\" width=10></TD>\r\n");
      out.write("                                <TD bgColor=\"#e8e8e8\"><IMG height=1 src=\"images/t.gif\" width=1></TD>\r\n");
      out.write("                                <TD width=10><IMG height=10 src=\"images/f_br.gif\" width=10></TD>\r\n");
      out.write("                            </TR>\r\n");
      out.write("                        </TBODY>\r\n");
      out.write("                        </TABLE>\r\n");
      out.write("                        </TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                </TBODY>\r\n");
      out.write("                </TABLE>\r\n");
      out.write("                </TD>\r\n");
      out.write("                <TD vAlign=top width=14 background=\"images/b_r.gif\" rowSpan=2><IMG height=217 src=\"images/b_r1.gif\" width=14></TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD vAlign=top bgColor=\"#ffffff\"><IMG height=8 src=\"images/t.gif\" width=1></TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <TR>");
      out.write("\r\n");
      out.write("                <TD width=14><IMG height=15 src=\"images/b_bl.gif\" width=14></TD>\r\n");
      out.write("                <TD width=744 background=\"images/b_b.gif\"><IMG height=15 src=\"images/t.gif\" width=1></TD>\r\n");
      out.write("                <TD width=14><IMG height=15 src=\"images/b_br.gif\" width=14></TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD colspan=\"3\" align=\"center\" valign=\"middle\">\r\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("                </TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("        </TBODY>\r\n");
      out.write("        </TABLE>\r\n");
      out.write("        <P></P>\r\n");
      out.write("    </BODY>\r\n");
      out.write("</HTML>");
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

  private boolean _jspx_meth_html_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page_module.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_0.setPageContext(_jspx_page_context);
    _jspx_th_html_link_0.setParent(null);
    _jspx_th_html_link_0.setModule("");
    _jspx_th_html_link_0.setPage("/login.do?method=index");
    int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
    if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        <img src=\"images/logo.gif\" border=\"0\">\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_html_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page_module.reuse(_jspx_th_html_link_0);
      return true;
    }
    _jspx_tagPool_html_link_page_module.reuse(_jspx_th_html_link_0);
    return false;
  }

  private boolean _jspx_meth_gui_menu_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gui:menu
    org.apache.jsp.tag.web.jportal.gui.menu_tag _jspx_th_gui_menu_0 = new org.apache.jsp.tag.web.jportal.gui.menu_tag();
    _jspx_th_gui_menu_0.setJspContext(_jspx_page_context);
    _jspx_th_gui_menu_0.setMethod("showAppMenu");
    _jspx_th_gui_menu_0.doTag();
    return false;
  }

  private boolean _jspx_meth_gui_portlet_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gui:portlet
    org.apache.jsp.tag.web.jportal.gui.portlet_tag _jspx_th_gui_portlet_0 = new org.apache.jsp.tag.web.jportal.gui.portlet_tag();
    _jspx_th_gui_portlet_0.setJspContext(_jspx_page_context);
    _jspx_th_gui_portlet_0.setContent("portlets/callback/call_gen_content.jsp");
    _jspx_th_gui_portlet_0.doTag();
    return false;
  }
}
