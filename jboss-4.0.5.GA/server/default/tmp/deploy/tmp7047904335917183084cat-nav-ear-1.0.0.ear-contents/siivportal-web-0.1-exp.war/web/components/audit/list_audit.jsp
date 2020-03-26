<!--
* @version 0.1
* @author Edward.Moraru@uti.ro
-->

<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ page import="ro.uti.jpf.waf.components.audit.command.AuditAction" %>

<html:form action="audit.do" styleId="addForm">
    <input type="hidden" name="method" value="showAdd"/>
</html:form>

<div class="table">
    <table width="100%" cellspacing="0" cellpadding="0" border="0">

        <logic:messagesPresent message="true">
        <!-- Sectiune de Afisare Erori. -->
        <tr>
            <td colspan="2"><html:errors/></td>
        </tr>
        <tr>
            <td colspan="3" class="note" align="center">
				<html:messages id="mesaje" bundle="app" message="true">
					<bean:write name="mesaje" ignore="true"/>
				</html:messages>
            </td>
        </tr>
        </logic:messagesPresent>
        <!-- END Sectiune de Afisare Erori. -->

        <!-- includ prima pagina daca nu e page key-ul -->
		<logic:empty name="<%=AuditAction.PAGE_KEY%>">
        <tr class="page-title-header">
            <td colspan="3">
                <!-- Titlul ferestrei de cautare. -->
                <bean:message bundle="audit" key="audit.title.search"/>
                <!-- END Sectiune de Titlu -->
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <jsp:include page="search_audit.jsp" flush="true"/>
            </td>
        </tr>
		</logic:empty>

        <!-- includ pagina curenta -->
		<logic:equal name="<%=AuditAction.PAGE_KEY%>" value="<%=AuditAction.SEARCH_PAGE%>">
        <tr class="page-title-header">
            <td colspan="3">
                <!-- Titlul ferestrei de cautare. -->
                <bean:message bundle="audit" key="audit.title.search"/>
                <!-- END Sectiune de Titlu -->
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <jsp:include page="search_audit.jsp" flush="true"/>
            </td>
        </tr>
		</logic:equal>

        <logic:equal name="<%=AuditAction.PAGE_KEY%>" value="<%=AuditAction.LIST_PAGE%>">
        <tr class="page-title-header">
            <td colspan="3">
                <!-- Titlul ferestrei de cautare. -->
                <bean:message bundle="audit" key="audit.title.list"/>
                <!-- END Sectiune de Titlu -->
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <jsp:include page="list_lista_audit.jsp" flush="true"/>
            </td>
        </tr>
		</logic:equal>

		<logic:equal name="<%=AuditAction.PAGE_KEY%>" value="<%=AuditAction.VIEW_PAGE%>">
        <tr class="page-title-header">
            <td colspan="3">
                <!-- Titlul ferestrei de cautare. -->
                <bean:message bundle="audit" key="audit.title.view"/>
                <!-- END Sectiune de Titlu -->
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <jsp:include page="view_audit.jsp" flush="true"/>
            </td>
        </tr>
		</logic:equal>
    </table>
</div>
