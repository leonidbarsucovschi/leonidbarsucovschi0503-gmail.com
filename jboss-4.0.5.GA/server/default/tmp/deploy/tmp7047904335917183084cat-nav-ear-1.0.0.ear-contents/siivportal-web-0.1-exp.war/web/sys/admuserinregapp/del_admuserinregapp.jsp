<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr>
  <td width="100%" valign="top" class="bottom" align="left">
<!-- Sectiune de Titlu pagina. -->
<!-- Titlul ferestrei pentru stergere. -->
<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.title.delete"/>
<!-- END Sectiune de Titlu pagina. -->
</td>
<td valign="top" class="bottom" align="right">
<img border="0" onMouseOver="swapImage('closeEditFrame','images/close_on.gif');" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuserinregapp" key="adm_user_inreg_app.label.closeWindow"/>'  name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
</td>
</tr></table>
<!-- Sectiune de Afisare Erori. -->
<table width="100%" border="0" cellpadding="1" align="center" class="lightrow" cellspacing="1"><logic:messagesPresent><tr>
  <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center"><html:errors/></td>
</tr></logic:messagesPresent>
<!-- END Sectiune de Afisare Erori. -->
<!-- START Sectiune de FORM. -->

<!-- Cimpul 'descriere' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.prompt.descriere"/>:
                </td><td class="text"><bean:write  property="descriere" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'fk_limba_stiri' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.fk_limba_stiri"/>:
                </td><td class="text"><bean:write  property="fk_limba_stiri" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'fk_limba' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.fk_limba"/>:
                </td><td class="text"><bean:write  property="fk_limba" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'fk_statut_firma' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.fk_statut_firma"/>:
                </td><td class="text"><bean:write  property="fk_statut_firma" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'fk_oras' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.fk_oras"/>:
                </td><td class="text"><bean:write  property="fk_oras" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'nume_user' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.nume_user"/>:
                </td><td class="text"><bean:write  property="nume_user" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'prenume_user' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.prenume_user"/>:
                </td><td class="text"><bean:write  property="prenume_user" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'email_user' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.email_user"/>:
                </td><td class="text"><bean:write  property="email_user" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'bi' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.bi"/>:
                </td><td class="text"><bean:write  property="bi" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'stiri' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.stiri"/>:
                </td><td class="text"><bean:write  property="stiri" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'sig_port' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.sig_port"/>:
                </td><td class="text"><bean:write  property="sig_port" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'prot_med' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.prot_med"/>:
                </td><td class="text"><bean:write  property="prot_med" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'user_login' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.user_login"/>:
                </td><td class="text"><bean:write  property="user_login" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'user_password' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.user_password"/>:
                </td><td class="text"><bean:write  property="user_password" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'cd' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.cd"/>:
                </td><td class="text"><bean:write  property="cd" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'data_cerere' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.data_cerere"/>:
                </td><td class="text"><bean:write  property="data_cerereString" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>
<!-- Cimpul 'stare' field. -->
<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.stare"/>:
                </td><td class="text"><bean:write  property="stare" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr>

<tr>
  <td width="40%" valign="top" class="textbold" align="right"><bean:message bundle="admuserinregapp" key="adm_user_inreg.prompt.site_web"/>:
                </td><td class="text"><bean:write  property="site_web" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>
</td></tr><html:form action="/admuserinregapp.do"  >
 <input type="hidden" name="values.id_user_inreg_app" value="<bean:write property="id_user_inreg_app" name="<%=Constants.ADM_USER_INREG_APP_KEY%>"/>">
<!-- START Sectiune de BUTOANE. -->
<!-- buton modificare. -->
<tr>
  <td colspan="2" class="button-row" align="center"><html:submit styleClass="button"><bean:message bundle="admuserinregapp" key="adm_user_inreg_app.button.delete"/></html:submit><html:hidden property="method"  value="delete"/></td>
</tr>
<!-- END Sectiune de BUTOANE. -->
</html:form>
</table >
</div><!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="sys/admuserinregapp.do"><html:hidden property="method"  value="list"/></form><script>
    function closeWindow(){
        document.closeForm.submit();
    }
</script>
