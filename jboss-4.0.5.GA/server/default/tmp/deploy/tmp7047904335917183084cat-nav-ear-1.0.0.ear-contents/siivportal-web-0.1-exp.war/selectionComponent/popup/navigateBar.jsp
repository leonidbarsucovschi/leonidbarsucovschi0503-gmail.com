<%@ page import=" ro.uti.waf.components.selectionComponent.selectionPopup.*,
                 ro.uti.waf.components.selectionComponent.taglib.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.type.*,
                 ro.uti.waf.components.selectionComponent.selectionPopup.web.*,
                 java.util.Enumeration"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%
        String prefix=request.getParameter("prefix");
        String pagge="";

        // get the list navigation parameters /////////////////
        ViewObject viewObject = (ViewObject)request.getAttribute("viewObject");
        int resPerPage = viewObject.getResPerPage();
        int crtPage = viewObject.getCrtPage();

        int prevPage = viewObject.getPrevPage();
        int nextPage = viewObject.getNextPage();
        int lastPage =  viewObject.getLastPage();

        int pages = viewObject.getPages();
        int groupStartPage = viewObject.getGroupStartPage();
        int groupEndPage = viewObject.getGroupEndPage();
        int pageItems = viewObject.getPageItems();
%>

<%if(pagge.length()>0) {%>
    <input type="hidden" name="page" value="<%=pagge%>"/>
    <input type="hidden" name="prefix" value="<%=prefix%>"/>
<%}%>
<input type="hidden" name="rpp" value="<bean:write property="resPerPage" name="viewObject"/>"/>
<input type="hidden" name="crtPage" value="<bean:write property="crtPage" name="viewObject"/>"/>

<table width="100%" align=center border="0" cellspacing="0" cellpadding="2">

    <logic:equal  value="0" property="maxItems" name="viewObject">
    <tr>
      <td colspan="3" align="center" class="note">
          <bean:message key="navigation.toolbar.noresults" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>!
      </td>
    </tr>
    </logic:equal>
<!-- end numarul de rezultate  -->
<!-- display pages --->
<logic:greaterThan value="1" property="pages" name="viewObject">
    <tr>
	  <td class="searchBar">
		<table   cellspacing="0" cellpadding="0" border="0">
          <tbody>
            <tr>
              <td valign="middle" nowrap="true">
                <logic:greaterThan value="1" property="groupStartPage" name="viewObject">
					<input align="absmiddle" type="image" onClick='setNavigate(<%=resPerPage%>,1)' name="first" src="../resources/images/navigator/btn-first.png"
					       title='<bean:message key="label.navigation.first" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>'  border="0"/>
			    </logic:greaterThan>
				<logic:equal value="1" property="groupStartPage" name="viewObject">
					<input align="absmiddle" type="image" name="first" src="../resources/images/navigator/btn-first-disabled.png" disabled="true"
					       title='<bean:message key="label.navigation.first" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>' border="0"/>
				</logic:equal>
              </td>
              <td valign="middle" nowrap="true">
                <logic:greaterThan value="0" property="groupStartPage" name="viewObject">
					|

					<a href="javascript:setPage(<bean:write property="groupStartPage" name="viewObject"/>);" >
					  <img border="0" align="absmiddle" src="../resources/images/back.gif">
					</a>
					<a class="searchLink" href="javascript:setPage(<bean:write property="groupStartPage" name="viewObject"/>);" >prev. <b>
										<bean:write property="pageItems" name="viewObject"/></b>
                    </a>
					|
				</logic:greaterThan>
              </td>
              <td valign="middle" nowrap="true">
                <logic:equal value="true" property="primaPagina" name="viewObject">
					<input align="absmiddle" type="image" onClick='setNavigate(<%=resPerPage%>,<%=prevPage%>)' name="prev" src="../resources/images/navigator/btn-previous.png"
					       title='<bean:message key="label.navigation.prev" bundle="<%=Constants.MESSAGE_BUNDLE%>" />' border="0"/>
				</logic:equal>
                <logic:equal value="false" property="primaPagina" name="viewObject">
					<input align="absmiddle" type="image" name="prev" src="../resources/images/navigator/btn-previous-disabled.png" disabled="true" title='<bean:message key="label.navigation.prev" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>'
					       border="0"/>
				</logic:equal>
								<% for (int i=groupStartPage+1;i<=groupEndPage;i++) {%>
									<logic:equal name="viewObject" property="crtPage" value='<%=i+""%>'>
									 [<b><%=i%></b>]
									</logic:equal>
									<logic:notEqual name="viewObject" property="crtPage" value='<%=i+""%>'>
											<a class="searchLink" href="javascript:setPage(<%=i%>);"><%=i%></a>
									</logic:notEqual>
								<%}%>
								<logic:greaterThan value="0" property="nextPage" name="viewObject">
									<input align="absmiddle" type="image" onClick='setNavigate(<%=resPerPage%>,<%=nextPage%>)' name="next" src="../resources/images/navigator/btn-next.png"
													title="<bean:message key="label.navigation.next" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>"  border="0"/>
								</logic:greaterThan>
								<logic:lessEqual value="0" property="nextPage" name="viewObject">
										<input width="18" type="image" title="Next" src="../resources/images/navigator/btn-next-disabled.png" disabled="true"  name="next" height="18" border="0"
													 title="Next" align="absmiddle">
								</logic:lessEqual>
								<logic:notEqual name="viewObject" property="ultimulGrup" value="true">
										|
										<a class="searchLink" href="javascript:setPage(<%=groupEndPage+1%>);" > next <b><%=pageItems%></b> </a>
										<a href="javascript:setPage(<%=groupEndPage+1%>)" ><img border="0" align="absmiddle" src="../resources/images/next.gif"></a>
										|
								</logic:notEqual>
								</td>
								<td valign="middle" nowrap="true">
									<logic:greaterThan value="0" property="nextPage" name="viewObject">
											<input align="absmiddle" type="image" onClick='setNavigate(<%=resPerPage%>,<%=lastPage%>)' name="last" src="../resources/images/navigator/btn-last.png"
														title='<bean:message key="label.navigation.last" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>' border="0"/>
									</logic:greaterThan>
									<logic:lessThan value="0" property="nextPage" name="viewObject">
											<input align="absmiddle" type="image" name="last" src="../resources/images/navigator/btn-last-disabled.png" disabled="true" title='<bean:message key="label.navigation.last" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>'
														 border="0"/>
									</logic:lessThan>
								</td>
								<td width="100%" valign="middle">
								</td>
								<td valign="middle" nowrap="true" class="searchLink">
										<bean:message key="label.navigation.page" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>&nbsp;<b><%=crtPage%></b>&nbsp;<bean:message key="label.navigation.of" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>&nbsp;<b><%=pages%></b>
								</td>
            </tr>
          </tbody>
        </table>
			</td>
    </tr>
  </logic:greaterThan>
</table>
