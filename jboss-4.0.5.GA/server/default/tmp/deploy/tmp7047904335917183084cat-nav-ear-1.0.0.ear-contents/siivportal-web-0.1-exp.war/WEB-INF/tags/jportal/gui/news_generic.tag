<%@ tag import="ro.uti.apmc.sys.util.SystemUtil" %>
<%@ attribute name="key" required="true" %>
<%@ attribute name="bundle" %>
<%@ attribute name="style" %>
<%@ attribute name="type" required="true" %>
<%@ attribute name="bifa" %>

<%@ attribute name="background" %>
<%@ attribute name="height" %>
<%@ attribute name="method" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="/WEB-INF/sys.tld" prefix="sys" %>
<%@ tag isELIgnored="false" %>

<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
    <TBODY>
        <TR>
            <TD width=10><IMG height=10 src="images/e_tl.gif" width=10></TD>
            <TD background="images/e_t.gif"><IMG height=10 src="images/t.gif" width=3></TD>
            <TD width=10><IMG height=10 src="images/e_tr.gif" width=11></TD>
        </TR>
        <TR>
            <TD width=10 background="images/e_l.gif"><IMG height=4 src="images/e_l.gif" width=10></TD>
            <TD bgColor=#ffffff>
                <TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
                    <TBODY>
                        <TR>
                            <TD class="text_title">
                                <bean:message bundle="${bundle}" key="${key}"/>
                            </TD>
                        </TR>
                        <tr height="10">
                            <td></td>
                        </tr>
                        <TR>
                            <TD class=smallbodylite background="${background}" style="${style}" height="${height}">

                                <c:set var="cprefix" scope="request" value="<%=SystemUtil.getModulePrefix(request)%>"/>

                                <jsp:include flush="true" page="/portal/vizstire.do">
                                    <jsp:param name="method" value="${method}"/>
                                    <jsp:param name="tip_stire" value="${type}"/>
                                    <jsp:param name="xinclude" value="true"/>
                                </jsp:include>

                                <sys:cmodule prefix="${cprefix}"/>
                            </TD>
                        </tr>
                        <tr>
                            <TD>
                                <A class=homepagelink
                                   href="<%= "portal/vizstire.do?method=showNewsDetailList&tip_stire="%>${type}<%="&bifa="%>${bifa}">(
                                    <bean:message bundle="portal" key="portal.mai_mult"/>)</A>
                                &nbsp;&nbsp;
                                <A class=homepagelink
                                   href="<%= "portal/vizstire.do?method=showNewsArchiveList&tip_stire="%>${type}<%="&bifa="%>${bifa}">(
                                    <bean:message bundle="portal" key="portal.arhiva"/>)</A>
                            </TD>
                        </TR>
                    </TBODY>
                </TABLE>
            </TD>
            <TD width=10 background="images/e_r.gif"><IMG height=5 src="images/e_r.gif" width=11></TD>
        </TR>
        <TR>
            <TD width=10><IMG height=10 src="images/e_bl.gif" width=10></TD>
            <TD background="images/e_b.gif"><IMG height=10 src="images/e_b.gif" width=3></TD>
            <TD width=10><IMG height=10 src="images/e_br.gif" width=11></TD>
        </TR>
    </TBODY>
</TABLE>