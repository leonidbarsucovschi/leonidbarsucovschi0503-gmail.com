<!--
                          *
                          *
                          * @version
                          * @author
                          */
                    -->
<%@ page import="ro.uti.settings.util.Constants,
                 ro.uti.apmc.sys.util.AdmUserInregConstants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!-- #########################3 -->
<!--                            -->
<!-- Start Sectiune de SEARCH. -->
<!-- #############################-->
<logic:equal name="viewObject" property="search" value="<%=String.valueOf(1)%>">
  <div id="search" class="show">
</logic:equal>
<logic:notEqual name="viewObject" property="search" value="<%=String.valueOf(1)%>">
<div id="search" class="noshow">
</logic:notEqual>
<html:form action="/admuserinreg.do" styleId="searchForm" >
 <p width="100%" class="button-row" align="right">
  <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="admuserinreg" key="adm_user_inreg.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
 </p>
<table width="100%" border="0">
<!-- Cimpul 'stare' field. -->
  <tr>
    <td valign="top" class="label" align="right">
       <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.stare"/>:
    </td>
    <td class="text" align="left">
    <html:select property="values.stare" styleClass="selectbox">
         <option value="-1"><bean:message key="select.prompt" bundle="app" /></option>
         <option value="<%= AdmUserInregConstants.STARE_NEVIZUALIZAT %>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.stare_nevizualizat"/></option>
         <option value="<%= AdmUserInregConstants.STARE_VIZUALIZAT %>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.stare_vizualizat"/></option>
         <%--<option value="<%= AdmUserInregConstants.STARE_ACCEPTAT %>"><bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.stare_acceptat"/></option>--%>
    </html:select>
    </td>
  </tr>
<!-- Cimpul 'nume_user' field. -->
<tr>
  <td valign="top" class="label" align="right">
      <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.nume_user"/>:
  </td>
  <td class="text" align="left">
   <html:text styleClass="field_input" property="values.nume_user" size="30"/>
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.searchlabel.tooltip.nume_user"/>" />
  </td>
  </tr>
<!-- Cimpul 'prenume_user' field. -->
  <tr>
    <td valign="top" class="label" align="right">
      <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.prenume_user"/>:
    </td>
    <td class="text" align="left">
     <html:text styleClass="field_input" property="values.prenume_user" size="30"/>
     <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.searchlabel.tooltip.prenume_user"/>" />
    </td>
  </tr>
<!-- Cimpul 'data_cerere' field. -->
  <tr>
    <td valign="top" class="label" align="right">
     <bean:message bundle="admuserinreg" key="adm_user_inreg.prompt.data_cerere"/>:
    </td>
    <td class="text" align="left">
     <html:text styleClass="field_input" styleId="data_cerereString" property="values.data_cerereString"/>
     <input align="absmiddle" type="image" src="images/cal.gif" id="triggerdata_cerereString"/>
     <script type="text/javascript">
     Calendar.setup(
      {
       inputField  : "data_cerereString",// ID of the input field
       ifFormat    : "%d.%m.%Y",    // the date format
       button      : "triggerdata_cerereString"// ID of the button
      }
     );
     </script><bean:message bundle="stire" key="stire.label.date_format"/></font>
     <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="admuserinreg" key="adm_user_inreg.searchlabel.tooltip.data_cerere"/>" />
</td>
  </tr>
  <input type="hidden" name="displayMode" value="<bean:write property="displayMode" name="viewObject"/>"/><tr>
  <td colspan="2" class="button-row" align="center"><input type="hidden" name="method" value="search"/><input type="hidden" name="search" value="1"/><html:submit styleClass="button"><bean:message bundle="admuserinreg" key="adm_user_inreg.button.search"/></html:submit></td>
  </tr></html:form></table>
<!-- #############################-->
<!-- END Sectiune de SEARCH. -->
