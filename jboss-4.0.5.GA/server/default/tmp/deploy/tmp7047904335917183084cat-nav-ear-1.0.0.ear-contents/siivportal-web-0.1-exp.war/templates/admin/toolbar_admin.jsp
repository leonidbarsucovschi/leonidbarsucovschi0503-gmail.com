<%@ page import="ro.uti.waf.security.User,
                 java.util.ResourceBundle,
                 java.util.Locale,
                 java.text.MessageFormat,
                 ro.uti.apmc.portal.components.util.DateUtils"%>

<%@ page import="org.apache.struts.Globals"%>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>

<!------- START HEADER ------------------------------------------------->
<%
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
%>
<%--APMC1.0-<b>@buildNum@</b>-<i>@buildDate@</i>--%>
<%--<a href="#" class="footer" style="text-decoration:none">--%>
 <span class="footer"><%=DateUtils.getNow(request,response)%></span>
<!--</a>-->
<IMG height=10 src="images/header_line.gif" width=14 style="vertical-align:middle" align="middle">
<%=output%>
<!------- END HEADER --------------------------------------------------->
