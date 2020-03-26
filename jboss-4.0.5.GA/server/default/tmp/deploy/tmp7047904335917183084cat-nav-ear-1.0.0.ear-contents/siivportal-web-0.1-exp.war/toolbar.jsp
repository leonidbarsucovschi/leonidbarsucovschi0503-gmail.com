<%@ page import="ro.uti.waf.web.action.JPortalActionContext"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-html.tld" prefix="html" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-logic.tld" prefix="logic" %>
<%@ taglib  uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!-- tabelul cu portletul APLICATII -->
<TABLE cellSpacing="0" cellPadding="0" width="400" border="0" align="right">
<TBODY>
    <TR>
        <TD width=10 height=4></TD>
        <TD>
        <%
            ro.uti.waf.security.User user = (ro.uti.waf.security.User)session.getAttribute(ro.uti.waf.base.simple.util.Constants.USER_KEY);
        //	if (user != null) {
        %>
        <form name="form_SearchForms" method="get" action="/siiv/s.do">
        <TABLE cellSpacing="0" cellPadding="0" align="right" border="0">
        <TBODY>
            <TR>
            <%-- just for filling unused space without redimensioning existing cells  --%>
                 <td></td>
            <c:if test="${empty user}">
                <td class="menuText" align="right" nowrap style="padding-left:5px;padding-right:5px">
                    <a href="/siiv/sys/admuserinreg.do?method=showAdd">
                        <img border="0" src="images/toolbar/reg_user.gif" align="absmiddle">
                        &nbsp;<bean:message bundle="portal" key="index.link.inreg"/>
                    </a>&nbsp;|&nbsp;
                </td>
            </c:if>
                <td class="menuText" align="right" nowrap style="padding-left:5px;padding-right:5px">
                    <a href="/siiv/portal/mesajsite.do?method=showAdd">
                        <img border="0" src="images/toolbar/contact_icon.gif" align="absmiddle">
                        &nbsp;<bean:message bundle="portal" key="index.link.contact"/>
                    </a>&nbsp;|&nbsp;
                </td>
                <td class="menuText" align="right" nowrap style="padding-left:5px;padding-right:5px">
                    <a href="/siiv/portal/static.do?package_id=acces_inf_publice&x=load">
                        <img border="0" src="images/toolbar/contact_icon.gif" align="absmiddle">
                        &nbsp;<bean:message bundle="portal" key="index.link.informatii"/>
                    </a>&nbsp;|&nbsp;
                </td>
                <td align="center" nowrap style="padding-left:1px;padding-right:5px">
                    <input type="hidden" name="method" value="show">
                    <input type="hidden" name="page"/>
                    &nbsp;
                    <input type="text" class="input-toolbar" name="query" value=""
                           title="<bean:message bundle="portal" key="index.link.search"/>" onFocus="this.value=''"/>
                    <a href="javascript:document.form_SearchForms.submit();">
                        <img border="0" src="images/toolbar/search_btn_sus.gif" align="absmiddle"
                             title="<bean:message bundle="portal" key="index.link.search"/>">
                    </a>
                </td>
            <c:if test="${not empty user}">
                <TD align="left" class="menuText" style="cursor:pointer;padding-left:2px" width="130" nowrap valign="middle" >
                    <img height=12 border="0" src="images/aplicatii_icon.gif" align="top"
                         onmouseover="onApplicationMenuMouseOver();"
                         onmouseout="onApplicationMenuMouseOut();">
                    <a href="javascript:onApplicationMenuMouseOver();"
                       onmouseover="onApplicationMenuMouseOver();"
                       onmouseout="onApplicationMenuMouseOut();" >
                         <bean:message bundle="portal"  key="portal.meniu_aplicatii"/>
                    </a>
                </TD>
            </c:if>
            </TR>
        </TBODY>
        </TABLE>
        </form>
        </TD>
        <TD width=10 height=5></TD>
    </TR>
</TBODY>
</TABLE>
<!-- sfarsit tabelul cu APPLICATIILE-->

</div>
<c:if test="${not empty user}">
    <div id="app_table_div" style="z-index:1000; visibility:hidden; position:absolute; top:30; left:180">
    <table border="1" bordercolor="#CCCCCC" cellpadding=2 cellspacing=1  class="admin-menu" width="200" id="app_table" align="right" >
    <logic:iterate id="appEntry" name="form_MenuForm" property="appEntries">
        <tr>
            <td>
                <a onmouseover="setAppMenuOn();" onmouseout="setAppMenuOff();"
                   href='<%=request.getContextPath()%>/menu.do?method=appClick&parentMenuId=<bean:write name="appEntry" property="entryVO.id_menu_entry" format=""/>'
                   class="footer">- <bean:write name="appEntry" property="name"/> &raquo;
                </a>
            </td>
        </tr>
    </logic:iterate>
    </table>
    </div>
</c:if>
