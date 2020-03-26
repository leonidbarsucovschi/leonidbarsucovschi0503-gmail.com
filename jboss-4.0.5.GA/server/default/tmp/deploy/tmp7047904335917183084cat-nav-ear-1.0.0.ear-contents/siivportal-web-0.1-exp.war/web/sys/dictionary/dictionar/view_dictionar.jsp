<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.waf.common.Commands" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr>
      <td width="100%" valign="top" class="bottom" align="left">
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="dictionar" key="dictionar.title.view"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="dictionar" key="dictionar.label.closeWindow"/>' src="images/close_off.gif" />
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
    <!-- Cimpul 'fk_limba' field. -->
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
  </table>
</div>
<form name="closeForm" method="post" action="sys/dictionar.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
