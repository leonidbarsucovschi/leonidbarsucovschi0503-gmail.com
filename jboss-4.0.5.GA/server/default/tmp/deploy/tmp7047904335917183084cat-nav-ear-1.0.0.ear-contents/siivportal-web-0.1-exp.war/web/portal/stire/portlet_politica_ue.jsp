<%@ page import="java.util.*,
                 ro.uti.settings.util.Constants" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<table border="0" cellpadding="1" cellspacing="1">
<logic:iterate id="stire" name="<%= Constants.TBL_STIRE_KEY_VIZ_LIST %>">
    <tr>
        <td>
        <table width="100%" cellspacing="0" cellpadding="0" border="0">
            <tr>
                <logic:notEmpty name="stire" property="traducere_img">
                <td width="70" valign="top">
                    <img width="60" height="60"
                         src="<bean:write name="stire"  property="traducere_img" filter="false" />"
                         align="left" border="2" style="border-color:#E5E5E5;">
                </td>
                </logic:notEmpty>
                <td style="vertical-align:top" class="smallbodylite">
                    <A class="homepagelink"
                       href="portal/vizstire.do?bifa=true&method=showNews&id_stire=<bean:write name="stire" property="id_stire" filter="false" />&tip_stire=<bean:write name="stire" property="tip_stire" filter="false" />">
                        <bean:write name="stire" property="traducere_titlu" filter="false"/>
                    </A>
                  </td>
            </tr>
             <tr>
                  <td style="vertical-align:top" class="smallbodylite" colspan="2">
                     <logic:notEmpty name="stire" property="traducere_obs">
                        <bean:write name="stire" property="traducere_obs" filter="false"/>
                    </logic:notEmpty>
                 </td>
            </tr>
        </table>
        </td>
    </tr>
</logic:iterate>
</table>