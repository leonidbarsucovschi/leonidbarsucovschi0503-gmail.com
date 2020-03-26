<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1"><tr class="page-title-header">  <td WIDTH="100%" valign="top" align="left">
        <!-- Sectiune de Titlu pagina. -->
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="admuser" key="adm_user.title.delete"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="top" class="bottom" align="right">
        <img border="0"   style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuser" key="adm_user.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <!-- Sectiune de Afisare Erori. -->
  <table width="100%" border="0" cellpadding="1" align="center" class="news-table-content" cellspacing="1">
    <logic:messagesPresent>
      <tr>
        <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error" align="center">
          <html:errors/>
        </td>
      </tr>
    </logic:messagesPresent>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- START Sectiune de FORM. -->
    <!-- Cimpul 'user_login' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.user_login"/>
        :
      </td>
      <td class="text">
        <bean:write  property="user_login" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'user_passwd' field. -->
    <%-- tr>
      <td width="40%" valign="top" class="textbold" align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.user_passwd"/>
        :
      </td>
      <td class="text">
        <bean:write  property="user_passwd" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'logged' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.logged"/>
        :
      </td>
      <td class="text">
        <bean:write  property="logged" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'account_status' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.account_status"/>
        :
      </td>
      <td class="text">
        <bean:write  property="account_status" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr--%>
    <!-- Cimpul 'account_creation_date' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.account_creation_date"/>
        :
      </td>
      <td class="text">
        <bean:write  property="account_creation_date" name="<%=Constants.ADM_USER_KEY%>" format="dd.MM.yyyy"/>
      </td>
    </tr>
    <!-- Cimpul 'account_deletion_date' field. -->
    <%--tr>
      <td width="40%" valign="top" class="textbold" align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.account_deletion_date"/>
        :
      </td>
      <td class="text">
        <bean:write  property="account_deletion_dateString" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'serial_number' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.serial_number"/>
        :
      </td>
      <td class="text">
        <bean:write  property="serial_number" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'issuer_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.issuer_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="issuer_name" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'digital_certificate' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.digital_certificate"/>
        :
      </td>
      <td class="text">
        <bean:write property="digital_certificateFile" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr--%>
    <!-- Cimpul 'user_type' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.user_type"/>
        :
      </td>
      <td class="text">
        <%--bean:write  property="user_type" name="<%=Constants.ADM_USER_KEY%>"/--%>
        <logic:equal  property="user_type" name="<%=Constants.ADM_USER_KEY%>" value="0">
        	<bean:message bundle="admuser" key="adm_user.user_type.internal"/>
        </logic:equal>
        <logic:equal  property="user_type" name="<%=Constants.ADM_USER_KEY%>" value="2">
        	<bean:message bundle="admuser" key="adm_user.user_type.external"/>
        </logic:equal>
      </td>
    </tr>
    <!-- Cimpul 'email' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.email"/>
        :
      </td>
      <td class="text">
        <bean:write  property="email" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr>
    <html:form action="/admuser.do"  >
      <input type="hidden" name="values.id_user" value="<bean:write property="id_user" name="<%=Constants.ADM_USER_KEY%>"/>">
      <!-- START Sectiune de BUTOANE. -->
      <!-- buton modificare. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="admuser" key="adm_user.button.delete"/>
          </html:submit>
          <html:hidden property="method"  value="delete"/>
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="sys/admuser.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
