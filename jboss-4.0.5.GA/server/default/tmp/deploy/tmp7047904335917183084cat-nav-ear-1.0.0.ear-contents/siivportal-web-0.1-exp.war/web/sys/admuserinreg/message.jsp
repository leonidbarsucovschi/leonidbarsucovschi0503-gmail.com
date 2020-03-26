<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Aug 24, 2005
  Time: 12:05:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<div class="table">
  <table width="100%">
    <!-- Sectiune de Afisare Erori. -->
    <tr>
      <td colspan="2" class="msg_error">
        <html:errors/>
      </td>
    </tr>
    <!-- END Sectiune de Afisare Erori. -->
   <logic:messagesPresent message="true">
      <tr>
        <td colspan="2" class="msg_success" align="center">
          <html:messages id="mesaje" bundle="app" message="true">
            <bean:write name="mesaje" ignore="true"/>
          </html:messages>
        </td>
      </tr>
    </logic:messagesPresent>
  </table>
</div>