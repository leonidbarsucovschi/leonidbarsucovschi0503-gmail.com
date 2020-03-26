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
        <bean:message bundle="mesajsite" key="mesaj_site.title.viewarh" />
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
        <bean:write property="nume" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'prenume' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.prenume" />
        :
      </td>
      <td class="text">
        <bean:write property="prenume" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'telefon' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.telefon" />
        :
      </td>
      <td class="text">
        <bean:write property="telefon" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'fax' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.fax" />
        :
      </td>
      <td class="text">
        <bean:write property="fax" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'email_utilizator' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.email_utilizator" />
        :
      </td>
      <td class="text">
        <bean:write property="email_utilizator" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'titlu_mesaj' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.titlu_mesaj" />
        :
      </td>
      <td class="text">
        <bean:write property="titlu_mesaj" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'continut_mesaj' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.continut_mesaj" />
        :
      </td>
      <td class="text">
        <bean:write property="continut_mesaj" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <!-- Cimpul 'data_introducere' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.data_introducere" />
        :
      </td>
      <td class="text">
        <bean:write property="data_introducere" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
       <!-- Cimpul 'tip_operatie' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.tip_operatie" />
        :
      </td>
      <td class="text">
         <logic:equal value="<%=String.valueOf(0)%>" property="tip_operatie" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>">
                 Vizualizare
          </logic:equal>
          <logic:equal value="<%=String.valueOf(1)%>" property="tip_operatie" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>">
                   <bean:message bundle="mesajsite" key="mesaj_site.tip.reply" />
          </logic:equal>
          <logic:equal value="<%=String.valueOf(2)%>" property="tip_operatie" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>">
                  <bean:message bundle="mesajsite" key="mesaj_site.tip.forward" />
          </logic:equal>
          <logic:equal value="<%=String.valueOf(3)%>" property="tip_operatie" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>">
                 <bean:message bundle="mesajsite" key="mesaj_site.tip.archive" />
          </logic:equal>

      </td>
    </tr>

      <!-- Cimpul 'data_arhivare' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.data_arhivare" />
        :
      </td>
      <td class="text">
        <bean:write property="data_arhivare" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
        <!-- Cimpul 'lista adrese fw' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.lista_adrese" />
        :
      </td>
      <td class="text">
        <bean:write property="lista_adrese" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
          <!-- Cimpul 'mesaj operatie' field. -->
    <tr>
      <td width="40%" valign="top"  align="right">
        <bean:message bundle="mesajsite" key="mesaj_site.prompt.mesaj_operatie" />
        :
      </td>
      <td class="text">
        <bean:write property="mesaj_operatie" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>" />
      </td>
    </tr>
    <html:form action="/mesajsite.do">
      <input type="hidden" name="values.id_mesaj_site" value="<bean:write property="id_mesaj_site" name="<%= Constants.TBL_ARCHIVE_MESAJ_SITE_KEY %>"/>">
<%--      <html:hidden property="method"/>--%>
      <!-- START Sectiune de BUTOANE. -->


        <tr>
            <td class="button-row" align="center" colspan="2">
              <!-- buton delete. -->
              <html:submit styleClass="btn-generic">
                <bean:message bundle="mesajsite" key="mesaj_site.button.delete" />
              </html:submit>
              <html:hidden property="method" value="deleteArh" />
           </td>
       </tr>


      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
</div>
<form name="closeForm" method="post" action="portal/mesajsite.do">
    <html:hidden property="method" value="listArchive" />
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
