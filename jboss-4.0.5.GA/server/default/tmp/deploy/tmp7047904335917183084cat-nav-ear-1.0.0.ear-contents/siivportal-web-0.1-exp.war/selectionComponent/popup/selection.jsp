<%@page import="ro.uti.waf.components.selectionComponent.selectionPopup.*,
                ro.uti.waf.components.selectionComponent.selectionPopup.ejb.*,
                ro.uti.waf.components.selectionComponent.selectionPopup.type.*,
                ro.uti.waf.components.selectionComponent.selectionPopup.web.*,
                org.apache.struts.Globals"%>
<%@ page contentType="text/html; charset=iso-8859-2" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib  uri="/WEB-INF/sys.tld" prefix="sys"%>
<%@ page isELIgnored="false" %>
    <head>
        <META http-equiv="Content-Type" content="text/html; charset=iso-8859-2">
   <sys:base suffix="selectionComponent/popup/selection.jsp"/>
    <link type="text/css" rel="stylesheet" href="../resources/css/menu.css" >
    <link type="text/css" rel="stylesheet" href="../resources/css/styles.css">
    <link type="text/css" rel="stylesheet" href="../resources/css/tab.css">
<!--    <link type="text/css" rel="stylesheet" href="../resources/calendar/popcalendar.css" >-->

    <script type="text/javascript" src="../script/hashtable.js" language="JavaScript"></script>
    <script type="text/javascript" src="../script/gselect.js" language="JavaScript"></script>
    <script type="text/javascript" src="../resources/calendar/popcalendar.js" language="JavaScript"></script>
<%System.out.println("!!!!!!selection"); %>
<script > columnProperties = new Array();</script>
<bean:define id="selParams" name="<%=Constants.SELECTION_PARAMS%>" scope="session" type="SelectionCaseParams"/>
<bean:define id="selectionCase" name="<%=Constants.SELECTION_PARAMS%>" property="selectionCase"  type="SelectionCase"/>
<%System.out.println("!!!!!!after define"); %>

    <body onload="parent.resizeWindow(myWindow);"
	 		 onmouseup="parent.dropIt()"
			 onmousemove="parent.dragIt(event)"
			 onclick="parent.bringToFront(myWindow)">

    <html:form action="/initSelect" method="post" styleId="theForm">

  <table id="window_table" border="1" cellpadding="0" cellspacing="0" width="100%">
     <tr>
        <td style="background-color: #0066CC; height: 10px; font-size: 10px; overflow: hidden; cursor: move;" width='99%'
              onmousedown="parent.pickIt(myWindow,event);">
            <font color="White"><b>&nbsp;
