<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
  <display:table list="<%=Constants.ADM_USER_SESSION_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admusersession.do" decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
    <display:column property="fk_http_session" bundle="admusersession" title="adm_user_session.prompt.fk_http_session" sortable="fk_http_session" style="sortable"/>
    <display:column property="ip_address" bundle="admusersession" title="adm_user_session.prompt.ip_address" sortable="ip_address" style="sortable"/>
    <display:column property="login_date" bundle="admusersession" title="adm_user_session.prompt.login_date" sortable="login_date" style="sortable"/>
    <display:column property="login_date" bundle="admusersession" title="adm_user_session.prompt.login_date" sortable="login_date" style="sortable"/>
    <display:column property="logout_date" bundle="admusersession" title="adm_user_session.prompt.logout_date" sortable="logout_date" style="sortable"/>
    <display:column property="logout_date" bundle="admusersession" title="adm_user_session.prompt.logout_date" sortable="logout_date" style="sortable"/>
    <display:column property="user_login"  bundle="admuser" title="adm_user.prompt.user_login" sortable="user_login" style="sortable"/>
    <display:column property="user_passwd"  bundle="admuser" title="adm_user.prompt.user_passwd" sortable="user_passwd" style="sortable"/>
    <display:column property="logged"  bundle="admuser" title="adm_user.prompt.logged" sortable="logged" style="sortable"/>
    <display:column property="account_status"  bundle="admuser" title="adm_user.prompt.account_status" sortable="account_status" style="sortable"/>
    <display:column property="account_creation_date"  bundle="admuser" title="adm_user.prompt.account_creation_date" sortable="account_creation_date" style="sortable"/>
    <display:column property="account_creation_date" bundle="admusersession" title="adm_user_session.prompt.account_creation_date" sortable="account_creation_date" style="sortable"/>
    <display:column property="account_deletion_date"  bundle="admuser" title="adm_user.prompt.account_deletion_date" sortable="account_deletion_date" style="sortable"/>
    <display:column property="account_deletion_date" bundle="admusersession" title="adm_user_session.prompt.account_deletion_date" sortable="account_deletion_date" style="sortable"/>
    <display:column property="serial_number"  bundle="admuser" title="adm_user.prompt.serial_number" sortable="serial_number" style="sortable"/>
    <display:column property="issuer_name"  bundle="admuser" title="adm_user.prompt.issuer_name" sortable="issuer_name" style="sortable"/>
    <display:column property="digital_certificate"  bundle="admuser" title="adm_user.prompt.digital_certificate" sortable="digital_certificate" style="sortable"/>
    <display:column property="digital_certificateFile" bundle="admusersession" title="adm_user_session.prompt.digital_certificate" sortable="" style="sortable"/>
    <display:column property="user_type"  bundle="admuser" title="adm_user.prompt.user_type" sortable="user_type" style="sortable"/>
    <display:column property="email"  bundle="admuser" title="adm_user.prompt.email" sortable="email" style="sortable"/>
    <display:column property="noPrint"   bundle="admusersession"  width="80" keyprefix="adm_user_session" decorator="default" pkName="id_user_session"/>
  </display:table>
</div>
