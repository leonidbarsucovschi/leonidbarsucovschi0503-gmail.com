<!--
*
*
* @version
* @author
*/
-->
<%@ page import="ro.uti.settings.util.Constants" %>
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
    <bean:message bundle="nomlimba" key="nom_limba.title.delete"/>
    <!-- END Sectiune de Titlu pagina. -->
  </td>
    <td valign="top" class="bottom" align="right">
      <img border="0" style="cursor:pointer;" onClick="javascript:closeWindow();"
           title='<bean:message bundle="nomlimba" key="nom_limba.label.closeWindow"/>' name="closeEditFrame"
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
    <!-- END Sectiune de Afisare Erori. -->
    <!-- START Sectiune de FORM. -->
    <!-- Cimpul 'denumire' field. -->
    <tr>
      <td width="50%" valign="top" class="label" align="right">
        <bean:message bundle="nomlimba" key="nom_limba.prompt.den_limba"/>
        :
      </td>
      <td class="field_text">
        <bean:write property="den_limba" name="<%=Constants.NOM_LIMBA_KEY%>"/>
      </td>
    </tr>
      <tr>
          <td colspan="2" height="10"></td>
      </tr>
    <html:form action="/nomlimba.do">
      <input type="hidden" name="values.id_limba"
             value="<bean:write property="id_limba" name="<%=Constants.NOM_LIMBA_KEY%>"/>">
      <!-- START Sectiune de BUTOANE. -->
      <!-- buton modificare. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="nomlimba" key="nom_limba.button.delete"/>
          </html:submit>
          <html:hidden property="method" value="delete"/>
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="nom/nomlimba.do">
  <html:hidden property="method" value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
