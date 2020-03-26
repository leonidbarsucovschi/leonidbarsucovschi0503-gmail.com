<%@ taglib  uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

 <table cellspacing=0 cellpadding=0 width="100%" border=0>
  <tbody>
    <tr bgcolor="#FFCC00">
      <td style="padding:3px " class="smallbodywhitebold" align="center"><bean:message bundle="login" key="login.welcome.title" /></td>
    </tr>
    <tr>
      <td align="center">      <p>&nbsp;</p>
        <p class="pageheader2"><bean:message bundle="login" key="login.welcome.detail"/></p>
        <p>&nbsp;</p></td>
    </tr>
  </tbody>
</table>

