<%--
  Created by IntelliJ IDEA.
  User: Sandu Mihai
  Date: 15-Jun-2007
  Time: 12:40:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>

<div>
  <display:table list="<%=Constants.TBL_REPORT_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="listMine" requestURI="reports/report.do" decorator="ro.uti.apmc.sys.util.ReportMineTableDecorator">
    <display:column property="name" bundle="report" title="report.prompt.name" sortable="name" style="sortable" decorator="table"/>
    <display:column property="description" bundle="report" title="report.prompt.description" sortable="description" style="sortable"/>
    <display:column property="creation_date" bundle="report" title="report.prompt.creation_date" sortable="creation_date" style="sortable" decorator="table"/>
    <display:column property="last_edit_date" bundle="report" title="report.prompt.last_edit_date" sortable="last_edit_date" style="sortable" decorator="table"/>
  </display:table>
</div>
