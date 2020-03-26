
<%@ page import="java.util.*,ro.uti.settings.util.Constants,
                 ro.uti.jpf.base.composite.util.CompositeConstants"%>
<%@ page import="ro.uti.apmc.portal.components.util.StireConstants"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<form name="closeForm"  method="post" action="portal/stire.do"><html:hidden property="method"  value="list" name="<%=Constants.TBL_STIRE_KEY%>"/></form><script>
    function closeWindow(){
        document.closeForm.submit();
    }
function initChb(id_boo,id) {
 var chb = document.getElementById(id_boo);
 var field = document.getElementById(id);
 if (chb.checked) {
   field.value="1";
 }else {
   field.value="0";
 }
}
</script>
<div class="table">
 <table width="100%" border="0" cellpadding="2" cellspacing="0">
   <tr>
       <td width="100%" valign="top" align="left" class="page-subtitle">&nbsp;
				<!-- Titlul ferestrei pentru modificare. -->
				<logic:empty  name="<%=Constants.TBL_STIRE_KEY%>"  property="values.primaryKey" scope="request">
				<bean:message bundle="stire" key="stire.title.add"/>
				</logic:empty>
				<!-- Titlul ferestrei pentru adaugare. -->
				<logic:notEmpty  name="<%=Constants.TBL_STIRE_KEY%>" property="values.primaryKey" scope="request">
				<bean:message bundle="stire" key="stire.title.save"/>
				</logic:notEmpty>
				<!-- END Sectiune de Titlu pagina. -->
				</td>
			<td class="bottom" align="right">
				<img border="0"  style="cursor:pointer;" onClick="javascript:closeWindow();" title='<bean:message bundle="stire" key="stire.label.closeWindow"/>' src="images/close_off.gif" />
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
		<table width="100%" border="0" cellpadding="0" cellspacing="1" class="label">
<!-- START Sectiune de FORM. -->
<html:form  action="/stire.do" onsubmit="return validateForm_StireForm(this);" method="post" enctype="multipart/form-data">
<html:hidden property="values.id_stire"/>


<!-- Cimpul 'tip_stire' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.tip_stire"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left">
  <logic:empty  name="<%=Constants.TBL_STIRE_KEY%>"  property="values.primaryKey" scope="request">
      <html:select property="values.tip_stire" styleClass="selectbox">
         <html:option value=""><bean:message key="select.prompt" bundle="app" /></html:option>
         <logic:iterate id="listItem" name='<%= StireConstants.KEY_STIRE_ADD_TIP %>'>
             <bean:define id="titleKey" type="java.lang.String">stire.tip_stire_<%=((HashMap)listItem).get("id")%></bean:define>
             <html:option value="<%= ((HashMap)listItem).get("id")+""%>" key="<%=titleKey%>" bundle="stire"/>
         </logic:iterate>
      </html:select>
   </logic:empty>
   <logic:notEmpty  name="<%=Constants.TBL_STIRE_KEY%>" property="values.primaryKey" scope="request">
     <html:select property="values.tip_stire" styleClass="selectbox">
         <html:option value=""><bean:message key="select.prompt" bundle="app" /></html:option>
         <logic:iterate id="listItem" name='<%= StireConstants.KEY_STIRE_EDIT_TIP %>'>
             <bean:define id="titleKey" type="java.lang.String">stire.tip_stire_<%=((HashMap)listItem).get("id")%></bean:define>
             <html:option value="<%= ((HashMap)listItem).get("id")+""%>" key="<%=titleKey%>" bundle="stire"/>
         </logic:iterate>
      </html:select>
   </logic:notEmpty>
  </td>
</tr>
<!-- Cimpul 'titlu' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.link_titlu"/><font color="#336600">*</font> :
  </td>
<td class="text" align="left">
    <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.titlu" maxlength="150" /><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.link_titlu"/>" />
  </td>
</tr>

<!-- Cimpul 'obs_scurta' field. -->
<tr>
  <td valign="top"  align="right" class="label">
    <bean:message bundle="stire" key="stire.prompt.link_obs_scurta"/> :
  </td>
  <td class="text" align="left">
  <html:textarea errorStyleClass="errorfield"  property="values.obs_scurta" cols="32" rows="4" />
  <img align="top" src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.link_obs_scurta"/>" />
 </td>
</tr>

<!-- Cimpul 'continut' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.link_continut"/><font color="#336600">*</font> :
  </td>
  <td class="text" align="left">
   <html:textarea errorStyleClass="errorfield"  property="values.continut" cols="32" rows="8" /><img align="top"   src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.link_continut"/>" />
 </td>
</tr>

<!-- Cimpul 'apare_homepage' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.apare_homepage"/><font color="#336600">**</font> :
  </td>
  <td class="text" align="left">
   <html:checkbox property="values.apare_homepage_boo" value="true" />
   <img align="top"   src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.apare_homepage"/>" />
  </td>
</tr>
<!--Campul pozitie_afisare-->
<tr>
 <td align="right" class="label">
   <bean:message bundle="stire" key="stire.prompt.pozitie_afisare"/> :
 </td>
 <td align="left">
  <html:text styleClass="field_input" property="values.pozitie_afisare" maxlength="3"/>
  <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.pozitie_afisare"/>" />
 </td>
</tr>
<!--Campul arhivare_fortata-->
<html:hidden property = "arhivare_fortata" styleId = "arhivare_fortata" />
<tr>
  <td align="right" class="label">
   <bean:message bundle = "stire" key = "stire.prompt.arhivare"/> :
  </td>
  <td>
   <input type="checkbox" id="arhivare_fortata_boo" onclick="javascript: initChb('arhivare_fortata_boo','arhivare_fortata');"/>
   <img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.arhivare"/>" /> 
   <script type="text/javascript">
          if (document.getElementById("arhivare_fortata").value == "1") {
              document.getElementById("arhivare_fortata_boo").checked = true;
          }
   </script>
  </td>
