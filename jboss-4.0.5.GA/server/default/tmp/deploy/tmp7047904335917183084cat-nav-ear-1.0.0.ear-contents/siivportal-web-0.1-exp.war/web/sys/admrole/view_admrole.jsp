<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.waf.security.Types" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/jstl1.1/c.tld" prefix="c" %>
<%@ page isELIgnored="false" %>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr class="page-title-header">
      <td width="100%" valign="top" class="bottom" align="left">
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="admrole" key="adm_role.title.view"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admrole" key="adm_role.label.closeWindow"/>' src="images/close_off.gif" />
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
    <!-- Cimpul 'role_name' field. -->
    <!-- Cimpul 'role_name' field. -->
    <tr class="smallbodylite">
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrole" key="adm_role.prompt.role_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="values.role_name" name="<%=Constants.ADM_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_description' field. -->
    <!-- Cimpul 'role_description' field. -->
    <tr class="smallbodylite">
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrole" key="adm_role.prompt.role_description"/>
        :
      </td>
      <td class="text">
        <bean:write  property="values.role_description" name="<%=Constants.ADM_ROLE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'role_type' field. -->
    <!-- Cimpul 'role_type' field. -->
    <tr class="smallbodylite">
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrole" key="adm_role.prompt.role_type"/>
        :
      </td>
      <td class="text">
        <%--bean:write  property="role_type" name="<%=Constants.ADM_ROLE_KEY%>"/--%>
        <logic:equal name="form_AdmRoleForm"  value="0" property="values.role_type" >
            <bean:message bundle="admrole" key="adm_role.type.system" />
        </logic:equal>
         <logic:equal name="form_AdmRoleForm"  value="2" property="values.role_type" >
            <bean:message bundle="admrole" key="adm_role.type.system" />
        </logic:equal>
        <logic:equal name="form_AdmRoleForm" value="1" property="values.role_type" >
            <bean:message bundle="admrole" key="adm_role.type.user" />
        </logic:equal>
        <logic:equal name="form_AdmRoleForm" value="3" property="values.role_type" >
            <bean:message bundle="admrole" key="adm_role.type.user" />
        </logic:equal>
        <%--<c:choose>
        	<c:when test="${form_AdmRoleForm.values.role_type} == <%=Types.RoleTypes.SYSTEM_ROLE%>">
        		<bean:message bundle="admrole" key="adm_role.type.system" />
        	</c:when>
        	<c:when test="${form_AdmRoleForm.values.role_type} == <%=Types.RoleTypes.USER_ROLE%>">
        		<bean:message bundle="admrole" key="adm_role.type.user" />
        	</c:when>
        </c:choose>--%>
      </td>
    </tr>
    <!-- Cimpul 'role_code' field. -->
    <!-- Cimpul 'role_code' field. -->
    <tr class="smallbodylite">
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admrole" key="adm_role.prompt.role_code"/>
        :
      </td>
      <td class="text">
        <bean:write  property="values.role_code" name="<%=Constants.ADM_ROLE_KEY%>"/>
      </td>
    </tr>
    <tr>
    	<td colspan="2">

<table width="100%">
<tr>
    <td class="page-title-header" align="center">&nbsp;</td>
  </tr>
<tr>
    <td class="page-title-header" align="center"><bean:message bundle="admuser" key="adm_user.roles.selected_roles" /></td>
  </tr>
  <tr>
    <td align="center"><table width="50%"  border="0" cellpadding="0" cellspacing="0" align="center">

    	<logic:iterate name="form_AdmRoleForm" property="selectedRoles" id="sr">
	      <tr>
	        <td valign="top">
	        	<div>&nbsp;</div>
	        	<div class="text-label">
		        	<bean:write name="sr" property="roleVO.role_name"/>
	        	</div>
	        	<div id="sr_<bean:write name="sr" property="id"/>">##</div>

				<script type="text/javascript">

					var selRole_<bean:write name="sr" property="id"/> = new dTree('selRole_<bean:write name="sr" property="id"/>', null, false);
					selRole_<bean:write name="sr" property="id"/>.add(<bean:write name="sr" property="id"/>, -1, '<bean:write name="sr" property="roleVO.role_name"/>', '', '<bean:write name="sr" property="roleVO.role_name"/>');

					<logic:iterate name="sr" id="r" property="children">
						var roleId = '<bean:write name="r" property="id" />';
						selRole_<bean:write name="sr" property="id"/>.add(roleId,<logic:empty name="r" property="parentId">0</logic:empty><logic:notEmpty name="r" property="parentId"><bean:write name="r" property="parentId" /></logic:notEmpty>,'<bean:write name="r" property="roleVO.role_name" />','','<bean:write name="r" property="roleVO.role_name" />','_self', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif');
					</logic:iterate>

					selRole_<bean:write name="sr" property="id"/>.closeAll();
					document.getElementById('sr_<bean:write name="sr" property="id"/>').innerHTML = selRole_<bean:write name="sr" property="id"/>;

				</script>

	        </td>
	      </tr>
    	</logic:iterate>

    </table></td>
  </tr>

  <tr>
    <td>&nbsp;</td>
  </tr>
  </table>

    	</td>
    </tr>
  </table>
</div>
<%
  String type = request.getParameter("type");
%>
<form name="closeForm" method="post" action="sys/admrole.do">
  <html:hidden property="method"  value="list"/>
  <input type="hidden" name="type" value="<%=type%>"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
