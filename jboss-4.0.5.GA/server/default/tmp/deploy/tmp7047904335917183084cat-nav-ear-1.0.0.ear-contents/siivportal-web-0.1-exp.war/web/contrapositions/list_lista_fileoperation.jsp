<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>

<div>
  <display:table list="<%=Constants.TBL_FILEOPERATION_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="contrapositions/fileoperation.do" decorator="ro.uti.apmc.sys.util.FileOperationTableDecorator">
    <display:column property="fo_file_name" bundle="fileoperation" title="fileoperation.prompt.fo_file_name" sortable="fo_file_name" style="sortable"/>
	<display:column property="fo_upload_date" bundle="fileoperation" title="fileoperation.prompt.fo_upload_date" sortable="fo_upload_date" style="sortable" decorator="table"/>
	<display:column property="jsp_country" bundle="fileoperation" title="fileoperation.prompt.fo_country" sortable="fo_country" style="sortable"/>
    <display:column property="fo_period_type" bundle="fileoperation" title="fileoperation.prompt.fo_period_type" sortable="fo_period_type" style="sortable" decorator="table"/>
	<display:column property="fo_type" bundle="fileoperation" title="fileoperation.prompt.fo_type" sortable="fo_type" style="sortable" decorator="table"/>
	<display:column property="fo_starting_date" bundle="fileoperation" title="fileoperation.prompt.fo_starting_date" sortable="fo_starting_date" style="sortable" decorator="table"/>
	<display:column property="fo_ending_date" bundle="fileoperation" title="fileoperation.prompt.fo_ending_date" sortable="fo_ending_date" style="sortable" decorator="table"/>
	<display:column property="noPrint" bundle="fileoperation" width="80" keyprefix="fileoperation" decorator="table" pkName="fo_id"/>
  </display:table>
</div>
