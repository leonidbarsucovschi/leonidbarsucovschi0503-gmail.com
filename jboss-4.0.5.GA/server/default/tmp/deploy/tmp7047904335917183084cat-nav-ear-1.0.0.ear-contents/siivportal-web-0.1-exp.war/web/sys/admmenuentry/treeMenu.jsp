<%--
  Created by IntelliJ IDEA.
  User: Sile
  Date: Oct 28, 2005
  Time: 12:45:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Sile
  Date: Oct 28, 2005
  Time: 12:28:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ page language="java" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html>
<head>
<title><bean:message bundle="tree" key="tree.titlu"/></title>
<link type="text/css" rel="stylesheet" href="<html:rewrite module=""   page="/css/dtree.css"/>">
<style>
.button{
     background-color: #D8E5FF;
	font-family:Verdana, Geneva, Arial, Helvetica, sans-serif;
	font-size: 10px;
	border-bottom: 2px solid #AA1E1C;
	border-left: 1px solid #AA1E1C;
	border-right: 1px solid #AA1E1C;
	border-top: 1px solid #AA1E1C;
    color:#000066;
    font-weight:bold;
}
</style>
<script language="javascript" src="<html:rewrite module=""  page="/js/dtree/dtree.js"/>"></script>
</head>
<body bgcolor=white leftmargin=0 topmargin=0 marginheight="0" marginwidth="0">


<%--
<input type="button" class="button" onClick="javascript: b.openAll();" value="<bean:message key="document.prompt.category.openall"/>"/>
<input type="button" class="button" onClick="javascript: b.closeAll();" value="<bean:message key="document.prompt.category.closeall"/>"/>
--%>
<br/>
<span style="margin-left: 10px;">
<input type="image" onClick="javascript: b.openAll();"  src="<html:rewrite module=""  page="/images/open_tree.gif"/>" title="<bean:message bundle="tree" key="tree.deschide_arbore"/>" />
<input type="image" onClick="javascript: b.closeAll();" src="<html:rewrite module=""  page="/images/close_tree.gif"/>" title="<bean:message bundle="tree" key="tree.inchide_arbore"/>" />
</span>

<script language="javascript" >

function choose(choiceLabel, choiceId,choiceTag) {

	document.getElementById("chooseForm").isEdit.value = '0';
	document.getElementById("chooseForm").choiceLabel.value = choiceLabel;
	document.getElementById("chooseForm").choiceId.value = choiceId;
    document.getElementById("chooseForm").choiceTag.value = choiceTag;
}

function finalizeChoice() {
	var choiceLabel = document.getElementById("chooseForm").choiceLabel.value;
	var choiceId = document.getElementById("chooseForm").choiceId.value;
    var choiceTag = document.getElementById("chooseForm").choiceTag.value;
    var isEdit = document.getElementById("chooseForm").isEdit.value;
	if (isEdit == 0) {
		if ((choiceLabel.length == 0) || (choiceId == -1)) {
			alert('<bean:message bundle="tree" key="tree.alert_confirmare"/>');
		} else {
			<bean:parameter name="form" id="form"/>
			<bean:parameter name="choiceLabel" id="choiceLabel"/>
			<bean:parameter name="choiceId" id="choiceId"/>
            <bean:parameter name="choiceTag" id="choiceTag"/>
            <bean:parameter name="selectedId" id="selectedId"/>

//			alert(choiceLabel + " - " + choiceId+" - " + choiceTag);
			window.opener.document.getElementById('<bean:write name="form"/>').<bean:write name="choiceLabel"/>.value = choiceLabel;
			window.opener.document.getElementById('<bean:write name="form"/>').<bean:write name="choiceId"/>.value = choiceId;
//            window.opener.document.getElementById('<bean:write name="form"/>').<bean:write name="choiceTag"/>.value = choiceTag;
            <%if(request.getParameter("onchange")!=null){%>
                window.opener.<%=request.getParameter("onchange")%>
            <%}%>
            window.close();
		}
	} else {
		window.close();
	}

}





b = new dTree('b', '<html:rewrite module="" page="/images/dtree"/>');
b.config.useCookies=false;
b.config.useIcons=false;
b.config.useSelection=true;
<logic:iterate name="hash_tbl_arbore" id="node">
b.add(<bean:write name="node" property="id"/>, <bean:write name="node" property="parentId"/>,'<bean:write name="node" property="label" filter="false"/>','<bean:write name="node" property="action"/>', '<bean:write name="node" property="label" filter="false"/>', '', '');
</logic:iterate>
document.write(b);
</script>


<form id="chooseForm">
<input type="hidden" name="isEdit" value="0"/>
<input type="hidden" name="choiceLabel"/>
<input type="hidden" name="choiceId"/>
<input type="hidden" name="choiceTag"/>
</form>

<p align="center" <%--style="background-color:#ffff00; padding:3px;"--%>>
<input type="button" class="button" onClick="finalizeChoice();" value="<bean:message bundle="tree" key="tree.buton.confirma"/>"/>
</p>


<script language="javascript" >
<logic:notEmpty name="selectedId">
b.openTo(<bean:write name="selectedId"/>, true);
document.getElementById("chooseForm").isEdit.value='1';
</logic:notEmpty>
</script>

</body>
</html>
