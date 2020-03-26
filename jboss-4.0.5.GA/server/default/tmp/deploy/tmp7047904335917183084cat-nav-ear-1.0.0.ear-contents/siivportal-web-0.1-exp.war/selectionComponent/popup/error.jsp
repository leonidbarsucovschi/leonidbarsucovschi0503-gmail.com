
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
    <head>
        <META http-equiv="Content-Type" content="text/html; charset=iso-8859-2">
        <html:base/>

        <title><bean:message name="<%=Constants.SELECTION_PARAMS%>" property="label" bundle="<%=Constants.MESSAGE_BUNDLE%>"/></title>
        <link type="text/css" rel="stylesheet" href="../css/styles.css"/>
        <link type="text/css" rel="stylesheet" href="../css/tab.css"/>
<!--        <link type="text/css" rel="stylesheet" href="../resources/calendar/popcalendar.css"/>-->

    </head>

    <body>
        <br>
        <br>
        <br>
        <table width="50%" cellspacing="0" cellpadding="0" border="0" bgcolor="white" align="center">
        <!-- Sectiune de Afisare Erori. -->
        <logic:messagesPresent message="false">
            <tr>
              <td class="errormsg" align="center">
                <bean:message key="errors.header.title"/>:
              </td>
            </tr>
          <html:messages message="false" id="error" bundle="<%=Constants.MESSAGE_BUNDLE%>">
            <tr>
              <td class="errormsg" align="center">
                <img src="../resources/images/error.gif" border="0" align="absmiddle">
                  <bean:write name="error" ignore="true"/>
              </td>
            </tr>
          </html:messages>
        </logic:messagesPresent>
        <!-- END Sectiune de Afisare Erori. -->
        <!-- Sectiune de Afisare Mesaje. -->
        <logic:messagesPresent message="true">
          <html:messages message="true" id="message" bundle="<%=Constants.MESSAGE_BUNDLE%>">
            <tr>
              <td class="errormsg" align="center">
                <img src="../resources/images/note.gif" border="0" align="absmiddle">
              </td>
              <td width="80%" class="note" align="center">
                  <bean:write name="message" ignore="true"/>
              </td>
            </tr>
          </html:messages>
        </logic:messagesPresent>
        <!-- END Sectiune de Afisare Mesaje. -->
        </table>
    </body>
</html:html>>