<%--             <%=Util.getMessage(pageContext,selParams.getLabel(),selectionCase.getBundle(), selectionCase.getModule())%>--%>
             <bean:message bundle="<%=selectionCase.getBundle()%>" key="<%=selParams.getLabel()%>"/>
             &nbsp;</b></font></td>
        <td style="background-color: Silver; border: groove; cursor: pointer; height:10px; font-size:10px;"
            onclick="parent.closeFrame(myWindow);"
            onselectstart="event.cancelBubble=true;event.returnValue=false;"
            onmouseup="this.style.border='groove';"
            onmouseout="this.style.border='groove';"
            onmousedown="this.style.border='ridge';">&nbsp;X&nbsp;</td>
     <tr><td colspan="2">

        <table bgcolor="#ffffff" width="99%" align="center" border="20" bordercolor="#D4D0C8" cellpadding="5" cellspacing="0">
          <tr id="tabs_row">
            <td onclick="parent.selectionWindow=myWindow;document.getElementById('theForm').submit();" style="cursor: pointer;"
                <logic:equal value="true" name="<%=Constants.SELECTION_FORM%>" property="showSearchTab">class="tableDesc"</logic:equal>
                <logic:notEqual value="true" name="<%=Constants.SELECTION_FORM%>" property="showSearchTab">class="tableHeader"</logic:notEqual>>
              <bean:message key="gs.records.tab"  bundle="<%=Constants.MESSAGE_BUNDLE%>"/>
            </td>
            <td onclick="show_tab('fltr', 'art', this);" style="cursor: pointer;"

                <logic:equal value="true" name="<%=Constants.SELECTION_FORM%>" property="showSearchTab">class="tableHeader"</logic:equal>
                <logic:notEqual value="true" name="<%=Constants.SELECTION_FORM%>" property="showSearchTab">class="tableDesc"</logic:notEqual>>
              <bean:message key="gs.filters.tab"  bundle="<%=Constants.MESSAGE_BUNDLE%>"/>
            </td>
            <td width="90%">&nbsp;</td>
          </tr>

          <%--RESULT TABLE--%>
        <logic:notEqual value="true" name="<%=Constants.SELECTION_FORM%>" property="showSearchTab">
          <tr id="art" style="height: 400px;" align="center" valign="top">
            <td colspan=3 class="tableHeader">
                <jsp:include page="records.jsp" flush="true"/>
            </td>
          </tr>
        </logic:notEqual>

          <%--FILTERS--%>
        <logic:equal value="true" name="<%=Constants.SELECTION_FORM%>" property="showSearchTab">
          <tr id="fltr" style="height: 400px;width=100%">
        </logic:equal>
        <logic:notEqual value="true" name="<%=Constants.SELECTION_FORM%>" property="showSearchTab">
          <tr id="fltr" style="display: none;height: 400px;">
        </logic:notEqual>
            <td colspan=3 class="tableHeader" align="center" valign="middle">

                <div style="position: absolute;" id="filterdiv">
                  <jsp:include page="filters.jsp" flush="true"/>
                </div>

            </td>
          </tr>

          <%--SPACER--%>
          <tr style="height: 3px;">
            <td colspan=3 >
            </td>
          </tr>
        </table>


        <%--SELECTION--%>
        <table width="99%" border="0" cellpadding="5" cellspacing="0" align="center">
          <tr>
            <td class="tableHeader">

              <table width="100%" class=table cellpadding="0" cellspacing="0">
                <tr class="button-row">
                    <td colspan=3 class="button-row" style="background-color: #0066CC; color:#FFFFFF; border-bottom-width: 0px;">
                      <logic:equal value="true" name="<%=Constants.SELECTION_FORM%>" property="multiple">
                        <bean:message key="gs.records.selected.multiple"  bundle="<%=Constants.MESSAGE_BUNDLE%>"/>
                      </logic:equal>
                      <logic:notEqual value="true" name="<%=Constants.SELECTION_FORM%>" property="multiple">
                        <bean:message key="gs.records.selected.single"  bundle="<%=Constants.MESSAGE_BUNDLE%>"/>
                      </logic:notEqual>
                    </td>
                </tr>
              </table>

              <div style="overflow: auto; height: 40px;" class="table">
                <jsp:include page="selected.jsp" flush="true"/>
              </div>

            </td>
          </tr>

          <tr>
            <td colspan=3 class="tableHeader">
              <center>
                <input value="<bean:message key="gs.button.ok" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>"
                       class="button" type="button" onclick="sendValues()">
                &nbsp;&nbsp;
                <input value="<bean:message key="gs.button.cancel" bundle="<%=Constants.MESSAGE_BUNDLE%>"/>"
                       class="button" type="button" onclick="parent.closeFrame(myWindow)">
              </center>
            </td>
          </tr>

        </table>

		</td></tr>
	</table>

        </html:form>

    </body>


<script>

  var myWindow = parent.selectionWindow;
//----------------------------------------------------------------------------------------------------------------------
  function show_tab(vizibil, ascuns, tab) {

      var visibleClass = "tableHeader";
      var hiddenClass = "tableDesc";

      var tabVizibil = document.getElementById(vizibil);
      var tabAscuns = document.getElementById(ascuns);
      tabVizibil.style.display = "";
      tabAscuns.style.display = "none";

      var tabs = document.getElementById("tabs_row").getElementsByTagName('TD');
      for (i = 0; i < tabs.length - 1; i++) {
        if (tabs[i].tagName == 'TD') {
            tabs[i].className = hiddenClass;
        }
      }
      tab.className = visibleClass;

	var myDiv = document.getElementById('filterdiv');
	myDiv.style.top = 24 + myDiv.parentNode.offsetTop + (myDiv.parentNode.offsetHeight - myDiv.offsetHeight) / 2;
//	if (myDiv.parentNode.offsetHeight - myDiv.offsetHeight < 0) myDiv.style.top = 0;
	myDiv.style.left = 4 + myDiv.parentNode.offsetLeft + (myDiv.parentNode.offsetWidth - myDiv.offsetWidth) / 2;
//	if (myDiv.parentNode.offsetWidth - myDiv.offsetWidth < 0) myDiv.style.left = 0;
  }
//----------------------------------------------------------------------------------------------------------------------
  function set_children_bgColor(color, row) {

    var cells = row.getElementsByTagName('TD');
      for (i = 0; i < cells.length; i++) {
        if (cells[i].tagName == 'TD') {
            cells[i].style.backgroundColor = color;
        }
      }
  }
