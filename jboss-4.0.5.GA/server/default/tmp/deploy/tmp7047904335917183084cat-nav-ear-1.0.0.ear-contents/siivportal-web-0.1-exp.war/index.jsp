<%@ page import="ro.uti.settings.util.Constants" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/gui.tld" prefix="gui" %>
<%@ taglib uri="/WEB-INF/sys.tld" prefix="sys" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page pageEncoding="UTF-8" %>
<HTML>
<HEAD>
    <TITLE>
        <bean:message bundle="portal" key="portal.titlu"/>
    </TITLE>
    <sys:base/>
    <META NAME="Description" CONTENT='Serviciul Vamal Moldova (S.V.M.) avand rolul de autoritate vamala a Republicii Moldova isi propune sa ofere servicii de calitate si competitive tuturor clientilor'>
    <META NAME="Keywords" CONTENT="svm vama vamal moldova romania vami taxa frontiera control">

    <LINK REL="SHORTCUT ICON" href="favicon.ico">
    <link rel="stylesheet" type="text/css" media="screen"
          href="<%= request.getContextPath() %>/css/page_styles.css">
    <link rel="stylesheet" type="text/css" media="screen"
          href="<%= request.getContextPath() %>/css/index.css">

<script type="text/javascript">
    var pageLoaded = false;
    var indexPage = true;
    var hasRightFlashVersion = false;
    var allowedDiskSpace = true;
    var treeMenuLoaded = false;
    var mainMenuLoaded = false;
    var startedMenus = false;

    function onLoadHandler() {
        pageLoaded = true;
        //alert(hasRightFlashVersion + ", " + allowedDiskSpace + ", " + browser.isIE + ", " + !browser.isOpera + ", " + !browser.isFirefox);
        if (hasRightFlashVersion && allowedDiskSpace && browser.isIE && !browser.isOpera && !browser.isFirefox) {
            callFScommand(true, false, 10);
            document.getElementById("frmFlashFlag").flashInstalled.value = 0;
        }
        document.getElementById("frmFlashFlag").submit();
    }
</script>

</HEAD>

