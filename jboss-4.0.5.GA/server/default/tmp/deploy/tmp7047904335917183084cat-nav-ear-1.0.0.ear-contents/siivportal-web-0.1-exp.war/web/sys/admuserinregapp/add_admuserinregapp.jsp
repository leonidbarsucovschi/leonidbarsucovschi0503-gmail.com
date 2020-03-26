<%@ page import="java.util.*,ro.uti.settings.util.Constants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm"  method="post" action="sys/admuserinregapp.do">
<html:hidden property="method"  value="list"/>
</form>
<script>
    function closeWindow(){
        document.closeForm.submit();
    }
</script>
<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
		<tr>
  <td width="100%" valign="top" class="bottom" align="left">&nbsp;
				<!-- Titlul ferestrei pentru modificare. -->
				<logic:empty  name="<%=Constants.ADM_USER_INREG_APP_KEY%>"  property="values.primaryKey" scope="request">
				<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.title.add"/>
				</logic:empty>
				<!-- Titlul ferestrei pentru adaugare. -->
				<logic:notEmpty  name="<%=Constants.ADM_USER_INREG_APP_KEY%>" property="values.primaryKey" scope="request">
				<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.title.save"/>
				</logic:notEmpty>
				<!-- END Sectiune de Titlu pagina. -->
				</td>
			<td class="bottom" align="right">
				<img border="0"  style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.label.closeWindow"/>' src="images/close_off.gif" />
				</td>
</tr>
</table>
		<table width="100%" border="0" cellpadding="0" cellspacing="1" class="bottom"><logic:messagesPresent><tr>

  <td valign="top" colspan="2" class="errormsg" align="center">
<ul>
<html:messages id="error">
<li><bean:write name="error"/></li>
</html:messages>
</ul>
</td>

</tr>
</logic:messagesPresent>
<!-- START Sectiune de FORM. -->

		<html:form action="/admuserinregapp.do" onsubmit="return validateForm_AdmUserInregAppForm(this);">
		<html:hidden property="values.id_user_inreg_app"/><!-- Cimpul 'fk_user_inreg' field. -->
				<tr>
  <td valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.prompt.fk_user_inreg"/><font color="#336600">*</font> :
						</td>
					<td class="text" align="left">
						<html:select property="values.fk_user_inreg" styleClass="selectbox"><option value=""><bean:message bundle="app" key="select.prompt"/></option><html:options collection="array_adm_user_inreg" property="values.id_user_inreg" labelProperty="values.dumpData"/></html:select><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.label.tooltip.fk_user_inreg"/>" />
						</td>
</tr><!-- Cimpul 'fk_application' field. -->
				<tr>
  <td valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.prompt.fk_application"/><font color="#336600">*</font> :
						</td>
					<td class="text" align="left">
						<html:select property="values.fk_application" styleClass="selectbox"><option value=""><bean:message bundle="app" key="select.prompt"/></option><html:options collection="array_adm_application" property="values.id_application" labelProperty="values.dumpData"/></html:select><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.label.tooltip.fk_application"/>" />
						</td>
</tr><!-- Cimpul 'descriere' field. -->
				<tr>
  <td valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.prompt.descriere"/><font color="#336600">*</font> :
						</td>
					<td class="text" align="left">



								<html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.descriere" size="30"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.label.tooltip.descriere"/>" />
						</td>
</tr>
		<!-- START Sectiune de BUTOANE. -->
		<logic:empty  name="<%=Constants.ADM_USER_INREG_APP_KEY%>"  property="values.primaryKey" scope="request"><!-- Buton adugare. -->
		<tr>
  <td colspan="2" class="button-row" align="center"><html:submit styleClass="button"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.button.add"/></html:submit><html:hidden property="method"  value="add"/></td>
</tr>
		</logic:empty>
		<logic:notEmpty  name="<%=Constants.ADM_USER_INREG_APP_KEY%>" property="values.primaryKey" scope="request"><!-- buton modificare. -->
		<tr>
  <td colspan="2" class="button-row" align="center"><html:submit styleClass="button"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.button.save"/></html:submit><html:hidden property="method"  value="update"/></td>
</tr>
</logic:notEmpty>
<!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_AdmUserInregAppForm" dynamicJavascript="true" staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp" ></script>
