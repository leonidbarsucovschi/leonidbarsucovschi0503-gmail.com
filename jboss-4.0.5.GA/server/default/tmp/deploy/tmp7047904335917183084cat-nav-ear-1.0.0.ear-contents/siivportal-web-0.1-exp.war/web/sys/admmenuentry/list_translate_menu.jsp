<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Aug 8, 2005
  Time: 4:26:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%= Constants.ADM_MENU_ENTRY_KEY_LIST %>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admmenuentry.do" decorator="ro.uti.apmc.sys.util.AdmMenuTranslateTableDecorator">
    <display:column property="traducere" bundle="admmenuentry" title="adm_menu_entry.prompt.link_menu_name"/>
    <display:column property="den_limba" bundle="admmenuentry" title="adm_menu_entry.prompt.cod_limba"/>
    <display:column property="noPrint"   bundle="admmenuentry"  width="80" keyprefix="adm_menu_entry" decorator="table" pkName="id_menu_entry"/>
  </display:table>
</div>