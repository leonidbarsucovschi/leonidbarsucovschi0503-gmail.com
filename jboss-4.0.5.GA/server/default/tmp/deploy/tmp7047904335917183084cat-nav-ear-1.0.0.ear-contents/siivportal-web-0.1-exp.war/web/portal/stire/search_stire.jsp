<%@ page import="ro.uti.settings.util.Constants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="selectionComponent" prefix="selection" %>
<script src="selectionComponent/script/selectioncomponent.js"></script>
<script src="selectionComponent/script/hashtable.js"></script>

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
<p width="100%" class="button-row" align="right">
  <img border="0" style="cursor:pointer" onClick="javascript:hideLayer('search');" title='<bean:message bundle="stire" key="stire.label.closeWindow"/>' name="closeEditFrame" id="closeEdit" src="images/close_off.gif" />
</p>
<table width="100%" border="0">
  <html:form action="/stire.do" styleId="searchForm" >
  <!-- Cimpul fk_limba field. -->
<tr>
   <td valign="top"  align="right" width="40%" class="label">
     <bean:message bundle="stire" key="stire.prompt.nom_limba"/>:
   </td>
   <td class="text" align="left">
<%--      <html:select property="values.id_limba" styleClass="selectbox">
       <option value="-1"><bean:message key="select.prompt" bundle="app" /></option>
        <logic:iterate id="listItem" name='<%= StireConstants.KEY_STIRE_NOM_LIMBA %>'>
          <option value='<bean:write name="listItem" property="id_limba" />'><bean:write name='listItem' property="den_limba" /></option>
        </logic:iterate>
    </html:select>  --%>
       <selection:selectionComponent property="values.id_limba" detailsFieldName="denumire" idTableName="lmb.ID_Limba" multiple="false">
            <selection:genericSelection searchCaseId="nomLimba" showCodeInsert="true" knownFieldName="cod" styleClass="field_input_small">
           </selection:genericSelection>
       </selection:selectionComponent>
   </td>
  </tr>


  <!-- Cimpul 'link_titlu' field. -->

 <tr>
   <td valign="top"  align="right" class="label">
     <bean:message bundle="stire" key="stire.prompt.link_titlu"/>:
   </td>
   <td class="text" align="left">
     <html:text styleClass="text-small" property="values.titlu" size="22"/>
     <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title='<bean:message bundle="stire" key="stire.searchlabel.tooltip.link_titlu"/>'/>
   </td>
 </tr>



<!-- Cimpul 'data_crearii' field. -->
<tr>
    <td valign="top"  align="right" class="label">
      <bean:message bundle="stire" key="stire.prompt.data_crearii"/>:
    </td>
    <td class="text" align="left">


    <html:text styleClass="field_input" styleId="data_creariiString" property="values.data_creariiString"/>
      <img align="absmiddle" style="cursor:pointer;" src="images/cal.gif" id="triggerdata_creariiString"/>
      <script type="text/javascript">
                                            Calendar.setup(
                                            {
                                                inputField  : "data_creariiString",// ID of the input field
                                                ifFormat    : "%d.%m.%Y",    // the date format
                                                button      : "triggerdata_creariiString"// ID of the button
                                            }
                                            );
      </script><font size="-1">[dd/MM/yyyy]</font><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.searchlabel.tooltip.data_crearii"/>" />
    </td>
  </tr>
<!-- Cimpul 'data_expirarii' field. -->

  <tr>
    <td valign="top"  align="right" class="label">
      <bean:message bundle="stire" key="stire.prompt.data_expirarii"/>:
    </td>
    <td class="text" align="left">

      <html:text styleClass="text-small" styleId="data_expirariiString" property="values.data_expirariiString"/>
      <img align="absmiddle" style="cursor:pointer;" src="images/cal.gif" id="triggerdata_expirariiString"/>
      <script type="text/javascript">
                                            Calendar.setup(
                                            {
                                                inputField  : "data_expirariiString",// ID of the input field
                                                ifFormat    : "%d.%m.%Y",    // the date format
                                                button      : "triggerdata_expirariiString"// ID of the button
                                            }
                                            );
       </script><font size="-1">[dd/MM/yyyy]</font><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.searchlabel.tooltip.data_expirarii"/>" />
                                        </td>
  </tr>
   <!-- Cimpul 'data_publicarii' field. -->

 <tr>
    <td valign="top"  align="right" class="label">
      <bean:message bundle="stire" key="stire.prompt.data_publicarii"/>:
    </td>
    <td class="text" align="left">


   <html:text styleClass="text-small" styleId="data_publicariiString" property="values.data_publicariiString"/>
      <img align="absmiddle" style="cursor:pointer;" src="images/cal.gif" id="triggerdata_publicariiString"/>
      <script type="text/javascript">
                                            Calendar.setup(
                                            {
                                                inputField  : "data_publicariiString",// ID of the input field
                                                ifFormat    : "%d.%m.%Y",    // the date format
                                                button      : "triggerdata_publicariiString"// ID of the button
                                            }
                                            );

      </script><font size="-1">[dd/MM/yyyy]</font><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.searchlabel.tooltip.data_publicarii"/>" />
    </td>
  </tr>
  <!-- Cimpul 'tip_stire' field. -->
<tr>
  <td valign="top"  align="right" class="label">
    <bean:message bundle="stire" key="stire.prompt.tip_stire"/><font color="#336600">*</font> :
  </td>
  <td class="label" align="left">
     <html:select property="values.tip_stire" styleClass="selectbox">
          <html:option value="-1"><bean:message key="select.prompt" bundle="app" /></html:option>
          <% for (int i = 1; i <= 5 ; i++) { %>
            <bean:define id="titleKey" type="java.lang.String">stire.tip_stire_<%=i%></bean:define>
            <html:option value="<%= i+""%>" key="<%=titleKey%>" bundle="stire"/>
          <% } %>
     </html:select>
  </td>
</tr>
                                <tr>
    <td colspan="2" class="button-row" align="center">
      <input type="hidden" name="method" value="search"/>
      <input type="hidden" name="search" value="1"/>
      <html:submit styleClass="btn-generic">
        <bean:message  bundle="stire" key="stire.button.search"/>
      </html:submit>
     </td>
  </tr>
  </html:form>

  </table>
<!-- #############################-->
<!-- END Sectiune de SEARCH. -->
