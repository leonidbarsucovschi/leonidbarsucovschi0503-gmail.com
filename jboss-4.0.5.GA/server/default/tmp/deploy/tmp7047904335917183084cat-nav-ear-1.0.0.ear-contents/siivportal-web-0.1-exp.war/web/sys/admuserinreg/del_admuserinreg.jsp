<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page import="ro.uti.settings.util.ThreadSafeSDFs" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr>
      <td width="100%" valign="top" align="left" class="page-subtitle">
        <!-- Sectiune de Titlu pagina. -->
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="admuserinreg" key="adm_user_inreg.title.delete"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="top" class="bottom" align="right">
        <img border="0"   style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <!-- Sectiune de Afisare Erori. -->
  <table width="100%">
   <logic:messagesPresent>
      <tr>
        <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error " align="center">
          <html:errors/>
        </td>
      </tr>
   </logic:messagesPresent>
  </table>
   <!-- END Sectiune de Afisare Erori. -->
  <table width="100%" border="0" cellpadding="1" align="center" cellspacing="1">
    <tr class="even" >
       <td class="label" colspan="2">
         <b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_utilizator"/></b>
       </td>
    </tr>
    <!-- Cimpul 'nume_user' field. -->
    <tr>
      <td valign="top" class="label" align="right" width="50%" >
        <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.nume_user"/> :
      </td>
      <td class="field_text" align="left" width="50%" >
        <bean:write  property="nume_user" name="<%=Constants.ADM_USER_INREG_KEY%>"/>
      </td>
    </tr>

    <!-- Cimpul 'prenume_user' field. -->
    <tr>
      <td  valign="top" class="label" align="right">
        <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prenume_user"/> :
      </td>
      <td class="field_text" align="left">
        <bean:write  property="prenume_user" name="<%=Constants.ADM_USER_INREG_KEY%>"/>
      </td>
    </tr>

    <!-- Cimpul 'email_user' field. -->
    <tr>
      <td  valign="top" class="label" align="right">
        <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.email_user"/> :
      </td>
      <td class="field_text" align="left">
        <bean:write  property="email_user" name="<%=Constants.ADM_USER_INREG_KEY%>"/>
      </td>
    </tr>
     <!-- Cimpul 'cd' field. -->
    <tr>
      <td valign="top" class="label" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.mod_autentificare"/> :
      </td>
      <td class="field_text" align="left">
         <logic:equal value="1" property="cd" name="<%=Constants.ADM_USER_INREG_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.cd"/></logic:equal>
         <logic:equal value="0" property="cd" name="<%=Constants.ADM_USER_INREG_KEY%>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.up"/></logic:equal>
     </td>
    </tr>
    <!-- Cimpul 'user_login' field. -->
    <tr>
      <td  valign="top" class="label" align="right">
        <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.user_login"/> :
      </td>
      <td class="field_text" align="left">
        <bean:write  property="user_login" name="<%=Constants.ADM_USER_INREG_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'data_cerere' field. -->
    <tr>
      <td valign="top" class="label" align="right">
        <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.data_cerere"/> :
      </td>
      <td class="field_text" align="left">
        <logic:notEmpty property="data_cerere" name="<%=Constants.ADM_USER_INREG_KEY%>" >
           <bean:define id="cerereDate" property="data_cerere" name="<%=Constants.ADM_USER_INREG_KEY%>" type="java.util.Date" />
           <%=ThreadSafeSDFs.getSdf().format(cerereDate)%>
        </logic:notEmpty>
      </td>
    </tr>

 <tr>
  <td valign="top">
   <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr class="even" >
     <td class="label" colspan="2" ><b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.aplicatii"/></b></td>
    </tr>
    <!--campul is_nom-->
    <tr>
     <td valign="top" class="label" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.is_nom"/> :
       <logic:notEmpty property="is_nom" name="<%=Constants.ADM_USER_INREG_KEY%>" >
          <logic:equal value="1" property="is_nom" name="<%=Constants.ADM_USER_INREG_KEY%>" >
            <input type="checkbox" checked="true" disabled="true"/>
          </logic:equal>
       </logic:notEmpty>
       <logic:empty property="is_nom" name="<%=Constants.ADM_USER_INREG_KEY%>" >
          <input type="checkbox" disabled="true"/>
       </logic:empty>
     </td>
     <td class="field_text" align="left"  >
       <bean:write  property="obs_nom" name="<%=Constants.ADM_USER_INREG_KEY%>"/>
     </td>
    </tr>
   </table>
  </td>
  <td valign="top">
    <table width="100%" border="0" cellpadding="0" cellspacing="1">
      <tr class="even" >
        <td class="label" colspan="2" ><b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.informatii"/></b></td>
      </tr>
      <!-- Cimpul 'bi' buletin informativ field. -->
      <tr>
       <td valign="top" class="label" align="right" width="50%" >
         <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.bi"/> :
       </td>
       <td class="text" align="left" valign="top" width="50%" >
        <logic:equal value="1" property="bi" name="<%=Constants.ADM_USER_INREG_KEY%>" >
          <input type="checkbox" checked="true" disabled="true"/>
       </logic:equal>
       <logic:equal value="0" property="bi" name="<%=Constants.ADM_USER_INREG_KEY%>" >
          <input type="checkbox" disabled="true"/>
       </logic:equal>
       </td>
      </tr>
      <tr class="even" >
       <td class="label" colspan="2" ><b><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.anunturi"/></b></td>
      </tr>
      <!-- Cimpul 'stiri' field. -->
      <tr>
        <td valign="top" class="label" align="right">
         <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.stiri"/> :
        </td>
        <td class="text" align="left" valign="top">
        <logic:equal value="1" property="stiri" name="<%=Constants.ADM_USER_INREG_KEY%>" >
          <input type="checkbox" checked="true" disabled="true"/>
       </logic:equal>
       <logic:equal value="0" property="stiri" name="<%=Constants.ADM_USER_INREG_KEY%>" >
          <input type="checkbox" disabled="true"/>
       </logic:equal>
       </td>
      </tr>
      <!-- Cimpul 'sig_port' field. -->
      <tr>
       <td valign="top" class="label" align="right">
        <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.sig_port"/> :
       </td>
       <td class="text" align="left" valign="top">
        <logic:equal value="1" property="sig_port" name="<%=Constants.ADM_USER_INREG_KEY%>" >
          <input type="checkbox" checked="true" disabled="true"/>
       </logic:equal>
       <logic:equal value="0" property="sig_port" name="<%=Constants.ADM_USER_INREG_KEY%>" >
          <input type="checkbox" disabled="true"/>
       </logic:equal>
       </td>
      </tr>
      <!-- Cimpul 'prot_med' field. -->
      <tr>
        <td valign="top" class="label" align="right">
          <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prot_med"/> :
        </td>
        <td class="text" align="left" valign="top">
        <logic:equal value="1" property="prot_med" name="<%=Constants.ADM_USER_INREG_KEY%>" >
          <input type="checkbox" checked="true" disabled="true"/>
       </logic:equal>
       <logic:equal value="0" property="prot_med" name="<%=Constants.ADM_USER_INREG_KEY%>" >
          <input type="checkbox" disabled="true"/>
       </logic:equal>
       </td>
      </tr>
    </table>
  </td>
  </tr>
 <html:form action="/admuserinreg.do"  >
      <input type="hidden" name="values.id_user_inreg" value="<bean:write property="id_user_inreg" name="<%=Constants.ADM_USER_INREG_KEY%>"/>">
      <!-- START Sectiune de BUTOANE. -->
      <!-- buton delete. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="button">
            <bean:message bundle="admuserinreg" key="adm_user_inreg.button.delete"/>
          </html:submit>
          <html:hidden property="method"  value="delete"/>
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="sys/admuserinreg.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
