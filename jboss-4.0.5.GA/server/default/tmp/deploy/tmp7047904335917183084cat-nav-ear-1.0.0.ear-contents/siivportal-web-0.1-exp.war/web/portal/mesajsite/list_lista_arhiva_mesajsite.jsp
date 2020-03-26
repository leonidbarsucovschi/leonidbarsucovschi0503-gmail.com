<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%--<script>
    var checkedButtons = "|";

</script>
<form name="multipleActions" method="get" action="portal/mesajsite.do">
  <center>

    <input type="hidden" name="method">
    <input type="hidden" name="checkedString">
    <input type="submit" class="btn-generic"
       onclick="setCheckedString();document.multipleActions.method.value='showMultipleDeleteArh'"
        value="<bean:message bundle="mesajsite" key="mesaj_site.button.delete" />">
  </center>
</form>--%>
<div>
  <display:table list="<%= Constants.TBL_MESAJ_SITE_KEY_LIST %>" crt="yes" bundle="app" style="report" pagesize="50" method="listArchive" requestURI="portal/mesajsite.do" decorator="ro.uti.waf.taglib.table.DefaultTableDecorator">
    <display:column property="userIcon" bundle="mesajsite" keyprefix="mesaj_site" title="mesaj_site.prompt.tip_utilizator" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
    <display:column property="checkedMsg" bundle="mesajsite" title="mesaj_site.prompt.selected" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator" />
    <display:column property="operationIcon" bundle="mesajsite" title="mesaj_site.prompt.tip_operatie" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
    <display:column property="titlu_mesaj" bundle="mesajsite" title="mesaj_site.prompt.titlu_mesaj" sortable="titlu_mesaj" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
    <display:column property="data_introducere" bundle="mesajsite" title="mesaj_site.prompt.data_introducere" sortable="data_introducere" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
    <display:column property="data_arhivare" bundle="mesajsite" title="mesaj_site.prompt.data_arhivare" sortable="data_arhivare" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
    <display:column property="nume_prenume" bundle="mesajsite" title="mesaj_site.prompt.nume_prenume" sortable="nume" style="sortable" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator"/>
    <display:column property="allButtonsArchiveList"   bundle="mesajsite"  width="30" keyprefix="mesaj_site" decorator="ro.uti.apmc.portal.components.util.MesajSiteDecorator" pkName="id_mesaj_site"/>
</display:table>
</div>
<script>
    function addChecked(id) {
        index = checkedButtons.indexOf(id);
        buttonsString = checkedButtons;
        if (index == -1) {
            checkedButtons += id + "|";
        }
        else {
            checkedButtons = buttonsString.substring(0,index)+buttonsString.substring(index+id.toString().length+1,buttonsString.length);
        }

    }
    function setCheckedString() {
        document.multipleActions.checkedString.value = checkedButtons;
    }
    function deleteItems(){
        var mes = confirm('Mesajele selectate vor fi sterse definitiv din baza de date.');
        if (mes) {
            setCheckedString();
            document.multipleActions.method.value='multipleDeleteArh';
        } else {
            document.multipleActions.method.value='listArchive';
        }
    }
</script>