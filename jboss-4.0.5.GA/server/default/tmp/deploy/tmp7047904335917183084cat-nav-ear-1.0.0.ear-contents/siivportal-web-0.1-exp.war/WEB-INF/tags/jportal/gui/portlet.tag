<%@ attribute name="content" required="true"%>
<%@ tag isELIgnored="false" %>

<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
  <TBODY>
    <TR>
      <TD bgColor=#ffffff>
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
                <jsp:include page="${content}"/>                                
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
