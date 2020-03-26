<%@ page import="ro.uti.waf.util.LanguageUtil,
                 ro.uti.apmc.sys.util.SysCfgParam" %>
<%@ page import="ro.uti.settings.util.Constants"%>

<%@ page contentType="text/html; charset=iso-8859-2" %>

<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/gui.tld" prefix="gui" %>
<%@ taglib uri="/WEB-INF/sys.tld" prefix="sys" %>

<%@ page isELIgnored="false" %>

<%
	LanguageUtil.setLocaleRo(request);
	session.setAttribute(SysCfgParam.REFRESH_MENU, "true");
%>

<HTML>
    <HEAD>
        <TITLE>ADMIN Portal SVM</TITLE>

        <sys:base/>

        <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
        <jsp:include page="templates/includes/app/style_include.jsp"/>
        <jsp:include page="templates/includes/app/javascript_include.jsp"/>

    </HEAD>

    <BODY class="pagebg" leftMargin="0" topMargin="0" marginheight="0" marginwidth="0" onLoad="javascript:pageLoaded=true;">
        <!-- ################################################### aplicatii disponibile dupa logare #####################-->
        <div id=ToolTip style="position:absolute;top:0;left:0;background:#FFFFFF;border-color:#65d0e7;border-style:solid;border-width:1px 1px 1px 1px;visibility:hidden;">
        </div>
        <!-- asta e tabelul pentru intreaga pagina -->
        &nbsp;
        <TABLE cellSpacing=0 cellPadding=0 width="980" align=center border=0>
        <TBODY>
            <TR>
                <TD><IMG height="10" src="images/b_tl.gif" width="14" border="0"></TD>
                <TD bgColor="#ffffff"><IMG height="10" src="images/t.gif" width="1" border="0"></TD>
                <TD><IMG height="10" src="images/b_tr.gif" width="14" border="0"></TD>
            </TR>
            <TR>
                <TD vAlign=top width=14 background="images/b_l.gif" rowSpan=2>
                    <IMG height=217 src="images/b_l1.gif" width=14 border="0">
                </TD>
                <TD vAlign=top width="100%" bgColor="#ffffff">
                <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                <TBODY>
                    <TR>
                        <td>
                        <table width="100%" cellpadding="0" cellspacing="0" border="0">
                            <tr>
                                <td rowspan="2" width="225">
                                    <html:link module="" page="/login.do?method=index">
                                        <img src="images/logo.gif" border="0">
                                    </html:link>
                                </td>
                                <td align="right">
                                    <div id="appDiv" align="right"
                                         style="z-index: 999; position: relative; right:0px; top: 0px; width: 200px; height:21px;">
                                        <gui:menu method="showAppMenu"/>
                                </td>
                            </tr>
                            <TR>
                                <TD align="right">
                                    <jsp:include page="templates/admin/toolbar_admin.jsp"/>
                                </TD>
                            </TR>
                        </table>
                        </td>
                    </TR>
                    <TR>
                        <TD vAlign=top bgColor="#ffffff"><IMG height=7 src="images/t.gif" width=1 border="0"></TD>
                    </TR>
                    <TR>
                        <TD vAlign=top bgColor="#ffffff">
                        <%------------ asta este meniul ----------------%>
                        <TABLE cellSpacing=0 cellPadding=0 width="100%" align=left border=0>
                        <TBODY>
                            <TR bgcolor="#0066CC" height="24">
                                <td>
<%
 //String parameter = request.getParameter("parentMenuId");
  String parameter = String.valueOf(session.getAttribute(Constants.USER_MENU_PARENT));
  if(parameter==null)
    parameter="2";
%>
                                    <gui:menu method="showMenuTree" parentMenu="<%=parameter%>"/>
                                    <!-- aici intra meniul daca e bagat ca la ZEUS si se sterge cel de sus-->
                                </td>
                            </TR>
                        </TBODY>
                        </TABLE>
                        <%------------ sfarsit meniu ----------------%>
                        </TD>
                    </TR>
                    <tr bgcolor="#FFFFFF" height="3"><td></td></tr>
                    <%--################################################################################################### --%>
                    <tr bgcolor="#E8E8E8">
                        <td>
                        <table cellspacing="0" cellpadding="0" border="0" width="100%">
                            <tr>
                                <td valign="top"></td>
                            </tr>
                        </table>
                        </td>
                    </tr>
                    <!-------------- asta este table row-ul care contine portletzii...
                    primii sunt pusi intr-o celula iar ceilalti in alta celula care pare sa se intinda pe tot restul paginii...-->
                    <TR>
                        <TD vAlign=top bgColor="#e8e8e8">
                        <TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
                        <TBODY>
                            <TR vAlign=top>
                                <TD WIDTH="100%" align="center" valign="top">
                                    <%-- start tabelul cu CONTENT --%>
                                    <gui:portlet content="portlets/callback/call_gen_content.jsp"/>
                                    <!-- sfarsit tabelul cu CONTENT -->
                                </TD>
                            </TR>
                        </TBODY>
                        </TABLE>
                        </TD>
                    </TR>
                    <TR><%--marginea de jos a portiunii care tine portletii --%>
                        <TD vAlign=top bgColor="#ffffff">
                        <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                        <TBODY>
                            <TR>
                                <TD width=10><IMG height=10 src="images/f_bl.gif" width=10></TD>
                                <TD bgColor="#e8e8e8"><IMG height=1 src="images/t.gif" width=1></TD>
                                <TD width=10><IMG height=10 src="images/f_br.gif" width=10></TD>
                            </TR>
                        </TBODY>
                        </TABLE>
                        </TD>
                    </TR>
                </TBODY>
                </TABLE>
                </TD>
                <TD vAlign=top width=14 background="images/b_r.gif" rowSpan=2><IMG height=217 src="images/b_r1.gif" width=14></TD>
            </TR>
            <TR>
                <TD vAlign=top bgColor="#ffffff"><IMG height=8 src="images/t.gif" width=1></TD>
            </TR>
            <TR><%-- ultima margine rotunjita --%>
                <TD width=14><IMG height=15 src="images/b_bl.gif" width=14></TD>
                <TD width=744 background="images/b_b.gif"><IMG height=15 src="images/t.gif" width=1></TD>
                <TD width=14><IMG height=15 src="images/b_br.gif" width=14></TD>
            </TR>
            <TR>
                <TD colspan="3" align="center" valign="middle">
                    <jsp:include page="footer.jsp"/>
                </TD>
            </TR>
        </TBODY>
        </TABLE>
        <P></P>
    </BODY>
</HTML>