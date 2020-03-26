<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<link rel="stylesheet" href="css/menu_styles.css" type="text/css">

<logic:messagesPresent>
    <span class="errormsg"><html:errors bundle="upload" property="error.same_folder"/></span>
</logic:messagesPresent>
<br><br>
<table border="0" cellspacing=2 cellpadding=2 class="report">
    <tr>
        <td class="text" align="left">
            <a href="portal/upload.do?method=showModifyUpload&index_selectat=<%=request.getAttribute("index")%>"
               class="footer">
                <bean:message bundle="upload" key="upload.back"/>
            </a>
        </td>
    </tr>
</table>

