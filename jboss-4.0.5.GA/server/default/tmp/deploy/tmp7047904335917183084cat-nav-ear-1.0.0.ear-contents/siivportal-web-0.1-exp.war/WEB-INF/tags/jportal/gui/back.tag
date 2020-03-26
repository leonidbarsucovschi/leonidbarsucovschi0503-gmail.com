<%@ attribute name="key" %>
<%@ attribute name="bundle" %>
<%@ attribute name="style" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<%@ tag isELIgnored="false" %>

<table>
  <tr>
    <td><html:link module="" action="/back.do"><bean:message key="${key}" bundle="${bundle}"/></html:link></td>
  </tr>
</table>
