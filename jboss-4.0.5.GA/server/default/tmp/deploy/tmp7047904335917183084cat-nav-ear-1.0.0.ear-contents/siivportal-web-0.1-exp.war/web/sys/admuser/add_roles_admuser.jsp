<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<style type="text/css">
<!--
img {
	border: 0px none #000000;
}
-->


</style>

<form name="closeForm" method="get" action="sys/admuser.do">
  <html:hidden property="method" value="list"/>
</form>
<script language="Javascript">
  function closeWindow() {
    document.closeForm.submit();
  }
</script>

<table width="100%"  border="0" cellpadding="0" cellspacing="0">
  <% String userLogin = ((ro.uti.apmc.sys.model.AdmUserVO)((ro.uti.apmc.sys.command.AdmUserForm)request.getAttribute("form_AdmUserForm")).getValues()).getUser_login(); %>
  <%-- tr>
    <td colspan="4" align="center"><bean:message bundle="admuser" key="adm_user.roles.title" arg0="<%=userLogin%>"/></td>
  </tr--%>
  <tr>
  	<td colspan="4">
		<table width="100%" border="0" cellpadding="2" cellspacing="0"><tr
		    class="page-title-header"><td width="100%" valign="top" align="left">
		  <bean:message bundle="admuser" key="adm_user.roles.title" arg0="<%=userLogin%>"/>
		</td>
		  <td class="bottom" align="right">
		    <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();"
		         title='<bean:message bundle="admuser" key="adm_user.label.closeWindow"/>'
		         src="images/close_off.gif"/>
		  </td>
		</tr></table>
  	</td>
  </tr>
  <tr>
  	<td colspan="4" class="text-label">
  		<bean:message bundle="admuser" key="adm_user.subtitle.addRoles"/>
  	</td>
  </tr>
  <tr>
    <td width="20%" height="22">&nbsp;</td>
    <td width="30%">&nbsp;</td>
    <td width="10%">&nbsp;</td>
    <td width="40%">&nbsp;</td>
  </tr>
  <logic:messagesPresent message="true">
    <html:messages id="meslogin" message="true" bundle="admuser">
      <tr>
        <td valign="top" colspan="4" class="msg_error" align="center">
          <bean:write name="meslogin" />
        </td>
      </tr>
    </html:messages>
  </logic:messagesPresent>
  <tr>
    <td>&nbsp;</td>
    <td class="page-title-header"><bean:message bundle="admuser" key="adm_user.roles.selected_roles" /></td>
    <td>&nbsp;</td>
    <td class="page-title-header"><bean:message bundle="admuser" key="adm_user.roles.roles_tree" /></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><table width="100%"  border="0" cellpadding="0" cellspacing="0">

    	<logic:iterate name="form_AdmUserForm" property="selectedRoles" id="sr">
	      <tr>
	        <td valign="top">
	        	<div>&nbsp;</div>
	        	<div class="text-label">
		        	<bean:write name="sr" property="roleVO.role_name"/>
		        	&nbsp;
		        	<a href="javascript:removeRoleNode(<bean:write name="sr" property="id"/>)">
		        		<bean:message bundle="admuser" key="adm_user.label.remove" />
		        	</a>
	        	</div>
	        	<div id="sr_<bean:write name="sr" property="id"/>">##</div>

				<script type="text/javascript">

					var selRole_<bean:write name="sr" property="id"/> = new dTree('selRole_<bean:write name="sr" property="id"/>', null, false);
					selRole_<bean:write name="sr" property="id"/>.add(<bean:write name="sr" property="id"/>, -1, '<bean:write name="sr" property="roleVO.role_name"/>', 'javascript:nothing()', '<bean:write name="sr" property="roleVO.role_name"/>');

					<logic:iterate name="sr" id="r" property="children">
						var roleId = '<bean:write name="r" property="id" />';
						selRole_<bean:write name="sr" property="id"/>.add(roleId,<logic:empty name="r" property="parentId">0</logic:empty><logic:notEmpty name="r" property="parentId"><bean:write name="r" property="parentId" /></logic:notEmpty>,'<bean:write name="r" property="roleVO.role_name" />','javascript:nothing()','<bean:write name="r" property="roleVO.role_name" />','_self', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif');
					</logic:iterate>

					selRole_<bean:write name="sr" property="id"/>.closeAll();
					document.getElementById('sr_<bean:write name="sr" property="id"/>').innerHTML = selRole_<bean:write name="sr" property="id"/>;

				</script>

	        </td>
	      </tr>
    	</logic:iterate>

    </table></td>
    <td>&nbsp;</td>
    <td valign="top">
           <table width="100%">
                        <tr>
                           <td class="label">
                              <input type="radio" name="tipRol" id="selectRol" value="0" checked="true" onclick="showDiv(0);" /><bean:message bundle="admuser" key="adm_user.roles.system"/>
                              <input type="radio" name="tipRol" id="selectRol" value="1" onclick="showDiv(1);"/><bean:message bundle="admuser" key="adm_user.roles.user"/>
                           </td>
                        </tr>
                        <tr>
                           <td style="vertical-align:top"  >
                           <table id="tr1" style="display:block" width="100%" >
                           <tr><td> <div id="rls">#Browser not supported#</div></td></tr>
                           </table><table  width="100%" id="tr2" style="display:none" ><tr><td><div id="user" >#Browser not supported#</div></td></tr></table>
                           </td>
                        </tr>
                     </table>

    </td>
  </tr>

	<script type="text/javascript">

		var selRoles = new dTree('selRoles', null, false);
		selRoles.add(0, -1, '<bean:message bundle="admuser" key="adm_user.roles.system"/>', '', '<bean:message bundle="admuser" key="adm_user.roles.system"/>');

		<logic:iterate name="form_AdmUserForm" id="r" property="rolesSystem">
			var roleId = '<bean:write name="r" property="id" />';
			selRoles.add(roleId,<logic:empty name="r" property="parentId">0</logic:empty><logic:notEmpty name="r" property="parentId"><bean:write name="r" property="parentId" /></logic:notEmpty>,'<bean:write name="r" property="roleVO.role_name" />','javascript:addRoleNode('+roleId+')','<bean:write name="r" property="roleVO.role_name" />','_self', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif');
		</logic:iterate>

		selRoles.closeAll();
		document.getElementById('rls').innerHTML = selRoles;

        var selRolesUser = new dTree('selRolesUser', null, false);
		selRolesUser.add(0, -1, '<bean:message bundle="admuser" key="adm_user.roles.user"/>', '', '<bean:message bundle="admuser" key="adm_user.roles.user"/>');

		<logic:iterate name="form_AdmUserForm" id="r" property="rolesUser">
			var roleId = '<bean:write name="r" property="id" />';
			selRolesUser.add(roleId,<logic:empty name="r" property="parentId">0</logic:empty><logic:notEmpty name="r" property="parentId"><bean:write name="r" property="parentId" /></logic:notEmpty>,'<bean:write name="r" property="roleVO.role_name" />','javascript:addRoleNode('+roleId+')','<bean:write name="r" property="roleVO.role_name" />','_self', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif');
		</logic:iterate>

		selRolesUser.closeAll();
		document.getElementById('user').innerHTML = selRolesUser;

		function addRoleNode(roleId) {
			var urlStr = "<%=request.getContextPath()%>/sys/admuser.do;jsessionid=<%=request.getSession().getId()%>?method=addRole&roleId="+roleId+"&values.user_login=<bean:write property="values.user_login" name="<%=Constants.ADM_USER_KEY%>"/>";
			window.location = urlStr;
		}

		function removeRoleNode(roleId) {
			var urlStr = "<%=request.getContextPath()%>/sys/admuser.do;jsessionid=<%=request.getSession().getId()%>?method=removeRole&roleId="+roleId+"&values.user_login=<bean:write property="values.user_login" name="<%=Constants.ADM_USER_KEY%>"/>";
			window.location = urlStr;
		}

        function showDiv(id){
            if(id == 0){
                document.getElementById("tr1").style.display='inline';
                document.getElementById("tr2").style.display='none';
            }else{
                document.getElementById("tr1").style.display='none';
                document.getElementById("tr2").style.display='inline';
            }
        }

	</script>

  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr align="center">
    <td colspan="4">
    	<button class="btn-generic" onclick="document.getElementById('frm_save').submit();"><bean:message bundle="admuser" key="adm_user.button.save"/></button>
    </td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
<html:form  action="/admuser.do"  styleId="frm_save">
   <html:hidden property="method"  value="save"/>
   <html:hidden property="values.id_user"/>
   <html:hidden property="values.user_login"/>
</html:form>