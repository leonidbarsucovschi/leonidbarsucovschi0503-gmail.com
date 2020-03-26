<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<% System.out.println("+++ BEGIN menuTree.jsp+++");%>
 <c:if test="${not empty sessionScope.SATT_P_LEFT_MENU_RENDER || empty sessionScope.SATT_P_FLASH_INSTALED}">
<% System.out.println("++++++++++++++++++++++++++++++++++++");%>
<% System.out.println("++++++++++++++++++++++++++++++++++++");%>
<% System.out.println("LEFT MENU FROM DATABASE");%>
<% System.out.println("++++++++++++++++++++++++++++++++++++");%>
<% System.out.println("++++++++++++++++++++++++++++++++++++");%>
<div class="table">
<table width="100%" cellspacing="0" cellpadding="0" border="0">
    <tr>
        <td width="71%" class="page-subtitle" align="left">
            <!-- Titlul ferestrei de listare. -->
            <bean:message bundle="admmenuentry" key="menu.left.title"/>
            <!-- END Sectiune de Titlu pagina. -->
        </td>
        <td valign="middle" nowrap="true" align="right">
            <!--butonae add,refresh,search-->
        </td>
    </tr>
</table>

		<c:if test="${not empty requestScope.form_MenuForm}">
		    <%--<c:out value="${form_MenuForm.leftMenuBuffer}"/>--%>
		    <bean:write name="form_MenuForm" property="leftMenuBuffer" filter="false"/>
	    </c:if>

</div>
 </c:if>
<% System.out.println("+++ END menuTree.jsp+++");%>
