package org.apache.jsp.templates.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ro.uti.waf.security.User;
import java.util.ResourceBundle;
import java.util.Locale;
import java.text.MessageFormat;
import ro.uti.apmc.portal.components.util.DateUtils;
import org.apache.struts.Globals;

public final class toolbar_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts/struts-html.tld");
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
      response.setContentType("text/html");
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
      out.write("<!------- START HEADER ------------------------------------------------->\r\n");

  String output="";
    User user = (User)session.getAttribute(ro.uti.waf.base.simple.util.Constants.USER_KEY);
    if (user == null) {
      Locale locale = (Locale)session.getAttribute(Globals.LOCALE_KEY);
      ResourceBundle bundle = ResourceBundle.getBundle("uti.resources.web.sys.login", locale);
      String login = bundle.getString("login.login_test");     
      output ="<A href=\"login.do?method=showLogin\"  class=\"footer\">"+login+"</A>";
    } else {
        String welcomeMsg = "Welcome, {0}";
        Locale locale = (Locale)session.getAttribute(Globals.LOCALE_KEY);
        if (locale == null) locale = new Locale("en");//Just in case. This is not to happen but being the home page we won't risk it.
        ResourceBundle bundle = ResourceBundle.getBundle("uti.resources.web.sys.login", locale);
        welcomeMsg = bundle.getString("login.welcome");
        Object[] inserts = new Object[] {user.getName()};
        MessageFormat format = new MessageFormat(welcomeMsg, locale);
        welcomeMsg = format.format(inserts);
        String logout = bundle.getString("login.logout_test");
        output="<span class=\"smallbodylite\">"+welcomeMsg+" (<A href=\"login.do?method=logout\"  class=\"footer\">"+logout+"</A>)"+"</span>";
    }

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write(" <span class=\"footer\">");
      out.print(DateUtils.getNow(request,response));
      out.write("</span>\r\n");
      out.write("<!--</a>-->\r\n");
      out.write("<IMG height=10 src=\"images/header_line.gif\" width=14 style=\"vertical-align:middle\" align=\"middle\">\r\n");
      out.print(output);
      out.write("\r\n");
      out.write("<!------- END HEADER --------------------------------------------------->\r\n");
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
