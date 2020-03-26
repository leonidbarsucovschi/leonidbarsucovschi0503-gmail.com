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

<html:form action="/admusersession.do" styleId="searchForm">
	<p width="100%" class="button-row" align="right">
		<img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admusersession" key="adm_user_session.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif"/>
	</p>

	<table width="100%" class="lightrow" border="0">

	<!-- Cimpul 'fk_user' field. -->
	<tr>
		<td valign="top" align="right">
			<bean:message bundle="admusersession" key="adm_user_session.prompt.fk_user"/>:
		</td>
		<td class="text" align="left">
			<html:select property="values.fk_user" styleClass="selectbox">
				<option value=""><bean:message bundle="app" key="select.prompt"/></option>
				<html:options collection="array_adm_user" property="id_user" labelProperty="dumpData"/>
			</html:select>
			<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admusersession" key="adm_user_session.searchlabel.tooltip.fk_user"/>"/>
		</td>
	</tr>

	<!-- Cimpul 'http_session_id' field. -->
	<tr>
		<td valign="top" align="right">
			<bean:message bundle="admusersession" key="adm_user_session.prompt.http_session_id"/>:
		</td>
		<td class="text" align="left">
			<html:text styleClass="text-small" property="values.http_session_id" size="30"/>
			<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admusersession" key="adm_user_session.searchlabel.tooltip.fk_http_session"/>"/>
		</td>
	</tr>

	<!-- Cimpul 'ip_address' field. -->
	<tr>
		<td valign="top" align="right">
				<bean:message bundle="admusersession" key="adm_user_session.prompt.ip_address"/>:
		</td>
		<td class="text" align="left">
			<html:text styleClass="text-small" property="values.ip_address" size="15"/>
			<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admusersession" key="adm_user_session.searchlabel.tooltip.ip_address"/>"/>
		</td>
	</tr>

	<!-- Cimpul 'login_date' field. -->
	<tr>
		<td valign="top" align="right">
			<bean:message bundle="admusersession" key="adm_user_session.prompt.login_date"/>:
		</td>
		<td class="text" align="left">
			<html:text styleClass="text-small" styleId="login_dateString" property="values.login_dateString"/>
			<input align="absmiddle" type="image" src="images/cal.gif" id="triggerlogin_dateString"/>
			<script type="text/javascript">
				Calendar.setup({
					inputField  : "login_dateString",// ID of the input field
					ifFormat	: "%d.%m.%Y",	// the date format
					button	  : "triggerlogin_dateString"// ID of the button
				});
			</script>
			<font size="-1">[dd/MM/yyyy]</font>
			<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admusersession" key="adm_user_session.searchlabel.tooltip.login_date"/>"/>
		</td>
	</tr>

	<!-- Cimpul 'logout_date' field. -->
	<tr>
		<td valign="top" align="right">
			<bean:message bundle="admusersession" key="adm_user_session.prompt.logout_date"/>:
		</td>
		<td class="text" align="left">
			<html:text styleClass="text-small" styleId="logout_dateString" property="values.logout_dateString"/>
			<input align="absmiddle" type="image" src="images/cal.gif" id="triggerlogout_dateString"/>
			<script type="text/javascript">
				Calendar.setup({
					inputField  : "logout_dateString",// ID of the input field
					ifFormat	: "%d.%m.%Y",	// the date format
					button	  : "triggerlogout_dateString"// ID of the button
				});
			</script>
			<font size="-1">[dd/MM/yyyy]</font>
			<img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admusersession" key="adm_user_session.searchlabel.tooltip.logout_date"/>"/>
		</td>
	</tr>
	<input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>"/>
	<tr>
		<td colspan="2" class="button-row" align="center">
			<input type="hidden" name="method" value="search"/>
			<input type="hidden" name="search" value="1"/>
			<html:submit styleClass="btn-generic">
				<bean:message bundle="admusersession" key="adm_user_session.button.search"/>
			</html:submit>
		</td>
	</tr>
	</table>
</html:form>
<!-- END Sectiune de SEARCH. -->
