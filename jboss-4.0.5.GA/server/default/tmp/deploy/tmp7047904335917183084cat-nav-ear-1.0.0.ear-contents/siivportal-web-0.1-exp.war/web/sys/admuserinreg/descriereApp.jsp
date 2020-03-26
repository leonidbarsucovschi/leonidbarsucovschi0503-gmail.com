<%@ page import="java.util.HashMap,
                 ro.uti.apmc.sys.util.AdmUserInregConstants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<logic:iterate id="listItem" name='<%= AdmUserInregConstants.LIST_DEN_DESC_APP %>'>
<tr>
  <td width="100%" valign="top" class="page-subtitle" align="left">
    <bean:write name="listItem" property="DENUMIRE"/>
  </td>
  <td class="bottom" align="right">
    <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.closeWindow"/>'  src="images/close_off.gif" />
   </td>
</tr>
<tr>
 <td class="label" colspan="2">
   <bean:write name="listItem" property="DES"/>
 </td>
</tr>
</logic:iterate>
</table>

</div>
<script>
function closeWindow(){
  if(window.opener) {
     window.opener.close();
  }
}
</script>