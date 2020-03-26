<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.ADM_ROLE_HIERARCHY_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admrolehierarchy.do" decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
    <display:column property="role_name"  bundle="admrole" title="adm_role.prompt.role_name" sortable="role_name" style="sortable"/>
    <display:column property="role_description"  bundle="admrole" title="adm_role.prompt.role_description" sortable="role_description" style="sortable"/>
    <display:column property="role_type"  bundle="admrole" title="adm_role.prompt.role_type" sortable="role_type" style="sortable"/>
    <display:column property="role_code"  bundle="admrole" title="adm_role.prompt.role_code" sortable="role_code" style="sortable"/>
    <display:column property="role_name"  bundle="admrole" title="adm_role.prompt.role_name" sortable="role_name" style="sortable"/>
    <display:column property="role_description"  bundle="admrole" title="adm_role.prompt.role_description" sortable="role_description" style="sortable"/>
    <display:column property="role_type"  bundle="admrole" title="adm_role.prompt.role_type" sortable="role_type" style="sortable"/>
    <display:column property="role_code"  bundle="admrole" title="adm_role.prompt.role_code" sortable="role_code" style="sortable"/>
    <display:column property="noPrint"   bundle="admrolehierarchy"  width="80" keyprefix="adm_role_hierarchy" decorator="default" pkName="id_role_hierarchy"/>
  </display:table>
</div>
