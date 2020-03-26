<%@ attribute name="suffix"%>
<%@ tag import="ro.uti.apmc.sys.util.DatabaseSysConfig"%>
<%@ tag import="ro.uti.waf.config.SystemConfig"%>
<%@ tag import="ro.uti.waf.base.simple.util.Constants"%>
<%@ tag isELIgnored="false" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%

  SystemConfig dbSysCfg = DatabaseSysConfig.getInstance();
  if (request.getRemoteAddr().equals(dbSysCfg.getParameter("gateSafe.host"))) {
     String gsUrlSecu = dbSysCfg.getParameter("gateSafe.url");
     String gsUrlPublic = dbSysCfg.getParameter("gateSafe.public");

      String protocol = request.getHeader(Constants.GATESAFE_PROTOCOL_HEADER);

      if(protocol !=null){
        if(protocol.startsWith("https"))
            request.setAttribute("gsUrl",gsUrlSecu);
         else
            request.setAttribute("gsUrl",gsUrlPublic);
      }
//   nu am protocol
    else{
           request.setAttribute("gsUrl",gsUrlPublic);
      }
%>

<base href="<c:out value="${gsUrl}${suffix}"/>"/>
<% } else { %>
<html:base/>
<% } %>