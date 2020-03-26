<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr class="page-title-header">
      <td width="100%" valign="top" class="bottom" align="left">
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="mesajsite" key="mesaj_site.title.view" />
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right"><img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' src="images/close_off.gif" /></td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="1" align="center" class="report" cellspacing="1">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center">
        <html:errors />
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- Cimpul 'nume' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.nume" />
        :
      </td>
      <td class="text">
        <bean:write property="nume" name="<%= Constants.TBL_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'prenume' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.prenume" />
        :
      </td>
      <td class="text">
        <bean:write property="prenume" name="<%= Constants.TBL_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'telefon' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.telefon" />
        :
      </td>
      <td class="text">
        <bean:write property="telefon" name="<%= Constants.TBL_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'fax' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.fax" />
        :
      </td>
      <td class="text">
        <bean:write property="fax" name="<%= Constants.TBL_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'email_utilizator' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.email_utilizator" />
        :
      </td>
      <td class="text">
        <bean:write property="email_utilizator" name="<%= Constants.TBL_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'titlu_mesaj' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.titlu_mesaj" />
        :
      </td>
      <td class="text">
        <bean:write property="titlu_mesaj" name="<%= Constants.TBL_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'continut_mesaj' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.continut_mesaj" />
        :
      </td>
      <td class="text">
        <bean:write property="continut_mesaj" name="<%= Constants.TBL_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'data_introducere' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.data_introducere" />
        :
      </td>
      <td class="text">
        <bean:write property="data_introducere" name="<%= Constants.TBL_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <html:form action="/mesajsite.do">
      <input type="hidden" name="values.id_mesaj_site" value="<bean:write property="id_mesaj_site" name="<%= Constants.TBL_MESAJ_SITE_KEY %>"/>">
<%--      <html:hidden property="method"/>--%>
      <!-- START Sectiune de BUTOANE. -->

      <logic:notPresent parameter="archive">
      <html:hidden property="method"/>
      <tr>
        <td class="button-row" align="center" colspan="2">

          <!-- buton reply. -->
          <html:submit styleClass="btn-generic" onclick="document.form_MesajSiteForm.method.value='showReply'" >
            <bean:message bundle="mesajsite" key="mesaj_site.button.reply" />
          </html:submit>


          <!-- buton forward. -->
          <html:submit styleClass="btn-generic" onclick="document.form_MesajSiteForm.method.value='showForward'">
            <bean:message bundle="mesajsite" key="mesaj_site.button.forward" />
          </html:submit>


          <!-- buton archive. -->
          <html:submit styleClass="btn-generic" onclick="document.form_MesajSiteForm.method.value='showArchive'">
            <bean:message bundle="mesajsite" key="mesaj_site.button.archive" />
          </html:submit>

          <!-- buton delete. -->
          <html:submit styleClass="btn-generic" onclick="document.form_MesajSiteForm.method.value='showDelete'">
            <bean:message bundle="mesajsite" key="mesaj_site.button.delete" />
          </html:submit>

          <!-- buton iesire. -->
         <%-- <html:button styleClass="btn-generic" property="exit" onclick="closeWindow()">
            <bean:message bundle="mesajsite" key="mesaj_site.button.exit" />
          </html:button>--%>

        </td>
      </tr>
       </logic:notPresent>
       <logic:present parameter="archive">
        <tr>
            <td class="button-row" align="center" colspan="2">
              <!-- buton delete. -->
              <html:submit styleClass="btn-generic">
                <bean:message bundle="mesajsite" key="mesaj_site.button.delete" />
              </html:submit>
              <html:hidden property="method" value="deleteArh" />
           </td>
       </tr>

      </logic:present>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
</div>
<form name="closeForm" method="post" action="portal/mesajsite.do">
    <logic:notPresent parameter="archive">
    <html:hidden property="method" value="list" />
  </logic:notPresent>
  <logic:present parameter="archive">
    <html:hidden property="method" value="listArchive" />
  </logic:present>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
