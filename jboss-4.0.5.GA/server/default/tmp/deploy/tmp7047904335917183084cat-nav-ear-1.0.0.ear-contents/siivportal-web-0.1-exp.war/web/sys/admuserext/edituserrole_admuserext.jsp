<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Sep 9, 2005
  Time: 12:26:07 PM
  To change this template use File | Settings | File Templates.
--%>
 <%@ page import="java.util.*,ro.uti.settings.util.Constants,ro.uti.apmc.sys.util.AdmUserInregConstants" %>
       <%@ page contentType="text/html; charset=iso-8859-2" %>
       <%@ page language="java" %>
       <%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
       <%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
       <%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
       <form name="closeForm" method="post" action="sys/admuserext.do">
       </form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
       <div class="table">
         <table width="100%" border="0" cellpadding="0" cellspacing="1">
           <tr class="page-title-header">
             <td width="100%" valign="top" align="left">
               &nbsp;
               <!-- Titlul ferestrei pentru modificare. -->
                 <bean:message bundle="admuserinreg" key="adm_user_inreg.title.save"/>
               <!-- END Sectiune de Titlu pagina. -->
             </td>
             <td class="bottom" align="right">
               <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="admuserext" key="adm_user_ext.label.closeWindow"/>' src="images/close_off.gif" />
             </td>
           </tr>
         </table>
          <table  width="100%" border="0" cellpadding="0" cellspacing="1">
           <logic:messagesPresent>
             <tr>
               <td valign="top" colspan="2" class="msg_error " align="center">
                 <ul>
                   <html:messages id="error">
                     <li>
                       <bean:write name="error"/>
                     </li>
                   </html:messages>
                 </ul>
               </td>
             </tr>
           </logic:messagesPresent>
         </table>
<table width="100%" border="0" cellpadding="0" cellspacing="1" class="report">
           <!-- START Sectiune de FORM. -->
           <html:form action="/admuserext.do" onsubmit="return validateForm_AdmUserExtForm(this);">
             <!--Campul id_user_ext-->
             <html:hidden property="values.id_user_ext"/>
             <!-- Cimpul 'fk_user' field. -->
             <html:hidden property="values.fk_user"/>
             <!-- Cimpul 'fk_firma' field. -->
             <html:hidden property="values.fk_firma"/>
            <!-- Cimpul 'fk_limba' field. -->
             <html:hidden property="values.fk_limba"/>
             <!-- Cimpul 'nume' field. -->
             <html:hidden property="values.nume"/>
             <!-- Cimpul 'prenume' field. -->
             <html:hidden property="values.prenume"/>
  <!-- Cimpul 'nume' field. -->
    <tr>
     <td valign="top" class="label" align="right" width="50%" >
       <bean:message bundle="admuserext" key="adm_user_ext.prompt.nume"/>:
    </td>
    <td class="text" align="left" width="50%" >
     <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.nume"/>
    </td>
  </tr>
   <!-- Cimpul 'prenume' field. -->
  <tr>
    <td valign="top" class="label" align="right">
      <bean:message bundle="admuserext" key="adm_user_ext.prompt.prenume"/> :
    </td>
    <td class="text" align="left">
      <bean:write name="<%=Constants.ADM_USER_EXT_KEY%>" property="values.prenume"/>
    </td>
  </tr>
       <!-- START Sectiune de BUTOANE. -->
       <!-- buton modificare. -->
       <tr>
         <td colspan="2" class="button-row" align="center">
           <html:submit styleClass="button">
             <bean:message bundle="admuserext" key="adm_user_ext.button.save"/>
           </html:submit>
           <html:hidden property="method"  value="updateEditUserRole"/>
         </td>
       </tr>
       <!-- END Sectiune de BUTOANE. -->
       </html:form>
       <!-- END Sectiune de FORM. -->
       </table>
       </div>
       <!-- Validare cimpuri forma. -->
       <html:javascript formName="form_AdmUserExtForm" dynamicJavascript="true" staticJavascript="false"/>
       <script language="Javascript1.1" src="staticJavascript.jsp"></script>
