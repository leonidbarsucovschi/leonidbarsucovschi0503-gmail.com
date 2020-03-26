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
	<td width="100%" valign="top" class="bottom" align="left">
		<bean:message bundle="admsessionoperation" key="adm_session_operation.title.view"/>
	</td>
	<td class="bottom" align="right">
		<img border="0" style="cursor:pointer" onClick="javascript:closeWindow();"
			 title='<bean:message bundle="admsessionoperation" key="adm_session_operation.label.closeWindow"/>'
			 src="images/close_off.gif"/>
	</td>
</tr>
</table>
<table width="100%" border="0" cellpadding="1" align="center" class="lightrow" cellspacing="1">

<!-- Sectiune de Afisare Erori. -->
<tr>
	<td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center">
		<html:errors/>
	</td>
</tr>
<!-- END Sectiune de Afisare Erori. -->


<tr>
	<td colspan="2" height="10">
		&nbsp;
	</td>
</tr>
<!-- Cimpul 'user_login' field. -->
<tr>
	<td width="40%" valign="top" align="right">
		<bean:message bundle="admsessionoperation" key="adm_session_operation.view.user_login"/>
		:
	</td>
	<td class="text">
		<bean:write property="user_login" name="<%=Constants.ADM_SESSION_OPERATION_KEY%>"/>
	</td>
</tr>

<!-- Cimpul 'fk_user' field. -->
<tr>
	<td width="40%" valign="top" align="right">
		<bean:message bundle="admsessionoperation" key="adm_session_operation.view.fk_user"/>
		:
	</td>
	<td class="text">
		<bean:write property="fk_user" name="<%=Constants.ADM_SESSION_OPERATION_KEY%>"/>
	</td>
</tr>


<!-- Cimpul 'http_session_id' field. -->
<tr>
	<td width="40%" valign="top" align="right">
		<bean:message bundle="admsessionoperation" key="adm_session_operation.view.http_session_id"/>
		:
	</td>
	<td class="text">
		<bean:write property="http_session_id" name="<%=Constants.ADM_SESSION_OPERATION_KEY%>"/>
	</td>
</tr>

<!-- Cimpul 'ip_address' field. -->
<tr>
	<td width="40%" valign="top" align="right">
		<bean:message bundle="admsessionoperation" key="adm_session_operation.view.ip_address"/>
		:
	</td>
	<td class="text">
		<bean:write property="ip_address" name="<%=Constants.ADM_SESSION_OPERATION_KEY%>"/>
	</td>
</tr>
<tr>
	<td colspan="2" height="10">
		&nbsp;
	</td>
</tr>

<!-- Cimpul 'operation_date' field. -->
<tr>
	<td width="40%" valign="top" align="right">
		<bean:message bundle="admsessionoperation" key="adm_session_operation.prompt.operation_date"/>
		:
	</td>
	<td class="text">
		<bean:define id="operationDate" property="operation_date" name="<%=Constants.ADM_SESSION_OPERATION_KEY%>"
					 type="oracle.sql.TIMESTAMP"/>
		<%=ThreadSafeSDFs.getSdf().format(oracle.sql.TIMESTAMP.toTimestamp(operationDate.getBytes()))%>
	</td>
</tr>

<!-- Cimpul 'description' field. -->
<tr>
	<td width="40%" valign="top" align="right">
		<bean:message bundle="admsessionoperation" key="adm_session_operation.prompt.description"/>
		:
	</td>
	<td class="text">
		<bean:write property="description" name="<%=Constants.ADM_SESSION_OPERATION_KEY%>"/>
	</td>
</tr>

<!-- Cimpul 'opp_name' field. -->
<tr>
	<td width="40%" valign="top" align="right">
		<bean:message bundle="admsessionoperation" key="adm_session_operation.view.opp_name"/>
		:
	</td>
	<td class="text">
		<bean:write property="opp_name" name="<%=Constants.ADM_SESSION_OPERATION_KEY%>"/>
	</td>
</tr>

<!-- Cimpul 'description' field. -->
<tr>
	<td width="40%" valign="top" align="right">
		<bean:message bundle="admsessionoperation" key="adm_session_operation.view.description"/>
		:
	</td>
	<td class="text">
		<bean:write property="description" name="<%=Constants.ADM_SESSION_OPERATION_KEY%>"/>
	</td>
</tr>



<!-- Cimpul 'dump' field. -->
<tr>
	<td width="40%" valign="top" align="right">
		<bean:message bundle="admsessionoperation" key="adm_session_operation.prompt.dump"/>
		:
	</td>
	<td class="text">
		<logic:notEmpty property="dump" name="<%=Constants.ADM_SESSION_OPERATION_KEY%>">
			<bean:define id="dumpStr" property="dump" name="<%=Constants.ADM_SESSION_OPERATION_KEY%>"
						 type="java.lang.String"/>
			<%=dumpStr.replaceAll("\n","<br>")%>
		</logic:notEmpty>
	</td>
</tr>

</table>
</div>
<form name="closeForm" method="post" action="sys/admsessionoperation.do">
	<html:hidden property="method" value="list"/>
</form>
<script>
	function closeWindow()
	{
		document.closeForm.submit();
	}
</script>
