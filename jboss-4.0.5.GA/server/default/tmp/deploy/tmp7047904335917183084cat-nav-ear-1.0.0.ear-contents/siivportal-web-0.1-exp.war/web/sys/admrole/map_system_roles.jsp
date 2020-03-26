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
     <bean:message bundle="admuser" key="adm_user.systemrolemap.title" />
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
		var rolSysInt = new dTree('rolSysInt', null, false);
		rolSysInt.add(0, -1, '<bean:message bundle="admrole" key="adm_role.type.system.int"/>', '', '<bean:message bundle="admrole" key="adm_role.type.system.int"/>');
		<logic:iterate name="form_AdmRoleForm" id="r" property="rolesSystem">
			var roleId = '<bean:write name="r" property="id" />';
			rolSysInt.add(roleId,<logic:empty name="r" property="parentId">0</logic:empty><logic:notEmpty name="r" property="parentId"><bean:write name="r" property="parentId" /></logic:notEmpty>,'<bean:write name="r" property="roleVO.role_name" />','','<bean:write name="r" property="roleVO.role_name" />','_self', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif');
		</logic:iterate>
		document.write(rolSysInt);
    rolSysInt.closeAll();
	</script>
 </td>
 <td>&nbsp;</td>
 <td valign="top" >
  <script type="text/javascript">
		var rolSysExt = new dTree('rolSysExt', null, false);
		rolSysExt.add(0, -1, '<bean:message bundle="admrole" key="adm_role.type.system.ext"/>', '', '<bean:message bundle="admrole" key="adm_role.type.system.ext"/>');
		<logic:iterate name="form_AdmRoleForm" id="r" property="rolesUser">
			var roleId = '<bean:write name="r" property="id" />';
			rolSysExt.add(roleId,<logic:empty name="r" property="parentId">0</logic:empty><logic:notEmpty name="r" property="parentId"><bean:write name="r" property="parentId" /></logic:notEmpty>,'<bean:write name="r" property="roleVO.role_name" />','','<bean:write name="r" property="roleVO.role_name" />','_self', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif');
		</logic:iterate>
		document.write(rolSysExt);
    rolSysExt.closeAll();
	</script>
 </td>
</tr>
</table>
</div>
