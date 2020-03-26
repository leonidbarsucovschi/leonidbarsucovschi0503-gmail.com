<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="/WEB-INF/sys.tld" prefix="sys"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page isELIgnored="false" %>

<table class="smallbodylite" cellpadding="2" cellspacing="0" border="0" align="center" width="100%">
  <TR>
    <TD class="text_title" align="left">
      <bean:message bundle="portal" key="portal.harta.titlu"/>
    </TD>
  </TR>
  <tr>
    <td align="center">
      <bean:message bundle="portal" key="portal.harta.harta_virtuala"/>
      <br>
       <bean:message bundle="portal" key="portal.harta.descriere"/>
    </td>
  </tr>
  <tr>
    <td align="center">
      <a href="#"><img src="images/harta_mic.jpg" border="0" width="210" height="160" /></a>
    </td>
  </tr>
  <tr>
    <td align="center">
      <bean:message bundle="portal" key="portal.harta.pozitia"/>
    </td>
  </tr>
</table>
