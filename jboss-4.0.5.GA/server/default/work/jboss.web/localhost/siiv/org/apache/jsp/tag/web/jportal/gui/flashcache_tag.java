package org.apache.jsp.tag.web.jportal.gui;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.Globals;
import java.util.Locale;

public final class flashcache_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/jstl1.1/c.tld");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String leftMenu;

  public java.lang.String getLeftMenu() {
    return this.leftMenu;
  }

  public void setLeftMenu(java.lang.String leftMenu) {
    this.leftMenu = leftMenu;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getLeftMenu() != null ) 
      _jspx_page_context.setAttribute("leftMenu", getLeftMenu());

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    int updateMain = 0;
    int updateLeft = 0;
    Locale cLocale = (Locale) session.getAttribute(Globals.LOCALE_KEY);
    String code = cLocale.getLanguage();


      out.write('\n');
      out.write('\n');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.SATT_P_MENU_RENDER}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    ");
 updateMain = 1;
          out.write("\n");
          out.write("    ");
 session.removeAttribute("SATT_P_MENU_RENDER");
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write('\n');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.SATT_P_LEFT_MENU_RENDER && leftMenu==1}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    ");
 updateLeft = 1;
          out.write("\n");
          out.write("    ");
 session.removeAttribute("SATT_P_LEFT_MENU_RENDER");
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"width:1px; height:1px; visibility:visible;\">\n");
      out.write("    <SCRIPT LANGUAGE=\"JavaScript\" type=\"text/javascript\"\n");
      out.write("\t    src=\"script/flashcache.js\"></SCRIPT>\n");
      out.write("    <OBJECT\n");
      out.write("\t    CLASSID=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\"\n");
      out.write("\t    WIDTH=\"100%\"\n");
      out.write("\t    HEIGHT=\"100%\"\n");
      out.write("\t    CODEBASE=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab\"\n");
      out.write("\t    ID=\"flashRepository\">\n");
      out.write("\t<PARAM NAME=\"MOVIE\" VALUE=\"flashSaveData.swf\">\n");
      out.write("\t<PARAM NAME=\"FLASHVARS\"\n");
      out.write("\t       VALUE=\"&updMain=");
      out.print(updateMain);
      out.write("&updTree=");
      out.print(updateLeft);
      out.write("&menuTree=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leftMenu}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("&lng=");
      out.print(code);
      out.write("&\">\n");
      out.write("\t<PARAM NAME=\"PLAY\" VALUE=\"false\">\n");
      out.write("\t<PARAM NAME=\"LOOP\" VALUE=\"false\">\n");
      out.write("\t<PARAM NAME=\"QUALITY\" VALUE=\"high\">\n");
      out.write("\t<PARAM NAME=\"SCALE\" VALUE=\"SHOWALL\">\n");
      out.write("\n");
      out.write("\t<EMBED\n");
      out.write("\t\tNAME=\"flashRepository\"\n");
      out.write("\t\tSRC=\"flashSaveData.swf\"\n");
      out.write("\t\tWIDTH=\"100%\"\n");
      out.write("\t\tHEIGHT=\"100%\"\n");
      out.write("\t\tPLAY=\"false\"\n");
      out.write("\t\tFLASHVARS=\"&updMain=");
      out.print(updateMain);
      out.write("&updTree=");
      out.print(updateLeft);
      out.write("&menuTree=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leftMenu}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("&lng=");
      out.print(code);
      out.write("&\"\n");
      out.write("\t\tLOOP=\"false\"\n");
      out.write("\t\tQUALITY=\"high\"\n");
      out.write("\t\tSCALE=\"SHOWALL\"\n");
      out.write("\t\tswLiveConnect=\"true\"\n");
      out.write("\t\tPLUGINSPAGE=\"http://www.macromedia.com/go/flashplayer\">\n");
      out.write("\t</EMBED>\n");
      out.write("    </OBJECT>\n");
      out.write("    <SCRIPT LANGUAGE=\"VBScript\">\n");
      out.write("\t<!-- // Catch FS Commands in IE, and pass them to the corresponding JavaScript function.\n");
      out.write("\tSub flashRepository_FSCommand(ByVal command,ByVal args)\n");
      out.write("\tcall flashRepository_DoFSCommand(command, args)\n");
      out.write("\tend sub // -->\n");
      out.write("    </SCRIPT>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\thasRightFlashVersion = hasFlashVersion(7);\n");
      out.write("    ");
 if(updateLeft == 1) { 
      out.write("\n");
      out.write("        var updateTree = true;\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        var updateTree = false;\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <form action=\"flashflag.jsp\" id=\"frmFlashFlag\" name=\"frmFlashFlag\"\n");
      out.write("\t  target=\"iframeFlashFlag\" method=\"POST\">\n");
      out.write("\t<input type=\"hidden\" name=\"flashInstalled\" value=\"0\">\n");
      out.write("    </form>\n");
      out.write("    <iframe width=\"1\" height=\"1\" src=\"about:blank\" frameborder=\"0\"\n");
      out.write("\t    id=\"iframeFlashFlag\" name=\"iframeFlashFlag\"></iframe>\n");
      out.write("</div>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }
}
