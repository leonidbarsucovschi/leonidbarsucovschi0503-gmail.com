<%--
 *
 * composite_change_detail.jsp
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
    Used to generate server's response when current detail has been changed.
    See "composite_response_iframe.jsp" for more details.
------------------------------------------------------------------------------%>

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositePresentationConst" %>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants"%>

<%-- taglibs --%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ taglib uri="/WEB-INF/composite.tld" prefix="composite" %>

<%-- defines --%>
<bean:define id="currentDetailID" name="<%=CompositeConstants.ATTR_CURRENT_DETAIL_ID%>"
             scope="request" type="java.lang.String"/>

<composite:includeBody succeeded="true">

  <%-- current detail's content --%>
  <composite:jsFilter>
    <div id="detailContentID">
      <composite:componentPage componentID="<%=currentDetailID%>" varName="detailPage"/>
      <jsp:include page="<%=detailPage%>"/>
    </div>
  </composite:jsFilter>
  <%-- end current detail's content --%>

  <%-- javascript code called when the page is completely loaded --%>
  <script type="text/javascript">
  function compositeResponsePageLoaded() {
      var parentElement = parent.document.getElementById(
          "<%=CompositePresentationConst.COMPONENT_ELEMENT_ID_PREFIX%>"
              + parent.<%=CompositePresentationConst.DETAILS_JSVAR_NAME%>.getCurrentDetailID());

      compositeCopyElements(parentElement, document.getElementById("detailContentID"));

      parentElement.id = "<%=CompositePresentationConst.COMPONENT_ELEMENT_ID_PREFIX%><%=currentDetailID%>";
      parent.<%=CompositePresentationConst.DETAILS_JSVAR_NAME%>.currentDetailPageLoaded("<%=currentDetailID%>");
  }
  </script>
  <%-- end javascript code --%>

</composite:includeBody>
