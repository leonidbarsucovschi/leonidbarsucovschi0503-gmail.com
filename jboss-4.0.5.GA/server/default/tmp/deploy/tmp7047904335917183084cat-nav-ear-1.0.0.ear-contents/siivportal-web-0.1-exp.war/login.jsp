<%@ page import="ro.uti.waf.config.SystemConfig"%>
<%@ page import="ro.uti.apmc.sys.util.DatabaseSysConfig"%>
<%@ page contentType="text/html; charset=iso-8859-2"%>
<%@ taglib uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean"%>
<%
  SystemConfig dbSysCfg = DatabaseSysConfig.getInstance();
  //String gsUrl = "https://172.20.100.138:8098/siiv/";
  String gsUrl = dbSysCfg.getParameter("gateSafe.url");
%>


<script>
/* submit the login form*/
function login(){
  document.getElementById('loginF').submit();
}

function checkEnterPressed(evt)
{
    var e = (window.event)? window.event : evt;
    var code = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode;
     if (code == 13) {
       login();
     }
}
</script>
<html:form action="/login.do" styleId="loginF" >
  <html:hidden property="method" value="login" />
  <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
    <TBODY>
      <TR bgcolor="#FFCC00">
        <TD style="padding:3px " class="smallbodywhitebold" align="center">
          <bean:message bundle="login" key="login.title" />
          :
        </TD>
      </TR>
      <tr>
        <td align="center">
          <table cellspacing="0" cellpadding="2" border="0">
            <tr height="10">
              <td colspan="2"></td>
            </tr>
            <logic:messagesPresent message="true">
              <html:messages id="meslogin" message="true" bundle="login">
                <tr>
                  <td valign="top" colspan="2" class="errormsg" align="center">
                    <bean:write name="meslogin" />
                  </td>
                </tr>
              </html:messages>
            </logic:messagesPresent>
            <tr>
              <td class="pageheader2">
                <bean:message bundle="login" key="login.username" />
                :
              </td>
              <td>
                <html:text property="username" style="background-color:#EEEEEE; border-style:none;width:100" />
              </td>
            </tr>
            <tr>
              <td class="pageheader2">
                <bean:message bundle="login" key="login.password" />
                :
              </td>
              <td>
                <html:password property="password" onkeypress="javascript:checkEnterPressed(event);"  style=" background-color:#EEEEEE; border-style:none;width:100" />
              </td>
            </tr>
            <tr>
              <td colspan="2" align="center" height="40" >
              <html:link href="javascript:login();" styleClass="news-table-title">
                <bean:message bundle="login" key="login.login_button" /> &raquo;
              </html:link>
            </td>
            </tr>
            <tr>
              <td colspan="2" align="center">
              <html:link href="/siiv/sys/recuperareparola.do?method=showRecuperareParola" styleClass="news-table-title">
                <bean:message bundle="login" key="login.recoverypass" />
              </html:link>
              </td>
            </tr>
            <tr>
              <td colspan="2" align="center">
                <html:submit value="login" style="visibility: hidden;" />
              </td>
            </tr>
          </table>
        </td>
      </tr>
    </TBODY>
  </TABLE>
  <html:hidden property="useCert" value="false" />
</html:form>


<%--<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>--%>
          <%--<TBODY>--%>
          <%--<TR bgcolor="#FFCC00">--%>

            <%--<TD style="padding:3px " class="smallbodywhitebold" align="center"><bean:message bundle="login" key="login.cert.title"/>:</TD>--%>
          <%--</TR>--%>
          <%--<tr>--%>
<%--<td align="center">--%>
<%--<table cellspacing="3" cellpadding="2" border="0">--%>
  <%--<tr height="10"><td></td></tr>--%>
  <%--<tr>--%>
    <%--<td align="center">--%>

      <%--<a href="<%=gsUrl%>"  class="news-table-title"><bean:message bundle="login" key="login.cert.link"/> &raquo; </a>--%>
    <%--</td>--%>
  <%--</tr>--%>
  <%--<tr height="10"><td></td></tr>--%>
<%--</table>--%>
<%--</td>--%>
<%--</tr>--%>
<%--</TBODY>--%>

<%--</TABLE>--%>
