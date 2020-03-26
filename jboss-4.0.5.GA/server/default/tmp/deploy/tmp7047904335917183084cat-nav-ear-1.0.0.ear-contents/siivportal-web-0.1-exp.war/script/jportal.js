/*
*     Funtie folosita pentru afisarea ferestrelor de editare si stergere
*/
function setAction(actionType, key, id, prefix) {
    if (typeof(document.actionForm.method) != "undefined")
        document.actionForm.method.value = actionType;
    if (prefix != null)
        document.actionForm.prefix.value = prefix;
    document.actionForm.elements[key].value = id;
    document.actionForm.submit();
    return;
}
/*
*     Funtii de navigare
*/
function setNavigate(rpp, crtPage) {
    document.navigationForm.rpp.value = rpp;
    document.navigationForm.crtPage.value = crtPage;
    document.navigationForm.submit();
    return;
}
function setResults(rpp) {
    document.navigationForm.rpp.value = rpp;
    document.navigationForm.crtPage.value = 1;
    document.navigationForm.submit();
    return;
}
function setDisplayMode(mode) {
    document.navigationForm.displayMode.value = mode;
    document.navigationForm.submit();
    return;
}

function setOrder(orderBy, orderType) {
    if (orderBy == -1) {
        alert('Trebuie sa selectati un criteriu !');
        return;
    }
    document.navigationForm.orderBy.value = orderBy;
    document.navigationForm.orderType.value = orderType;
    document.navigationForm.submit();
    return;
}
function submitOrder(listname) {
    document.navigationForm.orderBy.value = document.getElementById("sort"
            + listname).value;
    document.navigationForm.orderType.value = document.getElementById("type"
            + listname).value;
    document.navigationForm.submit();
    return;
}
function refresh(refreshName) {
    var formId = document.getElementById("formID").value;
    dtReset(formId);
    return;
}

function setPage(crtPage) {
    document.navigationForm.crtPage.value = crtPage;
    document.navigationForm.submit();
    return;
}

/**
 * ROniga: Metoda de setare a unui obiect dintr-un form
 */
function setFormParam(form, param, value) {
    if (value && value != "") {
        eval("document." + form + "." + param + ".value = " + value + ";");
    }
}


/*
*     END Funtii navigare
*/
/**
 *     Functie pentru ascunderea interfetei de search
 */
function clikker(a)
{
    if (a.style.display == '')
    {
        a.style.display = 'none';
        //b.src='images/portlet/show.gif';
    }
    else
    {
        a.style.display = '';
        //b.src='images/portlet/hide.gif';
    }
}

function showLayer(layerID) {
    document.getElementById(layerID).style.display = 'block';
}

function hideLayer(layerID) {
    document.getElementById(layerID).style.display = 'none';
    if (typeof(document.navigationForm) != "undefined") {
        if (typeof(document.navigationForm.search) != "undefined") {
            document.navigationForm.search.value = 0;
        }

    }
}
/**
 *     END_Functie pentru ascunderea interfetei de search
 */

/**
 * Afiseaza un div
 */
function showDiv(layerID) {
    document.getElementById(layerID).style.display = 'block';
}

/**
 * Ascunde un div
 */
function hideDiv(layerID) {
    document.getElementById(layerID).style.display = 'none';
}

/**
 *  Seteaza rolul care se doreste a fi deleted, in add_user
 */
function setRole(idRole, idCompany) {
    document.deleteRole.id_appl_role.value = idRole;
    document.deleteRole.idCompany.value = idCompany;
    document.deleteRole.submit();
    return;
}
/**
 *   Verifica daca s=a selectat un rol
 */
function checkSelect() {
    if (document.addRole.id_appl_role.value == "0")
        document.addRole.addRoleBtn.disabled = true;
    else
        document.addRole.addRoleBtn.disabled = false;
}

/**
 *   Verifica daca s=a selectat un subrol
 */
function checkSubRoleSelect() {
    if (document.addSubRole.id_appl_sub_role.value == "0")
        document.addSubRole.addRoleBtn.disabled = true;
    else
        document.addSubRole.addRoleBtn.disabled = false;
}
/**
 *  Seteaza subrolul care se doreste a fi deleted, in add_role
 */
