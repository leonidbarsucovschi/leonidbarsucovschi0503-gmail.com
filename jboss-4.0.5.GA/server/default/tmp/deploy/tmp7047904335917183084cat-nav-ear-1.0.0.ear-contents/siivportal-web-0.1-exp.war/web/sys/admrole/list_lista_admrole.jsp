<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/tld/jportal/jpdisplaytag.tld" prefix="display" %>
<%
  String type = request.getParameter("type");
%>
<div>
  <display:table list="<%=Constants.ADM_ROLE_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admrole.do" decorator="ro.uti.apmc.sys.util.RoleListDecorator">
    <display:column property="role_name" bundle="admrole" title="adm_role.prompt.role_name" sortable="role_name" style="sortable"/>
    <display:column property="role_description" bundle="admrole" title="adm_role.prompt.role_description" sortable="role_description" style="sortable"/>
    <display:column property="roleType" bundle="admrole" title="adm_role.prompt.role_type" sortable="role_type" style="sortable" decorator="table"/>
    <display:column property="role_code" bundle="admrole" title="adm_role.prompt.role_code" sortable="role_code" style="sortable"/>
    <display:column property="noPrint"   bundle="admrole"  width="80" keyprefix="adm_role" decorator="table" pkName="id_role"/>
    <display:params>
      <input type="hidden" name="type" value="<%=type%>"/>
    </display:params>
  </display:table>
</div>
