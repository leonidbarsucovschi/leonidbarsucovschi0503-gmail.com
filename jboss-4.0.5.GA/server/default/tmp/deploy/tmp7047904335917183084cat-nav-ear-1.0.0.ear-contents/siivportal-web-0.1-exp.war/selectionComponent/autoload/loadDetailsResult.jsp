<%@page import="java.util.Hashtable,
                ro.uti.waf.components.selectionComponent.util.Constants,
                ro.uti.waf.components.selectionComponent.autoload.LoadDetailsForm"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ taglib  uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib  uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib  uri="/WEB-INF/sys.tld" prefix="sys"%>
<%@ page isELIgnored="false" %>

<html>
    <head>
    <META http-equiv="Content-Type" content="text/html; charset=iso-8859-2">
         <sys:base/>
</head>

<body>
<script src="../script/hashtable.js" ></script>
<script src="../script/jportal.js" ></script>
<script src="../script/selectioncomponent.js" ></script>

<logic:present name="<%=Constants.LOAD_DETAILS_KEY%>">

<html:form styleId="innerForm" action="loadDetails" onsubmit="alert('submit inner form')">
    <html:hidden property="idTableName"/>
    <html:hidden property="idTableValue"/>
    <html:hidden property="knownFieldName"/>
    <html:hidden property="knownFieldValue"/>
    <html:hidden property="detailsFieldName"/>
    <html:hidden property="propertyName"/>
    <html:hidden property="displayName"/>
    <html:hidden property="actionType" value='<%=ro.uti.waf.components.selectionComponent.util.Commands.LOADDETAILS+""%>'/>
    <html:hidden property="searchCaseId"/>
    <html:hidden property="maxlengthDetails"/>
    <div id="parametersDiv"></div>

</html:form>


</body>
<script >

<logic:notPresent  name="<%=Constants.LOAD_DETAILS_KEY_LIST%>" >
	function setDetailsParent(){
		parent.document.getElementById('<bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="propertyName"/>').value='<bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="idTableValue"/>';
		parent.document.getElementById('<bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="displayName"/>').value='<bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="idTableValue"/>';

                var textComp = parent.document.getElementById('<%=ro.uti.waf.components.selectionComponent.taglib.selectionComponent.Constants.TEXT%><bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="displayName"/><bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="knownFieldName"/>');
                if(textComp){
                  textComp.value='<bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="knownFieldValue"/>';
                }

        <%String details = ((LoadDetailsForm)request.getAttribute(Constants.LOAD_DETAILS_KEY)).getDetailsFieldValue();
            if(details.trim().length()==0)
                details = "&nbsp;";

        %>

		parent.document.getElementById('<%=ro.uti.waf.components.selectionComponent.taglib.selectionComponent.Constants.DIV%><bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="displayName"/><bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="detailsFieldName"/>').innerHTML=truncate('<%=details%>', <bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="maxlengthDetails"/>);
		parent.document.getElementById('<%=ro.uti.waf.components.selectionComponent.taglib.selectionComponent.Constants.DETAILS_HIDDEN%><bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="displayName"/>').value='<%=details%>';

        parent.<%=ro.uti.waf.components.selectionComponent.taglib.selectionComponent.Constants.ON_CHANGE_FUNCTION%><bean:write name="<%=Constants.LOAD_DETAILS_KEY%>" scope="request" property="displayName"/>();

	}
    setDetailsParent();
</logic:notPresent>

<logic:present  name="<%=Constants.LOAD_DETAILS_KEY_LIST%>" >
	function setAutoCompleteValues(){
        var autoComplArray = new Array();

        <logic:iterate id="value" name="<%=Constants.LOAD_DETAILS_KEY_LIST%>" >
            autoComplArray[autoComplArray.length] = '<bean:write name="value" />';
        </logic:iterate>

		eval('parent.setAutoCompleteValues'+document.innerForm.propertyName.value+'(autoComplArray);');
	}
    setAutoCompleteValues();
</logic:present>

</script>

</logic:present>

<logic:notPresent  name="<%=Constants.LOAD_DETAILS_KEY%>">

<form name="innerForm" action="<html:rewrite action='/selectionComponent/loadDetails'/>"  method="POST">
    <input type="hidden" name="idTableValue"/>
    <input type="hidden" name="idTableName"/>
    <input type="hidden" name="knownFieldName"/>
    <input type="hidden" name="knownFieldValue"/>
    <input type="hidden" name="detailsFieldName"/>
    <input type="hidden" name="propertyName"/>
    <input type="hidden" name="displayName"/>
    <input type="hidden" name="actionType" value='<%=ro.uti.waf.components.selectionComponent.util.Commands.LOADDETAILS+""%>'/>
    <input type="hidden" name="searchCaseId"/>
    <input type="hidden" name="maxlengthDetails"/>
    <div id="parametersDiv"></div>
</form>

</body>

<script >

function listparameters(forma){
  for(var i=0; i<forma.elements.length; i++){
    alert(forma.elements[i].name +" = "+forma.elements[i].value);
  }
}


<logic:present  name="<%=Constants.LOAD_DETAILS_KEY_LIST%>" >
	function setAutoCompleteValues(){
        var autoComplArray = new Array();

        <logic:iterate id="value" name="<%=Constants.LOAD_DETAILS_KEY_LIST%>" >
            autoComplArray[autoComplArray.length] = '<bean:write name="value" />';
        </logic:iterate>

		eval('parent.setAutoCompleteValues'+document.innerForm.propertyName.value+'(autoComplArray);');
	}
    setAutoCompleteValues();
</logic:present>

</script>


</logic:notPresent>

</html>
