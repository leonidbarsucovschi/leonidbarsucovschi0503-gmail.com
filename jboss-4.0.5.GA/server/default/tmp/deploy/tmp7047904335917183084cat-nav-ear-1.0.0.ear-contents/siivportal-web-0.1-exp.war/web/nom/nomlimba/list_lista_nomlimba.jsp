<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.NOM_LIMBA_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="nom/nomlimba.do" decorator="ro.uti.apmc.portal.components.util.NomLimbaTableDecorator">
    <display:column property="den_limba" bundle="nomlimba" title="nom_limba.prompt.den_limba" sortable="lower(den_limba)" style="sortable"/>
    <display:column property="cod_limba" bundle="nomlimba" title="nom_limba.prompt.cod_limba" sortable="lower(cod_limba)" style="sortable"/>
    <display:column property="noPrint"   bundle="nomlimba"  width="80" keyprefix="nom_limba" decorator="table" pkName="id_limba"/>
  </display:table>
</div>
