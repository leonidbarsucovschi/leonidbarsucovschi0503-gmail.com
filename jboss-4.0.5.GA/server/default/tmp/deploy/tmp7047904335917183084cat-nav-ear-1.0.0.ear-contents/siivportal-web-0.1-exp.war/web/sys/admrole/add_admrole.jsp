<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/jstl1.1/c.tld" prefix="c" %>
<%@ page isELIgnored="false" %>
<%
  String type = request.getParameter("type");
%>
<form name="closeForm" method="post" action="sys/admrole.do">
  <html:hidden property="method"  value="list"/>
  <input type="hidden" name="type" value="<%=type%>"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
<div class="table">
  <table width="100%" border="0" cellpadding="2" cellspacing="0">
    <tr>
      <td width="100%" valign="top" class="page-subtitle" align="left">&nbsp;
        <!-- Titlul ferestrei pentru adaugare. -->
        <logic:empty  name="<%=Constants.ADM_ROLE_KEY%>"  property="values.primaryKey" scope="request">
        <% if ("int".equals(type)) {%>
            <bean:message bundle="admrole" key="adm_role.title.add_int"/>
         <%}%>
         <% if ("ext".equals(type)) {%>
            <bean:message bundle="admrole" key="adm_role.title.add_ext"/>
         <%}%>
        </logic:empty>
        <!-- Titlul ferestrei pentru modificare. -->
        <logic:notEmpty  name="<%=Constants.ADM_ROLE_KEY%>" property="values.primaryKey" scope="request">
          <bean:message bundle="admrole" key="adm_role.title.save"/>
        </logic:notEmpty>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admrole" key="adm_role.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
  </table>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
<logic:messagesPresent>
 <tr>
  <td valign="top" colspan="2" class="msg_error" align="center">
     <ul>
      <html:messages id="error">
       <li><bean:write name="error"/></li>
      </html:messages>
     </ul>
  </td>
 </tr>
</logic:messagesPresent>
</table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <!-- START Sectiune de FORM. -->
    <html:form action="/admrole.do" onsubmit="return validateForm_AdmRoleForm(this);">
      <html:hidden property="values.id_role"/>
      <!-- Cimpul 'role_name' field. -->
      <tr>
        <td valign="top"  align="right" width="45%" class="label" >
          <bean:message bundle="admrole" key="adm_role.prompt.role_name"/>
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="text" align="left" width="55%">
          <html:text errorStyleClass="errorfield" styleClass="field_input" property="values.role_name"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrole" key="adm_role.label.tooltip.role_name"/>" />
        </td>
      </tr>
      <!-- Cimpul 'role_description' field. -->
      <tr>
        <td valign="top"  align="right" class="label">
          <bean:message bundle="admrole" key="adm_role.prompt.role_description"/>
          :
        </td>
        <td class="text" align="left">
          <html:text errorStyleClass="errorfield" styleClass="field_input" property="values.role_description" size="30"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrole" key="adm_role.label.tooltip.role_description"/>" />
        </td>
      </tr>
      <!-- Cimpul 'role_type' field. -->
      <tr>
        <td valign="top"  align="right" class="label" >
          <bean:message bundle="admrole" key="adm_role.prompt.role_type"/>
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td class="field_text" align="left">
            <bean:message bundle="admrole" key="adm_role.type.user"/>
        </td>
        <html:hidden property="values.role_type" />
      </tr>
      <!-- Cimpul 'role_code' field. -->
      <tr>
        <td valign="top"  align="right" class="label" >
          <bean:message bundle="admrole" key="adm_role.prompt.role_code"/>
          :
        </td>
        <td class="text" align="left">
          <html:text errorStyleClass="errorfield" styleClass="field_input" property="values.role_code" maxlength="7"/>
          <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admrole" key="adm_role.label.tooltip.role_code"/>" />
        </td>
      </tr>
      <!-- START Sectiune de BUTOANE. -->
      <logic:empty  name="<%=Constants.ADM_ROLE_KEY%>"  property="values.primaryKey" scope="request">
      <!-- Buton adugare. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="admrole" key="adm_role.button.add"/>
          </html:submit>
          <html:hidden property="method"  value="add"/>
          <input type="hidden" name="type" value="<%=type%>"/>
        </td>
      </tr>
    </logic:empty>
    <logic:notEmpty  name="<%=Constants.ADM_ROLE_KEY%>" property="values.primaryKey" scope="request">
    <tr>
      <td colspan="2" class="button-row" align="center">&nbsp;</td>
    </tr>
    <!-- buton modificare. -->
    <tr>
      <td colspan="2" class="button-row" align="center">
        <html:submit styleClass="btn-generic">
          <bean:message bundle="admrole" key="adm_role.button.save"/>
        </html:submit>
        <html:hidden property="method"  value="update"/>
        <input type="hidden" name="type" value="<%=type%>"/>
      </td>
    </tr>
  </logic:notEmpty>
  <!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_AdmRoleForm"
              dynamicJavascript="true"
               staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
