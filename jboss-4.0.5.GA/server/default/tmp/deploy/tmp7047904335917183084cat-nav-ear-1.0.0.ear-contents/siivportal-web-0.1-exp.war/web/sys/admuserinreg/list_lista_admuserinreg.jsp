<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.ADM_USER_INREG_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admuserinreg.do" decorator="ro.uti.apmc.sys.util.AdmUserInregTableDecorator">
    <display:column property="nume_user" bundle="admuserinreg" title="adm_user_inreg.prompt.nume_user" sortable="nume_user" style="sortable"/>
    <display:column property="prenume_user" bundle="admuserinreg" title="adm_user_inreg.prompt.prenume_user" sortable="prenume_user" style="sortable"/>
    <display:column property="data_cerere" bundle="admuserinreg" title="adm_user_inreg.prompt.data_cerere" sortable="data_cerere" style="sortable" decorator="table"/>
    <display:column property="noPrint"   bundle="admuserinreg"  width="80" keyprefix="adm_user_inreg" decorator="table" pkName="id_user_inreg"/>
  </display:table>
</div>
