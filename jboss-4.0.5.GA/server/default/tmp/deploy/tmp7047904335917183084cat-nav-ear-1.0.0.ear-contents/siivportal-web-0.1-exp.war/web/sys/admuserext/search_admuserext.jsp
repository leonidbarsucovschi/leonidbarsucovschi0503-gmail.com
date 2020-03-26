<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="selectionComponent" prefix="selection" %>
<!-- #########################3 -->
<!--                            -->
<!-- Start Sectiune de SEARCH. -->
<!-- #############################-->
<logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>">
  <div id="search" class="show">
  </logic:equal>
  <logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>">
    <div id="search" class="noshow">
    </logic:notEqual>
    <html:form action="/admuserext.do" styleId="searchForm" >
      <p width="100%" class="button-row" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admuserext" key="adm_user_ext.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </p>
      <table width="100%" class="report" border="0">

<!-- Cimpul 'nume_user' field. -->
<tr>
  <td valign="top" class="label" align="right">
    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.nume_user"/>:
  </td>
  <td class="text" align="left">
   <html:text styleClass="field_input" property="values.nume" size="30"/>
<%--   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.searchlabel.tooltip.nume_user"/>" />--%>
  </td>
</tr>
<!-- Cimpul 'prenume_user' field. -->
<tr>
    <td valign="top" class="label" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prenume_user"/>:
    </td>
    <td class="text" align="left">
     <html:text styleClass="field_input" property="values.prenume" size="30"/>
<%--     <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.searchlabel.tooltip.prenume_user"/>" />--%>
    </td>
</tr>
<!-- Cimpul 'user_login' field. -->
<tr>
    <td valign="top"   align="right">
      <bean:message bundle="admuser" key="adm_user.prompt.user_login"/>:
    </td>
    <td class="text" align="left">
      <html:text styleClass="field_input" property="values.user_login" size="25"/>
<%--      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.searchlabel.tooltip.user_login"/>"/>--%>
    </td>
</tr>

<input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>" />
<tr>
  <td colspan="2" class="button-row" align="center">
        <input type="hidden" name="method" value="search" />
        <input type="hidden" name="search" value="1" />
        <html:submit styleClass="button">
          <bean:message  bundle="admuserext" key="adm_user_ext.button.search"/>
        </html:submit>
  </td>
    </tr>
  </html:form>
</table>
<!-- #############################-->
<!-- END Sectiune de SEARCH. -->
