
<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmMessageTemplateConstants,
                 ro.uti.waf.base.simple.util.LanguageMap" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm" method="post" action="sys/admmessagetemplate.do">
  <html:hidden property="method" value="list" />
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr class="page-title-header">
      <td width="100%" valign="top" class="bottom" align="left">
        &nbsp;
       <!-- Titlul ferestrei pentru adaugare traducere. -->
        <logic:equal value="<%= LanguageMap.defaultID %>" name="<%= Constants.ADM_MESSAGE_TEMPLATE_KEY%>" property="values.fk_limba" scope="request">
        <bean:message bundle="admmessagetemplate" key="adm_message_template.title.addtranslate" />
        </logic:equal>
        <!-- Titlul ferestrei pentru modificare traducere. -->
        <logic:notEqual value="<%= LanguageMap.defaultID %>" name="<%= Constants.ADM_MESSAGE_TEMPLATE_KEY %>" property="values.fk_limba" scope="request">
          <bean:message bundle="admmessagetemplate" key="adm_message_template.title.edittranslate" />
        </logic:notEqual>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right"><img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admmessagetemplate" key="adm_message_template.label.closeWindow"/>' src="images/close_off.gif" /></td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1" class="report">
    <logic:messagesPresent>
      <tr>
        <td valign="top" colspan="2" class="errormsg" align="center">
          <ul>
            <html:messages id="error">
              <li>
                <bean:write name="error" />
              </li>
            </html:messages>
          </ul>
        </td>
      </tr>
    </logic:messagesPresent>
    <!-- START Sectiune de FORM. -->
    <html:form action="/admmessagetemplate.do" onsubmit="return validateForm_AdmMessageTemplateForm(this);" method="post" enctype="multipart/form-data">
         <html:hidden property="values.id_message_template" name="<%= Constants.ADM_MESSAGE_TEMPLATE_KEY %>" />
          <html:hidden property="values.mkey" name="<%= Constants.ADM_MESSAGE_TEMPLATE_KEY %>" />
      <!-- Cimpul id_limba field. -->
      <tr>
        <td valign="top" align="right">
          <bean:message bundle="admmessagetemplate" key="adm_message_template.prompt.fk_limba" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="text" align="left">

<%          if ("0".equals((String)request.getAttribute("m"))) {
            if ("1".equals((String)request.getAttribute("am"))) {
%>
              <html:select property="values.fk_limba" styleClass="selectbox">
                <logic:iterate id="listItem" name='<%= AdmMessageTemplateConstants.KEY_AdmMessageTemplate_NOM_LIMBA %>'>
                  <option value='<bean:write name="listItem" property="id_limba" />'>
                  <bean:write name='listItem' property="den_limba" />
                  </option>
                </logic:iterate>
              </html:select>
<%
            } else {
%>
              <bean:message bundle="admmessagetemplate" key="adm_message_template.label.romana" />
<%
            }
    }else {%>
        <html:hidden property="values.fk_limba"/>
        <bean:write name="<%=Constants.ADM_MESSAGE_TEMPLATE_KEY%>" property="den_limba" />
    <%}%>
        </td>
      </tr>

      <!-- Cimpul 'message' field. -->
      <tr>
        <td valign="top" align="right">
          <bean:message bundle="admmessagetemplate" key="adm_message_template.prompt.message" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="text" align="left">
          <html:textarea errorStyleClass="errorfield" name="<%= Constants.ADM_MESSAGE_TEMPLATE_KEY %>" styleClass="textarea_medium" property="values.message"  />
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admmessagetemplate" key="adm_message_template.label.tooltip.message"/>" /></td>
      </tr>


      <!-- START Sectiune de BUTOANE. -->

      <!-- Buton adugare. -->
<%     if ("0".equals((String)request.getAttribute("m"))) {
      if ("1".equals((String)request.getAttribute("am"))) {
%>
        <tr>
          <td colspan="2" class="button-row" align="center">
            <html:submit styleClass="btn-generic">
              <bean:message bundle="admmessagetemplate" key="adm_message_template.button.add" />
            </html:submit>
            <html:hidden property="method" value="addTranslate" />
          </td>
        </tr>
<%
      } }else {
%>

    <!-- buton modificare. -->
    <tr>
      <td colspan="2" class="button-row" align="center">
        <html:submit styleClass="btn-generic">
          <bean:message bundle="admmessagetemplate" key="adm_message_template.button.save" />
        </html:submit>
        <html:hidden property="method" value="updateTranslate" />
      </td>
    </tr>
      <%}%>

  <!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
        <jsp:include page="list_translate_messagetemplate.jsp" flush="true" />
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_AdmMessageTemplateForm" dynamicJavascript="true" staticJavascript="false" />
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
