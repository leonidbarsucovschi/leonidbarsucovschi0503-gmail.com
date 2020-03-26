<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm" method="post" action="audit/audit.do">
    <html:hidden property="method" value="list"/>
</form>
<script>
    function closeWindow() {
        document.closeForm.submit();
    }
</script>

<div class="table">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr>
        <td width="100%" valign="top" class="bottom" align="left">&nbsp;
            <!-- Titlul ferestrei pentru modificare. -->
            <logic:empty name="<%=Constants.TBL_AUDIT_KEY%>" property="values.primaryKey" scope="request">
                <bean:message bundle="audit" key="audit.title.add"/>
            </logic:empty>
            <!-- Titlul ferestrei pentru adaugare. -->
            <logic:notEmpty name="<%=Constants.TBL_AUDIT_KEY%>" property="values.primaryKey" scope="request">
                <bean:message bundle="audit" key="audit.title.save"/>
            </logic:notEmpty>
            <!-- END Sectiune de Titlu pagina. -->
        </td>
        <td class="bottom" align="right">
            <img border="0" style="cursor:pointer" onClick="closeWindow();"
                 title='<bean:message bundle="audit" key="audit.label.closeWindow"/>' src="images/close_off.gif"/>
        </td>
    </tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="1" class="bottom"><logic:messagesPresent><tr>

    <td valign="top" colspan="2" class="errormsg" align="center">
        <ul>
            <html:messages id="error">
                <li><bean:write name="error"/></li>
            </html:messages>
        </ul>
    </td>

</tr>
</logic:messagesPresent>
<!-- START Sectiune de FORM. -->

<html:form action="/audit.do" onsubmit="return validateForm_AuditForm(this);">
<html:hidden property="values.id_audit"/><!-- Cimpul 'id_scenariu' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.id_scenariu"/><font
            color="#336600">*</font> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.id_scenariu" size="30"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.id_scenariu"/>"/>
    </td>
</tr><!-- Cimpul 'pk_entitate' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.pk_entitate"/><font
            color="#336600">*</font> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.pk_entitate" size="22"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.pk_entitate"/>"/>
    </td>
</tr><!-- Cimpul 'fk_user' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.fk_user"/><font
            color="#336600">*</font> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.fk_user" size="22"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.fk_user"/>"/>
    </td>
</tr><!-- Cimpul 'ip' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.ip"/><font
            color="#336600">*</font> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.ip" size="30"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.ip"/>"/>
    </td>
</tr><!-- Cimpul 'cod_operatie' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.cod_operatie"/><font
            color="#336600">*</font> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.cod_operatie" size="22"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.cod_operatie"/>"/>
    </td>
</tr><!-- Cimpul 'data_operatie' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.data_operatie"/><font
            color="#336600">*</font> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" styleId="data_operatieString"
                   property="values.data_operatieString"/><input align="absmiddle" type="image" src="images/cal.gif"
                                                                 id="triggerdata_operatieString"/><script
            type="text/javascript">
        Calendar.setup(
        {
            inputField  : "data_operatieString",// ID of the input field
            ifFormat    : "%d.%m.%Y",    // the date format
            button      : "triggerdata_operatieString"// ID of the button
        }
                );
    </script><font size="-1">[ZZ.LL.AAAA]</font><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
                                                     title="<bean:message bundle="audit" key="audit.label.tooltip.data_operatie"/>"/>
    </td>
</tr><!-- Cimpul 'xml_description' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.xml_description"/>
        <font color="#336600">*</font> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.xml_description" size="30"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.xml_description"/>"/>
    </td>
</tr><!-- Cimpul 'atribut1' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.atribut1"/> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.atribut1" size="30"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.atribut1"/>"/>
    </td>
</tr><!-- Cimpul 'atribut2' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.atribut2"/> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.atribut2" size="30"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.atribut2"/>"/>
    </td>
</tr><!-- Cimpul 'atribut3' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.atribut3"/> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.atribut3" size="30"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.atribut3"/>"/>
    </td>
</tr><!-- Cimpul 'atribut4' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.atribut4"/> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.atribut4" size="30"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.atribut4"/>"/>
    </td>
</tr><!-- Cimpul 'atribut5' field. -->
<tr>
    <td valign="top" class="textbold" align="right"><bean:message bundle="audit" key="audit.prompt.atribut5"/> :
    </td>
    <td class="text" align="left">


        <html:text errorStyleClass="errorfield" styleClass="inputtext" property="values.atribut5" size="30"/><img
            src="images/quest.gif" width="15" height="15" style="cursor:pointer;"
            title="<bean:message bundle="audit" key="audit.label.tooltip.atribut5"/>"/>
    </td>
</tr>
<!-- START Sectiune de BUTOANE. -->
<logic:empty name="<%=Constants.TBL_AUDIT_KEY%>" property="values.primaryKey" scope="request"><!-- Buton adugare. -->
    <tr>
        <td colspan="2" class="button-row" align="center"><html:submit styleClass="button"><bean:message bundle="audit"
                                                                                                         key="audit.button.add"/>
        </html:submit><html:hidden property="method" value="add"/></td>
    </tr>
</logic:empty>
<logic:notEmpty name="<%=Constants.TBL_AUDIT_KEY%>" property="values.primaryKey" scope="request"><!-- buton modificare.
    -->
    <tr>
        <td colspan="2" class="button-row" align="center"><html:submit styleClass="button"><bean:message bundle="audit"
                                                                                                         key="audit.button.save"/>
        </html:submit><html:hidden property="method" value="update"/></td>
    </tr>
</logic:notEmpty>
<!-- END Sectiune de BUTOANE. -->
</html:form>
<!-- END Sectiune de FORM. -->
</table>
</div>
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_AuditForm" dynamicJavascript="true" staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