function setSubRole(id) {
    document.deleteSubRole.id_appl_sub_role.value = id;
    document.deleteSubRole.submit();
    return;
}
/**
 *  functie chemata la unload de fiecare template.
 */
function execUnload()
{
    var iX = window.document.body.offsetWidth + window.event.clientX ;
    var iY = window.event.clientY ;
    if (iX <= 30 && iY < 0) {
        location = "toUS?prefix=/userservice&page=logout.do&action=102";
    }
}
// name - name of the cookie
// value - value of the cookie
// [expires] - expiration date of the cookie (defaults to end of current session)
// [path] - path for which the cookie is valid (defaults to path of calling document)
// [domain] - domain for which the cookie is valid (defaults to domain of calling document)
// [secure] - Boolean value indicating if the cookie transmission requires a secure transmission
// * an argument defaults when it is assigned null as a placeholder
// * a null placeholder is not required for trailing omitted arguments
function setCookie(name, value, expires, path, domain, secure) {
    var curCookie = name + "=" + escape(value) +
                    ((expires) ? "; expires=" + expires.toGMTString() : "") +
                    ((path) ? "; path=" + path : "") +
                    ((domain) ? "; domain=" + domain : "") +
                    ((secure) ? "; secure" : "");
    document.cookie = curCookie;
}

// name - name of the desired cookie
// * return string containing value of specified cookie or null if cookie does not exist
function getCookie(name) {
    var dc = document.cookie;
    var prefix = name + "=";
    var begin = dc.indexOf("; " + prefix);
    if (begin == -1) {
        begin = dc.indexOf(prefix);
        if (begin != 0) return null;
    } else
        begin += 2;
    var end = document.cookie.indexOf(";", begin);
    if (end == -1)
        end = dc.length;
    return unescape(dc.substring(begin + prefix.length, end));
}

// name - name of the cookie
// [path] - path of the cookie (must be same as path used to create cookie)
// [domain] - domain of the cookie (must be same as domain used to create cookie)
// * path and domain default if assigned null or omitted if no explicit argument proceeds
function deleteCookie(name, path, domain) {
    if (getCookie(name)) {
        document.cookie = name + "=" +
                          ((path) ? "; path=" + path : "") +
                          ((domain) ? "; domain=" + domain : "") +
                          "; expires=Thu, 01-Jan-70 00:00:01 GMT";
    }
}

// date - any instance of the Date object
// * hand all instances of the Date object to this function for "repairs"
function fixDate(date) {
    var base = new Date(0);
    var skew = base.getTime();
    if (skew > 0)
        date.setTime(date.getTime() - skew);
}


function iterativeSetAction(action, key, listObj)
{
    document.actionForm.actionType.value = action;
    var boolAtLeastOne = false;
    for (var i = 0; i < listObj.length; i++)
        if (listObj[ i ].checked) {
            document.actionForm.elements[key].value += ( listObj[ i ].id
                    + '|' );
            boolAtLeastOne = true;
        }
        //    alert( document.actionForm.elements[key].value );
    if (boolAtLeastOne)
        document.actionForm.submit();
    return;
}

function contains(array, value) {
    for (i = 0; i < array.length; i++)
        if (array[i] == value)
            return true;
    return false;
}

//gen sel


/////////////// End Dragable Div Functionality /////////////////

function selectAll(selectBox) {
    for (i = 0; i < selectBox.length; i++) {
        selectBox.options[i].selected = true;
    }
}

function clearAll(selectBox) {
    for (i = selectBox.length; i >= 0; i--) {
        selectBox.options[i] = null;
    }
}


function copyOptions(frombox, tobox) {
    clearAll(tobox);
    mycopyAllOptions(frombox, tobox);
    selectAll(tobox);
}

function mycopyAllOptions(frombox, tobox) {
    if (!hasOptions(frombox)) {
        return;
    }
    for (var i = 0; i < frombox.options.length; i++) {
        var newOpt = frombox.options[i];
        tobox.options[i] = new Option(newOpt.text, newOpt.value, false, false);
    }
}

function checkDuplicate(selectObject, optionText, optionValue) {
    var sltbool = false;
    for (i = 0; i < selectObject.options.length; i++) {
        if (optionText == selectObject.options[i].text || optionValue
                == selectObject.options[i].text) {
            sltbool = true;
            break
        }
    }
    return sltbool;
}

