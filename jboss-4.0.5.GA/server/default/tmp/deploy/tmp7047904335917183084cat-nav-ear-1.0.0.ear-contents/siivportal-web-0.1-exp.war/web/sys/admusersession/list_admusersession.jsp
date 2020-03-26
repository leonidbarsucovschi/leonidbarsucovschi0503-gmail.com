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
  <table width="100%" cellspacing="0" cellpadding="0" border="0">
    <tr class="bottom">
      <td width="17%">
        &nbsp;
      </td>
      <td width="71%" class="page-title-header" align="left">
        <!-- Titlul ferestrei de listare. -->
        <b><bean:message bundle="admusersession" key="adm_user_session.title.list"/>
        </b><!-- END Sectiune de Titlu pagina. -->
      </td>
      <td>
        <html:form action="admusersession.do" styleId="addForm">
          <input type="hidden" name="method" value="showAdd" />
        </html:form>
      </td>
      <td valign="middle" nowrap="true" align="right">
        <a href="javascript:document.getElementById('addForm').submit()">
          <img border="0" src="images/add.gif"  title="<bean:message bundle="admusersession" key="adm_user_session.button.add"/>" />
        </a>
        <img src="images/search.gif"  onClick="javascript:showLayer('search')" class="arrow" border="0">
        <input type="image" onClick="javascript:refresh();" name="reload_btn" src="images/refresh.gif"  border="0" title='<bean:message  bundle="app" key="message.button.tooltip.refresh"/>' />
      </td>
    </tr>
  </table>
  <table width="100%">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td colspan="2">
        <html:errors/>
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- #########################3 -->
    <!-- Start Sectiune de SEARCH. -->
    <!-- #############################-->
    <tr>
      <td colspan="2">
<%
        try { 
%>
          <jsp:include page="search_admusersession.jsp" flush="true"/>
<%
        } catch (Exception e) {
          e.printStackTrace();
        }
%>
      </td>
    </tr>
    <!-- #############################-->
    <!-- END Sectiune de SEARCH. -->
    <logic:messagesPresent message="true">
      <tr>
        <td colspan="2" class="note" align="center">
          <html:messages id="mesaje" bundle="app" message="true">
            <bean:write name="mesaje" ignore="true"/>
          </html:messages>
        </td>
      </tr>
    </logic:messagesPresent>
  </table>
<%
  try { 
%>
    <jsp:include page="list_lista_admusersession.jsp" flush="true"/>
<%
  } catch (Exception e) {
    e.printStackTrace();
  }
%>
</div>
<form name="actionForm" method="post" action="sys/admusersession.do">
  <input type="hidden" name="method" />
  <input type="hidden" name="page" />
  <input type="hidden" name="prefix" value="/" />
  <input type="hidden" name="id_user_session" />
</form>
<script>
  function showPrint(name, id) {
    link = "<html:rewrite page="/admusersession.do"/>";
    popup = window.open(link + "?method=showPrint&" + name + "=" + id, "_blank", 
            "height=500,width=600,status=no,toolbar=no,menubar=no,location=yes,scrollbars=yes");
  }
</script>
