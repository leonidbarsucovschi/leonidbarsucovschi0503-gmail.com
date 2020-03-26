
<%@ page import="java.util.*,ro.uti.settings.util.Constants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="selectionComponent" prefix="selection" %>
<script src="selectionComponent/script/selectioncomponent.js" ></script>
<script src="selectionComponent/script/hashtable.js" ></script>
<div id=ToolTip style="position:absolute;top:0;left:0;background:#FFFFFF;border-color:#65d0e7;border-style:solid;border-width:1px 1px 1px 1px;visibility:hidden;" ></div>


<form name="closeForm"  method="post" action="
sys/
admusersession.do"><html:hidden property="method"  value="list"/></form><script>
    function closeWindow(){
        document.closeForm.submit();
    }
</script><div class="table"><table width="100%" border="0" cellpadding="2" cellspacing="0"><tr class="page-title-header">  <td width="100%" valign="top" align="left">&nbsp;
				<!-- Titlul ferestrei pentru modificare. -->
				<logic:empty  name="<%=Constants.ADM_USER_SESSION_KEY%>"  property="values.primaryKey" scope="request">
				<bean:message bundle="admusersession" key="adm_user_session.title.add"/>
				</logic:empty>
				<!-- Titlul ferestrei pentru adaugare. -->
				<logic:notEmpty  name="<%=Constants.ADM_USER_SESSION_KEY%>" property="values.primaryKey" scope="request">
				<bean:message bundle="admusersession" key="adm_user_session.title.save"/>
				</logic:notEmpty>
				<!-- END Sectiune de Titlu pagina. -->
				</td>
			<td class="bottom" align="right">
				<img border="0"  style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admusersession" key="adm_user_session.label.closeWindow"/>' src="images/close_off.gif" />
				</td>
</tr></table>
		<table width="100%" border="0" cellpadding="0" cellspacing="1" class="report"><logic:messagesPresent><tr>
  <td valign="top" colspan="2" class="errormsg" align="center"><ul><html:messages id="error"><li><bean:write name="error"/></li></html:messages></ul></td>
</tr></logic:messagesPresent><!-- START Sectiune de FORM. -->
		<html:form action="/admusersession.do" onsubmit="return validateForm_AdmUserSessionForm(this);">
		<html:hidden property="values.id_user_session"/><!-- Cimpul 'fk_user' field. -->
				<tr>
  <td valign="top"  align="right"><bean:message bundle="admusersession" key="adm_user_session.prompt.fk_user"/> :
						</td>
					<td class="text" align="left">
						<%--<html:select property="values.--%>
							<%--fk_user" styleClass="selectbox"><option value=""><bean:message bundle="app" key="select.prompt"/></option><html:options collection="array_adm_user" property="values.id_user" labelProperty="values.dumpData"/></html:select><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admusersession" key="adm_user_session.label.tooltip.fk_user"/>" />--%>

            <selection:selectionComponent property="fk_user" detailsFieldName="login" idTableName="u.user_login" multiple="false" >
              <selection:genericSelection searchCaseId="testSelectie" knownFieldName="login"  showCodeInsert="true"  maxlength="100" maxlengthDetails="30" size="20" styleClass="text-small" >
                <selection:selectionFilter paramName="idLimba" value="<%=session.getAttribute("Limba")%>"/>
                <selection:selectionFilter paramName="idLimba" valueField="values.ip_address"/>
              </selection:genericSelection>
            </selection:selectionComponent>


						</td>
</tr><!-- Cimpul 'fk_http_session' field. -->
				<tr>
  <td valign="top"  align="right"><bean:message bundle="admusersession" key="adm_user_session.prompt.fk_http_session"/><font color="#336600">*</font> :
						</td>
					<td class="text" align="left">



								<%--<html:text errorStyleClass="errorfield" styleClass="text-small" property="values.fk_http_session" size="30"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admusersession" key="adm_user_session.label.tooltip.fk_http_session"/>" />--%>
						</td>
</tr><!-- Cimpul 'ip_address' field. -->
				<tr>
  <td valign="top"  align="right"><bean:message bundle="admusersession" key="adm_user_session.prompt.ip_address"/><font color="#336600">*</font> :
						</td>
					<td class="text" align="left">



								<html:text errorStyleClass="errorfield" styleClass="text-small" property="values.ip_address" size="15"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admusersession" key="adm_user_session.label.tooltip.ip_address"/>" />
						</td>
</tr><!-- Cimpul 'login_date' field. -->
				<tr>
  <td valign="top"  align="right"><bean:message bundle="admusersession" key="adm_user_session.prompt.login_date"/><font color="#336600">*</font> :
						</td>
					<td class="text" align="left">



								<html:text errorStyleClass="errorfield" styleClass="text-small" styleId="login_dateString" property="values.login_dateString"/><input align="absmiddle" type="image" src="images/cal.gif" id="triggerlogin_dateString"/><script type="text/javascript">
                        Calendar.setup(
                        {
                            inputField  : "login_dateString",// ID of the input field
                            ifFormat    : "%d.%m.%Y",    // the date format
                            button      : "triggerlogin_dateString"// ID of the button
                        }
                        );
								</script><font size="-1">[ZZ.LL.AAAA]</font><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admusersession" key="adm_user_session.label.tooltip.login_date"/>" />
						</td>
</tr><!-- Cimpul 'logout_date' field. -->
				<tr>
  <td valign="top"  align="right"><bean:message bundle="admusersession" key="adm_user_session.prompt.logout_date"/> :
						</td>
					<td class="text" align="left">



								<html:text errorStyleClass="errorfield" styleClass="text-small" styleId="logout_dateString" property="values.logout_dateString"/><input align="absmiddle" type="image" src="images/cal.gif" id="triggerlogout_dateString"/><script type="text/javascript">
                        Calendar.setup(
                        {
                            inputField  : "logout_dateString",// ID of the input field
                            ifFormat    : "%d.%m.%Y",    // the date format
                            button      : "triggerlogout_dateString"// ID of the button
                        }
                        );
								</script><font size="-1">[ZZ.LL.AAAA]</font><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admusersession" key="adm_user_session.label.tooltip.logout_date"/>" />
						</td>
</tr>
		<!-- START Sectiune de BUTOANE. -->
		<logic:empty  name="<%=Constants.ADM_USER_SESSION_KEY%>"  property="values.primaryKey" scope="request"><!-- Buton adugare. -->
		<tr>
  <td colspan="2" class="button-row" align="center"><html:submit styleClass="btn-generic"><bean:message bundle="admusersession" key="adm_user_session.button.add"/></html:submit><html:hidden property="method"  value="add"/></td>
</tr>
		</logic:empty>
		<logic:notEmpty  name="<%=Constants.ADM_USER_SESSION_KEY%>" property="values.primaryKey" scope="request"><!-- buton modificare. -->
		<tr>
  <td colspan="2" class="button-row" align="center"><html:submit styleClass="btn-generic"><bean:message bundle="admusersession" key="adm_user_session.button.save"/></html:submit><html:hidden property="method"  value="update"/></td>
</tr>
		</logic:notEmpty>
		<!-- END Sectiune de BUTOANE. -->
		</html:form>
		<!-- END Sectiune de FORM. -->
		</table>
		</div>
		<!-- Validare cimpuri forma. -->
		<html:javascript formName="form_AdmUserSessionForm"
              dynamicJavascript="true"
               staticJavascript="false"/><script language="Javascript1.1" src="staticJavascript.jsp" ></script>