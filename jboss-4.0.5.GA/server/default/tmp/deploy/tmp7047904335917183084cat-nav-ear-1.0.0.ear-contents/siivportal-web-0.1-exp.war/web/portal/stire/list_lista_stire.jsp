<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.TBL_STIRE_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="portal/stire.do" decorator="ro.uti.apmc.portal.components.util.NewsTableDecorator">
    <display:column property="titlu" bundle="stire" title="stire.prompt.link_titlu" sortable="lower(titlu_stire)" style="sortable"/>
    <display:column property="typeNew" bundle="stire" title="stire.prompt.tip_stire" keyprefix="stire" sortable="tip_stire" decorator="table" style="sortable"/>
    <display:column property="cod_limba" bundle="stire" title="stire.prompt.cod_limba"/>
    <display:column property="noPrint"   bundle="stire"  width="100" keyprefix="stire" decorator="table" pkName="id_stire"/>
  </display:table>
</div>
