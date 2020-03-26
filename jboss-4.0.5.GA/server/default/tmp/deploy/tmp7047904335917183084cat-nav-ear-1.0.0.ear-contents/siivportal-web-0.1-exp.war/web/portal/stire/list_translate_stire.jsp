<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page import="ro.uti.apmc.portal.components.util.StireConstants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=StireConstants.TRADUCERI_STIRE_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="portal/stire.do" singlepage="true" decorator="ro.uti.apmc.portal.components.util.NewsTranslateTableDecorator">
    <display:column property="titlu" bundle="stire" title="stire.prompt.link_titlu"/>
    <display:column property="den_limba" bundle="stire" title="stire.prompt.cod_limba"/>
    <display:column property="noPrint"   bundle="stire"  width="80" keyprefix="stire" decorator="table" pkName="id_stire"/>
  </display:table>
</div>