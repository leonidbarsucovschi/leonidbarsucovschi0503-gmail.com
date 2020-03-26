<%@ tag import="org.apache.struts.Globals" %>
<%@ tag import="java.util.Locale" %>
<%@ attribute required="true" name="leftMenu" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ tag isELIgnored="false" %>

<%
    int updateMain = 0;
    int updateLeft = 0;
    Locale cLocale = (Locale) session.getAttribute(Globals.LOCALE_KEY);
    String code = cLocale.getLanguage();

%>

<c:if test="${not empty sessionScope.SATT_P_MENU_RENDER}">
    <% updateMain = 1;%>
    <% session.removeAttribute("SATT_P_MENU_RENDER");%>
</c:if>
<c:if test="${not empty sessionScope.SATT_P_LEFT_MENU_RENDER && leftMenu==1}">
    <% updateLeft = 1;%>
    <% session.removeAttribute("SATT_P_LEFT_MENU_RENDER");%>
</c:if>


<div style="width:1px; height:1px; visibility:visible;">
    <SCRIPT LANGUAGE="JavaScript" type="text/javascript"
	    src="script/flashcache.js"></SCRIPT>
    <OBJECT
	    CLASSID="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
	    WIDTH="100%"
	    HEIGHT="100%"
	    CODEBASE="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab"
	    ID="flashRepository">
	<PARAM NAME="MOVIE" VALUE="flashSaveData.swf">
	<PARAM NAME="FLASHVARS"
	       VALUE="&updMain=<%=updateMain%>&updTree=<%=updateLeft%>&menuTree=${leftMenu}&lng=<%=code%>&">
	<PARAM NAME="PLAY" VALUE="false">
	<PARAM NAME="LOOP" VALUE="false">
	<PARAM NAME="QUALITY" VALUE="high">
	<PARAM NAME="SCALE" VALUE="SHOWALL">

	<EMBED
		NAME="flashRepository"
		SRC="flashSaveData.swf"
		WIDTH="100%"
		HEIGHT="100%"
		PLAY="false"
		FLASHVARS="&updMain=<%=updateMain%>&updTree=<%=updateLeft%>&menuTree=${leftMenu}&lng=<%=code%>&"
		LOOP="false"
		QUALITY="high"
		SCALE="SHOWALL"
		swLiveConnect="true"
		PLUGINSPAGE="http://www.macromedia.com/go/flashplayer">
	</EMBED>
    </OBJECT>
    <SCRIPT LANGUAGE="VBScript">
	<!-- // Catch FS Commands in IE, and pass them to the corresponding JavaScript function.
	Sub flashRepository_FSCommand(ByVal command,ByVal args)
	call flashRepository_DoFSCommand(command, args)
	end sub // -->
    </SCRIPT>
    <script type="text/javascript">
	hasRightFlashVersion = hasFlashVersion(7);
    <% if(updateLeft == 1) { %>
        var updateTree = true;
    <% } else { %>
        var updateTree = false;
    <% } %>
    </script>

    <form action="flashflag.jsp" id="frmFlashFlag" name="frmFlashFlag"
	  target="iframeFlashFlag" method="POST">
	<input type="hidden" name="flashInstalled" value="0">
    </form>
    <iframe width="1" height="1" src="about:blank" frameborder="0"
	    id="iframeFlashFlag" name="iframeFlashFlag"></iframe>
</div>