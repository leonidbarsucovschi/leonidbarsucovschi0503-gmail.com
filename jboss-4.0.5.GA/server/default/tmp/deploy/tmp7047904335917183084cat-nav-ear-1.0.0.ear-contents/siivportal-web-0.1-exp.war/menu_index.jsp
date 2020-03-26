<%@ page contentType="text/html; charset=iso-8859-1" language="java"%>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/jstl1.1/c.tld" prefix="c" %>

<%@ page isELIgnored="false" %>

<!-- #################### meniul principal si sub se afla meniurile secundare ################## -->
<script type="text/javascript" src="js/template.js" language="JavaScript"></script>
<link rel="stylesheet" href="css/menu_styles.css" type="text/css">
<div id="mainMenu" style="width:100%; height:24px;">
    <c:if test="${not empty sessionScope.SATT_P_MENU_RENDER || empty sessionScope.SATT_P_FLASH_INSTALED}">
        <logic:present name="form_MenuForm">
            <bean:write name="form_MenuForm" property="userMenuBuffer" filter="false"/>
        </logic:present>
    </c:if>
</div>
