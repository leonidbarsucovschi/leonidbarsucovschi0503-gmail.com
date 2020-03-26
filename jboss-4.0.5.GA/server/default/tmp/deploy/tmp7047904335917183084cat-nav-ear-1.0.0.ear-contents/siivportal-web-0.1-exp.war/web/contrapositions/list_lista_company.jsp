<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>

<div>
  <display:table list="<%=Constants.TBL_COMPANY_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="contrapositions/company.do" decorator="ro.uti.apmc.sys.util.CompanyTableDecorator">
	<display:column property="idno" bundle="company" title="company.prompt.idno" sortable="idno" style="sortable"/>
	<display:column property="name" bundle="company" title="company.prompt.name" sortable="name" style="sortable"/>
	<display:column property="address" bundle="company" title="company.prompt.address" sortable="address" style="sortable"/>
	<display:column property="noPrint" bundle="company" width="80" keyprefix="company" decorator="table" pkName="id"/>
  </display:table>
</div>
