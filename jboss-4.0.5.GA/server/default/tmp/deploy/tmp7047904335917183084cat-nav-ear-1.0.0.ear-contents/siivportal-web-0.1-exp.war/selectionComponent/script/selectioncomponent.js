

function contains (array, value){
	for(i=0;i<array.length;i++)
		if(array[i]==value)
			return true;
	return false;
}

//gen sel

var ie5=document.all&&document.getElementById
var ns6=document.getElementById&&!document.all

var selectionWindow;

//----------------------------------------------------------------------------------------------------------------------
function openSelectionWindow (property, idTableName, selectionCase, filters, pks, isMultiple, isTree, callbackFunction, appname, wdth, height) {
//alert('openSelectionWindow');

    // construct the GET url
    var selectionUrl = "/" + appname + "/selectionComponent/initSelect.do?caseId="+selectionCase;
//alert(selectionUrl);
    // add the pk(s)
    if (typeof(pks) == "object") {
        for (var i in pks) {
            selectionUrl += "&pks="+pks[i];
        }
    } else {
        selectionUrl += "&pks="+pks;
    }
//alert(selectionUrl);
    // add params values
    for(var paramName in filters.hashtable) {
//    alert(paramName);
        selectionUrl += "&filterParam("+paramName+")="+filters.get(""+paramName);
    }
//alert(selectionUrl);
    // set multiple
    selectionUrl += "&multiple=" + isMultiple;
    // set property
    selectionUrl += "&property=" + property;
    // set property
    selectionUrl += "&idTableName=" + idTableName;
    // set tree
    selectionUrl += "&tree=" + isTree;
    // callbackFunction
    selectionUrl += "&callbackFunction=" + callbackFunction;
    selectionUrl += "&newSelection=" + 1;
//alert(selectionUrl);
//    selectionWindow = window.open(selectionUrl, "selection",
//                                  "height="+height+",width="+width+
//                                  ",top="+top+",left="+left+
//                                  ",status=no,toolbar=no,menubar=no,location=no,scrollbars=yes,resizable=no");
    var myFrame = document.getElementById('select_' + property);
//    alert(myFrame);
    var myDiv = document.getElementById( property + '_window');
    //alert(myDiv);
    myFrame.src = selectionUrl;
    myFrame.style.width = wdth;
    myFrame.style.height = 1;
    myDiv.style.top = -100;
    myDiv.style.left = (document.body.clientWidth - wdth) / 2;
    bringToFront(myDiv);
    //alert(selectionUrl);
    selectionWindow = myDiv;
    myDiv.style.display = '';

    document.onmousemove = dragIt;
    document.onmouseup = dropIt;
}

//----------------------------------------------------------------------------------------------------------------------
function bringToFront(frame) {

	if (!frame) return false;

//	alert("bringing to front: " + frame.id);
//	for ( i in allFrames ) {
//		if (allFrames[i]) allFrames[i].style.zIndex = 100;
//	}
//	alert("bringing to front: " + frame.id);
//	if ( ! allFrames[frame.id] ) allFrames[frame.id] = frame;
//	alert("bringing to front: " + frame.id);
//	frame.style.zIndex = 101;
//	alert("bringing to front: " + frame.id);

	frame.style.zIndex = 101000;
}
//----------------------------------------------------------------------------------------------------------------------

