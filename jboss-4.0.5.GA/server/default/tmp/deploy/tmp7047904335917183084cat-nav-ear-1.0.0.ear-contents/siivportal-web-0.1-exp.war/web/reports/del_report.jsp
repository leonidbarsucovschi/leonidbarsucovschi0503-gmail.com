<!--
*
*
* @version
* @author
*/
-->
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page import="ro.uti.settings.util.ThreadSafeSDFs" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr>
        <td WIDTH="100%" valign="top" align="left" class="page-subtitle">
            <!-- Sectiune de Titlu pagina. -->
            <!-- Titlul ferestrei pentru stergere. -->
            <bean:message bundle="report" key="report.title.delete"/>
            <!-- END Sectiune de Titlu pagina. -->
        </td>
        <td valign="top" class="bottom" align="right">
            <img border="0" style="cursor:pointer;" onClick="javascript:closeWindow();"
                 title='<bean:message bundle="report" key="report.label.closeWindow"/>' name="closeEditFrame"
                 id="closeEdit" src="images/close_off.gif"
                 onMouseOver="this.src='images/close_on.gif'" onmouseout="this.src='images/close_off.gif'"/>
        </td>
    </tr>
</table>
<!-- Sectiune de Afisare Erori. -->
<logic:messagesPresent>
    <table width="100%" border="0" cellpadding="1" align="center" cellspacing="1">
        <tr>
            <td valign="middle" nowrap="nowrap" colspan="2" align="center" class="msg_error">
                <html:errors/>
            </td>
        </tr>
    </table>
</logic:messagesPresent>
<table width="100%" border="0" cellpadding="1" align="center" cellspacing="1">
    <tr>
        <td colspan="2" height="10"></td>
    </tr>

    <!-- START Sectiune de FORM. -->
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

    <html:form action="/report.do">
        <input type="hidden" name="values.report_id"
               value="<bean:write property="report_id" name="<%=Constants.TBL_REPORT_KEY%>"/>">
        <!-- START Sectiune de BUTOANE. -->
        <!-- buton modificare. -->
        <tr>
            <td colspan="2" class="button-row" align="center">
                <html:submit styleClass="btn-generic">
                    <bean:message bundle="report" key="report.button.delete"/>
                </html:submit>
                <html:hidden property="method" value="delete"/>
            </td>
        </tr>
        <!-- END Sectiune de BUTOANE. -->
    </html:form>
</table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="reports/report.do">
    <html:hidden property="method" value="list"/>
</form>
<script>
    function closeWindow() {
        document.closeForm.submit();
    }
</script>
