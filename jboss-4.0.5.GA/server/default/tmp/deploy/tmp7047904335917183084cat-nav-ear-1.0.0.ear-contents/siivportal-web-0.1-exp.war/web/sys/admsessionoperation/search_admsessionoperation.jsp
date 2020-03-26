<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!-- Start Sectiune de SEARCH. -->
<logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>">
	<div id="search" class="show">
</logic:equal>
<logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>">
	<div id="search" class="noshow">
</logic:notEqual>
<html:form action="/admsessionoperation.do" styleId="searchForm">
	<p width="100%" class="button-row" align="right">
		<img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');"
			 title='<bean:message bundle="admsessionoperation" key="adm_session_operation.label.closeWindow"/>'
			 name="closeEditFrame" id="closeEdit" src="images/close_off.gif"/>
	</p>

	<table width="100%" border="0">
	<!-- Cimpul 'fk_operation_type' field. -->
	<tr>
		<td valign="top" class="label" align="right">
			<bean:message bundle="admsessionoperation" key="adm_session_operation.prompt.fk_operation_type"/>:
		</td>
		<td class="text" align="left">
			<html:select property="values.fk_operation_type" styleClass="selectbox">
				<option value="-1"><bean:message key="select.prompt" bundle="app" /></option>
				<option value="6"><bean:message bundle="admsessionoperation" key="adm_session_operation.label.login"/></option>
				<option value="15"><bean:message bundle="admsessionoperation" key="adm_session_operation.label.logout"/></option>
				<option value="16"><bean:message bundle="admsessionoperation" key="adm_session_operation.label.report_viewed"/></option>
			</html:select>
			<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
				 title="<bean:message bundle="admsessionoperation" key="adm_session_operation.searchlabel.tooltip.fk_operation_type"/>"/>
		</td>
	</tr>

	<!-- Cimpul 'user_login' field. -->
	<tr>
		<td valign="top" class="label" align="right">
			<bean:message bundle="admsessionoperation" key="adm_session_operation.prompt.user_login"/>:
		</td>
		<td class="text" align="left">
			<html:text styleClass="field_input" property="user_login" size="30"/>
			<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
				 title="<bean:message bundle="admsessionoperation" key="adm_session_operation.searchlabel.tooltip.user_login"/>"/>
		</td>
	</tr>

	<!-- Cimpul 'operation_date' field. -->
	<tr>
		<td valign="top" class="label" align="right">
			<bean:message bundle="admsessionoperation" key="adm_session_operation.prompt.operation_date"/>:
		</td>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td valign="top" class="label" align="right">
			<bean:message bundle="admsessionoperation" key="adm_session_operation.prompt.operationDateFrom"/>:
		</td>
		<td class="text" align="left">
			<html:text styleClass="text-small" styleId="operation_dateFrom"
					   property="operationDateFrom"/>
			<input align="absmiddle" type="image" src="images/cal.gif" id="triggeroperation_dateFrom"/>
			<script type="text/javascript">
				Calendar.setup({
					inputField  : "operation_dateFrom",// ID of the input field
					ifFormat	: "%d/%m/%Y",	// the date format
					button	  : "triggeroperation_dateFrom"// ID of the button
				});
			</script>
			<bean:message bundle="admsessionoperation" key="adm_session_operation.label.date_format"/>
			<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
				 title="<bean:message bundle="admsessionoperation" key="adm_session_operation.searchlabel.tooltip.operationDateFrom"/>"/>
		</td>
	</tr>
	<tr>
		<td valign="top" class="label" align="right">
			<bean:message bundle="admsessionoperation" key="adm_session_operation.prompt.operationDateTo"/>:
		</td>
		<td class="text" align="left">
			<html:text styleClass="text-small" styleId="operation_dateTo"
					   property="operationDateTo"/>
			<input align="absmiddle" type="image" src="images/cal.gif" id="triggeroperation_dateTo"/>
			<script type="text/javascript">
				Calendar.setup({
					inputField  : "operation_dateTo",// ID of the input field
					ifFormat	: "%d/%m/%Y",	// the date format
					button	  : "triggeroperation_dateTo"// ID of the button
				});
			</script>
			<bean:message bundle="admsessionoperation" key="adm_session_operation.label.date_format"/>
			<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
				 title="<bean:message bundle="admsessionoperation" key="adm_session_operation.searchlabel.tooltip.operationDateTo"/>"/>
		</td>
	</tr>

	<input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>"/>
	<tr>
		<td colspan="2" class="button-row" align="center">
			<input type="hidden" name="method" value="search"/>
			<input type="hidden" name="search" value="1"/>
			<html:submit styleClass="btn-generic">
				<bean:message bundle="admsessionoperation" key="adm_session_operation.button.search"/>
			</html:submit>
		</td>
	</tr>
	</table>
</html:form>
<!-- END Sectiune de SEARCH. -->
