<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>

<display:table list="<%=Constants.ADM_PARAMETRII_CONFIG_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admparametriiconfig.do" decorator="ro.uti.apmc.portal.components.util.AdmParametriiTableDecorator">
    <display:column property="denumire" bundle="admparametriiconfig" title="adm_parametrii_config.prompt.denumire" sortable="denumire" style="sortable"/>
    <display:column property="val_implicita" bundle="admparametriiconfig" title="adm_parametrii_config.prompt.val_implicita" sortable="val_implicita" style="sortable"/>
    <display:column property="val_curenta" bundle="admparametriiconfig" title="adm_parametrii_config.prompt.val_curenta" sortable="val_curenta" style="sortable"/>
    <display:column property="noPrint"   bundle="admparametriiconfig"  width="80" keyprefix="adm_parametrii_config" decorator="table" pkName="id_parametrii_config"/>
  </display:table>
</div>

