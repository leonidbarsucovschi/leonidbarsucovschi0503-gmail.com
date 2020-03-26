<%@ page import="ro.uti.settings.util.Constants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>">
  <div id="search" class="show">
  </logic:equal>
<logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>">
  <div id="search" class="noshow">
  </logic:notEqual>

<html:form action="/admuser.do" styleId="searchForm" >
  <p width="100%" class="button-row" align="right">
    <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admuser" key="adm_user.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
  </p>

<table width="100%" border="0"  class="news-table-content">
<!-- Cimpul 'user_login' field. -->
<tr>
    <td valign="top"  width="40%"align="right">
      <bean:message bundle="admuser" key="adm_user.prompt.user_login"/>:
    </td>
    <td class="text" width="60%" align="left">
      <html:text styleClass="text-small" property="values.user_login" size="25"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.searchlabel.tooltip.user_login"/>"/>
    </td>
</tr>
<!-- Cimpul 'email' field. -->
<tr>
    <td valign="top"  align="right">
      <bean:message bundle="admuser" key="adm_user.prompt.email"/>:
    </td>
    <td class="text" align="left">
      <html:text styleClass="text-small" property="values.email" size="20"/>
      <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuser" key="adm_user.searchlabel.tooltip.email"/>" />
    </td>
</tr>
<!--Campul logat-->
<tr>
    <td valign="top"  align="right">
       <bean:message bundle="admuser" key="adm_user.prompt.logged"/>:
    </td>
    <td class="text" align="left">
       <html:select property="values.logged" styleClass="selectbox">
         <option value="-1"><bean:message key="select.prompt" bundle="app" /></option>
         <option value="1"><bean:message bundle="admuser" key="adm_user.logat"/></option>
         <option value="0"><bean:message bundle="admuser" key="adm_user.nelogat"/></option>
       </html:select>
    </td>
  </tr>
<!-- Cimpul 'account_status' field. -->
<tr>
    <td valign="top"  align="right">
     <bean:message bundle="admuser" key="adm_user.prompt.account_status"/>:
    </td>
    <td class="text" align="left">
      <html:select property="values.account_status" styleClass="selectbox">
         <option value="-1"><bean:message key="select.prompt" bundle="app" /></option>
         <option value="0"><bean:message bundle="admuser" key="adm_user.account_status.active"/></option>
         <option value="1"><bean:message bundle="admuser" key="adm_user.account_status.disabled"/></option>
       </html:select>
    </td>
</tr>
<!--Campul tip utilizator-->
<%--
<tr>
    <td valign="top"  align="right">
     <bean:message bundle="admuser" key="adm_user.prompt.user_type"/>:
    </td>
    <td class="text" align="left">
      <html:select property="values.user_type" styleClass="selectbox">
         <option value="-1"><bean:message key="select.prompt" bundle="app" /></option>
         <option value="0"><bean:message key="adm_user.user_type.internal" bundle="admuser"/></option>
         <option value="1"><bean:message key="adm_user.user_type.external" bundle="admuser"/></option>
       </html:select>
    </td>
</tr>
--%>
<!--Data crearii-->
<tr>
  <td valign="top"  align="right">
    <bean:message bundle="admuser" key="adm_user.prompt.account_creation_date"/>:
  </td>
  <td></td>
</tr>
<tr>
  <td valign="top"  align="right">
    <bean:message bundle="admuser" key="adm_user.dela"/>:
  </td>
  <td  class="text" align="left">
   <html:text styleClass="text-small" styleId="account_creation_dateString" property="values.account_creation_dateString"/>
     <input align="absmiddle" type="image" src="images/cal.gif" id="triggeraccount_creation_dateString"/>
     <script type="text/javascript">
     Calendar.setup(
       {
        inputField  : "account_creation_dateString",// ID of the input field
        ifFormat    : "%d.%m.%Y",    // the date format
        button      : "triggeraccount_creation_dateString"// ID of the button
       }
     );
     </script>
     <font size="-1">[dd/MM/yyyy]</font>
  </td>
</tr>

<tr>
<td valign="top"  align="right"><bean:message bundle="admuser" key="adm_user.la"/>:</td>
<td  class="text" align="left">
<html:text styleClass="text-small" styleId="account_deletion_dateString" property="values.account_deletion_dateString"/>
     <input align="absmiddle" type="image" src="images/cal.gif" id="triggeraccount_deletion_dateString"/>
     <script type="text/javascript">
     Calendar.setup(
       {
        inputField  : "account_deletion_dateString",// ID of the input field
        ifFormat    : "%d.%m.%Y",    // the date format
        button      : "triggeraccount_deletion_dateString"// ID of the button
       }
     );
     </script>
     <font size="-1">[dd/MM/yyyy]</font>
</td>
</tr>

  <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>"/>
  <tr>
    <td colspan="2" class="button-row" align="center">
      <input type="hidden" name="method" value="search"/>
      <input type="hidden" name="search" value="1"/>
      <html:submit styleClass="btn-generic"><bean:message  bundle="admuser" key="adm_user.button.search"/></html:submit>
    </td>
  </tr>
  </html:form>
  </table>