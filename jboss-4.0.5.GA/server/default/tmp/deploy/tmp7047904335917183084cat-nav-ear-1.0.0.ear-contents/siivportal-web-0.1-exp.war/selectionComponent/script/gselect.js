var ie5=document.all&&document.getElementById
var ns6=document.getElementById&&!document.all

var selectionWindow;


//----------------------------------------------------------------------------------------------------------------------
function operationChanged(select,tblid) {
    op = select.value;
    myTbl = document.getElementById(tblid)
    cells = myTbl.getElementsByTagName('td');
    if(op.indexOf('is')>=0) {
        if (cells[0].getElementsByTagName('select')[0]) {
            cells[0].getElementsByTagName('select')[0].multiple = false;
            cells[0].getElementsByTagName('select')[0].size = 1;
        }
        cells[0].style.visibility="hidden";
        cells[1].style.visibility="hidden";

    } else if (op.indexOf('in')>=0) {
        if (cells[0].getElementsByTagName('select')[0]) {
            cells[0].getElementsByTagName('select')[0].multiple = true;
            cells[0].getElementsByTagName('select')[0].size = 4;
        }
        cells[0].style.visibility="visible";
        cells[1].style.visibility="hidden";

    } else if (op.indexOf('btw')>=0) {
        if (cells[0].getElementsByTagName('select')[0]) {
            cells[0].getElementsByTagName('select')[0].multiple = false;
            cells[0].getElementsByTagName('select')[0].size = 1;
        }
        cells[0].style.visibility="visible";
        cells[1].style.visibility="visible";

    } else {
        if (cells[0].getElementsByTagName('select')[0]) {
            cells[0].getElementsByTagName('select')[0].multiple = false;
            cells[0].getElementsByTagName('select')[0].size = 1;
        }
        cells[0].style.visibility="visible";
        cells[1].style.visibility="hidden";

    }
} // operationChanged
//----------------------------------------------------------------------------------------------------------------------
/*
 *  Acts upon a filter activation checkbox click
 */
function filterCheck( checkbox ) {
    var disabled = ! checkbox.checked;
    var inputs;
    if (ie5) {
        inputs = checkbox.form.elements("filter"+checkbox.id);
        if (document.images("filter"+checkbox.id) != null ) {
            document.images("filter"+checkbox.id).item(0).disabled = disabled;
            document.images("filter"+checkbox.id).item(1).disabled = disabled;
        }
    } else if (ns6) {
        inputs = checkbox.form.elements["filter"+checkbox.id];
        //if (document.images.namedItem("filter"+checkbox.id).length > 0) {
        if (document.images.namedItem("filter"+checkbox.id) != null) {
            document.images.namedItem("filter"+checkbox.id)[0].disabled = disabled;
            document.images.namedItem("filter"+checkbox.id)[1].disabled = disabled;
        }
    }

    for (i = 0 ; i < inputs.length ; i++) {
        inputs[i].disabled = disabled;
    }

}  // filterCheck
//----------------------------------------------------------------------------------------------------------------------
function checkClick( checkbox, filterNr ) {

    var disabled = checkbox.checked;
    var inputs;
    if (ie5) {
        inputs = checkbox.form.elements("filter" + filterNr);
    } else if (ns6) {
        inputs = checkbox.form.elements["filter" + filterNr];
    }

    for (i = 0 ; i < inputs.length ; i++) {
        var attrib = inputs.item(i).getAttribute("xyz");
        if (attrib == ("filter" + filterNr)) {
            inputs[i].disabled = disabled;
        }
    }
}
