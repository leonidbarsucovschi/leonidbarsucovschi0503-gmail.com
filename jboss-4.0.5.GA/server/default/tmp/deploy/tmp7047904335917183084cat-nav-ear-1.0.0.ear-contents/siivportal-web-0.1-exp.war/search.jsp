<%@ page import="java.util.List" %>
<%@ page import="ro.uti.apmc.portal.search.action.SearchDocumentType" %>
<%@ page import="ro.uti.waf.util.MessageResourceUtil" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/css/display.css">

<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
<TBODY>
<TR bgcolor="#FFCC00">
    <TD style="padding:3px " class="smallbodywhitebold" align="center">
        <bean:message bundle="search" key="search.title.search"/>
        :
    </TD>
</TR>
<tr>
    <td align="center">
        <html:form action="/s.do" method="get" styleId="searchForm">
            <table cellspacing="3" cellpadding="2" border="0">
                <tr height="10">
                    <td></td>
                </tr>
                <tr>
                    <td align="center">
                        <html:text property="query" styleId="tomsijerry"/>
                        <html:select property="type" styleId="modulCautat">
                            <html:option bundle="search" key="search.label.selectati" value="-1"/>
                            <html:option bundle="search" key="search.label.paginistatice"
                                         value="<%=String.valueOf(SearchDocumentType.DOCUMENT_TYPE_STATIC)%>"/>
                            <html:option bundle="search" key="search.label.stiri"
                                         value="<%=String.valueOf(SearchDocumentType.DOCUMENT_TYPE_STIRI)%>"/>
                        </html:select>
                        <html:submit styleClass="btn-trimite" onclick="return checkIfOk()">
                            <bean:message bundle="search" key="search.label.cauta"/>
                        </html:submit>
                        <html:hidden property="method" value="show"/>
                        <input type="hidden" name="page"/>
                        <img src="images/quest.gif" align="absmiddle" onmouseover="javascript:onHelpMouseOver();"
                             onmouseout="javascript:onHelpMouseOut();"/>

                        <div id="reference4tips"
                             style="visibility:hidden; position:relative; top:0px; left:0px;"></div>
                    </td>
                </tr>
                <tr height="10">
                    <td>
                        <div id="helptips"
                             style="z-index:100; width:340px; position:absolute; top:0px; left:0px; visibility:hidden; border-style:solid; border-color:#999999; border-width:1px;">
                            <table width="100%" cellspacing="0" cellpadding="3" border="0" bgcolor="#FFFCE4">
                                <tr>
                                    <td class="label">
                                        <%=MessageResourceUtil.getMessage("search.label.tips1", "search", "", request)%>
                                        <br>
                                        <%=MessageResourceUtil.getMessage("search.label.tips2", "search", "", request)%>
                                        <br>
                                        <%=MessageResourceUtil.getMessage("search.label.tips3", "search", "", request)%>
                                        <br>
                                        <%=MessageResourceUtil.getMessage("search.label.tips4", "search", "", request)%>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </td>
                </tr>
            </table>
        </html:form>
    </td>
</tr>
<tr>
    <td align="center" width="100%">
        <table>
            <tr>
                <%
                    int pages = ((Integer) request.getAttribute("list_size")).intValue();
                    int currentPage = ((Integer) request.getAttribute("page")).intValue();
                    int split = ((Integer) request.getAttribute("split")).intValue();
                    for (int i = 0; i < pages; i++) {
                        if (currentPage == i) {
                %>
                <td>
                    <div style="cursor:pointer;" class="smallbodybold" onclick="getPage(<%=i%>)"><%=(i + 1)%>
                        &nbsp;</div>
                </td>
                <% } else { %>
                <td>
                    <div style="cursor:pointer;" class="smallbodylite" onclick="getPage(<%=i%>)"><%=(i + 1)%>
                        &nbsp;</div>
                </td>
                <%}%>
                <%}%>
            </tr>
        </table>
    </td>
</tr>
<tr>
    <td width="100%" align="center">
        <table width="100%">
            <%if (((List) request.getAttribute("list_result")).size() != 0) {%>
            <logic:iterate id="results" name="list_result" indexId="index">
                <tr align="left">
                    <td>
                        <table width="100%" class="lightrow" cellspacing="1">
                            <tr class="smallbodybold">
                                <td><%=currentPage * split + index.intValue() + 1%>)&nbsp;<a
                                        href='<bean:write name="results" filter="false" property="document.href" />'>
                                    <bean:write name="results" property="document.title"/>
                                </a></td>
                                <td align="right">
                                    <bean:write name="results" property="formatedScore"/>
                                </td>
                            </tr>
                            <tr class="smallbodylite">
                                <td colspan="2" width="100%">
                                    <bean:write name="results" filter="false"
                                                property="document.summary"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </logic:iterate>
            <%} else {%>
            <tr class="msg_success" align="center">
                <td>
                    <bean:message bundle="search" key="search.label.noresults"/>
                </td>
            </tr>
            <%}%>
        </table>
    </td>
</tr>
</TBODY>
</TABLE>
<script>
    function getPage(numar) {
        document.getElementById('searchForm').page.value = numar;
        document.getElementById('searchForm').submit();
    }
    function checkIfOk() {
        if (document.getElementById("modulCautat").value == "-1") {
        <%String message = MessageResourceUtil.getMessage("search.label.selectmodul", "search", "", request);%>
            alert("<%=message%>");
            return false;
        }
        if (document.getElementById("tomsijerry").value.substring(0, 1) == '*' || document.getElementById("tomsijerry").value.substring(0, 1) == '?') {
        <%message = MessageResourceUtil.getMessage("search.label.farasteluta", "search", "", request);%>
            alert("<%=message%>");
            return false;
        }
        return true;
    }

    function onHelpMouseOver() {
        var x = document.getElementById('reference4tips').offsetLeft;
        var y = document.getElementById('reference4tips').offsetTop;

        document.getElementById('helptips').style.left = x;
        document.getElementById('helptips').style.top = 190;
        document.getElementById('helptips').style.visibility = 'visible';
    }

    function onHelpMouseOut() {
        document.getElementById("helptips").style.visibility = "hidden";
    }

</script>