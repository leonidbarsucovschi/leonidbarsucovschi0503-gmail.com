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
      <td width="100%" valign="top" class="page-subtitle" align="left">
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="nomlimba" key="nom_limba.title.view"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer;" onClick="javascript:closeWindow();"
             title='<bean:message bundle="nomlimba" key="nom_limba.label.closeWindow"/>' src="images/close_off.gif"
             onMouseOver="this.src='images/close_on.gif'" onmouseout="this.src='images/close_off.gif'"/>
      </td>
    </tr></table>
  <table width="100%" border="0" cellpadding="1" align="center" cellspacing="1">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error" align="center"><html:errors/></td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- Cimpul 'den_limba' field. -->
    <!-- Cimpul 'den_limba' field. -->
    <tr>
      <td width="40%" valign="top" class="label" align="right"><bean:message bundle="nomlimba"
                                                                                key="nom_limba.prompt.den_limba"/>:
      </td><td class="field_text"><bean:write property="den_limba" name="<%=Constants.NOM_LIMBA_KEY%>"/>
    </td></tr>
    <!-- Cimpul 'cod_limba' field. -->
    <!-- Cimpul 'cod_limba' field. -->
    <tr>
      <td width="40%" valign="top" class="label" align="right"><bean:message bundle="nomlimba"
                                                                                key="nom_limba.prompt.cod_limba"/>:
      </td><td class="field_text"><bean:write property="cod_limba" name="<%=Constants.NOM_LIMBA_KEY%>"/>
    </td></tr>
  </table>
</div>

<form name="closeForm" method="post" action="nom/nomlimba.do"><html:hidden property="method" value="list"/></form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