function removeDuplicates(selectObject) {

    for (i = 0; i < selectObject.options.length; i++) {
        if (checkDuplicate(selectObject.options[i].text, selectObject.options[i].text)
                == true) {
            selectObject.options[i] = null;
        }
    }
}

function hasOptions(obj) {
    if (obj != null && obj.options != null) {
        return true;
    }
    return false;
}
function selectUnselectMatchingOptions(obj, regex, which, only) {
    if (window.RegExp) {
        if (which == "select") {
            var selected1 = true;
            var selected2 = false;
        } else if (which == "unselect") {
            var selected1 = false;
            var selected2 = true;
        } else {
            return;
        }
        var re = new RegExp(regex);
        if (!hasOptions(obj)) {
            return;
        }
        for (var i = 0; i < obj.options.length; i++) {
            if (re.test(obj.options[i].text)) {
                obj.options[i].selected = selected1;
            } else {
                if (only == true) {
                    obj.options[i].selected = selected2;
                }
            }
        }
    }
}
function selectMatchingOptions(obj, regex) {
    selectUnselectMatchingOptions(obj, regex, "select", false);
}
function selectOnlyMatchingOptions(obj, regex) {
    selectUnselectMatchingOptions(obj, regex, "select", true);
}
function unSelectMatchingOptions(obj, regex) {
    selectUnselectMatchingOptions(obj, regex, "unselect", false);
}
function sortSelect(obj) {
    var o = new Array();
    if (!hasOptions(obj)) {
        return;
    }
    for (var i = 0; i < obj.options.length; i++) {
        o[o.length]
                = new Option(obj.options[i].text, obj.options[i].value, obj.options[i].defaultSelected, obj.options[i].selected);
    }
    if (o.length == 0) {
        return;
    }
    o = o.sort(
            function(a, b) {
                if ((a.text + "") < (b.text + "")) {
                    return -1;
                }
                if ((a.text + "") > (b.text + "")) {
                    return 1;
                }
                return 0;
            });
    for (var i = 0; i < o.length; i++) {
        obj.options[i]
                = new Option(o[i].text, o[i].value, o[i].defaultSelected, o[i].selected);
    }
}
function selectAllOptions(obj) {
    if (!hasOptions(obj)) {
        return;
    }
    for (var i = 0; i < obj.options.length; i++) {
        obj.options[i].selected = true;
    }
}
function moveSelectedOptions(from, to) {
    if (arguments.length > 3) {
        var regex = arguments[3];
        if (regex != "") {
            unSelectMatchingOptions(from, regex);
        }
    }
    if (!hasOptions(from)) {
        return;
    }
    for (var i = 0; i < from.options.length; i++) {
        var o = from.options[i];
        if (o.selected) {
            if (!hasOptions(to)) {
                var index = 0;
            } else {
                var index = to.options.length;
            }
            to.options[index] = new Option(o.text, o.value, false, false);
        }
    }
    for (var i = (from.options.length - 1); i >= 0; i--) {
        var o = from.options[i];
        if (o.selected) {
            from.options[i] = null;
        }
    }
    if ((arguments.length < 3) || (arguments[2] == true)) {
        sortSelect(from);
        sortSelect(to);
    }
    from.selectedIndex = -1;
    to.selectedIndex = -1;
}
function copySelectedOptions(from, to) {
    var options = new Object();
    if (hasOptions(to)) {
        for (var i = 0; i < to.options.length; i++) {
            options[to.options[i].value] = to.options[i].text;
        }
    }
    if (!hasOptions(from)) {
        return;
    }
    for (var i = 0; i < from.options.length; i++) {
        var o = from.options[i];
        if (o.selected) {
            if (options[o.value] == null || options[o.value] == "undefined"
                    || options[o.value] != o.text) {
                if (!hasOptions(to)) {
                    var index = 0;
                } else {
                    var index = to.options.length;
                }
                to.options[index] = new Option(o.text, o.value, false, false);
            }
        }
    }
    if ((arguments.length < 3) || (arguments[2] == true)) {
        sortSelect(to);
    }
    from.selectedIndex = -1;
    to.selectedIndex = -1;
}
function moveAllOptions(from, to) {
    selectAllOptions(from);
    if (arguments.length == 2) {
        moveSelectedOptions(from, to);
    } else if (arguments.length == 3) {
        moveSelectedOptions(from, to, arguments[2]);
    } else if (arguments.length == 4) {
        moveSelectedOptions(from, to, arguments[2], arguments[3]);
    }
}
function copyAllOptions(from, to) {
    selectAllOptions(from);
    if (arguments.length == 2) {
        copySelectedOptions(from, to);
    } else if (arguments.length == 3) {
        copySelectedOptions(from, to, arguments[2]);
    }
}
function swapOptions(obj, i, j) {
    var o = obj.options;
    var i_selected = o[i].selected;
    var j_selected = o[j].selected;
    var temp = new Option(o[i].text, o[i].value, o[i].defaultSelected, o[i].selected);
    var temp2 = new Option(o[j].text, o[j].value, o[j].defaultSelected, o[j].selected);
    o[i] = temp2;
    o[j] = temp;
    o[i].selected = j_selected;
    o[j].selected = i_selected;
}
function moveOptionUp(obj) {
    if (!hasOptions(obj)) {
        return;
    }
    for (i = 0; i < obj.options.length; i++) {
        if (obj.options[i].selected) {
            if (i != 0 && !obj.options[i - 1].selected) {
                swapOptions(obj, i, i - 1);
                obj.options[i - 1].selected = true;
            }
        }
    }
}
function moveOptionDown(obj) {
    if (!hasOptions(obj)) {
        return;
    }
    for (i = obj.options.length - 1; i >= 0; i--) {
        if (obj.options[i].selected) {
            if (i != (obj.options.length - 1) && ! obj.options[i
                    + 1].selected) {
                swapOptions(obj, i, i + 1);
                obj.options[i + 1].selected = true;
            }
        }
    }
}
function removeSelectedOptions(from) {
    if (!hasOptions(from)) {
        return;
    }
    for (var i = (from.options.length - 1); i >= 0; i--) {
        var o = from.options[i];
        if (o.selected) {
            from.options[i] = null;
        }
    }
    from.selectedIndex = -1;
}
function removeAllOptions(from) {
    if (!hasOptions(from)) {
        return;
    }
    for (var i = (from.options.length - 1); i >= 0; i--) {
        from.options[i] = null;
    }
    from.selectedIndex = -1;
}
function addOption(obj, text, value, selected) {
    if (obj != null && obj.options != null) {
        obj.options[obj.options.length]
                = new Option(text, value, false, selected);
    }
}


