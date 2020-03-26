package org.apache.jsp.tag.web.jportal.gui;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class portlet_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
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
  private java.lang.String content;

  public java.lang.String getContent() {
    return this.content;
  }

  public void setContent(java.lang.String content) {
    this.content = content;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    if( getContent() != null ) 
      _jspx_page_context.setAttribute("content", getContent());

    try {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("    <TR>\r\n");
      out.write("      <TD bgColor=#ffffff>\r\n");
      out.write("        <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("          <TBODY>\r\n");
      out.write("            <TR>\r\n");
      out.write("              <TD width=10><IMG height=10 src=\"images/e_tl.gif\" width=10></TD>\r\n");
      out.write("              <TD background=\"images/e_t.gif\"><IMG height=10 src=\"images/t.gif\" width=3></TD>\r\n");
      out.write("              <TD width=10><IMG height=10 src=\"images/e_tr.gif\" width=11></TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <TR>\r\n");
      out.write("              <TD width=10 background=\"images/e_l.gif\"><IMG height=4 src=\"images/e_l.gif\" width=10></TD>\r\n");
      out.write("              <TD bgColor=#ffffff>\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${content}", java.lang.String.class, (PageContext)this.getJspContext(), null, false), out, false);
      out.write("                                \r\n");
      out.write("              </TD>\r\n");
      out.write("              <TD width=10 background=\"images/e_r.gif\"><IMG height=5 src=\"images/e_r.gif\" width=11></TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("            <TR>\r\n");
      out.write("              <TD width=10><IMG height=10 src=\"images/e_bl.gif\" width=10></TD>\r\n");
      out.write("              <TD background=\"images/e_b.gif\"><IMG height=10 src=\"images/e_b.gif\" width=3></TD>\r\n");
      out.write("              <TD width=10><IMG height=10 src=\"images/e_br.gif\" width=11></TD>\r\n");
      out.write("            </TR>\r\n");
      out.write("          </TBODY>\r\n");
      out.write("        </TABLE>\r\n");
      out.write("      </TD>\r\n");
      out.write("    </TR>\r\n");
      out.write("  </TBODY>\r\n");
      out.write("</TABLE>\r\n");
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
    }
  }
}
