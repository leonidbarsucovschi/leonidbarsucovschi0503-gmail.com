<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<script>
    var checkedButtons = "|";

</script>
<form name="multipleActions" method="get" action="portal/mesajsite.do">
    <input type="hidden" name="method">
    <input type="hidden" name="checkedString">
</form>
<div class="table">
  <table width="100%" cellspacing="0" cellpadding="0" border="0">
    <tr class="page-title-header">
      <td width="71%" class="page-title-header" align="left">
          <!-- Titlul ferestrei de listare. -->
                <bean:message bundle="mesajsite" key="mesaj_site.title.list" />
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td valign="middle" nowrap="true" align="right">
        <input type="image" onClick="setCheckedString();document.multipleActions.method.value='showMultipleDelete';document.multipleActions.submit()" name="del_btn" src="images/sterge.gif" onMouseOut="this.src='images/sterge.gif'" onMouseOver="this.src='images/sterge.gif'" border="0"   title='<bean:message  bundle="mesajsite" key="mesaj_site.button.delete"/>' />
        <input type="image" onClick="setCheckedString();document.multipleActions.method.value='showMultipleArchive';document.multipleActions.submit()" name="pub_btn" src="images/arhiveaza.gif" onMouseOut="this.src='images/arhiveaza.gif'" onMouseOver="this.src='images/arhiveaza.gif'" border="0"   title='<bean:message  bundle="mesajsite" key="mesaj_site.button.archive"/>' />
        <input type="image" onClick="setCheckedString();document.multipleActions.method.value='showMultipleForward';document.multipleActions.submit()" name="del_btn" src="images/trimite.gif" onMouseOut="this.src='images/trimite.gif'" onMouseOver="this.src='images/trimite.gif'" border="0"   title='<bean:message  bundle="mesajsite" key="mesaj_site.button.forward"/>' />
        <input type="image" onClick="setCheckedString();document.multipleActions.method.value='showMultipleReply';document.multipleActions.submit()" name="pub_btn" src="images/raspunde.gif" onMouseOut="this.src='images/raspunde.gif'" onMouseOver="this.src='images/raspunde.gif'" border="0"   title='<bean:message  bundle="mesajsite" key="mesaj_site.button.reply"/>' />
        <input type="image" src="images/search.gif"  onClick="javascript:showLayer('search')" onMouseOut="this.src='images/search.gif'" onMouseOver="this.src='images/search_over.gif'" class="arrow" border="0" title='<bean:message  bundle="app" key="message.button.tooltip.cauta"/>' />
        <input type="image" src="images/refresh.gif" onClick="javascript:refresh();" name="reload_btn" border="0" title='<bean:message  bundle="app" key="message.button.tooltip.refresh"/>'/>
      </td>
    </tr>
  </table>
  <table width="100%">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td colspan="2"  class="msg_error" align="center"><html:errors/></td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- Start Sectiune de SEARCH. -->
    <tr>
      <td colspan="2">
        <jsp:include page="search_mesajsite.jsp" flush="true" />
      </td>
    </tr>
    <!-- END Sectiune de SEARCH. -->
    <logic:messagesPresent message="true">
      <tr>
        <td colspan="2" class="msg_success" align="center">
          <html:messages id="mesaje" bundle="mesajsite" message="true">
            <bean:write name="mesaje" filter="false" ignore="true" />
          </html:messages>
        </td>
      </tr>
    </logic:messagesPresent>
  </table>
  <jsp:include page="list_lista_mesajsite.jsp" flush="true" />
</div>
<form name="actionForm" method="post" action="portal/mesajsite.do">
  <input type="hidden" name="method" />
  <input type="hidden" name="page" />
  <input type="hidden" name="prefix" value="/" />
  <input type="hidden" name="id_mesaj_site" />
</form>
