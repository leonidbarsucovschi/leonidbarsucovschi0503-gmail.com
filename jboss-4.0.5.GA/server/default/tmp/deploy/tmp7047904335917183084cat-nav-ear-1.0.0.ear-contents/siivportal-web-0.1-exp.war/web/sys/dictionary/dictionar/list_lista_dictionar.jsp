<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.TBL_DICTIONAR_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/dictionar.do" decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
    <display:column property="fk_limba" bundle="dictionar" title="dictionar.prompt.fk_limba" sortable="fk_limba" style="sortable"/>
    <display:column property="traducere" bundle="dictionar" title="dictionar.prompt.traducere" sortable="traducere" style="sortable"/>
    <display:column property="camp_id" bundle="dictionar" title="dictionar.prompt.camp_id" sortable="camp_id" style="sortable"/>
    <display:column property="noPrint"   bundle="dictionar"  width="80" keyprefix="dictionar" decorator="default" pkName="id_dictionar"/>
  </display:table>
</div>
