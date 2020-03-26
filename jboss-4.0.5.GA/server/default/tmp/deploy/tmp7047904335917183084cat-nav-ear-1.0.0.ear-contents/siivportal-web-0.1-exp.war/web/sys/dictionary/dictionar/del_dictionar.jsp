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
  <table width="100%" border="0" cellpadding="0" cellspacing="1"><tr class="page-title-header">  <td WIDTH="100%" valign="top" align="left">
        <!-- Sectiune de Titlu pagina. -->
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="dictionar" key="dictionar.title.delete"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="top" class="bottom" align="right">
        <img border="0"   style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="dictionar" key="dictionar.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <!-- Sectiune de Afisare Erori. -->
  <table width="100%" border="0" cellpadding="1" align="center" class="news-table-content" cellspacing="1">
    <logic:messagesPresent>
      <tr>
        <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center">
          <html:errors/>
        </td>
      </tr>
    </logic:messagesPresent>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- START Sectiune de FORM. -->
    <!-- Cimpul 'fk_limba' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="dictionar" key="dictionar.prompt.fk_limba"/>
        :
      </td>
      <td class="text">
        <bean:write  property="fk_limba" name="<%=Constants.TBL_DICTIONAR_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'traducere' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="dictionar" key="dictionar.prompt.traducere"/>
        :
      </td>
      <td class="text">
        <bean:write  property="traducere" name="<%=Constants.TBL_DICTIONAR_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'camp_id' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="dictionar" key="dictionar.prompt.camp_id"/>
        :
      </td>
      <td class="text">
        <bean:write  property="camp_id" name="<%=Constants.TBL_DICTIONAR_KEY%>"/>
      </td>
    </tr>
    <html:form action="/dictionar.do"  >
      <input type="hidden" name="values.id_dictionar" value="<bean:write property="id_dictionar" name="<%=Constants.TBL_DICTIONAR_KEY%>"/>">
      <!-- START Sectiune de BUTOANE. -->
      <!-- buton modificare. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="dictionar" key="dictionar.button.delete"/>
          </html:submit>
          <html:hidden property="method"  value="delete"/>
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="sys/dictionar.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
