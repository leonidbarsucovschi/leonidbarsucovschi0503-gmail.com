<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Jul 25, 2005
  Time: 5:37:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,ro.uti.settings.util.Constants"%>
<%@ page import="ro.uti.apmc.portal.components.util.StireConstants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm"  method="post" action="portal/stire.do"><html:hidden property="method"  value="list"/></form><script>
    function closeWindow(){
        document.closeForm.submit();
    }
</script>
<div class="table"><table width="100%" border="0" cellpadding="0" cellspacing="1">
		<tr class="page-title-header">
  <td width="100%" valign="top" class="bottom" align="left">&nbsp;
				<!-- Titlul ferestrei pentru adaugare traducere. -->
				<!--m=0 am adauga-->
                <% if ("0".equals((String)request.getAttribute("m"))) {%>
				    <bean:message bundle="stire" key="stire.title.addtranslate"/>
               <%}else {%>
				<!-- Titlul ferestrei pentru modificare traducere. -->
				   <bean:message bundle="stire" key="stire.title.edittranslate"/>
                <%}%>
				<!-- END Sectiune de Titlu pagina. -->
				</td>
			<td class="bottom" align="right">
				<img border="0"  style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="stire" key="stire.label.closeWindow"/>' src="images/close_off.gif" />
				</td>
</tr></table>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
      <logic:messagesPresent>
         <tr>
           <td valign="top" colspan="2" class="msg_error" align="center">
             <ul><html:messages id="error"><li><bean:write name="error"/></li></html:messages></ul>
           </td>
         </tr>
      </logic:messagesPresent>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
  <logic:messagesPresent message="true">
      <tr>
        <td colspan="2" class="msg_success" align="center">
          <html:messages id="mesaje" bundle="app" message="true">
            <bean:write name="mesaje" ignore="true" />
          </html:messages>
        </td>
      </tr>
</logic:messagesPresent>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="1" class="label">

<!-- START Sectiune de FORM. -->
<html:form  action="/stire.do" onsubmit="return validateForm_StireForm(this);" method="post" enctype="multipart/form-data">
<html:hidden property="values.id_stire"/>
<html:hidden property="values.data_expirariiString"/>
<html:hidden property="den_limba"/>
<html:hidden property="values.data_publicariiString"/>
<html:hidden property="values.apare_homepage"/>
<html:hidden property="values.is_publicat"/>
<html:hidden property="values.pozitie_afisare"/>
 <!-- Cimpul id_limba field. -->
<tr>
   <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.nom_limba"/><font color="#336600">*</font> :
   </td>
   <td class="text" align="left">
   <!--m=0 am adauga-->
    <% if ("0".equals((String)request.getAttribute("m"))) {%>
      <% if ("1".equals((String)request.getAttribute("am"))) {%>
       <html:select property="values.id_limba" styleClass="selectbox">
         <option value=""><bean:message key="select.prompt" bundle="app" /></option>
         <logic:iterate id="listItem" name="<%= StireConstants.KEY_STIRE_NOM_LIMBA %>">
           <option value='<bean:write name="listItem" property="id_limba" />'><bean:write name='listItem' property="den_limba" /></option>
         </logic:iterate>
       </html:select>
      <% }else {%>
        <bean:message bundle="stire" key="stire.label.romana"/>
      <% }%>
    <%}else {%>
        <html:hidden property="values.id_limba"/>
        <bean:write name="<%=Constants.TBL_STIRE_KEY%>" property="den_limba" />
    <%}%>
   </td>
</tr>
<!-- Cimpul 'tip_stire' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.tip_stire"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left">
      <html:hidden property="values.tip_stire"/>
      <logic:equal value="1" name="<%=Constants.TBL_STIRE_KEY%>" property="values.tip_stire" ><bean:message bundle="stire" key="stire.tip_stire_1"/></logic:equal>
      <logic:equal value="2" name="<%=Constants.TBL_STIRE_KEY%>" property="values.tip_stire"><bean:message bundle="stire" key="stire.tip_stire_2"/></logic:equal>
      <logic:equal value="3" name="<%=Constants.TBL_STIRE_KEY%>" property="values.tip_stire"><bean:message bundle="stire" key="stire.tip_stire_3"/></logic:equal>
      <logic:equal value="4" name="<%=Constants.TBL_STIRE_KEY%>" property="values.tip_stire"><bean:message bundle="stire" key="stire.tip_stire_4"/></logic:equal>
      <logic:equal value="5" name="<%=Constants.TBL_STIRE_KEY%>" property="values.tip_stire"><bean:message bundle="stire" key="stire.tip_stire_5"/></logic:equal>
  </td>
</tr>

<!-- Cimpul 'titlu' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.link_titlu"/> :
  </td>
<td class="text" align="left">
    <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.titlu" size="22"/><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.link_titlu"/>" />
  </td>
</tr>

<!-- Cimpul 'obs_scurta' field. -->
<tr>
  <td valign="top"  align="right" class="label"><bean:message bundle="stire" key="stire.prompt.link_obs_scurta"/> :
  </td>
  <td class="text" align="left">
  <html:textarea errorStyleClass="errorfield"  property="values.obs_scurta" cols="32" rows="4" />
  <img align="top"  src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.link_obs_scurta"/>" />
 </td>
</tr>

<!-- Cimpul 'continut' field. -->
<tr>
  <td valign="top"  align="right" class="label"><bean:message bundle="stire" key="stire.prompt.link_continut"/> *:
  </td>
  <td class="text" align="left">
   <html:textarea errorStyleClass="errorfield"  property="values.continut" cols="32" rows="8" /><img align="top"   src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.link_continut"/>" />
 </td>
</tr>

<!-- Cimpul 'imagine_mica' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.link_imagine_mica"/> :
  </td>
  <td class="text" align="left">
    <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.imagine_mica" size="22"/>
    <html:file property="file_imagine_mica"/>
  </td>
</tr>

<!-- Cimpul 'imagine_mare' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.link_imagine_mare"/> :
  </td>
  <td class="text" align="left">
    <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.imagine_mare" size="22"/>
    <html:file property="file_imagine_mare"/>
  </td>
</tr>
		<!-- START Sectiune de BUTOANE. -->
		<!--m=0 am adauga-->
       <% if ("0".equals((String)request.getAttribute("m"))) {%>
          <!-- Buton adugare. -->
        <% if ("1".equals((String)request.getAttribute("am"))) {%>
             <tr>
              <td colspan="2" class="button-row" align="center"><html:submit styleClass="btn-generic"><bean:message bundle="stire" key="stire.button.add"/></html:submit><html:hidden property="method"  value="addTranslate"/></td>
             </tr>
         <% }%>
		 <%}else {%>
		   <!-- buton modificare. -->
		   <tr>
           <td colspan="2" class="button-row" align="center"><html:submit styleClass="btn-generic"><bean:message bundle="stire" key="stire.button.save"/></html:submit><html:hidden property="method"  value="updateTranslate"/></td>
        </tr>
		<%}%>
		<!-- END Sectiune de BUTOANE. -->
		</html:form>
		<!-- END Sectiune de FORM. -->
		</table>
        <jsp:include page="list_translate_stire.jsp" flush="true" />
		</div>
		<!-- Validare cimpuri forma. -->
		<html:javascript formName="form_StireForm"
              dynamicJavascript="true"
               staticJavascript="false"/><script language="Javascript1.1" src="staticJavascript.jsp" ></script>
