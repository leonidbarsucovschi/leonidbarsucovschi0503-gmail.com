<%--
  Created by IntelliJ IDEA.
  User: Sandu Mihai
  Date: 19-Jun-2007
  Time: 14:32:53
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page import="ro.uti.settings.util.ThreadSafeSDFs" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<form name="closeForm" method="post" action="reports/report.do">
    <html:hidden property="method" value="list"/>
</form>

<script>
    function closeWindow() {
        document.closeForm.submit();
    }
</script>

<div class="table">
    <!-- Titlul ferestrei -->
    <table width="100%" border="0" cellpadding="0" cellspacing="1">
        <tr>
            <td width="100%" valign="top" align="left" class="page-subtitle">
                <bean:message bundle="report" key="report.title.view"/>
            </td>
            <td class="bottom" align="right">
                <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();"
                     title='<bean:message bundle="report" key="report.label.closeWindow"/>'
                     src="images/close_off.gif"/>
            </td>
        </tr>
    </table>

    <!-- Sectiune de Afisare Erori. -->
    <logic:messagesPresent>
        <table width="100%" border="0" cellpadding="1" align="center" cellspacing="1">
            <tr>
                <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error" align="center">
                    <html:errors/>
                </td>
            </tr>
        </table>
    </logic:messagesPresent>

    <table width="100%" border="0" cellpadding="0" cellspacing="1">
        <tr>
            <td colspan="2" height="10"></td>
        </tr>

        <!-- Campul nume -->
        <tr>
            <td class="label" width="25%" align="right">
                <bean:message bundle="report" key="report.prompt.name"/>
                :
            </td>
            <td class="field_text" width="25%" align="left">
                <bean:write property="name" name="<%=Constants.TBL_REPORT_KEY%>"/>
            </td>
        </tr>

        <!-- Campul descriere -->
        <tr>
            <td class="label" width="25%" align="right">
                <bean:message bundle="report" key="report.prompt.description"/>
                :
            </td>
            <td class="field_text" width="25%" align="left">
                <bean:write property="description" name="<%=Constants.TBL_REPORT_KEY%>"/>
            </td>
        </tr>

        <!-- Campul data crearii -->
        <tr>
            <td class="label" width="25%" align="right">
                <bean:message bundle="report" key="report.prompt.creation_date"/>
                :
            </td>
            <td class="field_text" width="25%" align="left">
                <logic:notEmpty property="creation_date" name="<%=Constants.TBL_REPORT_KEY%>">
                    <bean:define id="creareDate" property="creation_date" name="<%=Constants.TBL_REPORT_KEY%>"
                                 type="java.util.Date"/>
                    <%=ThreadSafeSDFs.getSdf().format(creareDate)%>
                </logic:notEmpty>
            </td>
        </tr>

        <!-- Campul data ultimei editari -->
        <tr>
            <td class="label" width="25%" align="right">
                <bean:message bundle="report" key="report.prompt.last_edit_date"/>
                :
            </td>
            <td class="field_text" width="25%" align="left">
                <logic:notEmpty property="last_edit_date" name="<%=Constants.TBL_REPORT_KEY%>">
                    <bean:define id="ultimaEditareDate" property="last_edit_date" name="<%=Constants.TBL_REPORT_KEY%>"
                                 type="java.util.Date"/>
                    <%=ThreadSafeSDFs.getSdf().format(ultimaEditareDate)%>
                </logic:notEmpty>
            </td>
        </tr>

        <tr>
            <td colspan="2" height="10"></td>
        </tr>
    </table>
</div>
