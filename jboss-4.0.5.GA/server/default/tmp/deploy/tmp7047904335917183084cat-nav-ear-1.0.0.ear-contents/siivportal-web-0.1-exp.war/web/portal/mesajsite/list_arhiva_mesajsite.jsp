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
                <bean:message bundle="mesajsite" key="mesaj_site.title.listarchive" />
                <!-- END Sectiune de Titlu pagina. -->
            </td>
            <td valign="middle" nowrap="true" align="right">
               <input type="image" onClick="setCheckedString();document.multipleActions.method.value='showMultipleDeleteArh';document.multipleActions.submit()" name="del_btn" src="images/sterge.gif" onMouseOut="this.src='images/sterge.gif'" onMouseOver="this.src='images/sterge.gif'" border="0"   title='<bean:message  bundle="mesajsite" key="mesaj_site.button.delete"/>' />
                <!--<img src="images/search.gif"  onClick="javascript:showLayer('search')" class="hand" border="0">-->
                <input type="image" src="images/search.gif"  onClick="javascript:showLayer('search')" onMouseOut="this.src='images/search.gif'" onMouseOver="this.src='images/search_over.gif'" class="arrow" border="0" title='<bean:message  bundle="app" key="message.button.tooltip.cauta"/>' />
                <input type="image" onClick="refreshArchive();" name="reload_btn" src="images/refresh.gif"
                      title="<bean:message  bundle="app" key="message.button.tooltip.refresh"/>" />
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
                <jsp:include page="search_arhiva_mesajsite.jsp" flush="true"/>
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
        <%--<logic:messagesPresent message="true">
            <tr>
                <td colspan="2" class="note" align="center">
                    <html:messages id="mesaje" bundle="app" message="true">
                        <bean:write name="mesaje" ignore="true"/>
                    </html:messages>
                </td>
            </tr>
        </logic:messagesPresent>--%>
    </table>

    <jsp:include page="list_lista_arhiva_mesajsite.jsp" flush="true"/>
    </div>

    <form name="actionForm" method="post" action="portal/mesajsite.do">
        <input type="hidden" name="method"/>
        <input type="hidden" name="page"/>
        <input type="hidden" name="prefix" value="/"/>
        <input type="hidden" name="id_mesaj_site"/>
    </form>
<script>
    function refreshArchive(){
        document.navigationForm.method.value="refreshArchive";
        document.navigationForm.orderBy.value =  "";
        document.navigationForm.orderType.value = "";
	    document.navigationForm.crtPage.value = 1;
        document.navigationForm.submit();
    }

</script>