/////////////// Start Dragable Div Functionality /////////////////
var allFrames = new Array(100);
var movingFrame = null;
var cX =  0;
var cY = 0;
//----------------------------------------------------------------------------------------------------------------------
function pickIt(obj, evt) {
	var evt = (evt) ? evt : ((window.event) ? event : null);
	movingFrame = obj;
//	alert("in pickIt. frameId: " + movingFrame.id);
	if (movingFrame) {
		movingFrame.style.zIndex = 1000;
		cX = evt.screenX - movingFrame.offsetLeft;
		cY = evt.screenY - movingFrame.offsetTop;
		return;
	}
	else {
		movingFrame = null;
		return;
	}
}
//----------------------------------------------------------------------------------------------------------------------
function dragIt(evt) {
	evt = (evt) ? evt : ((window.event) ? event : null);
	if (movingFrame) {
//      alert("dragging: " + evt.clientX + "," + evt.clientY);
		movingFrame.style.left = evt.screenX - cX + 'px';
		movingFrame.style.top = evt.screenY - cY + 'px';
		evt.cancelBubble=true;
		evt.returnValue = false;
		return false;
	}
}
//----------------------------------------------------------------------------------------------------------------------
function dropIt() {
	if (movingFrame) {
		bringToFront(movingFrame);
//		alert("droped: " + movingFrame.id);
		movingFrame = null;
		return false;
	}
}
//----------------------------------------------------------------------------------------------------------------------
function resizeWindow( div ) {
	if (div) {
		var frame = div.getElementsByTagName('iframe').item(0);
		var height = 0;

		if (frame.contentDocument && frame.contentDocument.body.offsetHeight) //ns6 syntax
			height = frame.contentDocument.body.offsetHeight;
		else if (frame.Document && frame.Document.body.scrollHeight) //ie5+ syntax
			height = frame.Document.body.scrollHeight;

		frame.style.height = height;
//		div.style.top = (document.body.clientHeight - height) / 2;
                div.style.top = document.body.scrollTop + 10;
	}
}
//----------------------------------------------------------------------------------------------------------------------
function closeFrame(frame) {
//	if (!frame) return false;
//	var frame = allFrames[frame.id];
//	if (frame) {
		frame.style.display = 'none';
		frame.src='';
//		allFrames[frame.id] = null;
//
//		var i = null;
//		for ( i in allFrames ) {
//			if (allFrames[i]) allFrames[i].style.zIndex = 10;
//		}
//		if (allFrames[i]) allFrames[i].style.zIndex = 11;
//	}
}
/////////////// End Dragable Div Functionality /////////////////


// selectbox utilities
///////////////////////////////////////////////////////////////////////////////////////////////
function selectAll(selectBox){
    if(!hasOptions(selectBox)){return;}
    for (i=0; i<selectBox.length; i++) {
        selectBox.options[i].selected = true;
    }
}

function clearAll(selectBox){
    for (i=selectBox.length;i>=0; i--) {
        selectBox.options[i] = null;
    }
}


function copyOptions(frombox, tobox){
    clearAll(tobox);
    mycopyAllOptions(frombox,tobox);
    selectAll(tobox);
}

function mycopyAllOptions(frombox,tobox){
    if(!hasOptions(frombox)){return;}
    for(var i=0;i<frombox.options.length;i++){
        var newOpt = frombox.options[i];
        tobox.options[i] = new Option( newOpt.text, newOpt.value, false, false);
    }
}

function copyAllOptions(from,to){
    selectAllOptions(from);
    if(arguments.length==2){
        copySelectedOptions(from,to);
    } else if(arguments.length==3){
        copySelectedOptions(from,to,arguments[2]);
    }
}

function selectAllOptions(obj){
    if(!hasOptions(obj)){return;}
    for(var i=0;i<obj.options.length;i++){
        obj.options[i].selected = true;
    }
}

function removeSelectedOptions(from){
    if(!hasOptions(from)){return;}
    for(var i=(from.options.length-1);i>=0;i--){
        var o=from.options[i];
            if(o.selected){
                from.options[i] = null;
            }
    }
    from.selectedIndex = -1;
}

function copySelectedOptions(from,to){
    var options = new Object();
    if(hasOptions(to)){
        for(var i=0;i<to.options.length;i++){
            options[to.options[i].value] = to.options[i].text;
        }
    }
    if(!hasOptions(from)){return;}
    for(var i=0;i<from.options.length;i++){
        var o = from.options[i];
        if(o.selected){
            if(options[o.value] == null || options[o.value] == "undefined" || options[o.value]!=o.text){
                if(!hasOptions(to)){
                    var index = 0;
                }else{
                    var index=to.options.length;
                }
                to.options[index] = new Option( o.text, o.value, false, false);
                alert(to.options[index]);
            }
        }
    }
    if((arguments.length<3) ||(arguments[2]==true)){
        sortSelect(to);
    }
    from.selectedIndex = -1;
    to.selectedIndex = -1;
}


