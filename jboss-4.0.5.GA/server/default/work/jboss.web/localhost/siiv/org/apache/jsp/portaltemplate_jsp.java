package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.apmc.sys.util.SysCfgParam;

public final class portaltemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(12);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/jportal/gui/gui.tld");
    _jspx_dependants.add("/WEB-INF/tld/jportal/jpdisplaytag.tld");
    _jspx_dependants.add("/WEB-INF/tld/jportal/sys/sys.tld");
    _jspx_dependants.add("/WEB-INF/tags/jportal/sys/base.tag");
    _jspx_dependants.add("/WEB-INF/tld/jstl1.1/c.tld");
    _jspx_dependants.add("/WEB-INF/tags/jportal/gui/menu.tag");
    _jspx_dependants.add("/WEB-INF/tags/jportal/sys/cmodule.tag");
    _jspx_dependants.add("/WEB-INF/tags/jportal/gui/portlet.tag");
    _jspx_dependants.add("/WEB-INF/tags/jportal/gui/flashcache.tag");
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
      out.write("<HTML>\r\n");
      out.write("    <HEAD>\r\n");
      out.write("    <TITLE>Portal SVM</TITLE>\r\n");
      out.write("    ");
      if (_jspx_meth_sys_base_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <META http-equiv=Content-Type content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("\t<LINK REL=\"SHORTCUT ICON\" href=\"favicon.ico\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/includes/portal/style_include.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/includes/portal/javascript_include.jsp", out, false);
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var hasRightFlashVersion = false;\r\n");
      out.write("        var allowedDiskSpace = true;\r\n");
      out.write("        var treeMenuLoaded = false;\r\n");
      out.write("        var mainMenuLoaded = false;\r\n");
      out.write("        var startedMenus = false;\r\n");
      out.write("        var updateTree = true;\r\n");

    Object idMenuEntry = request.getSession().getAttribute("id_menu_entry");

      out.write("\r\n");
      out.write("        var menuIdToOpen = ");
      out.print(idMenuEntry);
      out.write(";\r\n");
      out.write("\r\n");
      out.write("        function onLoadHandler() {\r\n");
      out.write("            pageLoaded = true;\r\n");
      out.write("            //alert(hasRightFlashVersion + \", \" + allowedDiskSpace + \", \" + browser.isIE + \", \" + !browser.isOpera + \", \" + !browser.isFirefox);\r\n");
      out.write("            if(hasRightFlashVersion && allowedDiskSpace && browser.isIE && !browser.isOpera && !browser.isFirefox) {\r\n");
      out.write("                callFScommand(true,true,10);\r\n");
      out.write("                document.getElementById(\"frmFlashFlag\").flashInstalled.value = 0;\r\n");
      out.write("            }\r\n");
      out.write("            //if(updateTree || !browser.isIE) d.openTo(menuIdToOpen);\r\n");
      out.write("            document.getElementById(\"frmFlashFlag\").submit();\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');

    if(idMenuEntry != null) {
        request.getSession().setAttribute("id_menu_entry", "1");
    }

      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    </HEAD>\r\n");
      out.write("    <BODY class=\"pagebg\" leftMargin=\"0\" topMargin=\"0\" marginheight=\"0\" marginwidth=\"0\" onLoad=\"onLoadHandler();\">\r\n");
      out.write("    <!-- ################################################### aplicatii disponibile dupa logare #####################-->\r\n");
      out.write("    <div id=ToolTip style=\"position:absolute;top:0;left:0;background:#FFFFFF;border-color:#2F6090;border-style:solid;border-width:1px 1px 1px 1px;visibility:hidden;\"></div>\r\n");
      out.write("     <!-- asta e tabelul pentru intreaga pagina -->\r\n");
      out.write("    &nbsp;\r\n");
      out.write("    <TABLE cellSpacing=\"0\" cellPadding=\"0\" width=\"980\" align=\"center\" border=\"0\">\r\n");
      out.write("    <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <TD><IMG height=\"10\" src=\"images/b_tl.gif\" width=\"14\" border=\"0\"></TD>\r\n");
      out.write("            <TD bgColor=\"#ffffff\"><IMG height=\"10\" src=\"images/t.gif\" width=\"1\" border=\"0\"></TD>\r\n");
      out.write("            <TD><IMG height=\"10\" src=\"images/b_tr.gif\" width=\"14\" border=\"0\"></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <TD vAlign=top width=14 background=\"images/b_l.gif\" rowSpan=2><IMG height=217 src=\"images/b_l1.gif\" width=14 border=\"0\"></TD>\r\n");
      out.write("            <TD vAlign=top width=\"100%\" bgColor=\"#ffffff\">\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("            <TBODY>\r\n");
      out.write("                <TR>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td rowspan=\"2\" width=\"225\">");
      if (_jspx_meth_html_link_0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("                            <td align=\"right\">\r\n");
      out.write("                                <div id=\"appDiv\" style=\"z-index: 999; position: relative; right:0px; top: 0px; width: 200px; height:21px;\" align=\"right\">\r\n");
      out.write("                                ");
      if (_jspx_meth_gui_menu_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <TR>\r\n");
      out.write("                            <TD>\r\n");
      out.write("                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/main/toolbar_index.jsp", out, false);
      out.write("\r\n");
      out.write("                            </TD>\r\n");
      out.write("                        </TR>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <TR>\r\n");
      out.write("                    <TD vAlign=top bgColor=\"#ffffff\"><IMG height=7 src=\"images/t.gif\" width=1 border=\"0\"></TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <TR>\r\n");
      out.write("                    <TD vAlign=top bgColor=\"#0066CC\" height=\"24\">\r\n");
      out.write("                    <!------------ asta este meniul ---------------->\r\n");
      out.write("                    <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" align=left border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                        <TR bgcolor=\"#0066CC\" height=\"24\">\r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
      if (_jspx_meth_gui_menu_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </TR>\r\n");
      out.write("                    </TBODY>\r\n");
      out.write("                    </TABLE>\r\n");
      out.write("                    <!------------ sfarsit meniu ---------------->\r\n");
      out.write("                    </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <tr bgcolor=\"#FFFFFF\" height=\"3\">\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <!--###################################################################################################-->\r\n");
      out.write("                <tr bgcolor=\"#E8E8E8\">\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td valign=\"top\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("<!-------------- asta este table row-ul care contine portletzii...\r\n");
      out.write("             primii sunt pusi intr-o celula iar ceilalti in alta celula care pare sa se intinda pe tot restul paginii...-->\r\n");
      out.write("                <TR>\r\n");
      out.write("                    <TD vAlign=\"top\" bgColor=\"#e8e8e8\">\r\n");
      out.write("                    <TABLE cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\">\r\n");
      out.write("                        <TR vAlign=\"top\">\r\n");
      out.write("                            <TD WIDTH=\"85%\">\r\n");
      out.write("                                <!-- tabelul cu portletul CONTENT-->\r\n");
      out.write("                                ");
      if (_jspx_meth_gui_portlet_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <!-- sfarsit tabelul cu CONTENT -->\r\n");
      out.write("                            </TD>\r\n");
      out.write("                            <td id=\"treeMenu\">\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </TR>\r\n");
      out.write("                    </TABLE>\r\n");
      out.write("                    </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <TR>\r\n");
      out.write("                <!--marginea de jos a portiunii care tine portletii -->\r\n");
      out.write("                    <TD vAlign=\"top\" bgColor=\"#ffffff\">\r\n");
      out.write("                    <TABLE cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\">\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                        <TR>\r\n");
      out.write("                            <TD width=\"10\"><IMG height=\"10\" src=\"images/f_bl.gif\" width=\"10\"></TD>\r\n");
      out.write("                            <TD bgColor=\"#e8e8e8\"><IMG height=\"1\" src=\"images/t.gif\" width=\"1\"></TD>\r\n");
      out.write("                            <TD width=\"10\"><IMG height=\"10\" src=\"images/f_br.gif\" width=\"10\"></TD>\r\n");
      out.write("                        </TR>\r\n");
      out.write("                    </TBODY>\r\n");
      out.write("                    </TABLE>\r\n");
      out.write("                    </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("            </TBODY>\r\n");
      out.write("            </TABLE>\r\n");
      out.write("            </TD>\r\n");
      out.write("            <TD vAlign=\"top\" width=\"14\" background=\"images/b_r.gif\" rowSpan=\"2\"><IMG height=\"217\" src=\"images/b_r1.gif\" width=\"14\"></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <TD vAlign=\"top\" bgColor=\"#ffffff\"><IMG height=\"8\" src=\"images/t.gif\" width=\"1\"></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <!-- ultima margine rotunjita -->\r\n");
      out.write("            <TD width=\"14\"><IMG height=\"15\" src=\"images/b_bl.gif\" width=\"14\"></TD>\r\n");
      out.write("            <TD width=\"744\" background=\"images/b_b.gif\"><IMG height=\"15\" src=\"images/t.gif\" width=\"1\"></TD>\r\n");
      out.write("            <TD width=\"14\"><IMG height=\"15\" src=\"images/b_br.gif\" width=\"14\"></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <TD colspan=\"3\" align=\"center\" valign=\"middle\">\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("            </TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("    </TBODY>\r\n");
      out.write("    </TABLE>\r\n");
      out.write("    ");
      if (_jspx_meth_gui_fcache_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </BODY>\r\n");
      out.write("</HTML>\r\n");
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
        out.write("<img src=\"images/logo.gif\" border=\"0\">");
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

  private boolean _jspx_meth_gui_menu_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gui:menu
    org.apache.jsp.tag.web.jportal.gui.menu_tag _jspx_th_gui_menu_1 = new org.apache.jsp.tag.web.jportal.gui.menu_tag();
    _jspx_th_gui_menu_1.setJspContext(_jspx_page_context);
    _jspx_th_gui_menu_1.setMethod("showMenuTree");
    _jspx_th_gui_menu_1.setParentMenu("1");
    _jspx_th_gui_menu_1.doTag();
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

  private boolean _jspx_meth_gui_fcache_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  gui:fcache
    org.apache.jsp.tag.web.jportal.gui.flashcache_tag _jspx_th_gui_fcache_0 = new org.apache.jsp.tag.web.jportal.gui.flashcache_tag();
    _jspx_th_gui_fcache_0.setJspContext(_jspx_page_context);
    _jspx_th_gui_fcache_0.setLeftMenu("1");
    _jspx_th_gui_fcache_0.doTag();
    return false;
  }
}
