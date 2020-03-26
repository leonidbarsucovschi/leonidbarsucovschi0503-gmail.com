          <%@ page import="java.util.*,
                           ro.uti.settings.util.Constants" %>
          <%@ page contentType="text/html; charset=iso-8859-2" %>
          <%@ page language="java" %>
          <%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
          <%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
          <%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>


          <% String fk_language = request.getParameter("fk_limba");
             String newsContentLink = "portal/vizstire.do?bifa=false&method=showNews&fk_limba="+fk_language+"&id_stire=";
          %>

          <marquee id="mstiri" truespeed scrolldelay="30" scrollamount="1" direction="up" loop="true" onmouseover="mstiri.stop();" onmouseout="mstiri.start();" >
          <logic:iterate id="stire" name="<%= Constants.TBL_STIRE_KEY_VIZ_LIST%>">
           <table width="100%">
            <logic:notEmpty name="stire" property="traducere_img">
             <tr>
               <td colspan="2" align="left">
                 <a class="homepagelink" href="<%=newsContentLink%><bean:write name="stire" property="id_stire" filter="false" />&tip_stire=<bean:write name="stire" property="tip_stire" filter="false" />" onmouseout="top.window.status=''; return true" onmouseover="top.window.status='Citeste';return true">
                   <bean:write name="stire" property="traducere_titlu" filter="false" />
                 </a>
                </td>
             </tr>
             <tr>
                 <td valign="top" width="70"><img width="60" height="60" src="<bean:write name="stire" property="traducere_img" filter="false" />" border="0" align="left"></td>
                 <td valign="top" class="smallbodylite"><bean:write name="stire" property="traducere_obs" filter="false" /></td>
             </tr>
            </logic:notEmpty>
            <logic:empty name="stire" property="traducere_img">
               <tr>
               <td align="left">
                 <a class="homepagelink" href="<%=newsContentLink%><bean:write name="stire" property="id_stire" filter="false" />&tip_stire=<bean:write name="stire" property="tip_stire" filter="false" />" onmouseout="top.window.status=''; return true" onmouseover="top.window.status='Citeste';return true">
                   <bean:write name="stire" property="traducere_titlu" filter="false" />
                 </a>
                </td>
             </tr>
             <tr>
               <td valign="top" class="smallbodylite"><bean:write name="stire" property="traducere_obs" filter="false" /></td>
             </tr>
            </logic:empty>
           </table>
          <%--    <p>--%>
          <%--        <a class="footer" href="<%=newsContentLink%><bean:write name="stire" property="id_stire" filter="false" />" onmouseout="top.window.status=''; return true" onmouseover="top.window.status='Citeste';return true">--%>
          <%--            <bean:write name="stire" property="traducere_titlu" filter="false" />--%>
          <%--        </a>--%>
          <%--        <logic:notEmpty  name="stire" property="traducere_obs">--%>
          <%--            <br>--%>
          <%--            <bean:write name="stire" property="traducere_obs" filter="false" />--%>
          <%--        </logic:notEmpty>--%>
          <%--        <br>--%>
          <%--        <bean:write name="stire" property="data_publicarii" filter="false" />--%>
          <%--    </p>--%>
          <%--    <p>--%>
          <%--        <logic:notEmpty name="stire" property="traducere_img">--%>
          <%--            <img width="60" height="60" src="<bean:write name="stire" property="traducere_img" filter="false" />" border="0" align="left">--%>
          <%--        </logic:notEmpty>--%>
          <%--        <bean:write name="stire" property="traducere_continut" filter="false" />--%>
          <%--    </p>--%>
          </logic:iterate>
          </marquee>