function hasOptions(obj){if(obj!=null && obj.options!=null){return true;}return false;}
function selectUnselectMatchingOptions(obj,regex,which,only){if(window.RegExp){if(which == "select"){var selected1=true;var selected2=false;}else if(which == "unselect"){var selected1=false;var selected2=true;}else{return;}var re = new RegExp(regex);if(!hasOptions(obj)){return;}for(var i=0;i<obj.options.length;i++){if(re.test(obj.options[i].text)){obj.options[i].selected = selected1;}else{if(only == true){obj.options[i].selected = selected2;}}}}}
function selectMatchingOptions(obj,regex){selectUnselectMatchingOptions(obj,regex,"select",false);}
function selectOnlyMatchingOptions(obj,regex){selectUnselectMatchingOptions(obj,regex,"select",true);}
function unSelectMatchingOptions(obj,regex){selectUnselectMatchingOptions(obj,regex,"unselect",false);}
function sortSelect(obj){var o = new Array();if(!hasOptions(obj)){return;}for(var i=0;i<obj.options.length;i++){o[o.length] = new Option( obj.options[i].text, obj.options[i].value, obj.options[i].defaultSelected, obj.options[i].selected) ;}if(o.length==0){return;}o = o.sort(
function(a,b){if((a.text+"") <(b.text+"")){return -1;}if((a.text+"") >(b.text+"")){return 1;}return 0;});for(var i=0;i<o.length;i++){obj.options[i] = new Option(o[i].text, o[i].value, o[i].defaultSelected, o[i].selected);}}

function moveSelectedOptions(from,to){if(arguments.length>3){var regex = arguments[3];if(regex != ""){unSelectMatchingOptions(from,regex);}}if(!hasOptions(from)){return;}for(var i=0;i<from.options.length;i++){var o = from.options[i];if(o.selected){if(!hasOptions(to)){var index = 0;}else{var index=to.options.length;}to.options[index] = new Option( o.text, o.value, false, false);}}for(var i=(from.options.length-1);i>=0;i--){var o = from.options[i];if(o.selected){from.options[i] = null;}}if((arguments.length<3) ||(arguments[2]==true)){sortSelect(from);sortSelect(to);}from.selectedIndex = -1;to.selectedIndex = -1;}

function moveAllOptions(from,to){selectAllOptions(from);if(arguments.length==2){moveSelectedOptions(from,to);}else if(arguments.length==3){moveSelectedOptions(from,to,arguments[2]);}else if(arguments.length==4){moveSelectedOptions(from,to,arguments[2],arguments[3]);}}

function swapOptions(obj,i,j){var o = obj.options;var i_selected = o[i].selected;var j_selected = o[j].selected;var temp = new Option(o[i].text, o[i].value, o[i].defaultSelected, o[i].selected);var temp2= new Option(o[j].text, o[j].value, o[j].defaultSelected, o[j].selected);o[i] = temp2;o[j] = temp;o[i].selected = j_selected;o[j].selected = i_selected;}
function moveOptionUp(obj){if(!hasOptions(obj)){return;}for(i=0;i<obj.options.length;i++){if(obj.options[i].selected){if(i != 0 && !obj.options[i-1].selected){swapOptions(obj,i,i-1);obj.options[i-1].selected = true;}}}}
function moveOptionDown(obj){if(!hasOptions(obj)){return;}for(i=obj.options.length-1;i>=0;i--){if(obj.options[i].selected){if(i !=(obj.options.length-1) && ! obj.options[i+1].selected){swapOptions(obj,i,i+1);obj.options[i+1].selected = true;}}}}

function removeAllOptions(from){if(!hasOptions(from)){return;}for(var i=(from.options.length-1);i>=0;i--){from.options[i] = null;}from.selectedIndex = -1;}
function addOption(obj,text,value,selected){if(obj!=null && obj.options!=null){obj.options[obj.options.length] = new Option(text, value, false, selected);}}

function concat(multipleComponent){
    var concatValue='';
    if(!hasOptions(multipleComponent)){return '';}

    for(var i=0;i<multipleComponent.options.length;i++){
        var o = multipleComponent.options[i];
        if(i>0){
          concatValue += ",";
        }
        concatValue += o.value;
    }
    return concatValue;
}
///////////////////////////////////////////////////////////////////////////////////////////////


