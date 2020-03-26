<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.ADM_USER_EXT_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admuserext.do" decorator="ro.uti.apmc.sys.util.AdmUserExtTableDecorator">
    <display:column property="nume" bundle="admuserext" title="adm_user_ext.prompt.nume" sortable="lower(nume)" style="sortable"/>
    <display:column property="prenume" bundle="admuserext" title="adm_user_ext.prompt.prenume" sortable="lower(prenume)" style="sortable"/>
    <display:column property="user_login" bundle="admuserext" title="adm_user_ext.prompt.user_login" sortable="lower(user_login)" style="sortable"/>
    <display:column property="email" bundle="admuserext" title="adm_user_ext.prompt.email" sortable="lower(email)" style="sortable"/>
    <display:column property="logged" bundle="admuserext" title="adm_user_ext.prompt.logged" sortable="logged" style="sortable" decorator="table"/>

    <display:column property="noPrint"   bundle="admuserext"  width="80" keyprefix="adm_user_ext" decorator="table" pkName="id_user_ext"/>
  </display:table>
</div>
