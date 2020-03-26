<%@ attribute name="prefix" required="true" %>
<%@ tag import="org.apache.struts.util.ModuleUtils"%>
<%@ tag import="ro.uti.apmc.sys.util.SystemUtil"%>

<%
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
%>