// selection component functions
///////////////////////////////////////////////////////////////////////////////////////////////
function resetSelectionComponent(componentName){
    displayName = getDisplayName(componentName);
    eval('resetSelectionComponent'+displayName+'();');
}


function disableSelectionComponent(componentName){
//alert("disable " + componentName);
    displayName = getDisplayName(componentName);
    eval('setEnabled' + displayName + '(false);');
}

function enableSelectionComponent(componentName){
//alert("enable " + componentName);
    displayName = getDisplayName(componentName);
    eval('setEnabled' + displayName + '(true);');
}

function setComponentValue(componentName, value){
    displayName = getDisplayName(componentName);
    eval(displayName+'setComponentValue('+value+');');
}

function setReadOnlySelectionComponent(componentName, readOnly){
    eval('setEnabled' + displayName + '(' + readOnly + ');' );
    document.getElementById(componentName).disabled = '';
}


//------------------
function getSelectionComponentDetailValue(genericSelName) {
    displayName = getDisplayName(genericSelName);
    var id = "div" + displayName + getDetailsFieldName(genericSelName);
    return document.getElementById(id).innerHTML;
}


function getSelectionComponentKnownFieldElem(genericSelName) {
    displayName = getDisplayName(genericSelName);
    return document.getElementById("text" + displayName +  getKnownFieldName(genericSelName));
}

function getSelectionComponentKnownFieldValue(genericSelName) {
    return getSelectionComponentKnownFieldElem(genericSelName).value;
}

function getDetailsFieldName(componentName){
  displayName = getDisplayName(componentName);
  return (eval(displayName + "DescMap.get('detailsFieldName');"));
}

function getKnownFieldName(componentName){
  displayName = getDisplayName(componentName);
  return (eval(displayName + "DescMap.get('knownFieldName');"));
}

// obtinem numele pe care il folosim la generare
// ramane fara sufix pt compatibilitate cu hardcodari
//var DISPLAY_HIDDEN_FIELD = "displayHiddenField";
var DISPLAY_HIDDEN_FIELD = "";
function getDisplayName( propertyName){
//  displayName = removePoints( propertyName) +DISPLAY_HIDDEN_FIELD;
  displayName = removePoints( propertyName) ;
  return displayName;
}

///////////////////////////////////////////////////////////////////////////////////////////////
// utility function - removes the point from a string
function removePoints (original){

    tmp = "";
    pos = original.indexOf('.');
    _last = 0;
    while(pos != -1 ){
        tmp += original.substring(_last, pos);
        _last = pos + 1;
        pos = original.indexOf('.', _last );
    }

    tmp += original.substring(_last, original.length);

    return tmp;
}

//popup functions
function openPopupWindow(url){
    open(url, "popwin", "width=450,height=455,scrollbars=auto,menubar=no, status=yes");
}

function openPopupWindow(url, name, width, height){
    open(url, name, "width=" + width + ",height=" + height + ",scrollbars=yes,menubar=no, status=yes");
}



// tooltip functions
function showToolTip(e,text){
//alert('showToolTip');
//alert(text);
    if(text.length>0 && text!="&nbsp;"){
      ToolTip.innerHTML="<table><tr><td class=ToolTipTD>"+text+"</td></tr></table>";
//      ToolTip.style.pixelLeft=(e.x+15+document.body.scrollLeft);
//      ToolTip.style.pixelTop=(e.y+document.body.scrollTop);
      if(document.all){
        posX = e.x;
        posY = e.y;
      }else{
        posX = e.pageX;
        posY = e.pageY;
      }

      ToolTip.style.left=(posX +15+document.body.scrollLeft);
      ToolTip.style.top=(posY+document.body.scrollTop);

      ToolTip.style.visibility="visible";
    }
}
function hideToolTip(){
//alert('hideToolTip');
ToolTip.style.visibility="hidden";
}


function truncate(value, size){
//alert(value);
    if(size == -1){
        return value;
    }
    if(value.length >=size){
        return value.substring(0, size-3)+"...";
    }
    return value;
}
