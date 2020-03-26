<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>

    <table width="100%">
        <tr>
      <td colspan="6" class="msg_error" align="center" ><html:errors/></td>
    </tr>
<tr>
<logic:messagesPresent message="true">
      <td colspan="6" class="msg_success" align="center" >
<html:messages id="mesaje" bundle="jobimport" message="true">
<bean:write name="mesaje" ignore="true"/>
</html:messages>
</td></logic:messagesPresent>
</tr>
    </table>


 <display:table list="<%=Constants.JOB_IMPORT_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/jobimport.do" decorator="ro.uti.waf.components.databasejobs.util.JobImportTableDecorator">
  <display:column property="id_job_import" bundle="jobimport" title="title.id_job_import" sortable="id_job_import" style="sortable"/>
  <display:column property="job_description" bundle="jobimport" title="title.job_description" sortable="job_description" style="sortable"/>
  <display:column property="periodicity" bundle="jobimport" title="title.periodicity" sortable="periodicity" style="sortable" decorator="table"/>
  <display:column property="first_date" bundle="jobimport" title="title.first_date" sortable="first_date" style="sortable"/>
  <display:column property="last_date" bundle="jobimport" title="title.last_date" sortable="last_date" style="sortable"/>
  <display:column property="next_date" bundle="jobimport" title="title.next_date" sortable="next_date" style="sortable"/>
  <display:column property="noPrint"   bundle="jobimport"  width="120" keyprefix="job_import" decorator="table" pkName="id_job_import"/>
 </display:table>
