<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.waf.web.action.JPortalActionContext,
                 ro.uti.apmc.sys.util.AdmUserInregConstants" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<form name="closeForm" method="post" action="sys/admuserinreg.do">
    <html:hidden property="method" value="showMessage"/>
</form>

<script>
    var popup;
    function closeWindow() {
        document.closeForm.submit();
    }
    function send(method) {
        var el = document.getElementById('fdata');
        var m = document.getElementById('m');
        if (method == "prev") {
            m.value = "prev";
            el.submit();
        }
        if (method == "add") {
            m.value = "add";
            el.submit();
        }
    }
    function initChb(id_boo, id) {
        var chb = document.getElementById(id_boo);
        var field = document.getElementById(id);
        if (chb.checked) {
            field.value = "1";
        } else {
            field.value = "0";
        }
    }
    function showDescriereApp(id_app) {
        popup = window.open("/siiv/sys/admuserinreg.do?method=showDescriereApp&id_app=" + id_app, "wlist", "height=200,width=400,status=no,toolbar=no,menubar=no,location=no,scrollbars=yes");
    }
    function close() {
        if (popup) popup.close();
    }
</script>

<div class="table">

<table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr class="page-subtitle">
        <td width="100%" valign="top" align="left">&nbsp;
            <!-- Titlu pas 3. -->
            <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.date_optiuni_p"/>
            <!-- END Sectiune de Titlu pagina. -->
        </td>
        <td class="bottom" align="right">
            <img border="0" style="cursor:pointer" onClick="closeWindow();"
                 title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>'
                 src="<bean:message bundle="mesajsite" key="mesaj_site.button.closeWindow.path"/>"/>
        </td>
    </tr>
</table>

<table width="100%" border="0" cellpadding="0" cellspacing="1">
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

<table width="100%" border="0" cellpadding="0" cellspacing="1">
<!-- START Sectiune de FORM. -->
<html:form action="/admuserinreg.do" styleId="fdata">
<!--Campurile hidden -->
<!-- Cimpul 'method' field. -->
<html:hidden property="method" styleId="m"/>
<!--Camp nr pas-->
<html:hidden property="pas" value="3"/>
<!--celelalte campuri din forma care nu sunt aici completate-->
<html:hidden property="values.id_user_inreg"/>
<html:hidden property="values.nume_user"/>
<html:hidden property="values.prenume_user"/>
<html:hidden property="values.email_user"/>
<html:hidden property="values.cd"/>
<html:hidden property="values.user_login"/>
<html:hidden property="values.user_password"/>
<html:hidden property="c_user_password"/>
<tr>
<td valign="top">
    <table width="100%" border="0" cellpadding="0" cellspacing="1">
        <tr>
            <td class="label-title" colspan="2">
                <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.aplicatii"/>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td class="label" align="left">
                <bean:message bundle="admuserinreg" key="adm_user_inreg.label.comentarii"/>
                &nbsp;&nbsp;
                    <%--<img src="images/quest.gif" width="15" align="top"  height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.tooltip.comentarii"/>" />--%>
            </td>
        </tr>
        <!--campul is_nom-->
        <html:hidden property="values.is_nom" styleId="is_nom"/>
        <tr>
            <td valign="top" class="label" align="right">
                <a style="cursor:pointer;" onClick=" showDescriereApp(<%=AdmUserInregConstants.ID_NOM%>);">
                    <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.is_nom"/>
                </a> :
                <input type="checkbox" id="is_nom_boo" onClick=" initChb('is_nom_boo','is_nom');"/>
                <script type="text/javascript">
                    if (document.getElementById("is_nom").value == "1") {
                        document.getElementById("is_nom_boo").checked = true;
                    }
                </script>
            </td>
            <td>
                <html:textarea property="values.obs_nom" styleClass="textarea_small_width"/>
            </td>
        </tr>
    </table>
</td>
<td valign="top">
    <table width="100%" border="0" cellpadding="0" cellspacing="1">
        <tr>
            <td class="label-title" colspan="2">
                <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.informatii"/>
                :
            </td>
        </tr>
        <!-- Cimpul 'bi' buletin informativ field. -->
        <html:hidden property="values.bi" styleId="bi"/>
        <tr>
            <td valign="top" class="label" align="right">
                <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.bi"/>
                :
            </td>
            <td class="text" align="left" valign="top">
                <input type="checkbox" id="bi_boo" onClick=" initChb('bi_boo','bi');"/>
                <script type="text/javascript">
                    if (document.getElementById("bi").value == "1") {
                        document.getElementById("bi_boo").checked = true;
                    }
                </script>
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                     title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.bi"/>"/>
            </td>
        </tr>
        <tr>
            <td class="label-title" colspan="2">
                <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.anunturi"/>
                :
            </td>
        </tr>
        <!-- Cimpul 'stiri' field. -->
        <html:hidden property="values.stiri" styleId="stiri"/>
        <tr>
            <td valign="top" class="label" align="right">
                <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.stiri"/>
                :
            </td>
            <td class="text" align="left" valign="top">
                <input type="checkbox" id="stiri_boo" onClick=" initChb('stiri_boo','stiri');"/>
                <script type="text/javascript">
                    if (document.getElementById("stiri").value == "1") {
                        document.getElementById("stiri_boo").checked = true;
                    }
                </script>
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                     title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.stiri"/>"/>
            </td>
        </tr>
        <!-- Cimpul 'sig_port' field. -->
        <html:hidden property="values.sig_port" styleId="sig_port"/>
        <tr>
            <td valign="top" class="label" align="right">
                <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.sig_port"/>
                :
            </td>
            <td class="text" align="left" valign="top">
                <input type="checkbox" id="sig_port_boo" onClick=" initChb('sig_port_boo','sig_port');"/>
                <script type="text/javascript">
                    if (document.getElementById("sig_port").value == "1") {
                        document.getElementById("sig_port_boo").checked = true;
                    }
                </script>
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                     title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.sig_port"/>"/>
            </td>
        </tr>
        <!-- Cimpul 'prot_med' field. -->
        <html:hidden property="values.prot_med" styleId="prot_med"/>
        <tr>
            <td valign="top" class="label" align="right">
                <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prot_med"/>
                :
            </td>
            <td class="text" align="left" valign="top">
                <input type="checkbox" id="prot_med_boo" onClick=" initChb('prot_med_boo','prot_med');"/>
                <script type="text/javascript">
                    if (document.getElementById("prot_med").value == "1") {
                        document.getElementById("prot_med_boo").checked = true;
                    }
                </script>
                <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                     title="<bean:message bundle="admuserinreg" key="adm_user_inreg.label.tooltip.prot_med"/>"/>
            </td>
        </tr>
    </table>
</td>
</tr>
<tr>
    <td colspan="2" align="center">
        <img src="Captcha.jpg">
    </td>
</tr>
<tr>
    <td class="label">
        <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.captcha"/>
        *:
    </td>
    <td class="text" align="left">
        <input type="text" class="field_input" name="captcha"/>
    </td>
</tr>
<!-- START Sectiune de BUTOANE. -->
<tr>
    <td colspan="2" class="button-row" align="center">
        <input type="button" class="btn-generic"
               value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.prev"/>' onClick=' send("prev");'/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" class="btn-generic"
               value='<bean:message bundle="admuserinreg" key="adm_user_inreg.button.add"/>' onClick=' send("add");'/>
    </td>
</tr>
<!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</div>
