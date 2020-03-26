<%@ page import="ro.uti.settings.util.Constants"%>
<%@ taglib uri="/WEB-INF/tld/struts/struts-bean.tld" prefix="bean" %>

<TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <TBODY>
    <TR>
        <TD colspan="2">
            <a href="/siiv/login.do?method=index"  class=page-subtitle >
                <bean:message bundle="portal" key="portal.pagina_principala"/>
            </a>
        </TD>
    </tr>

    <tr>
     <td colspan="2" ></td>
    </tr>

    <TR>
        <td>
            <img height=12 border="0"  src="images/meniustiri/siguranta_portuara.gif">
        </td>
         <TD class="menuText" nowrap="true">
            <a href="<%= "portal/vizstire.do?method=showNewsDetailList&tip_stire=" + Constants.SECURITY_NEWS %>">
             <bean:message bundle="portal"  key="portal.svm"/>
            </a>
        </TD>
    </TR>

    <tr height="1" bgcolor="#CCCCCC" >
      <td colspan="2" ></td>
    </tr>

    <TR>
        <td>
            <img height=12 border="0"  src="images/meniustiri/evenimente.gif">
        </td>
         <TD class="menuText" nowrap="true">
            <a href="<%= "portal/vizstire.do?method=showNewsDetailList&tip_stire=" + Constants.EVENTS_NEWS %>">
             <bean:message bundle="portal"  key="portal.evenimente"/>
            </a>
        </TD>
    </TR>

    <tr height="1" bgcolor="#CCCCCC">
     <td colspan="2" ></td>
    </tr>

    <TR>
        <td>
            <img height=12 border="0"  src="images/meniustiri/protectia_mediului.gif">
        </td>
         <TD class="menuText" nowrap="true">
            <a href="<%= "portal/vizstire.do?method=showNewsDetailList&tip_stire=" + Constants.PROTECTION_NEWS %>">
             <bean:message bundle="portal"  key="portal.protectia_mediului"/>
            </a>
        </TD>
    </TR>

    <tr height="1" bgcolor="#CCCCCC">
      <td colspan="2" ></td>
    </tr>

    <TR>
         <td>
            <img height=12 border="0"  src="images/meniustiri/portul_astazi.gif">
        </td>
         <TD class="menuText" nowrap="true">
            <a href="<%= "portal/vizstire.do?method=showNewsDetailList&tip_stire=" + Constants.GENERAL_NEWS %>&bifa=false">
             <bean:message bundle="portal"  key="portal.stire_general"/>
            </a>
        </TD>
    </TR>

    <tr height="1" bgcolor="#CCCCCC">
      <td colspan="2" ></td>
    </tr>

    <TR>
         <td>
            <img height=12 border="0"  src="images/meniustiri/portul_astazi.gif">
        </td>
         <TD class="menuText" nowrap="true">
            <a href="<%= "portal/vizstire.do?method=showNewsDetailList&tip_stire=" + Constants.GENERAL_NEWS %>&bifa=true">
             <bean:message bundle="portal"  key="portal.astazi"/>
            </a>
        </TD>
    </TR>
    
     <tr height="1" bgcolor="#CCCCCC">
      <td colspan="2" ></td>
    </tr>

     <TR>
         <td>
            <img height=12 border="0"  src="images/meniustiri/evenimente.gif">
        </td>
         <TD class="menuText" nowrap="true">
            <a href="<%= "portal/vizstire.do?method=showNewsDetailList&tip_stire=" + Constants.POLITICA_UE_NEWS %>&bifa=true">
             <bean:message bundle="portal"  key="portal.politica_ue"/>
            </a>
        </TD>
    </TR>

    <tr height="1" bgcolor="#CCCCCC">
      <td colspan="2" ></td>
    </tr>
  </TBODY>
</TABLE>
