<!--
      *
      *
      * @version
      * @author
      */
-->
<%@ page import="ro.uti.settings.util.Constants" %>
<%@ page import="ro.uti.settings.util.ThreadSafeSDFs" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
  <table width="100%" border="0" cellpadding="0" cellspacing="1">
    <tr class="page-title-header">
      <td width="100%" valign="top" class="report_nofixed" align="left">
        <!-- Titlul ferestrei pentru vizualizare. -->
        <bean:message bundle="stire" key="stire.title.view"/>
        <!-- END Sectiune de Titlu pagina. -->
      </td>
      <td class="bottom" align="right">
        <img border="0" style="cursor:pointer" onClick="javascript:closeWindow();" title='<bean:message bundle="stire" key="stire.label.closeWindow"/>' src="images/close_off.gif" />
      </td>
    </tr>
  </table>
  <table width="100%" border="0" cellpadding="1" align="center" class="report_nofixed" cellspacing="1">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td valign="middle" nowrap="nowrap" colspan="2" class="msg_error " align="center">
        <html:errors/>
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
    <!-- Cimpul 'titlu' field. -->
    <tr>
      <td valign="top"  align="right" width="30%" >
        <bean:message bundle="stire" key="stire.prompt.link_titlu"/>
        :
      </td>
      <td class="text" width="70%" >
        <bean:write  property="titlu" name="<%=Constants.TBL_STIRE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'continut' field. -->
    <tr>
      <td  valign="top"  align="right">
        <bean:message bundle="stire" key="stire.prompt.link_continut"/>
        :
      </td>
      <td class="text">
        <bean:write  property="continut" name="<%=Constants.TBL_STIRE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'data_crearii' field. -->
    <tr>
      <td valign="top"  align="right">
        <bean:message bundle="stire" key="stire.prompt.data_crearii"/>
        :
      </td>
      <td class="text">
        <logic:notEmpty property="data_crearii" name="<%=Constants.TBL_STIRE_KEY%>" >
           <bean:define id="creareDate" property="data_crearii" name="<%=Constants.TBL_STIRE_KEY%>" type="java.util.Date" />
           <%=ThreadSafeSDFs.getSdf().format(creareDate)%>
        </logic:notEmpty>
      </td>
    </tr>
    <!-- Cimpul 'data_expirarii' field. -->
    <tr>
      <td valign="top"  align="right">
        <bean:message bundle="stire" key="stire.prompt.data_expirarii"/>
        :
      </td>
      <td class="text">
        <logic:notEmpty property="data_expirarii" name="<%=Constants.TBL_STIRE_KEY%>" >
           <bean:define id="expirareDate" property="data_expirarii" name="<%=Constants.TBL_STIRE_KEY%>" type="java.util.Date" />
           <%=ThreadSafeSDFs.getSdf().format(expirareDate)%>
        </logic:notEmpty>
      </td>
    </tr>
    <!-- Cimpul 'data_publicarii' field. -->
    <tr>
      <td  valign="top"  align="right">
        <bean:message bundle="stire" key="stire.prompt.data_publicarii"/>
        :
      </td>
      <td class="text">
        <logic:notEmpty property="data_publicarii" name="<%=Constants.TBL_STIRE_KEY%>" >
           <bean:define id="publicareDate" property="data_publicarii" name="<%=Constants.TBL_STIRE_KEY%>" type="java.util.Date" />
           <%=ThreadSafeSDFs.getSdf().format(publicareDate)%>
        </logic:notEmpty>
      </td>
    </tr>
    <!-- Cimpul 'obs_scurta' field. -->
    <tr>
      <td valign="top"  align="right">
        <bean:message bundle="stire" key="stire.prompt.link_obs_scurta"/>
        :
      </td>
      <td class="text">
        <bean:write  property="obs_scurta" name="<%=Constants.TBL_STIRE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'tip_stire' field. -->
    <tr>
      <td valign="top"  align="right">
        <bean:message bundle="stire" key="stire.prompt.tip_stire"/>
        :
      </td>
      <td class="text">
        <logic:equal value="1" name="<%=Constants.TBL_STIRE_KEY%>" property="tip_stire" ><bean:message bundle="stire" key="stire.tip_stire_1"/></logic:equal>
        <logic:equal value="2" name="<%=Constants.TBL_STIRE_KEY%>" property="tip_stire"><bean:message bundle="stire" key="stire.tip_stire_2"/></logic:equal>
        <logic:equal value="3" name="<%=Constants.TBL_STIRE_KEY%>" property="tip_stire"><bean:message bundle="stire" key="stire.tip_stire_3"/></logic:equal>
        <logic:equal value="4" name="<%=Constants.TBL_STIRE_KEY%>" property="tip_stire"><bean:message bundle="stire" key="stire.tip_stire_4"/></logic:equal>
        <logic:equal value="5" name="<%=Constants.TBL_STIRE_KEY%>" property="tip_stire"><bean:message bundle="stire" key="stire.tip_stire_5"/></logic:equal>
      </td>
    </tr>
    <!-- Cimpul 'apare_homepage' field. -->
    <tr>
      <td valign="top"  align="right">
        <bean:message bundle="stire" key="stire.prompt.apare_homepage"/>
        :
      </td>
      <td class="text">
       <logic:equal value="1" name="<%=Constants.TBL_STIRE_KEY%>" property="apare_homepage" ><bean:message bundle="stire" key="stire.boolean.apare_homepage"/></logic:equal>
        <logic:equal value="0" name="<%=Constants.TBL_STIRE_KEY%>" property="apare_homepage" ><bean:message bundle="stire" key="stire.boolean.nu_apare_homepage"/></logic:equal>
      </td>
    </tr>
    <!--Campul 'pozitie_afisare' -->
    <tr>
     <td align="right" class="label">
      <bean:message bundle="stire" key="stire.prompt.pozitie_afisare"/> :
     </td>
     <td align="left">
      <bean:write  property="pozitie_afisare" name="<%=Constants.TBL_STIRE_KEY%>"/>
     </td>
    </tr>
    <!-- Cimpul 'imagine_mica' field. -->
    <tr>
      <td valign="top"  align="right">
        <bean:message bundle="stire" key="stire.prompt.link_imagine_mica"/>
        :
      </td>
      <td class="text">
        <bean:write  property="imagine_mica" name="<%=Constants.TBL_STIRE_KEY%>"/>
      </td>
    </tr>
    <!-- Cimpul 'imagine_mare' field. -->
    <tr>
      <td valign="top"  align="right">
        <bean:message bundle="stire" key="stire.prompt.link_imagine_mare"/>
        :
      </td>
      <td class="text">
        <bean:write  property="imagine_mare" name="<%=Constants.TBL_STIRE_KEY%>"/>
      </td>
    </tr>
  </table>
</div>
<form name="closeForm" method="post" action="portal/stire.do">
  <html:hidden property="method"  value="list"/>
</form>
<script>
  function closeWindow() {
    document.closeForm.submit();
  }
</script>
