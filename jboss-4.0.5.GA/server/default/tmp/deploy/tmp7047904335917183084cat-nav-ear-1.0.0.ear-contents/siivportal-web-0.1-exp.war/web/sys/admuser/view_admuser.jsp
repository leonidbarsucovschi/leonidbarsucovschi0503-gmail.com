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
        <bean:message bundle="admuser" key="adm_user.title.view"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuser" key="adm_user.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="1" align="center" class="lightrow" cellspacing="1">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error" align="center">
        <html:errors/>
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- Cimpul 'user_login' field. -->
    <!-- Cimpul 'user_login' field. -->
    <tr class="smallbodylite">
      <td width="40%" valign="top"  align="right" class="text">
        <bean:message bundle="admuser" key="adm_user.prompt.user_login"/>
        :
      </td>
      <td class="text">
        <bean:write  property="values.user_login" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'user_passwd' field. -->
    <!-- Cimpul 'user_passwd' field. -->
    <%--tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.user_passwd"/>
        :
      </td>
      <td class="text">
        <bean:write  property="user_passwd" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr--%>
    <!-- Cimpul 'logged' field. -->
    <!-- Cimpul 'logged' field. -->
    <tr class="smallbodylite">
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.logged"/>
        :
      </td>
      <td class="text">
        <%--bean:write  property="logged" name="<%=Constants.ADM_USER_KEY%>"/--%>
        <c:choose>
        <c:when test="${form_AdmUserForm.values.logged == 0}">
        	<img src="<%=request.getContextPath()%>/images/offline.gif"/>
        </c:when>
        <c:otherwise>
        	<img src="<%=request.getContextPath()%>/images/online.gif"/>
        </c:otherwise>
        </c:choose>
      </td>
    </tr>
    <!-- Cimpul 'account_status' field. -->
    <!-- Cimpul 'account_status' field. -->
    <tr class="smallbodylite">
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.account_status"/>
        :
      </td>
      <td class="text">
        <%--bean:write  property="account_status" name="<%=Constants.ADM_USER_KEY%>"/--%>
        <c:choose>
        <c:when test="${form_AdmUserForm.values.account_status == 0}">
        	<bean:message bundle="admuser" key="adm_user.account_status.active"/>
        </c:when>
        <c:otherwise>
        	<bean:message bundle="admuser" key="adm_user.account_status.disabled"/>
        </c:otherwise>
        </c:choose>
      </td>
    </tr>
    <!-- Cimpul 'account_creation_date' field. -->
    <!-- Cimpul 'account_creation_date' field. -->
    <tr class="smallbodylite">
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.account_creation_date"/>
        :
      </td>
      <td class="text">
        <bean:write  property="values.account_creation_date" name="<%=Constants.ADM_USER_KEY%>" format="dd/MM/yyyy"/>
      </td>
    </tr>
    <!-- Cimpul 'account_deletion_date' field. -->
    <!-- Cimpul 'account_deletion_date' field. -->
    <%--tr class="smallbodylite">
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.account_deletion_date"/>
        :
      </td>
      <td class="text">
        <bean:write  property="values.account_deletion_date" name="<%=Constants.ADM_USER_KEY%>" format="dd/MM/yyyy" />
      </td>
    </tr--%>
    <!-- Cimpul 'serial_number' field. -->
    <!-- Cimpul 'serial_number' field. -->
    <%-- %>tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.serial_number"/>
        :
      </td>
      <td class="text">
        <bean:write  property="serial_number" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'issuer_name' field. -->
    <!-- Cimpul 'issuer_name' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.issuer_name"/>
        :
      </td>
      <td class="text">
        <bean:write  property="issuer_name" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'digital_certificate' field. -->
    <!-- Cimpul 'digital_certificate' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.digital_certificate"/>
        :
      </td>
      <td class="text">
        <bean:write property="digital_certificateFile" name="<%=Constants.ADM_USER_KEY%>"/>
      </td>
    </tr--%>
    <!-- Cimpul 'user_type' field. -->
    <!-- Cimpul 'user_type' field. -->
    <tr class="smallbodylite">
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.user_type"/>
        :
      </td>
      <td class="text">
        <%--bean:write  property="user_type" name="<%=Constants.ADM_USER_KEY%>"/--%>
        <c:choose>
        <c:when test="${form_AdmUserForm.values.user_type == 0}">
        	<bean:message bundle="admuser" key="adm_user.user_type.internal" />
        </c:when>
        <c:otherwise>
        	<bean:message bundle="admuser" key="adm_user.user_type.external" />
        </c:otherwise>
        </c:choose>
      </td>
    </tr>
    <!-- Cimpul 'email' field. -->
    <!-- Cimpul 'email' field. -->
    <tr class="smallbodylite">
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="admuser" key="adm_user.prompt.email"/>
        :
      </td>
      <td class="text">
        <bean:write  property="values.email" name="<%=Constants.ADM_USER_KEY%>"/>
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

    	<logic:iterate name="form_AdmUserForm" property="selectedRoles" id="sr">
	      <tr>
	        <td valign="top">
	        	<div>&nbsp;</div>
	        	<div class="text-label">
		        	<bean:write name="sr" property="roleVO.role_name"/>
	        	</div>
	        	<div id="sr_<bean:write name="sr" property="id"/>">##</div>

				<script type="text/javascript">

					var selRole_<bean:write name="sr" property="id"/> = new dTree('selRole_<bean:write name="sr" property="id"/>', null, false);
					selRole_<bean:write name="sr" property="id"/>.add(<bean:write name="sr" property="id"/>, -1, '<bean:write name="sr" property="roleVO.role_name"/>', 'javascript: nothing();', '<bean:write name="sr" property="roleVO.role_name"/>');

					<logic:iterate name="sr" id="r" property="children">
						var roleId = '<bean:write name="r" property="id" />';
						selRole_<bean:write name="sr" property="id"/>.add(roleId,<logic:empty name="r" property="parentId">0</logic:empty><logic:notEmpty name="r" property="parentId"><bean:write name="r" property="parentId" /></logic:notEmpty>,'<bean:write name="r" property="roleVO.role_name" />','javascript: nothing();','<bean:write name="r" property="roleVO.role_name" />','_self', '<%=request.getContextPath()%>/images/role.gif', '<%=request.getContextPath()%>/images/role.gif');
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
<form name="closeForm" method="post" action="sys/admuser.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
