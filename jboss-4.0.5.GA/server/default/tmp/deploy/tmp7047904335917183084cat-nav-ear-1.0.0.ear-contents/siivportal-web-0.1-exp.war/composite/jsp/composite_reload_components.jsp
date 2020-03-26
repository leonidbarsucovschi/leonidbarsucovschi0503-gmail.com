<%--
*
* composite_set_components_messages.jsp
*
* Copyright (c) 2005 UTI Systems. All Rights Reserved.
*
* This source file may not be copied, modified or redistributed,
* in whole or in part, in any form or for any reason, without the express
* written consent of UTI Systems.
*
--%>

<%@ page language="java" %>
<%@ page contentType="text/html;charset=UTF-8"%>

<%------------------------------------------------------------------------------
    Generates a JavaScript function, named "compositeReloadComponents", for
    reloading visible components.
------------------------------------------------------------------------------%>

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants" %>
<%@ page import="ro.uti.jpf.base.composite.util.CompositePresentationConst" %>

<%-- taglibs --%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ taglib uri="/WEB-INF/taglibs-string.tld" prefix="string" %>
<%@ taglib uri="/WEB-INF/composite.tld" prefix="composite" %>

<%-- defines --%>
<composite:flags varName="reloadComponentIDs"
   flags="<%=CompositeConstants.COMPONENT_FLAG_RELOAD%>" visible="true"/>

<%-- components content --%>
<logic:iterate id="componentID" name="reloadComponentIDs" scope="page" type="java.lang.String">
  <composite:jsFilter>
    <div id="<%=CompositePresentationConst.COMPONENT_ELEMENT_ID_PREFIX%><%=componentID%>">
      <composite:componentPage componentID="<%=componentID%>" varName="detailPage"/>
      <jsp:include page="<%=detailPage%>" flush="true"/>
    </div>
  </composite:jsFilter>
</logic:iterate>
<%-- end components content --%>

<%-- compositeReloadComponents JavaScript function --%>
<script type="text/javascript">
function compositeReloadComponents() {
    <logic:iterate id="componentID" name="reloadComponentIDs" scope="page">
    compositeCopyComponentContentToParent("<%=componentID%>");
    parent.compositeCallComponentPageLoadedFunction("<%=componentID%>");
    </logic:iterate>
}
</script>
<%-- end JS code --%>