</tr>
<!-- Cimpul 'data_expirarii' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.data_expirarii"/><font color="#336600">*</font> :
						</td>
					<td class="text" align="left">



								<html:text errorStyleClass="errorfield" styleClass="text-small" styleId="data_expirariiString" property="values.data_expirariiString"/><img align="absmiddle" style="cursor:pointer;" src="images/cal.gif" id="triggerdata_expirariiString"/><script type="text/javascript">
                        Calendar.setup(
                        {
                            inputField  : "data_expirariiString",// ID of the input field
                            ifFormat    : "%d.%m.%Y",    // the date format
                            button      : "triggerdata_expirariiString"// ID of the button
                        }
                        );
								</script><font class="label"><bean:message bundle="stire" key="stire.label.date_format"/></font><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.data_expirarii"/>" />
						</td>
</tr>

<!-- Cimpul 'data_publicarii' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.data_publicarii"/> :
						</td>
					<td class="text" align="left">



								<html:text errorStyleClass="errorfield" styleClass="text-small" styleId="data_publicariiString" property="values.data_publicariiString"/><img align="absmiddle" style="cursor:pointer;" src="images/cal.gif" id="triggerdata_publicariiString"/><script type="text/javascript">
                        Calendar.setup(
                        {
                            inputField  : "data_publicariiString",// ID of the input field
                            ifFormat    : "%d.%m.%Y",    // the date format
                            button      : "triggerdata_publicariiString"// ID of the button
                        }
                        );
								</script><font class="label"><bean:message bundle="stire" key="stire.label.date_format"/></font><img src="images/quest.gif" width="15" height="15" style="cursor:pointer;" title="<bean:message bundle="stire" key="stire.label.tooltip.data_publicarii"/>" />
						</td>
</tr>

<!--Campul data_publicarii-->
<logic:notEmpty  name="<%=Constants.TBL_STIRE_KEY%>" property="values.primaryKey" scope="request">
    <html:hidden property="values.data_publicariiString"/>
</logic:notEmpty>
<!--Campul id_limba-->
<logic:empty name="<%=Constants.TBL_STIRE_KEY%>" property="values.primaryKey" scope="request">
    <html:hidden property="values.id_limba" value="<%= Constants.DEFAULT_LANGUAGE%>"/>
</logic:empty>
<logic:notEmpty  name="<%=Constants.TBL_STIRE_KEY%>" property="values.primaryKey" scope="request">
    <html:hidden property="values.id_limba"/>
</logic:notEmpty>
<!-- Cimpul 'imagine_mica' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.link_imagine_mica"/> :
  </td>
  <td class="text" align="left">
   <logic:empty  name="<%=Constants.TBL_STIRE_KEY%>"  property="values.primaryKey" scope="request">
     <html:file property="file_imagine_mica"/>
   </logic:empty>
   <logic:notEmpty  name="<%=Constants.TBL_STIRE_KEY%>" property="values.primaryKey" scope="request">
    <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.imagine_mica" size="22"/>
    <html:file property="file_imagine_mica"/>
   </logic:notEmpty>
  </td>
</tr><!-- Cimpul 'imagine_mare' field. -->
<tr>
  <td valign="top"  align="right"><bean:message bundle="stire" key="stire.prompt.link_imagine_mare"/> :
  </td>
  <td class="text" align="left">
	<logic:empty  name="<%=Constants.TBL_STIRE_KEY%>"  property="values.primaryKey" scope="request">
     <html:file property="file_imagine_mare"/>
   </logic:empty>
   <logic:notEmpty  name="<%=Constants.TBL_STIRE_KEY%>" property="values.primaryKey" scope="request">
    <html:text errorStyleClass="errorfield" styleClass="text-small" property="values.imagine_mare" size="22"/>
    <html:file property="file_imagine_mare"/>
   </logic:notEmpty>
  </td>
</tr>
 <tr>
   <td colspan="2" class="info-text" align="left">
     <bean:message bundle="app" key="grad_clasificare.label.fieldInfo"/>
     <br/>
     <bean:message bundle="stire" key="stire.label.info"/>
   </td>
 </tr>
		<!-- START Sectiune de BUTOANE. -->
		<logic:empty  name="<%=Constants.TBL_STIRE_KEY%>"  property="values.primaryKey" scope="request"><!-- Buton adugare. -->
		<tr>
  <td colspan="2" class="button-row" align="center"><html:submit styleClass="btn-generic"><bean:message bundle="stire" key="stire.button.add"/></html:submit><html:hidden property="method"  value="add"/></td>
</tr>
		</logic:empty>
		<logic:notEmpty  name="<%=Constants.TBL_STIRE_KEY%>" property="values.primaryKey" scope="request"><!-- buton modificare. -->
		<tr>
  <td colspan="2" class="button-row" align="center"><html:submit styleClass="btn-generic"><bean:message bundle="stire" key="stire.button.save"/></html:submit><html:hidden property="method"  value="update"/></td>
</tr>
		</logic:notEmpty>
		<!-- END Sectiune de BUTOANE. -->
		</html:form>
		<!-- END Sectiune de FORM. -->
		</table>
		</div>
		<!-- Validare cimpuri forma. -->
		<html:javascript formName="form_StireForm"
              dynamicJavascript="true"
               staticJavascript="false"/><script language="Javascript1.1" src="staticJavascript.jsp" ></script>
