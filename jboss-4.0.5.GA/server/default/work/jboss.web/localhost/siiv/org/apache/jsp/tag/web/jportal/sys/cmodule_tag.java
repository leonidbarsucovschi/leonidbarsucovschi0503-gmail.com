package org.apache.jsp.tag.web.jportal.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.ModuleUtils;
import ro.uti.apmc.sys.util.SystemUtil;

public final class cmodule_tag
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
  private java.lang.String prefix;

  public java.lang.String getPrefix() {
    return this.prefix;
  }

  public void setPrefix(java.lang.String prefix) {
    this.prefix = prefix;
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
    if( getPrefix() != null ) 
      _jspx_page_context.setAttribute("prefix", getPrefix());

    try {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

//  ServletContext context = session.getServletContext();
//  Enumeration atn = context.getAttributeNames();
//  while (atn.hasMoreElements()) {
//    String name = (java.lang.String) atn.nextElement();
//    if(name.startsWith(Globals.MODULE_KEY))
//    System.out.println("name = " + name);
//    //System.out.println("context.getAttribute(name); = " + context.getAttribute(name));
//  }

//
//  System.out.println("prefix=" + prefix+":");
  ModuleUtils.getInstance().selectModule(SystemUtil.fixPrefix(prefix), request, session.getServletContext());

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
