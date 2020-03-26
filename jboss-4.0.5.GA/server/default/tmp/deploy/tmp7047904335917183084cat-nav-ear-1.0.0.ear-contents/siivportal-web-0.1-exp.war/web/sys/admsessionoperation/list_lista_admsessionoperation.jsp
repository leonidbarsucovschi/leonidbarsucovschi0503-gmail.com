<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.ADM_SESSION_OPERATION_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="25" method="list" requestURI="sys/admsessionoperation.do" decorator="ro.uti.siiv.sys.util.SessionOperationTableDecorator">
    <display:column property="operation_date" bundle="admsessionoperation" title="adm_session_operation.prompt.operation_date" sortable="operation_date" style="sortable" decorator="table"/>
	<display:column property="user_login"  bundle="admusersession" title="adm_user_session.prompt.fk_user" sortable="fk_user" style="sortable"/>
    <display:column property="opp_name"  bundle="admoperationtype" title="adm_operation_type.prompt.opp_name" sortable="opp_name" style="sortable"/>
    <display:column property="description"  bundle="admoperationtype" title="adm_operation_type.prompt.description" sortable="description" style="sortable"/>
	<display:column property="noPrint"   bundle="admsessionoperation"  width="80" keyprefix="adm_session_operation" decorator="table" pkName="id_session_operation"/>
  </display:table>
</div>
