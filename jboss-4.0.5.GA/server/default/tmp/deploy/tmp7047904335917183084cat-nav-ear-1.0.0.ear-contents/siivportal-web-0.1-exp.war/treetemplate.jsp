<%--
  Created by IntelliJ IDEA.
  User: Pavel Dan Gabriel
  Date: Aug 29, 2005
  Time: 12:50:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Hashtable,ro.uti.waf.web.action.JPortalActionContext" %>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib  uri="/WEB-INF/gui.tld" prefix="gui"%>
<%@ page isELIgnored="false" %>

<HTML>
  <HEAD>
   <html:base/>
    <META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
    <link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/css/global_styles.css">
    <link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/css/page_styles.css">
    <link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/css/element_styles.css">
    <link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/css/dtree.css">
    <link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/css/display.css">



&nbsp;

    <link rel="stylesheet" href="css/menu_styles.css" type="text/css">
    <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/displaytag.css"/>
    <link type="text/css" rel="stylesheet" href='<%=request.getContextPath()%>/jscalendar/calendar-win2k-1.css'/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/jscalendar/calendar.js" language="JavaScript"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/jscalendar/lang/calendar-en.js" language="JavaScript"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/jscalendar/lang/calendar-ro.js" language="JavaScript"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/jscalendar/calendar-setup.js" language="JavaScript"></script>
    <script type="text/javascript" language="javascript" src="<%=request.getContextPath()%>/js/template.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/script/jportal.js" language="JavaScript"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/script/dtree.js" language="JavaScript"></script>
    <script>
               function alegeTip(_id,_denumire){
                 var id = _id;
                 //var el = document.getElementById('id');
                 var denumire = _denumire;
                 //alert("id="+id);
                 //alert("denumire="+denumire);
                 if(window.opener){
                   window.opener.setParinte(id,denumire);
                 }
               }
               function alegeFirma(id_firma,den_firma,adresa_principala,cui,telefon,fax,email,statut) {
                  if(window.opener){
                   window.opener.setFirma(id_firma,den_firma,adresa_principala,cui,telefon,fax,email,statut);
                 }
               }
               function alegeLDAP(issuer_name,serial_number) {
                  if(window.opener) {
                   window.opener.setLDAP(issuer_name,serial_number);
                 }
               }
   </script>
  </HEAD>
  <BODY class="pagebg" leftMargin="0" topMargin="0" marginheight="0" marginwidth="0">
<!-- ################################################### aplicatii disponibile dupa logare #####################-->
<div>
<!-- asta e tabelul pentru intreaga pagina -->
<TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <TBODY>

  <TR>
    <TD><IMG height="10" src="images/b_tl.gif" width="14" border="0"></TD>
    <TD bgColor="#ffffff"><IMG height="10" src="images/t.gif" width="1" border="0"></TD>
    <TD><IMG height="10" src="images/b_tr.gif" width="14" border="0"></TD></TR>
  <TR>
    <TD vAlign=top width=14 background="images/b_l.gif" rowSpan=2><IMG height=217 src="images/b_l1.gif" width=14 border="0"></TD>
    <TD vAlign=top width="100%" bgColor="#ffffff">
      <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>

		    <TR>
			  <TD vAlign=top bgColor="#ffffff"><IMG height=7 src="images/t.gif" width=1 border="0"></TD>
		    </TR>

			<tr bgcolor="#FFFFFF" height="3"><td></td></tr>





<!--###################################################################################################-->

			<tr bgcolor="#E8E8E8">
				<td>
					<table cellspacing="0" cellpadding="0" border="0" width="100%">
						<tr>
							<td valign="top">

							</td>
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
					  <TD WIDTH="100%" align="center" valign="top">
              <!-- start tabelul cu CONTENT -->
              <gui:portlet content="portlets/callback/call_gen_content.jsp"/>
				     <!-- sfarsit tabelul cu CONTENT -->
					  </TD>
						</TR>
						</TBODY></TABLE></TD></TR>
        <TR><!--marginea de jos a portiunii care tine portletii -->
          <TD vAlign=top bgColor="#ffffff">
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
              <TR>
                <TD width=10><IMG height=10 src="images/f_bl.gif" width=10></TD>
                <TD bgColor="#e8e8e8"><IMG height=1 src="images/t.gif" width=1></TD>
                <TD width=10><IMG height=10 src="images/f_br.gif"  width=10></TD>
			  </TR>
			  </TBODY>
			</TABLE>
		  </TD>
		</TR>
		</TBODY>
	   </TABLE>
	</TD>
    <TD vAlign=top width=14 background="images/b_r.gif" rowSpan=2><IMG height=217 src="images/b_r1.gif" width=14>
	</TD>
  </TR>
  <TR>
    <TD vAlign=top bgColor="#ffffff"><IMG height=8 src="images/t.gif" width=1></TD>
  </TR>
  <TR><!-- ultima margine rotunjita -->
    <TD width=14><IMG height=15 src="images/b_bl.gif" width=14></TD>
    <TD width=744 background="images/b_b.gif"><IMG height=15 src="images/t.gif" width=1></TD>
    <TD width=14><IMG height=15 src="images/b_br.gif"  width=14></TD>
  </TR>
   </TBODY>
</TABLE>
<P></P>

</BODY></HTML>