function resetSelectionComponent(componentName) {
    eval('resetSelectionComponent' + componentName + '();');
}

function openPopupWindow(url) {
    open(url, "popwin", "width=450,height=455,scrollbars=auto,menubar=no, status=yes");

    //        var ret = showModalDialog(url,
    //                null,
    //            "dialogWidth:450px;dialogHeight:455px;resizable:no;scroll:auto;center:yes;status:yes;help:no");


}

function disableSelectionComponent(componentName) {
    //alert("disable " + componentName);
    eval('setEnabled' + componentName + '(false);');
}

function enableSelectionComponent(componentName) {
    //alert("enable " + componentName);
    eval('setEnabled' + componentName + '(true);');
}

function showToolTip(e, text) {
    document.getElementById("ToolTip").innerHTML
            = "<table><tr><td class=ToolTipTD>" + text + "</td></tr></table>";
    document.getElementById("ToolTip").style.pixelLeft = (e.x + 15
            + document.body.scrollLeft);
    document.getElementById("ToolTip").style.pixelTop = (e.y
            + document.body.scrollTop);
    document.getElementById("ToolTip").style.visibility = "visible";
}
function hideToolTip() {
    document.getElementById("ToolTip").style.visibility = "hidden";
}

/*
*
* @param value the value to be truncated
* @param size, the number of letters of the resulting string
*
* @return a string of length <code>size</code>
*/
function truncate(value, size) {
    if (size == -1) {
        return value;
    }
    if (value.length >= size) {
        return value.substring(0, size - 3) + "...";
    }
    return value;
}

function swapImage(imgName, imgUrl)
{
    document.images[imgName].src = imgUrl;
}

