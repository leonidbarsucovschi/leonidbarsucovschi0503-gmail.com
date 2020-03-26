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
<!-- #########################3 -->
<!-- -->
<!-- Start Sectiune de SEARCH. -->
<!-- #############################-->
<logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>">
  <div id="search" class="show">
</logic:equal>
<logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>">
  <div id="search" class="noshow">
</logic:notEqual>
<html:form action="/nomlimba.do" styleId="searchForm">
  <p width="100%" class="button-row" align="right">
    <img border="0" style="cursor:pointer;" onClick="javascript:hideLayer('search');"
         title='<bean:message bundle="nomlimba" key="nom_limba.label.closeWindow"/>' name="closeEditFrame"
         id="closeEdit" src="images/close_off.gif"
         onMouseOver="this.src='images/close_on.gif'" onmouseout="this.src='images/close_off.gif'"/>
  </p>
  <!-- <table width="100%" class="lightrow" border="0">-->
  <!-- <table width="100%" border="0" cellpadding="0" cellspacing="1">-->
  <table width="100%" border="0" cellpadding="0" cellspacing="1" class="report">
  <!-- <tr class="page-title-header">-->
  <tr>
    <td valign="top" width="40%" align="right">
      <!-- Cimpul 'denumire' field. -->
      <!--        <tr>
                <td valign="top" class="label" align="right">
      -->
      <bean:message bundle="nomlimba" key="nom_limba.prompt.den_limba"/>
      :
    </td>
    <td align="left">
      <html:text styleClass="field_input" property="values.den_limba" size="40" maxlength="40"/>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
           title="<bean:message bundle="nomlimba" key="nom_limba.searchlabel.tooltip.den_limba"/>"/>
    </td>
  </tr>
    <tr>
        <td colspan="2" height="10"></td>
    </tr>
  <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>"/>
  <tr>
    <td colspan="2" class="button-row" align="center">
      <input type="hidden" name="method" value="search"/>
      <input type="hidden" name="search" value="1"/>
      <html:submit styleClass="btn-generic">
        <bean:message bundle="nomlimba" key="nom_limba.button.search"/>
      </html:submit>
    </td>
  </tr>
</html:form>
</table>
<!-- #############################-->
<!-- END Sectiune de SEARCH. -->
