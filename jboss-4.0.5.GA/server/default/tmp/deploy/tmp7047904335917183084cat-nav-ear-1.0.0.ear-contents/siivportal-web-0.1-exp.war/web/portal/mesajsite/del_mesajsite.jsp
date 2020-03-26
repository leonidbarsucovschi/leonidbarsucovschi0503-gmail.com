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
      <td WIDTH="100%" valign="top" align="left">
        <!-- Sectiune de Titlu pagina. -->
        <!-- Titlul ferestrei pentru stergere. -->
        <bean:message bundle="mesajsite" key="mesaj_site.title.delete" />
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="top" class="bottom" align="right">
        <img border="0"   style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <!-- Sectiune de Afisare Erori. -->
  <table width="100%" border="0" cellpadding="1" align="center" class="news-table-content" cellspacing="1">
    <logic:messagesPresent>
      <tr>
        <td valign="middle" nowrap="nowrap" colspan="2" class="errormsg" align="center">
          <html:errors />
        </td>
      </tr>
    </logic:messagesPresent>
    <!-- END Sectiune de Afisare Erori. -->

    <!-- START Sectiune de FORM. -->

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

      <!-- START Sectiune de BUTOANE. -->

      <!-- buton stergere. -->
      <tr>
        <td colspan="2" class="button-row" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="mesajsite" key="mesaj_site.button.delete" />
          </html:submit>
          <logic:notPresent parameter="archive">
            <html:hidden property="method" value="delete" />
          </logic:notPresent>
          <logic:present parameter="archive" >
            <html:hidden property="method" value="deleteArh" />
          </logic:present>

        </td>
      </tr>

      <!-- END Sectiune de BUTOANE. -->
    </html:form>
  </table>
</div>
<!-- END Sectiune de FORM. -->
<form name="closeForm" method="post" action="portal/mesajsite.do">
  <logic:notPresent parameter="archive">
    <html:hidden property="method" value="list" />
  </logic:notPresent>
  <logic:present parameter="archive" >
    <html:hidden property="method" value="listArchive" />
  </logic:present>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
