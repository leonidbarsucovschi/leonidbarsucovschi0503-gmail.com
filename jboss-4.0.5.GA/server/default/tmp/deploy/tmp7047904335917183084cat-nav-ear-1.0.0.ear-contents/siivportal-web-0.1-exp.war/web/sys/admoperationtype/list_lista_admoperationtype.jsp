<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.ADM_OPERATION_TYPE_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admoperationtype.do" decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
    <display:column property="opp_name" bundle="admoperationtype" title="adm_operation_type.prompt.opp_name" sortable="opp_name" style="sortable"/>
    <display:column property="description" bundle="admoperationtype" title="adm_operation_type.prompt.description" sortable="description" style="sortable"/>
    <display:column property="fk_operation_type"  bundle="admoperationtype" title="adm_operation_type.prompt.fk_operation_type" sortable="fk_operation_type" style="sortable"/>
    <display:column property="opp_name"  bundle="admoperationtype" title="adm_operation_type.prompt.opp_name" sortable="opp_name" style="sortable"/>
    <display:column property="description"  bundle="admoperationtype" title="adm_operation_type.prompt.description" sortable="description" style="sortable"/>
    <display:column property="noPrint"   bundle="admoperationtype"  width="80" keyprefix="adm_operation_type" decorator="default" pkName="id_operation_type"/>
  </display:table>
</div>
