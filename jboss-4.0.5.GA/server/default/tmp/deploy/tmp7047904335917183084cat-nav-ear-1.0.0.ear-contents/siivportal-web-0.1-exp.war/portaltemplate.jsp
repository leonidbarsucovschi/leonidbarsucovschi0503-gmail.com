<%@ page import="ro.uti.apmc.sys.util.SysCfgParam"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/gui.tld" prefix="gui"%>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display"%>
<%@ taglib uri="/WEB-INF/sys.tld" prefix="sys"%>
<%@ page isELIgnored="false" %>

<HTML>
    <HEAD>
    <TITLE>Portal SVM</TITLE>
    <sys:base/>
    <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
	<LINK REL="SHORTCUT ICON" href="favicon.ico">
    <jsp:include page="templates/includes/portal/style_include.jsp"/>
    <jsp:include page="templates/includes/portal/javascript_include.jsp"/>
    <script type="text/javascript">
        var hasRightFlashVersion = false;
        var allowedDiskSpace = true;
        var treeMenuLoaded = false;
        var mainMenuLoaded = false;
        var startedMenus = false;
        var updateTree = true;
<%
    Object idMenuEntry = request.getSession().getAttribute("id_menu_entry");
%>
        var menuIdToOpen = <%=idMenuEntry%>;

        function onLoadHandler() {
            pageLoaded = true;
            //alert(hasRightFlashVersion + ", " + allowedDiskSpace + ", " + browser.isIE + ", " + !browser.isOpera + ", " + !browser.isFirefox);
            if(hasRightFlashVersion && allowedDiskSpace && browser.isIE && !browser.isOpera && !browser.isFirefox) {
                callFScommand(true,true,10);
                document.getElementById("frmFlashFlag").flashInstalled.value = 0;
            }
            //if(updateTree || !browser.isIE) d.openTo(menuIdToOpen);
            document.getElementById("frmFlashFlag").submit();

    <%-- resetez id_menu_entry
         adica pun id_menu_entry=1 daca nu gaseste vreun id la urm click
         pt ca nu incarca toate id-urile in hashmap --%>
<%
    if(idMenuEntry != null) {
        request.getSession().setAttribute("id_menu_entry", "1");
    }
%>
        }
    </script>

    </HEAD>
    <BODY class="pagebg" leftMargin="0" topMargin="0" marginheight="0" marginwidth="0" onLoad="onLoadHandler();">
    <!-- ################################################### aplicatii disponibile dupa logare #####################-->
    <div id=ToolTip style="position:absolute;top:0;left:0;background:#FFFFFF;border-color:#2F6090;border-style:solid;border-width:1px 1px 1px 1px;visibility:hidden;"></div>
     <!-- asta e tabelul pentru intreaga pagina -->
    &nbsp;
    <TABLE cellSpacing="0" cellPadding="0" width="980" align="center" border="0">
    <TBODY>
        <TR>
            <TD><IMG height="10" src="images/b_tl.gif" width="14" border="0"></TD>
            <TD bgColor="#ffffff"><IMG height="10" src="images/t.gif" width="1" border="0"></TD>
            <TD><IMG height="10" src="images/b_tr.gif" width="14" border="0"></TD>
        </TR>
        <TR>
            <TD vAlign=top width=14 background="images/b_l.gif" rowSpan=2><IMG height=217 src="images/b_l1.gif" width=14 border="0"></TD>
            <TD vAlign=top width="100%" bgColor="#ffffff">
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
            <TBODY>
                <TR>
                    <td>
                    <table width="100%" cellpadding="0" cellspacing="0" border="0">
                        <tr>
                            <td rowspan="2" width="225"><html:link module="" page="/login.do?method=index"><img src="images/logo.gif" border="0"></html:link></td>
                            <td align="right">
                                <div id="appDiv" style="z-index: 999; position: relative; right:0px; top: 0px; width: 200px; height:21px;" align="right">
                                <gui:menu method="showAppMenu"/>
                            </td>
                        </tr>
                        <TR>
                            <TD>
                                <jsp:include page="templates/main/toolbar_index.jsp" />
                            </TD>
                        </TR>
                    </table>
                    </td>
                </TR>
                <TR>
                    <TD vAlign=top bgColor="#ffffff"><IMG height=7 src="images/t.gif" width=1 border="0"></TD>
                </TR>
                <TR>
                    <TD vAlign=top bgColor="#0066CC" height="24">
                    <!------------ asta este meniul ---------------->
                    <TABLE cellSpacing=0 cellPadding=0 width="100%" align=left border=0>
                    <TBODY>
                        <TR bgcolor="#0066CC" height="24">
                            <td>
                                <gui:menu method="showMenuTree" parentMenu="1"/>
                            </td>
                        </TR>
                    </TBODY>
                    </TABLE>
                    <!------------ sfarsit meniu ---------------->
                    </TD>
                </TR>
                <tr bgcolor="#FFFFFF" height="3">
                    <td></td>
                </tr>
                <!--###################################################################################################-->
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
                    <TD vAlign="top" bgColor="#e8e8e8">
                    <TABLE cellSpacing="0" cellPadding="0" width="100%" border="0">
                        <TR vAlign="top">
                            <TD WIDTH="85%">
                                <!-- tabelul cu portletul CONTENT-->
                                <gui:portlet content="portlets/callback/call_gen_content.jsp"/>
                                <!-- sfarsit tabelul cu CONTENT -->
                            </TD>
                            <td id="treeMenu">
                                <%--<gui:portlet content="portlets/portal/menuTree.jsp"/>--%>
                            </td>
                        </TR>
                    </TABLE>
                    </TD>
                </TR>
                <TR>
                <!--marginea de jos a portiunii care tine portletii -->
                    <TD vAlign="top" bgColor="#ffffff">
                    <TABLE cellSpacing="0" cellPadding="0" width="100%" border="0">
                    <TBODY>
                        <TR>
                            <TD width="10"><IMG height="10" src="images/f_bl.gif" width="10"></TD>
                            <TD bgColor="#e8e8e8"><IMG height="1" src="images/t.gif" width="1"></TD>
                            <TD width="10"><IMG height="10" src="images/f_br.gif" width="10"></TD>
                        </TR>
                    </TBODY>
                    </TABLE>
                    </TD>
                </TR>
            </TBODY>
            </TABLE>
            </TD>
            <TD vAlign="top" width="14" background="images/b_r.gif" rowSpan="2"><IMG height="217" src="images/b_r1.gif" width="14"></TD>
        </TR>
        <TR>
            <TD vAlign="top" bgColor="#ffffff"><IMG height="8" src="images/t.gif" width="1"></TD>
        </TR>
        <TR>
            <!-- ultima margine rotunjita -->
            <TD width="14"><IMG height="15" src="images/b_bl.gif" width="14"></TD>
            <TD width="744" background="images/b_b.gif"><IMG height="15" src="images/t.gif" width="1"></TD>
            <TD width="14"><IMG height="15" src="images/b_br.gif" width="14"></TD>
        </TR>
        <TR>
            <TD colspan="3" align="center" valign="middle">
                <jsp:include page="footer.jsp" />
            </TD>
        </TR>
    </TBODY>
    </TABLE>
    <gui:fcache leftMenu="1"/>
    </BODY>
</HTML>
