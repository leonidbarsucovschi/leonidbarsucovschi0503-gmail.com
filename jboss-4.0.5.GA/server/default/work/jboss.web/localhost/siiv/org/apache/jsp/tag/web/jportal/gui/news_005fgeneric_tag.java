package org.apache.jsp.tag.web.jportal.gui;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.apmc.sys.util.SystemUtil;

public final class news_005fgeneric_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/tld/jstl1.1/c.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/jportal/sys/sys.tld");
    _jspx_dependants.add("/WEB-INF/tags/jportal/sys/cmodule.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;

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
  private java.lang.String key;
  private java.lang.String bundle;
  private java.lang.String style;
  private java.lang.String type;
  private java.lang.String bifa;
  private java.lang.String background;
  private java.lang.String height;
  private java.lang.String method;

  public java.lang.String getKey() {
    return this.key;
  }

  public void setKey(java.lang.String key) {
    this.key = key;
  }

  public java.lang.String getBundle() {
    return this.bundle;
  }

  public void setBundle(java.lang.String bundle) {
    this.bundle = bundle;
  }

  public java.lang.String getStyle() {
    return this.style;
  }

  public void setStyle(java.lang.String style) {
    this.style = style;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public java.lang.String getBifa() {
    return this.bifa;
  }

  public void setBifa(java.lang.String bifa) {
    this.bifa = bifa;
  }

  public java.lang.String getBackground() {
    return this.background;
  }

  public void setBackground(java.lang.String background) {
    this.background = background;
  }

  public java.lang.String getHeight() {
    return this.height;
  }

  public void setHeight(java.lang.String height) {
    this.height = height;
  }

  public java.lang.String getMethod() {
    return this.method;
  }

  public void setMethod(java.lang.String method) {
    this.method = method;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_bean_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_bundle_nobody.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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
    if( getKey() != null ) 
      _jspx_page_context.setAttribute("key", getKey());
    if( getBundle() != null ) 
      _jspx_page_context.setAttribute("bundle", getBundle());
    if( getStyle() != null ) 
      _jspx_page_context.setAttribute("style", getStyle());
    if( getType() != null ) 
      _jspx_page_context.setAttribute("type", getType());
    if( getBifa() != null ) 
      _jspx_page_context.setAttribute("bifa", getBifa());
    if( getBackground() != null ) 
      _jspx_page_context.setAttribute("background", getBackground());
    if( getHeight() != null ) 
      _jspx_page_context.setAttribute("height", getHeight());
    if( getMethod() != null ) 
      _jspx_page_context.setAttribute("method", getMethod());

    try {
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("    <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <TD width=10><IMG height=10 src=\"images/e_tl.gif\" width=10></TD>\r\n");
      out.write("            <TD background=\"images/e_t.gif\"><IMG height=10 src=\"images/t.gif\" width=3></TD>\r\n");
      out.write("            <TD width=10><IMG height=10 src=\"images/e_tr.gif\" width=11></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <TD width=10 background=\"images/e_l.gif\"><IMG height=4 src=\"images/e_l.gif\" width=10></TD>\r\n");
      out.write("            <TD bgColor=#ffffff>\r\n");
      out.write("                <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                        <TR>\r\n");
      out.write("                            <TD class=\"text_title\">\r\n");
      out.write("                                ");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </TD>\r\n");
      out.write("                        </TR>\r\n");
      out.write("                        <tr height=\"10\">\r\n");
      out.write("                            <td></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <TR>\r\n");
      out.write("                            <TD class=smallbodylite background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${background}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\" style=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${style}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\" height=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${height}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("                                ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      _jspx_th_c_set_0.setVar("cprefix");
      _jspx_th_c_set_0.setScope("request");
      _jspx_th_c_set_0.setValue(SystemUtil.getModulePrefix(request));
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/portal/vizstire.do" + (("/portal/vizstire.do").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("method", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${method}", java.lang.String.class, (PageContext)this.getJspContext(), null, false), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("tip_stire", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)this.getJspContext(), null, false), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("xinclude", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_sys_cmodule_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </TD>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <TD>\r\n");
      out.write("                                <A class=homepagelink\r\n");
      out.write("                                   href=\"");
      out.print( "portal/vizstire.do?method=showNewsDetailList&tip_stire=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.print("&bifa=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bifa}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\">(\r\n");
      out.write("                                    ");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write(")</A>\r\n");
      out.write("                                &nbsp;&nbsp;\r\n");
      out.write("                                <A class=homepagelink\r\n");
      out.write("                                   href=\"");
      out.print( "portal/vizstire.do?method=showNewsArchiveList&tip_stire=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.print("&bifa=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bifa}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\">(\r\n");
      out.write("                                    ");
      if (_jspx_meth_bean_message_2(_jspx_page_context))
        return;
      out.write(")</A>\r\n");
      out.write("                            </TD>\r\n");
      out.write("                        </TR>\r\n");
      out.write("                    </TBODY>\r\n");
      out.write("                </TABLE>\r\n");
      out.write("            </TD>\r\n");
      out.write("            <TD width=10 background=\"images/e_r.gif\"><IMG height=5 src=\"images/e_r.gif\" width=11></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <TD width=10><IMG height=10 src=\"images/e_bl.gif\" width=10></TD>\r\n");
      out.write("            <TD background=\"images/e_b.gif\"><IMG height=10 src=\"images/e_b.gif\" width=3></TD>\r\n");
      out.write("            <TD width=10><IMG height=10 src=\"images/e_br.gif\" width=11></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("    </TBODY>\r\n");
      out.write("</TABLE>");
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

  private boolean _jspx_meth_bean_message_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_bean_message_0.setBundle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bundle}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_bean_message_0.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_sys_cmodule_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sys:cmodule
    org.apache.jsp.tag.web.jportal.sys.cmodule_tag _jspx_th_sys_cmodule_0 = new org.apache.jsp.tag.web.jportal.sys.cmodule_tag();
    _jspx_th_sys_cmodule_0.setJspContext(_jspx_page_context);
    _jspx_th_sys_cmodule_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_sys_cmodule_0.setPrefix((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cprefix}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_sys_cmodule_0.doTag();
    return false;
  }

  private boolean _jspx_meth_bean_message_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_bean_message_1.setBundle("portal");
    _jspx_th_bean_message_1.setKey("portal.mai_mult");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_bundle_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_bean_message_2.setBundle("portal");
    _jspx_th_bean_message_2.setKey("portal.arhiva");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_bean_message_key_bundle_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }
}
