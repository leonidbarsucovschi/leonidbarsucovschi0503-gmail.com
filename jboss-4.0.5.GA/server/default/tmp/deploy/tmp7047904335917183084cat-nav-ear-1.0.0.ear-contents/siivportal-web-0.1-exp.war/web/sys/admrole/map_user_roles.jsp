<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<div class="table">
<!--Titlul-->
<table width="100%" border="0" cellpadding="2" cellspacing="0">
 <tr class="page-subtitle">
  <td width="100%" valign="top" align="left">
     <bean:message bundle="admuser" key="adm_user.userrolemap.title" />
  </td>
 </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr>
 <td width="10%">&nbsp;</td>
 <td width="40%">&nbsp;</td>
 <td width="10%">&nbsp;</td>
 <td width="40%">&nbsp;</td>
</tr>
<tr>
 <td>&nbsp;</td>
 <td valign="top" >
   <script type="text/javascript">
		var rolUserInt = new dTree('rolUserInt', null, false);
		rolUserInt.add(0, -1, '<bean:message bundle="admrole" key="adm_role.type.user.int"/>', '', '<bean:message bundle="admrole" key="adm_role.type.user.int"/>');
		<logic:iterate name="form_AdmRoleForm" id="r" property="rolesSystem">
			var roleId = '<bean:write name="r" property="id" />';
			rolUserInt.add(roleId,<logic:empty name="r" property="parentId">0</logic:empty><logic:notEmpty name="r" property="parentId"><bean:write name="r" property="parentId" /></logic:notEmpty>,'<bean:write name="r" property="roleVO.role_name" />','','<bean:write name="r" property="roleVO.role_name" />','_self', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif');
		</logic:iterate>
		document.write(rolUserInt);
    rolUserInt.closeAll();
	</script>
 </td>
 <td>&nbsp;</td>
 <td valign="top" >
  <script type="text/javascript">
		var rolUserExt = new dTree('rolUserExt', null, false);
		rolUserExt.add(0, -1, '<bean:message bundle="admrole" key="adm_role.type.user.ext"/>', '', '<bean:message bundle="admrole" key="adm_role.type.user.ext"/>');
		<logic:iterate name="form_AdmRoleForm" id="r" property="rolesUser">
			var roleId = '<bean:write name="r" property="id" />';
			rolUserExt.add(roleId,<logic:empty name="r" property="parentId">0</logic:empty><logic:notEmpty name="r" property="parentId"><bean:write name="r" property="parentId" /></logic:notEmpty>,'<bean:write name="r" property="roleVO.role_name" />','','<bean:write name="r" property="roleVO.role_name" />','_self', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif');
		</logic:iterate>
		document.write(rolUserExt);
    rolUserExt.closeAll();
	</script>
 </td>
</tr>
</table>
</div>