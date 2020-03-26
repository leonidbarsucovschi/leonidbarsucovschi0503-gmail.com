<%@ page import="ro.uti.waf.web.action.JPortalActionContext"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib  uri="/WEB-INF/gui.tld" prefix="gui"%>
<%@ taglib uri="/WEB-INF/jpdisplaytag.tld" prefix="display"%>
<%@ taglib  uri="/WEB-INF/sys.tld" prefix="sys"%>
<%@ page isELIgnored="false" %>

<HTML>
  <HEAD>
    <TITLE>
      <bean:message bundle="portal" key="portal.titlu_port" />
    </TITLE>
    <sys:base/>
    <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
    <link rel="stylesheet" type="text/css" media="screen" href="<%= request.getContextPath() %>/css/global_styles.css">
    <link rel="stylesheet" type="text/css" media="screen" href="<%= request.getContextPath() %>/css/page_styles.css">
    <link rel="stylesheet" type="text/css" media="screen" href="<%= request.getContextPath() %>/css/element_styles.css">
    <link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/css/display.css">
    &nbsp;


    <link rel="stylesheet" href="css/menu_styles.css" type="text/css">
    <link type="text/css" rel="stylesheet" href="<%= request.getContextPath() %>/css/displaytag.css" />
    <link type="text/css" rel="stylesheet" href='<%= request.getContextPath() %>/jscalendar/calendar-win2k-1.css' />
    <script type="text/javascript" src="<%= request.getContextPath() %>/jscalendar/calendar.js" language="JavaScript"></script>
    <script type="text/javascript" src="<%= request.getContextPath() %>/jscalendar/lang/calendar-en.js" language="JavaScript"></script>
    <script type="text/javascript" src="<%= request.getContextPath() %>/jscalendar/lang/calendar-ro.js" language="JavaScript"></script>
    <script type="text/javascript" src="<%= request.getContextPath() %>/jscalendar/calendar-setup.js" language="JavaScript"></script>
    <script type="text/javascript" src="<%= request.getContextPath() %>/script/jportal.js" language="JavaScript"></script>
    <script language="javascript">var pageLoaded=false;</script>
  </HEAD>
  <BODY class=pagebg leftMargin="0" topMargin="0" marginheight="0" marginwidth="0" onLoad="javascript:pageLoaded=true;">
    <!-- ################################################### aplicatii disponibile dupa logare #####################-->
    <div style="z-index: 999; position: absolute; right:0px; top: 30px; width: 200px; height:21px;" align="right"/>
    <gui:menu method="showAppMenu"/>
    <gui:menu method="showMenuTree" parentMenu="1"/>
      <!-- asta e tabelul pentru intreaga pagina -->
      <TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
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
                    <TD vAlign=top bgColor="#ffffff">
                      <jsp:include page="/templates/main/toolbar_index.jsp" />
                    </TD>
                  </TR>
                  <TR>
                    <TD vAlign=top bgColor="#ffffff"><IMG height=7 src="images/t.gif" width=1 border="0"></TD>
                  </TR>
                  <TR>
                    <TD vAlign=top bgColor="#ffffff">
                      <!------------ asta este meniul ---------------->
                      <TABLE cellSpacing=0 cellPadding=0 width="100%" align=left border=0>
                        <TBODY>
                          <TR bgcolor="#0066CC" height="24" width="100%">
                            <td align="right" valign="middle" class="label-footer">
                              <!-- aici intra meniul daca e bagat ca la ZEUS si se sterge cel de sus-->
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
            <!-------------- asta este table row-ul care contine portletzii...primii sunt pusi intr-o celula iar ceilalti in alta celula care pare sa se intinda pe tot restul paginii...-->
            <TR>
              <TD vAlign=top bgColor="#e8e8e8">
                <TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
                  <TBODY>
                    <TR vAlign=top>
                      <TD WIDTH="15%">
                          <table>
                              <tr>
                                  <td>
                                      <gui:portlet content="portlets/portal/menuTree.jsp"/>
                                  </td>
                                  </tr>
                            <tr>
                                  <td>
                                      <gui:portlet content="portlets/portal/stiri_left_menu.jsp"/>
                                  </td>
                              </tr>
                          </table>
                        <!-- start tabelul cu STIRI -->
                        <!-- sfarsit tabelul cu STIRI -->
                      </TD>
                      <TD WIDTH="85%" valign="top">
                        <!-- tabelul cu portletul CONTENT-->
                        <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                          <TBODY>
                            <TR>
                              <TD bgColor="#ffffff">
                                <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                                  <TBODY>
                                    <TR>
                                      <TD width=10><IMG height=10 src="images/e_tl.gif" width=10></TD>
                                      <TD background="images/e_t.gif"><IMG height=10 src="images/t.gif" width=3></TD>
                                      <TD width=10><IMG height=10 src="images/e_tr.gif" width=11></TD>
                                    </TR>
                                    <TR>
                                      <TD width=10 background="images/e_l.gif"><IMG height=4 src="images/e_l.gif" width=10></TD>
                                      <TD bgColor="#ffffff">
                                        <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0" width="800" height="480" id="intro" align="middle">
                                            <param name="allowScriptAccess" value="sameDomain" />
                                            <param name="movie" value="interactivemap.swf" />
                                            <param name="FlashVars" value="&currentlang=<%=JPortalActionContext.getActionContext().getCurrentLanguageId()%>&timetoolbarout=3&picturespath=images/&pics=map_big.jpg,nord_big.jpg,sud_big.jpg&thmbprefix=thumb_&picsNamesRO=Harta mare,Partea Nord,Partea Sud&picsNamesEN=Big Map,North Side,South Side&" />
                                            <param name="quality" value="high" />
                                            <param name="scale" value="noscale" />
                                            <param name="wmode" value="transparent" />
                                            <param name="bgcolor" value="#ffffff" />
                                            <embed src="interactivemap.swf" flashvars="&currentlang=<%=JPortalActionContext.getActionContext().getCurrentLanguageId()%>&timetoolbarout=3&picturespath=images/&pics=map_big.jpg,nord_big.jpg,sud_big.jpg&thmbprefix=thumb_&picsNamesRO=Harta mare,Partea Nord,Partea Sud&picsNamesEN=Big Map,North Side,South Side&" quality="high" scale="noscale" wmode="transparent" bgcolor="#ffffff" width="800" height="480" name="intro" align="middle" allowScriptAccess="sameDomain" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />
                                        </object>
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
                              </TD>
                            </TR>
                          </TBODY>
                        </TABLE>
                        <!-- sfarsit tabelul cu CONTENT -->
                      </TD>
                    </TR>
                  </TBODY>
                </TABLE>
              </TD>
            </TR>
                  <TR>
                    <!--marginea de jos a portiunii care tine portletii -->
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
          <TR>
            <!-- ultima margine rotunjita -->
            <TD width=14><IMG height=15 src="images/b_bl.gif" width=14></TD>
            <TD width=744 background="images/b_b.gif"><IMG height=15 src="images/t.gif" width=1></TD>
            <TD width=14><IMG height=15 src="images/b_br.gif" width=14></TD>
          </TR>
          <TR>
            <TD colspan="3" align="center" valign="middle">
              <jsp:include page="footer.jsp" />
            </TD>
          </TR>
        </TBODY>
      </TABLE>
      <P></P>
    </BODY>
</HTML>