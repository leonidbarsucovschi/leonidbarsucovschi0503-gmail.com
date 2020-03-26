<%--
 *
 * composite_change_details_render_mode.jsp
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
    Used to generate server's response when details rendering mode has been
    changed. See "composite_response_iframe.jsp" for more details.
------------------------------------------------------------------------------%>

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositeConstants" %>
<%@ page import="ro.uti.jpf.base.composite.util.CompositePresentationConst" %>

<%-- taglibs --%>
<%@ taglib uri="/WEB-INF/composite.tld" prefix="composite" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@ taglib uri="/WEB-INF/taglibs-string.tld" prefix="string" %>

<%-- defines --%>
<bean:define id="entityID" name="<%=CompositeConstants.ATTR_COMPOSITE_ID%>"
        scope="request" type="java.lang.String"/>
<bean:define id="resourcesRoot" name="<%=CompositeConstants.ATTR_RESOURCES_ROOT%>"
        scope="request" type="java.lang.String"/>

<composite:includeBody succeeded="true">

  <%-- details content --%>
  <composite:jsFilter>
    <div id="detailsContentID">
      <composite:includeBody minDetailsCount="1">
        <bean:define id="detailsPage" toScope="page" type="java.lang.String">
          <string:delete set="<%=CompositeConstants.CHARSET_SPACES%>">
            <%=resourcesRoot%>/<%=entityID%>_details_
            <composite:includeBody detailsRenderMode="tabs">tabs</composite:includeBody>
            <composite:includeBody detailsRenderMode="list">list</composite:includeBody>
            .jsp
          </string:delete>
        </bean:define>

        <jsp:include page="<%=detailsPage%>"/>
      </composite:includeBody>
    </div>
  </composite:jsFilter>
  <%-- end details content --%>

  <%-- javascript code called when the page is completely loaded --%>
  <script type="text/javascript">
  function compositeResponsePageLoaded() {
      <%-- otherwise the object seems that remains defined --%>
      parent.<%=CompositePresentationConst.DETAILS_JSVAR_NAME%> = null;

      compositeCopyElements(
          parent.document.getElementById("<%=CompositePresentationConst.DETAILS_ELEMENT_ID%>"),
          document.getElementById("detailsContentID"));

      <composite:includeBody minDetailsCount="1">
        parent.<%=CompositePresentationConst.DETAILS_JSVAR_NAME%>.pageLoaded();
      </composite:includeBody>
  }
  </script>
  <%-- end javascript code --%>

</composite:includeBody>
