<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants,
                 ro.uti.waf.web.action.JPortalActionContext" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="selectionComponent" prefix="selection" %>
<script src="selectionComponent/script/selectioncomponent.js" ></script>
<script src="selectionComponent/script/hashtable.js" ></script>
<%--<div id=ToolTip style="position:absolute;top:0;left:0;background:#FFFFFF;border-color:#65d0e7;border-style:solid;border-width:1px 1px 1px 1px;visibility:hidden;" ></div>--%>
<script>
  function closeWindow() {
    window.location="/siiv/login.do;jsessionid=<%=request.getSession().getId()%>?method=index";
    //document.closeForm.submit();
  }
</script>
<div class="table">
  <table width="100%" border="0" cellpadding="2" cellspacing="0">
    <tr class="page-title-header">
      <td width="100%" valign="top" align="left">
        <!-- Titlul ferestrei pentru modificare. -->
        <bean:message bundle="mesajsite" key="mesaj_site.title.add" />
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right"><img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' src="<bean:message bundle="mesajsite" key="mesaj_site.button.closeWindow.path"/>" /></td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="0" cellspacing="1" >
    <logic:messagesPresent message="true">
      <tr>
        <td colspan="2" class="note" align="center">
          <html:messages id="mesaje" bundle="mesajsite" message="true">
            <bean:write name="mesaje" ignore="true" />
          </html:messages>
        </td>
      </tr>
    </logic:messagesPresent>
    <!-- START Sectiune de FORM. -->
    <html:form action="/mesajsite.do" onsubmit="return validateForm_MesajSiteForm(this);" enctype="multipart/form-data">
      <html:hidden property="values.id_mesaj_site" />

      <!-- Cimpul 'nume' field. -->
      <tr>
        <td valign="top"  align="right" width="50%" class="label">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.nume" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td align="left">
                <html:text errorStyleClass="msg_error" styleClass="field_text" property="values.nume" size="30" />
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.nume"/>" /></td>
      </tr>

      <!-- Cimpul 'prenume' field. -->
      <tr>
        <td valign="top" align="right" width="50%" class="label">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.prenume" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td align="left">
                <html:text errorStyleClass="msg_error" styleClass="field_text" property="values.prenume" size="30" />
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.prenume"/>" /></td>
      </tr>

      <!-- Cimpul 'telefon' field. -->
      <tr>
        <td valign="top" align="right" width="50%" class="label">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.telefon" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td align="left">
                <html:text errorStyleClass="msg_error" styleClass="field_text" property="values.telefon" size="30" />
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.telefon"/>" /></td>
      </tr>

      <!-- Cimpul 'fax' field. -->
      <tr>
        <td valign="top" align="right" width="50%" class="label">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.fax" />
          :
        </td>
        <td align="left">
                <html:text errorStyleClass="msg_error" styleClass="field_text" property="values.fax" size="30" />
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.fax"/>" /></td>
      </tr>

      <!-- Cimpul 'email_utilizator' field. -->
      <tr>
        <td valign="top" align="right" width="50%" class="label">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.email_utilizator" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td align="left">
                <html:text errorStyleClass="msg_error" styleClass="field_text" property="values.email_utilizator" size="30" />
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.email_utilizator"/>" /></td>
      </tr>

      <!-- Cimpul 'titlu_mesaj' field. -->
      <tr>
        <td valign="top" align="right" width="50%" class="label">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.titlu_mesaj" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td align="left">
                <html:text errorStyleClass="msg_error" styleClass="field_text" property="values.titlu_mesaj" size="30" />
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.titlu_mesaj"/>" /></td>
      </tr>

      <!-- Cimpul 'continut_mesaj' field. -->
      <tr>
        <td valign="top" align="right" width="50%" class="label">
          <bean:message bundle="mesajsite" key="mesaj_site.prompt.continut_mesaj" />
          <font color="#336600">
            *
          </font>
          :
        </td>
        <td align="left">
                <html:textarea cols="50" rows="10" errorStyleClass="msg_error" styleClass="textarea" property="values.continut_mesaj" />
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.continut_mesaj"/>" /></td>
      </tr>
      
      <%--      <!-- Cimpul 'cont_fisier' field. -->--%>
      <%--      <tr>--%>
      <%--        <td valign="top" class="text-label" align="right">--%>
      <%--          <bean:message bundle="mesajsite" key="mesaj_site.prompt.cont_fisier" />--%>
      <%--          :--%>
      <%--        </td>--%>
      <%--        <td class="text" align="left">--%>
      <%--          <html:file errorStyleClass="msg_error" styleClass="field_text" property="mesajFile" /><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.label.tooltip.cont_fisier"/>" /></td>--%>
      <%--      </tr>--%>
      <tr>
        <td colspan="2" height="10"></td>
      </tr>
      <!-- START Sectiune de BUTOANE. -->
      <tr>
        <td class="button-row" colspan="2" align="center">
          <html:submit styleClass="btn-generic">
            <bean:message bundle="mesajsite" key="mesaj_site.button.save" />
          </html:submit>
          <html:hidden property="method" value="add" />
          &nbsp;
          <html:reset styleClass="btn-generic">
            <bean:message bundle="mesajsite" key="mesaj_site.button.back" />
          </html:reset>
        </td>
      </tr>
      <!-- END Sectiune de BUTOANE. -->
    </html:form>
    <!-- END Sectiune de FORM. -->
  </table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_MesajSiteForm" dynamicJavascript="true" staticJavascript="false" />
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
