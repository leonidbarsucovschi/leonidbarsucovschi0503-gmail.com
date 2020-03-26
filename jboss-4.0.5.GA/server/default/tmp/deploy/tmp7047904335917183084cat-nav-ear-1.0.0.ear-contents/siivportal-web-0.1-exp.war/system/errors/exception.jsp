<%@ page pageEncoding="UTF-8" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib  uri="/WEB-INF/sys.tld" prefix="sys"%>
<%
  String path = request.getContextPath();
%>
<HTML>
  <HEAD>
    <TITLE>
     Error
    </TITLE>
   <sys:base/>


    <link rel="stylesheet" type="text/css" media="screen" href="<%=path%>/css/global_styles.css">
    <link rel="stylesheet" type="text/css" media="screen" href="<%=path%>/css/page_styles.css">
    <link rel="stylesheet" type="text/css" media="screen" href="<%=path%>/css/element_styles.css">

  </HEAD>
  <BODY class="pagebg" leftMargin="0" topMargin="0" marginheight="0" marginwidth="0">
<!-- ################################################### aplicatii disponibile dupa logare #####################-->
<!-- asta e tabelul pentru intreaga pagina -->
<TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <TBODY>

  <TR>
    <TD><IMG height="10" src="<%=path%>/images/b_tl.gif" width="14" border="0"></TD>
    <TD bgColor="#ffffff"><IMG height="10" src="<%=path%>/images/t.gif" width="1" border="0"></TD>
    <TD><IMG height="10" src="<%=path%>/images/b_tr.gif" width="14" border="0"></TD></TR>
  <TR>
    <TD vAlign=top width=14 background="<%=path%>/images/b_l.gif" rowSpan=2><IMG height=217 src="<%=path%>/images/b_l1.gif" width=14 border="0"></TD>
    <TD vAlign=top width="100%" bgColor="#ffffff">
      <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD vAlign=top bgColor="#ffffff">
          &nbsp;
              </TD>
            </TR>
            <TR>
              <TD vAlign=top bgColor="#ffffff"><IMG height=7 src="<%=path%>/images/t.gif" width=1 border="0"></TD>
            </TR>
            <TR>
                <TD vAlign=top bgColor="#ffffff">

                    <TABLE cellSpacing=0 cellPadding=0 width="100%" align=left border=0>
                    <TBODY>
                    <TR bgcolor="#0066CC" height="24" width="100%">
                    <td align="right" valign="middle" class="label-footer">
                    <!-- aici intra meniul daca e bagat ca la ZEUS si se sterge cel de sus-->
                    </td>
                    </TR>
                    </TBODY>
                </TABLE>

               </TD>
            </TR>
            <tr bgcolor="#FFFFFF" height="3"><td></td></tr>


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

        <TR>
          <TD vAlign=top bgColor="#e8e8e8">
            <TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
            <TBODY>
              <TR vAlign=top>
                      <TD WIDTH="100%" align="center" valign="top" bgcolor="white" height="600">

                        <h2>System error</h2>
                        Cererea dvs nu a putut fi procesata. Daca eroarea persista contactati administratorul sistemului.<br>                        
                        Va multumim pentru intelegere.
                      </TD>
                        </TR>
                        </TBODY></TABLE></TD></TR>
        <TR><!--marginea de jos a portiunii care tine portletii -->
          <TD vAlign=top bgColor="#ffffff">
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
              <TR>
                <TD width=10><IMG height=10 src="<%=path%>/images/f_bl.gif" width=10></TD>
                <TD bgColor="#e8e8e8"><IMG height=1 src="<%=path%>/images/t.gif" width=1></TD>
                <TD width=10><IMG height=10 src="<%=path%>/images/f_br.gif"  width=10></TD>
              </TR>
              </TBODY>
            </TABLE>
          </TD>
        </TR>
        </TBODY>
       </TABLE>
    </TD>
    <TD vAlign=top width=14 background="<%=path%>/images/b_r.gif" rowSpan=2><IMG height=217 src="<%=path%>/images/b_r1.gif" width=14>
    </TD>
  </TR>
  <TR>
    <TD vAlign=top bgColor="#ffffff"><IMG height=8 src="<%=path%>/images/t.gif" width=1></TD>
  </TR>
  <TR><!-- ultima margine rotunjita -->
    <TD width=14><IMG height=15 src="<%=path%>/images/b_bl.gif" width=14></TD>
    <TD width=744 background="<%=path%>/images/b_b.gif"><IMG height=15 src="<%=path%>/images/t.gif" width=1></TD>
    <TD width=14><IMG height=15 src="<%=path%>/images/b_br.gif"  width=14></TD>
  </TR>
  <TR>

    <TD colspan="3" align="center" valign="middle">
      <jsp:include page="/footer.jsp"/>
    </TD>

   </TR>
   </TBODY>
</TABLE>
<P></P>

</BODY></HTML>