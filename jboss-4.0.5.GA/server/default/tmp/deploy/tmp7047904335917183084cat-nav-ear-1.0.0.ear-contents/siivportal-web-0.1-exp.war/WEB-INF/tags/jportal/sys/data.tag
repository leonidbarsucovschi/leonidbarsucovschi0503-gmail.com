<%@ tag import="ro.uti.waf.base.simple.action.ActionConstants" %>
<%@ tag import="ro.uti.waf.base.simple.action.DataLoader" %>
<%@ tag import="javax.servlet.jsp.PageContext" %>

<%@ tag import="java.util.ArrayList" %>
<%@ tag import="java.util.List" %>

<%@ attribute name="mappingName" %>
<%@ attribute name="paramName" %>
<%@ attribute name="beanId" required="true" %>
<%@ attribute name="scope" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<%@ tag isELIgnored="false" %>
<%
    Object attribute = request
	    .getAttribute(ActionConstants.DATA_LOADER_REQUEST_ATTRIBUTE);

    if (attribute != null) {
	if (attribute instanceof DataLoader) {
	    Object params = null;
	    if (paramName != null) {
		params = request.getAttribute(paramName);
	    }

	    DataLoader loader = (DataLoader) attribute;

	    if (mappingName == null) {
		request.setAttribute(beanId, new ArrayList());
	    } else {

		List list = loader.loadDataAsList(mappingName, params);

		if ("page".equals(scope)) {
		    jspContext.setAttribute(beanId, list);
		} else if ("session".equals(scope)) {
		    session.setAttribute(beanId, list);
		} else {
		    request.setAttribute(beanId, list);
		}
	    }
	}
    }

%>