//----------------------------------------------------------------------------------------------------------------------
  function addRowToSelection(row){
      var tmp = row.cloneNode(true);
      var pkvalue=row.pk;
      tmp.pk =pkvalue;
        for (var j = 0; j < columnProperties.length; j++) {
          eval('tmp.' + columnProperties[j] + '=row.' + columnProperties[j] + ';');
        }

      var dest_table = document.getElementById('sel_table');

      tmp.onmouseover=function () {};
      tmp.onmouseout=function () {};
      tmp.onclick=function () {};
      tmp.style.cursor='';
      set_children_bgColor('', tmp);
      tmp.getElementsByTagName('TD').item(0).align='left';

      var image = document.createElement('IMG');
      image.src='../resources/images/delete_selected.gif';
      image.height='9'; image.width='10';
      image.style.cursor='pointer';
      image.onclick=function () {removeItem(this);};
      var firstTD = tmp.getElementsByTagName('TD').item(0);
      //firstTD.innerHTML='';
      var n = firstTD.childNodes.length;
      for(i=0; i<n; i++) {
        firstTD.removeChild(firstTD.childNodes.item(i));
      }
      firstTD.appendChild(image);

//      alert(tmp.childNodes.item(0));
//      alert(tmp.childNodes.item(1));
//      alert(tmp.childNodes.item(2));
//      alert(tmp.childNodes.item(3));

//      tmp.getElementsByTagName('input').item(0).disabled=false;
      var tbody = dest_table.getElementsByTagName('TBODY').item(0);

<logic:equal value="true" name="<%=Constants.SELECTION_FORM%>" property="multiple" scope="session">
//      var valIdRow = tmp.getElementsByTagName('input').item(0).value;
      var valIdRow = pkvalue;

      var found = false;
      for(i=0; i<tbody.getElementsByTagName('TR').length; i++){
        var curTr = tbody.getElementsByTagName('TR').item(i);
        var curInput = curTr.getElementsByTagName('input').item(0);
        if(curInput){
            var curId = curInput.value;
            if(curId == valIdRow)
                found = true;
        }
      }

      if(!found){
          if (tbody.getElementsByTagName('TR').length > 0) {
            var firstTR = tbody.getElementsByTagName('TR').item(0);
            tbody.insertBefore(tmp, firstTR);
          } else {
            tbody.appendChild(tmp);
          }
      }
</logic:equal>
<logic:notEqual value="true" name="<%=Constants.SELECTION_FORM%>" property="multiple" scope="session">

      if (tbody.getElementsByTagName('TR').length > 0) {
        tbody.removeChild(tbody.getElementsByTagName('TR').item(0));
      }
      tbody.appendChild(tmp);
</logic:notEqual>
  }
//----------------------------------------------------------------------------------------------------------------------
  function removeItem(image) {
      var row = image.parentNode.parentNode;
      var tbody = row.parentNode;

      tbody.removeChild(row);
  }
//----------------------------------------------------------------------------------------------------------------------
  function setSort(colIdx) {
      var theForm = document.getElementById('theForm');
      if (theForm.sortColumn.value == colIdx) {
          if ("false" == theForm.sortAsc.value) {
              theForm.sortAsc.value = "true";
          } else {
              theForm.sortAsc.value = "false";
          }
      } else {
          theForm.sortAsc.value = "true";
      }
      theForm.sortColumn.value = colIdx;
      theForm.crtPage.value = 1;
      parent.selectionWindow=myWindow;
      theForm.submit();
}
//----------------------------------------------------------------------------------------------------------------------
  function setPage(crtPage) {
      document.getElementById('theForm').crtPage.value = crtPage;
      parent.selectionWindow=myWindow;
      document.getElementById('theForm').submit();
      return;
}
//----------------------------------------------------------------------------------------------------------------------
  function setNavigate(rpp, crtPage) {
      document.getElementById('theForm').rpp.value = rpp;
      document.getElementById('theForm').crtPage.value = crtPage;
      //document.getElementById('theForm').submit();
      return;
  }
//----------------------------------------------------------------------------------------------------------------------
  function sendValues() {

    //alert("sendValues");

    var selection = new Array();
    var rows = document.getElementById('sel_table').getElementsByTagName('TR');

    for (var idx = 0; idx < rows.length ; idx++) {
//      alert(rows.item(idx));
//      if(rows.item(idx).getElementsByTagName('input').item(0)){
      if(rows.item(idx).pk){

//        alert(idx);
        selection[idx] = new Hashtable();
        var cells = rows.item(idx).getElementsByTagName('td');

        for (var j = 1; j < cells.length; j++) {
          selection[idx].put(cells.item(j).id, cells.item(j).firstChild.nodeValue);
        }
//        alert(selection[idx]);

        for (var j = 0; j < columnProperties.length; j++) {
          selection[idx].put(columnProperties[j], eval('rows.item(idx).'+columnProperties[j]));
        }

        //alert('after: '+selection[idx]);

<!--        selection[idx].put("pk", rows.item(idx).pk); -->
      }
    }
    //alert('selection = ' + selection);
    if(selection.length > 0){
      parent.<bean:write name="<%=Constants.SELECTION_FORM%>" property="callbackFunction" scope="session"/>(selection);
    }else{
      parent.resetSelectionComponent('<bean:write name="<%=Constants.SELECTION_FORM%>" property="property" scope="session"/>');
    }
    parent.closeFrame(myWindow);
  }
//----------------------------------------------------------------------------------------------------------------------
</script>
