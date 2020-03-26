<%@ page import="ro.uti.settings.util.Constants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<div>
<display:table list="<%=Constants.ADM_USER_INREG_APP_KEY_LIST%>" crt="yes" bundle="app" style="report" pagesize="50" method="list" requestURI="sys/admuserinregapp.do" decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
<display:column property="descriere" bundle="admuserinregapp" title="adm_user_inreg_app.prompt.descriere" sortable="descriere" style="sortable"/>


<display:column property="fk_limba_stiri"  bundle="admuserinreg" title="adm_user_inreg.prompt.fk_limba_stiri" sortable="fk_limba_stiri" style="sortable"/>

<display:column property="fk_limba"  bundle="admuserinreg" title="adm_user_inreg.prompt.fk_limba" sortable="fk_limba" style="sortable"/>

<display:column property="fk_statut_firma"  bundle="admuserinreg" title="adm_user_inreg.prompt.fk_statut_firma" sortable="fk_statut_firma" style="sortable"/>

<display:column property="fk_oras"  bundle="admuserinreg" title="adm_user_inreg.prompt.fk_oras" sortable="fk_oras" style="sortable"/>

<display:column property="nume_user"  bundle="admuserinreg" title="adm_user_inreg.prompt.nume_user" sortable="nume_user" style="sortable"/>

<display:column property="prenume_user"  bundle="admuserinreg" title="adm_user_inreg.prompt.prenume_user" sortable="prenume_user" style="sortable"/>

<display:column property="email_user"  bundle="admuserinreg" title="adm_user_inreg.prompt.email_user" sortable="email_user" style="sortable"/>

<display:column property="bi"  bundle="admuserinreg" title="adm_user_inreg.prompt.bi" sortable="bi" style="sortable"/>

<display:column property="stiri"  bundle="admuserinreg" title="adm_user_inreg.prompt.stiri" sortable="stiri" style="sortable"/>

<display:column property="sig_port"  bundle="admuserinreg" title="adm_user_inreg.prompt.sig_port" sortable="sig_port" style="sortable"/>

<display:column property="prot_med"  bundle="admuserinreg" title="adm_user_inreg.prompt.prot_med" sortable="prot_med" style="sortable"/>

<display:column property="user_login"  bundle="admuserinreg" title="adm_user_inreg.prompt.user_login" sortable="user_login" style="sortable"/>

<display:column property="user_password"  bundle="admuserinreg" title="adm_user_inreg.prompt.user_password" sortable="user_password" style="sortable"/>

<display:column property="cd"  bundle="admuserinreg" title="adm_user_inreg.prompt.cd" sortable="cd" style="sortable"/>

<display:column property="data_cerere"  bundle="admuserinreg" title="adm_user_inreg.prompt.data_cerere" sortable="data_cerere" style="sortable"/>
<display:column property="data_cerere" bundle="admuserinregapp" title="adm_user_inreg_app.prompt.data_cerere" sortable="data_cerere" style="sortable"/>
<display:column property="stare"  bundle="admuserinreg" title="adm_user_inreg.prompt.stare" sortable="stare" style="sortable"/>

<display:column property="noPrint"   bundle="admuserinregapp"  width="80" keyprefix="adm_user_inreg_app" decorator="default" pkName="id_user_inreg_app"/></display:table></div>