<BODY class="pagebg" leftMargin="0" topMargin="0" marginheight="0" marginwidth="0" onLoad="onLoadHandler();">
&nbsp;
<TABLE cellSpacing="0" cellPadding="0" width="980" align="center" border="0">
<TBODY>
    <TR>
        <TD><IMG height="10" src="images/b_tl.gif" width="14" border="0"></TD>
        <TD bgColor="#ffffff"><IMG height="10" src="images/t.gif" width="1" border="0"></TD>
        <TD><IMG height="10" src="images/b_tr.gif" width="14" border="0"></TD>
    </TR>
    <TR>
        <TD vAlign="top" width="14" background="images/b_l.gif" rowSpan="2"><IMG height="217" src="images/b_l1.gif" width="14" border="0"></TD>
        <TD vAlign="top" width="100%" bgColor="#ffffff">
        <TABLE cellSpacing="0" cellPadding="0" width="100%" border="0">
        <TBODY>
            <tr>
                <td>
                <table width="100%" cellpadding="0" cellspacing="0" border="0">
                    <tr>
                        <td rowspan="2" width="225"><html:link module="" page="/login.do?method=index">
                            <img src="images/logo.gif" border="0"></html:link></td>
                        <td align="right">
                            <div id="appDiv" align="right"
                                 style="z-index: 999; position: relative; right:0px; top: 0px; width: 200px; height:21px;">
                                <gui:menu method="showAppMenu"/>
                        </td>
                    </tr>
                    <TR>
                        <TD>
                            <jsp:include page="templates/main/toolbar_index.jsp"/>
                        </TD>
                    </TR>
                </table>
                </td>
            </tr>
            <TR>
                <TD vAlign="top" bgColor="#ffffff"><IMG height="7" src="images/t.gif" width="1" border="0"></TD>
            </TR>
            <TR>
                <TD vAlign="top" bgColor="#ffffff" height="24">
                <!------------ asta este meniul ---------------->
                <TABLE cellSpacing="0" cellPadding="0" width="100%" align="left" border="0">
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
            <tr>
                <td>
                <table cellspacing="0" cellpadding="0" border="0" width="100%">
                    <tr>
                        <td valign="top">
                        <TABLE cellspacing="0" cellpadding="0" width="100%" border="0">
                        <TBODY>
                            <TR>
                                <TD width="10"><IMG height="10" src="images/e_tl.gif" width="10"></TD>
                                <TD background="images/e_t.gif"><IMG height="10" src="images/e_t.gif" width="3"></TD>
                                <TD width="10"><IMG height="10" src="images/e_tr.gif" width="11"></TD>
                            </TR>
                            <TR>
                                <TD width="10" background="images/e_l.gif"><IMG height="4" src="images/e_l.gif" width="10"></TD>
                                <TD bgColor="#ffffff">
                                <TABLE cellSpacing="0" cellPadding="0" width="100%" border="0">
                                <TBODY>
                                    <TR>
                                        <TD>
                                        <TABLE cellSpacing="1" cellPadding="0" width="100%" border="0">
                                        <TBODY>
                                            <TR>
                                                <TD class="prez-portlet-left" style="padding:5px;" width="30%">
                                                    <h5><bean:message bundle="portal" key="portal.titlu"/></h5>
                                                    <bean:message bundle="portal" key="portal.descriere"/>
                                                </TD>
                                                <td align="left" bgcolor="#6C2630" width="470">
                                                    <img src='<bean:message bundle="portal" key="portal.header"/>' id="pozaPort" width="470" height="200" border="0" style="vertical-align:middle"></td>
                                                <TD class="prez-portlet-right" background="images/bgweather.jpg"
                                                    style="background-repeat:no-repeat; background-position:left;"
                                                    align="center"
                                                    valign="middle"
                                                    width="33%"></TD>
                                            </TR>
                                        </TBODY>
                                        </TABLE>
                                        </TD>
                                    </TR>
                                </TBODY>
                                </TABLE>
                                </TD>
                                <TD width="11" background="images/e_r.gif"><IMG  height="5" src="images/e_r.gif" width="11"></TD>
                            </TR>
                            <TR>
                                <TD width="10"><IMG height="10" src="images/e_bl.gif" width="10"></TD>
                                <TD background="images/e_b.gif"><IMG height="10" src="images/e_b.gif" width="3"></TD>
                                <TD width="11"><IMG height="10" src="images/e_br.gif" width="11"></TD>
                            </TR>
                        </TBODY>
                        </TABLE>
                        </td>
                    </tr>
                </table>
                </td>
            </tr>
<!--------------
        asta este table row-ul care contine portletzii
        primii sunt pusi intr-o celula iar ceilalti in alta celula care pare sa se intinda pe tot restul paginii
-->
            <TR>
                <TD vAlign="top" bgColor="#e8e8e8">
                <TABLE cellSpacing="0" cellPadding="0" width="100%" align="center" border="0">
                <TBODY>
                    <TR vAlign="top">
                        <TD WIDTH="40%">
                        <!-- start tabelul cu EVENIMENTE -->
                        <gui:news_generic key="portal.evenimente"
                                          bundle="portal"
                                          method="showPortletList"
                                          type="<%=Constants.EVENTS_NEWS%>"/>
                        <%--<gui:portlet content="/portlets/callback/call_link_utile.jsp"/>--%>
                        </TD>
                        <TD WIDTH="60%">
                        <gui:news key="portal.astazi"
                                  bundle="portal"
                                  method="showPortletList"
                                  type="<%=Constants.GENERAL_NEWS%>"
                                  bifa="true"/>
                        </TD>
                    </TR>
                </TBODY>
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
        <jsp:include page="footer_index.jsp"/>
    </TR>
</TBODY>
</TABLE>
<gui:fcache leftMenu="0"/>
<div style="width:1px; height:1px; visibility:hidden; overflow:hidden;" id="hiddenFlash">
  <script type="text/javascript" src="script/flashcontent.js"></script>
  <script type="text/javascript" src="script/flashdetect.js"></script>
</div>
</BODY>
</HTML>
