<%@ page import="ro.uti.siiv.reports.PrintAction" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>

<%@ taglib uri="selectionComponent" prefix="selection" %>
<script src="selectionComponent/script/selectioncomponent.js"></script>
<script src="selectionComponent/script/hashtable.js"></script>

<form name="closeForm" method="post" action="reports/report.do">
    <html:hidden property="method" value="listMine"/>
</form>

<script>
function closeWindow()
{
    document.closeForm.submit();
}
</script>

<div class="table" height="100%">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr>
        <td width="100%" valign="top" align="left" class="page-subtitle">
            <!-- Titlul ferestrei. -->
            <bean:message bundle="report" key="report.title.parameters"/>
			-
			Blah :)
		</td>
        <td class="bottom" align="right">
            <img border="0" style="cursor:pointer;" onClick="javascript:closeWindow();"
                 title='<bean:message bundle="report" key="report.label.closeWindow"/>' src="images/close_off.gif"
                 onMouseOver="this.src='images/close_on.gif'" onmouseout="this.src='images/close_off.gif'"/>
        </td>
    </tr>
</table>
<br>

<!-- Sectiune de erori -->
<table width="100%" border="0" cellpadding="0" cellspacing="1">
    <logic:messagesPresent>
        <tr>
            <td valign="top" colspan="2" align="center" class="msg_error">
                <html:messages id="error" bundle="report">
                    <bean:write name="error"/>
                    <br>
                </html:messages>
            </td>
        </tr>
    </logic:messagesPresent>
</table>

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr>
	<td valign="top" align="center">
		<bean:write name="http_report_content" filter="false"/>
	</td>
</tr>
</table>

</div>

