<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.ADM_MENU_ENTRY_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admmenuentry.do" decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
    <display:column property="menu_key" bundle="admmenuentry" title="adm_menu_entry.prompt.menu_key" sortable="menu_key" style="sortable"/>
    <display:column property="menu_url" bundle="admmenuentry" title="adm_menu_entry.prompt.menu_url" sortable="menu_url" style="sortable"/>
    <display:column property="link_menu_name" bundle="admmenuentry" title="adm_menu_entry.prompt.link_menu_name" sortable="link_menu_name" style="sortable"/>
    <display:column property="menu_type" bundle="admmenuentry" title="adm_menu_entry.prompt.menu_type" sortable="menu_type" style="sortable"/>
    <display:column property="menu_state" bundle="admmenuentry" title="adm_menu_entry.prompt.menu_state" sortable="menu_state" style="sortable"/>
    <display:column property="menu_order" bundle="admmenuentry" title="adm_menu_entry.prompt.menu_order" sortable="menu_order" style="sortable"/>
    <display:column property="menu_description" bundle="admmenuentry" title="adm_menu_entry.prompt.menu_description" sortable="menu_description" style="sortable"/>
    <display:column property="menu_icon" bundle="admmenuentry" title="adm_menu_entry.prompt.menu_icon" sortable="menu_icon" style="sortable"/>
    <display:column property="menu_iconFile" bundle="admmenuentry" title="adm_menu_entry.prompt.menu_icon" sortable="" style="sortable"/>
    <display:column property="fk_menu_entry"  bundle="admmenuentry" title="adm_menu_entry.prompt.fk_menu_entry" sortable="fk_menu_entry" style="sortable"/>
    <display:column property="menu_key"  bundle="admmenuentry" title="adm_menu_entry.prompt.menu_key" sortable="menu_key" style="sortable"/>
    <display:column property="menu_url"  bundle="admmenuentry" title="adm_menu_entry.prompt.menu_url" sortable="menu_url" style="sortable"/>
    <display:column property="link_menu_name"  bundle="admmenuentry" title="adm_menu_entry.prompt.link_menu_name" sortable="link_menu_name" style="sortable"/>
    <display:column property="menu_type"  bundle="admmenuentry" title="adm_menu_entry.prompt.menu_type" sortable="menu_type" style="sortable"/>
    <display:column property="menu_state"  bundle="admmenuentry" title="adm_menu_entry.prompt.menu_state" sortable="menu_state" style="sortable"/>
    <display:column property="menu_order"  bundle="admmenuentry" title="adm_menu_entry.prompt.menu_order" sortable="menu_order" style="sortable"/>
    <display:column property="menu_description"  bundle="admmenuentry" title="adm_menu_entry.prompt.menu_description" sortable="menu_description" style="sortable"/>
    <display:column property="menu_icon"  bundle="admmenuentry" title="adm_menu_entry.prompt.menu_icon" sortable="menu_icon" style="sortable"/>
    <display:column property="menu_iconFile" bundle="admmenuentry" title="adm_menu_entry.prompt.menu_icon" sortable="" style="sortable"/>
    <display:column property="noPrint"   bundle="admmenuentry"  width="80" keyprefix="adm_menu_entry" decorator="default" pkName="id_menu_entry"/>
  </display:table>
</div>
