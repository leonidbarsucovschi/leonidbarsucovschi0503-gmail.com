<%@ page import="ro.uti.settings.util.Constants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!-- Start Sectiune de SEARCH. -->
<logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>">
    <div id="search" class="show">
</logic:equal>

<logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>">
    <div id="search" class="noshow">
</logic:notEqual>

<html:form action="/mesajsearch.do" styleId="searchForm" onsubmit="checkData();return validateForm_MesajSearchForm(this);">
    <p width="100%" class="button-row" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="mesajsite" key="mesaj_site.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
    </p>

<table width="100%" border="0" class="news-table-content">

    <!-- Cimpul 'interval_introducere' field. -->
    <tr>
        <td   width="40%" align="right">
            <bean:message bundle="mesajsite" key="mesaj_site.prompt.interval_introducere"/>:
        </td>
        <td class="text" align="left" width="1%" nowrap>
            <html:text styleClass="text-small" styleId="data_start" property="data_start" readonly="false"/>
            <input align="absmiddle" type="image" src="images/cal.gif" id="triggerdata_start" />
            <script type="text/javascript">
                Calendar.setup(
                    {
                        inputField  : "data_start",// ID of the input field
                        ifFormat    : "%d.%m.%Y",    // the date format
                        button      : "triggerdata_start"// ID of the button
                    }
                );
            </script>
        </td>
        <td class="text" valign="middle">&nbsp; - &nbsp;</td>
        <td class="text" align="left">
            <html:text styleClass="text-small" styleId="data_end" property="data_end" readonly="false"/>
            <input align="absmiddle" type="image" src="images/cal.gif" id="triggerdata_end" />
            <script type="text/javascript">

                Calendar.setup(
                    {
                        inputField  : "data_end",// ID of the input field
                        ifFormat    : "%d.%m.%Y",    // the date format
                        button      : "triggerdata_end"// ID of the button

                    }
                );
            </script>
            <font size="-1">[ZZ.LL.AAAA]</font>
        </td>
    </tr>

    <!-- Cimpul 'nume_prenume' field. -->
    <tr>
        <td   align="right">
            <bean:message bundle="mesajsite" key="mesaj_site.prompt.nume_prenume"/>:
        </td>
        <td class="text" align="left" colspan="2">
            <html:text styleClass="text-small" property="nume_prenume" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.searchlabel.tooltip.nume"/>" />
        </td>
    </tr>

    <!-- Cimpul 'titlu_mesaj' field. -->
    <tr>
        <td   align="right">
            <bean:message bundle="mesajsite" key="mesaj_site.prompt.titlu_mesaj"/>:
        </td>
        <td class="text" align="left" colspan="2">
            <html:text styleClass="text-small" property="values.titlu_mesaj" size="30"/>
            <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="mesajsite" key="mesaj_site.searchlabel.tooltip.titlu_mesaj"/>" />
        </td>
    </tr>

    <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>"/>

    <tr>
        <td colspan="4" class="button-row" align="center">
            <input type="hidden" name="method" value="search"/>
            <input type="hidden" name="search" value="1"/>

            <html:submit styleClass="btn-generic">
                <bean:message  bundle="mesajsite" key="mesaj_site.button.search"/>
            </html:submit>
        </td>
    </tr>

    </html:form>
    </table>
    <!-- END Sectiune de SEARCH. -->
<!-- Validare cimpuri forma. -->
<html:javascript formName="form_MesajSearchForm"
                 dynamicJavascript="true"
                 staticJavascript="false"/>
<script language="Javascript1.1" src="staticJavascript.jsp"></script>
<script type="text/javascript">
       function checkData() {
                   var start_date = document.getElementById("data_start").value;
                   var end_date = document.getElementById("data_end").value;

                   if(start_date!="" || start_date!=""){


                        var ddS=start_date.substring(0,2);
                        var mmS=start_date.substring(3,5);
                        var yyyyS=start_date.substring(6,10);
                        var ddE=end_date.substring(0,2);
                        var mmE=end_date.substring(3,5);
                        var yyyyE=end_date.substring(6,10);

                        var st_date=new Date;
                        var e_date=new Date;

                        st_date.setDate(parseInt(ddS));
                        st_date.setMonth(parseInt(mmS)-1); // January = 0
                        st_date.setFullYear(parseInt(yyyyS));


                        e_date.setDate(parseInt(ddE));
                        e_date.setMonth(parseInt(mmE)-1); // January = 0
                        e_date.setFullYear(parseInt(yyyyE));

                        if(st_date>e_date){
                            alert('Data de inceput a intervalului trebuie sa fie anterioara datei de sfarsit.')
                            return false;
                        }
                    }
                }
</script>