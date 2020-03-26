<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants,ro.uti.waf.common.Commands"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr>
    <td width="100%" valign="top" class="bottom" align="left">
<!-- Titlul ferestrei pentru stergere. -->
<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.title.view"/>
<!-- END Sectiune de Titlu pagina. -->
</td>
<td class="bottom" align="right">
<img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.label.closeWindow"/>'  src="images/close_off.gif" />
</td>
  </tr></table>
<table width="100%" border="0" cellpadding="1" align="center" class="lightrow" cellspacing="1"><!-- Sectiune de Afisare Erori. -->
<tr>
    <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center"><html:errors/></td>
  </tr>
<!-- END Sectiune de Afisare Erori. -->

<!-- Cimpul 'descriere' field. -->
<!-- Cimpul 'descriere' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.prompt.descriere"/>:
                </td><td class="text"><bean:write  property="descriere" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'fk_limba_stiri' field. -->
<!-- Cimpul 'fk_limba_stiri' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.fk_limba_stiri"/>:
                </td><td class="text"><bean:write  property="fk_limba_stiri" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'fk_limba' field. -->
<!-- Cimpul 'fk_limba' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.fk_limba"/>:
                </td><td class="text"><bean:write  property="fk_limba" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'fk_statut_firma' field. -->
<!-- Cimpul 'fk_statut_firma' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.fk_statut_firma"/>:
                </td><td class="text"><bean:write  property="fk_statut_firma" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'fk_oras' field. -->
<!-- Cimpul 'fk_oras' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.fk_oras"/>:
                </td><td class="text"><bean:write  property="fk_oras" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'nume_user' field. -->
<!-- Cimpul 'nume_user' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.nume_user"/>:
                </td><td class="text"><bean:write  property="nume_user" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'prenume_user' field. -->
<!-- Cimpul 'prenume_user' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.prenume_user"/>:
                </td><td class="text"><bean:write  property="prenume_user" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'email_user' field. -->
<!-- Cimpul 'email_user' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.email_user"/>:
                </td><td class="text"><bean:write  property="email_user" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'bi' field. -->
<!-- Cimpul 'bi' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.bi"/>:
                </td><td class="text"><bean:write  property="bi" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'stiri' field. -->
<!-- Cimpul 'stiri' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.stiri"/>:
                </td><td class="text"><bean:write  property="stiri" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'sig_port' field. -->
<!-- Cimpul 'sig_port' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.sig_port"/>:
                </td><td class="text"><bean:write  property="sig_port" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'prot_med' field. -->
<!-- Cimpul 'prot_med' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.prot_med"/>:
                </td><td class="text"><bean:write  property="prot_med" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'user_login' field. -->
<!-- Cimpul 'user_login' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.user_login"/>:
                </td><td class="text"><bean:write  property="user_login" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'user_password' field. -->
<!-- Cimpul 'user_password' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.user_password"/>:
                </td><td class="text"><bean:write  property="user_password" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'cd' field. -->
<!-- Cimpul 'cd' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.cd"/>:
                </td><td class="text"><bean:write  property="cd" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'data_cerere' field. -->
<!-- Cimpul 'data_cerere' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.data_cerere"/>:
                </td><td class="text"><bean:write  property="data_cerereString" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'stare' field. -->
<!-- Cimpul 'stare' field. -->
<tr>
    <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.stare"/>:
                </td><td class="text"><bean:write  property="stare" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
</table>
</div><form name="closeForm" method="post" action="sys/admuserinregapp.do"><html:hidden property="method"  value="list"/></form><script>
    function closeWindow(){
        document.closeForm.submit();
    }
</script>
