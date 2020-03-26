<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/tld/jportal/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.ADM_USER_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admuser.do" decorator="ro.uti.apmc.sys.util.UserListDecorator">
    <display:column property="user_login" bundle="admuser" title="adm_user.prompt.user_login" sortable="lower(user_login)" style="sortable"/>
    <%--display:column property="user_passwd" bundle="admuser" title="adm_user.prompt.user_passwd" sortable="user_passwd" style="sortable"/--%>
    <display:column property="logged" bundle="admuser" title="adm_user.prompt.logged" sortable="logged" style="sortable" decorator="table"/>
    <display:column property="accountStatus" bundle="admuser" title="adm_user.prompt.account_status" sortable="account_status" style="sortable" decorator="table" />
    <display:column property="creationDate" bundle="admuser" title="adm_user.prompt.account_creation_date" sortable="account_creation_date" style="sortable" decorator="table"/>
    <%--display:column property="deletionDate" bundle="admuser" title="adm_user.prompt.account_deletion_date" sortable="account_deletion_date" style="sortable" decorator="table"/--%>
    <display:column property="userType" bundle="admuser" title="adm_user.prompt.user_type" sortable="user_type" style="sortable" decorator="table"/>
    <display:column property="email" bundle="admuser" title="adm_user.prompt.email" sortable="lower(email)" style="sortable"/>
    <display:column property="noPrint" bundle="admuser"  width="80" keyprefix="adm_user" decorator="ro.uti.apmc.sys.util.UserListDecorator" pkName="id_user"/>
  </display:table>
</div>
