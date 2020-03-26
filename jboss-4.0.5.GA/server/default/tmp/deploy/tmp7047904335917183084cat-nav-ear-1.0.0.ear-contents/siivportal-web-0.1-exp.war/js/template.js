function Browser() {

  var ua, s, i;

  this.isIE    = false;  // Internet Explorer
  this.isNS    = false;  // Netscape
  this.isOpera = false;  // Opera
  this.isFirefox = false;// Mozilla, Firefox
  this.version = null;

  ua = navigator.userAgent;

  s = "MSIE";
  if ((i = ua.indexOf(s)) >= 0) {
    if(window.opera) {
        this.isOpera = true;
        //alert("opera from IE");
    } else {
    this.isIE = true;
        //alert("IE");
    }
    this.version = parseFloat(ua.substr(i + s.length));
    //return;
  }

  s = "Netscape6/";
  if ((i = ua.indexOf(s)) >= 0) {
    this.isNS = true;
    this.version = parseFloat(ua.substr(i + s.length));
    //return;
  }



  s = "Gecko";
  if ((i = ua.indexOf(s)) >= 0) {
    this.isNS = true;
    this.version = 6.1;
    //return;
  }

  s = "Opera";
  if ((i = ua.indexOf(s)) != -1) {
    this.isOpera = true;
    //alert("opera");
    //return;
  }

  s = "Firefox/";
  if ((i = ua.indexOf(s)) != -1) {
    this.isFirefox = true;
    //alert("mozilla firefox");
    //return;
  }
}

var browser = new Browser();



var activeButton = null;
var crtSubMenus = 0;  // number of the currently displayed submenus
var objDebug = null;  // debugger object

function buttonClick(event, menuId) {
  if(pageLoaded || indexPage) { // pageLoaded is set to TRUE when one of the templates below is fully loaded in browser
                   // (index.jsp, template.jsp, portaltemplate.jsp)
      var button;

      // Get the target button element.

      if (browser.isIE)
        button = window.event.srcElement;
      else
        button = event.currentTarget;

      // Blur focus from the link to remove that annoying outline.

      button.blur();

      // Associate the named menu to this button if not already done.
      // Additionally, initialize menu display.

      if (button.menu == null) {
        button.menu = document.getElementById(menuId);
        if (button.menu == null) {
            return;
        }
        if (button.menu.isInitialized == null)
          menuInit(button.menu);
      }

      // [MODIFIED] Added for activate/deactivate on mouseover.

      // Set mouseout event handler for the button, if not already done.

      if (button.onmouseout == null)
        button.onmouseout = buttonOrMenuMouseout;

      // Exit if this button is the currently active one.

      if (button == activeButton)
        return false;

      // [END MODIFIED]

      // Reset the currently active button, if any.

      if (activeButton != null)
        resetButton(activeButton);

      // Activate this button, unless it was the currently active one.

      if (button != activeButton) {
        depressButton(button);
        activeButton = button;
      }
      else
        activeButton = null;
         if (browser.isIE) {
            crtSubMenus++;
            if(!indexPage && !browser.isOpera)
            showIframe("ifr"+crtSubMenus, button.menu.offsetWidth, button.menu.offsetHeight, button.menu.offsetLeft, button.menu.offsetTop);
        }
      return false;
  }
}

var pageLoaded = false;

function buttonMouseover(event, menuId) {
  if(pageLoaded || indexPage) { // pageLoaded is set to TRUE when one of the templates below is fully loaded in browser
                   // (index.jsp, template.jsp, portaltemplate.jsp)
      var button;

      // [MODIFIED] Added for activate/deactivate on mouseover.

      // Activates this button's menu if no other is currently active.

      if (activeButton == null) {
        buttonClick(event, menuId);
        return;
      }

      // [END MODIFIED]

      // Find the target button element.

      if (browser.isIE)
        button = window.event.srcElement;
      else
        button = event.currentTarget;

      // If any other button menu is active, make this one active instead.

      if (activeButton != null && activeButton != button)
        buttonClick(event, menuId);
  }
}

function depressButton(button) {
  if(pageLoaded || indexPage) { // pageLoaded is set to TRUE when one of the templates below is fully loaded in browser
                   // (index.jsp, template.jsp, portaltemplate.jsp)

      var x, y;

      // Update the button's style class to make it look like it's
      // depressed.

      button.className += " menuButtonActive";

      // [MODIFIED] Added for activate/deactivate on mouseover.

      // Set mouseout event handler for the button, if not already done.

      if (button.onmouseout == null)
        button.onmouseout = buttonOrMenuMouseout;
      if (button.menu.onmouseout == null)
        button.menu.onmouseout = buttonOrMenuMouseout;

      // [END MODIFIED]

      // Position the associated drop down menu under the button and
      // show it.

      x = getPageOffsetLeft(button);
      y = getPageOffsetTop(button) + button.offsetHeight;

      // For IE, adjust position.

      if (browser.isIE) {
        x += button.offsetParent.clientLeft;
        y += button.offsetParent.clientTop;

      }

      button.menu.style.left = x + "px";
      button.menu.style.top  = y-3 + "px";
      button.menu.style.visibility = "visible";

  }
}

function resetButton(button) {

  // Restore the button's style class.

  removeClassName(button, "menuButtonActive");

  // Hide the button's menu, first closing any sub menus.

  if (button.menu != null) {
    closeSubMenu(button.menu);
    button.menu.style.visibility = "hidden";
    if(browser.isIE) {
        if(!indexPage && !browser.isOpera)
        hideIframe("ifr"+crtSubMenus);
        crtSubMenus--;
    }
  }
}

//----------------------------------------------------------------------------
// Code to handle the menus and sub menus.
//----------------------------------------------------------------------------

function menuMouseover(event) {

  var menu;

  // Find the target menu element.

  if (browser.isIE)
    menu = getContainerWith(window.event.srcElement, "DIV", "menu");
  else
    menu = event.currentTarget;

  // Close any active sub menu.

  if (menu.activeItem != null)
    closeSubMenu(menu);
}

function menuItemMouseover(event, menuId) {

  var item, menu, x, y;

  // Find the target item element and its parent menu element.

  if (browser.isIE)
    item = getContainerWith(window.event.srcElement, "A", "menuItem");
  else
    item = event.currentTarget;
  menu = getContainerWith(item, "DIV", "menu");

  // Close any active sub menu and mark this one as active.

  if (menu.activeItem != null)
    closeSubMenu(menu);
  menu.activeItem = item;

  // Highlight the item element.

  item.className += " menuItemHighlight";

  // Initialize the sub menu, if not already done.

  if (item.subMenu == null) {
     
    item.subMenu = document.getElementById(menuId);
    if (item.subMenu.isInitialized == null)
      menuInit(item.subMenu);
  }

  // [MODIFIED] Added for activate/deactivate on mouseover.

  // Set mouseout event handler for the sub menu, if not already done.

  if (item.subMenu.onmouseout == null)
    item.subMenu.onmouseout = buttonOrMenuMouseout;

  // [END MODIFIED]

  // Get position for submenu based on the menu item.

  x = getPageOffsetLeft(item) + item.offsetWidth;
  y = getPageOffsetTop(item);

  // Adjust position to fit in view.

  var maxX, maxY;

  if (browser.isNS) {
    maxX = window.scrollX + window.innerWidth;
    maxY = window.scrollY + window.innerHeight;
  }
  if (browser.isIE) {
    maxX = Math.max(document.documentElement.scrollLeft, document.body.scrollLeft) +
      (document.documentElement.clientWidth != 0 ? document.documentElement.clientWidth : document.body.clientWidth);
    maxY = Math.max(document.documentElement.scrollTop, document.body.scrollTop) +
      (document.documentElement.clientHeight != 0 ? document.documentElement.clientHeight : document.body.clientHeight);
  }
  maxX -= item.subMenu.offsetWidth;
  maxY -= item.subMenu.offsetHeight;

  if (x > maxX)
    x = Math.max(0, x - item.offsetWidth - item.subMenu.offsetWidth
      + (menu.offsetWidth - item.offsetWidth));
  y = Math.max(0, Math.min(y, maxY));

  // Position and show the sub menu.

  item.subMenu.style.left = x + "px";
  item.subMenu.style.top  = y + "px";
  item.subMenu.style.visibility = "visible";
    if (browser.isIE) {
      crtSubMenus++;
      if(!indexPage && !browser.isOpera)
      showIframe("ifr"+crtSubMenus, item.subMenu.offsetWidth, item.subMenu.offsetHeight, item.subMenu.offsetLeft, item.subMenu.offsetTop);
    }
  // Stop the event from bubbling.

  if (browser.isIE)
    window.event.cancelBubble = true;
  else
    event.stopPropagation();
}

function closeSubMenu(menu) {

  if (menu == null || menu.activeItem == null)
    return;

  // Recursively close any sub menus.

  if (menu.activeItem.subMenu != null) {
    closeSubMenu(menu.activeItem.subMenu);
    menu.activeItem.subMenu.style.visibility = "hidden";
    if(browser.isIE) {
        if(!indexPage && !browser.isOpera)
            hideIframe("ifr"+crtSubMenus);
        crtSubMenus--;
    }
    menu.activeItem.subMenu = null;
  }
  removeClassName(menu.activeItem, "menuItemHighlight");
  menu.activeItem = null;
}

// [MODIFIED] Added for activate/deactivate on mouseover. Handler for mouseout
// event on buttons and menus.

function buttonOrMenuMouseout(event) {

  var el;

  // If there is no active button, exit.

  if (activeButton == null)
    return;

  // Find the element the mouse is moving to.

  if (browser.isIE)
    el = window.event.toElement;
  else if (event.relatedTarget != null)
      el = (event.relatedTarget.tagName ? event.relatedTarget : event.relatedTarget.parentNode);

  // If the element is not part of a menu, reset the active button.

  if (getContainerWith(el, "DIV", "menu") == null) {
    resetButton(activeButton);
    activeButton = null;
  }
}

// [END MODIFIED]

//----------------------------------------------------------------------------
// Code to initialize menus.
//----------------------------------------------------------------------------
function menuInit(menu) {

  var itemList, spanList;
  var textEl, arrowEl;
  var itemWidth;
  var w, dw;
  var i, j;

  // For IE, replace arrow characters.

  if (browser.isIE) {
    menu.style.lineHeight = "2.5ex";
    spanList = menu.getElementsByTagName("SPAN");
    for (i = 0; i < spanList.length; i++)
      if (hasClassName(spanList[i], "menuItemArrow")) {
        spanList[i].style.fontFamily = "Webdings";
        spanList[i].firstChild.nodeValue = "4";
      }
  }

  // Find the width of a menu item.

  itemList = menu.getElementsByTagName("A");
  if (itemList.length > 0)
    itemWidth = itemList[0].offsetWidth;
  else
    return;

  // For items with arrows, add padding to item text to make the
  // arrows flush right.

  for (i = 0; i < itemList.length; i++) {
    spanList = itemList[i].getElementsByTagName("SPAN");
    textEl  = null;
    arrowEl = null;
    for (j = 0; j < spanList.length; j++) {
      if (hasClassName(spanList[j], "menuItemText"))
        textEl = spanList[j];
      if (hasClassName(spanList[j], "menuItemArrow"))
        arrowEl = spanList[j];
    }
    if (textEl != null && arrowEl != null)
      textEl.style.paddingRight = (itemWidth
        - (textEl.offsetWidth + arrowEl.offsetWidth)) + "px";
  }

  // Fix IE hover problem by setting an explicit width on first item of
  // the menu.

  if (browser.isIE) {
    w = itemList[0].offsetWidth;
    itemList[0].style.width = w + "px";
    dw = itemList[0].offsetWidth - w;
    w -= dw;
    itemList[0].style.width = w + "px";
  }

  // Mark menu as initialized.
  menu.isInitialized = true;
}

//----------------------------------------------------------------------------
// General utility functions.
//----------------------------------------------------------------------------

function getContainerWith(node, tagName, className) {

  // Starting with the given node, find the nearest containing element
  // with the specified tag name and style class.

  while (node != null) {
    if (node.tagName != null && node.tagName == tagName &&
hasClassName(node, className))
      return node;
    node = node.parentNode;
  }

  return node;
}

function hasClassName(el, name) {

  var i, list;

  // Return true if the given element currently has the given class
  // name.

  list = el.className.split(" ");
  for (i = 0; i < list.length; i++)
    if (list[i] == name)
      return true;

  return false;
}

function removeClassName(el, name) {

  var i, curList, newList;

  if (el.className == null)
    return;

  // Remove the given class name from the element's className property.

  newList = new Array();
  curList = el.className.split(" ");
  for (i = 0; i < curList.length; i++)
    if (curList[i] != name)
      newList.push(curList[i]);
  el.className = newList.join(" ");
}

function getPageOffsetLeft(el) {

  var x;

  // Return the x coordinate of an element relative to the page.

  x = el.offsetLeft;
  if (el.offsetParent != null)
    x += getPageOffsetLeft(el.offsetParent);

  return x;
}

function getPageOffsetTop(el) {

  var y;

  // Return the x coordinate of an element relative to the page.

  y = el.offsetTop;
  if (el.offsetParent != null)
    y += getPageOffsetTop(el.offsetParent);

  return y;
}
/**
*  This function does nothing. It is used on links
* that have no url.
*
*/
function nothing (){

}

/**
*   Creates an additional IFRAME that covers a possible combobox and displays
* a menu/submenu over comboboxes
*
*/
function createIframe(ifrNm, ifrWidth, ifrHeight, ifrPosX, ifrPosY) {

		ifrName = document.createElement("IFRAME");
		ifrName.style.position = "absolute";
		ifrName.style.top = ifrPosY;
		ifrName.style.left = ifrPosX;
		ifrName.style.width = ifrWidth;
		ifrName.style.height = ifrHeight;
		ifrName.id=ifrNm;
		ifrName.name=ifrNm;
        ifrName.src="blank.html";
        document.body.appendChild(ifrName);
}

/**
*   Removes an additional IFRAME created to display
* a menu/submenu over comboboxes
*/
function removeIframe(ifrName) {
		ifrToRemove = document.getElementById(ifrName);
		if(ifrToRemove)
		{
			ifrToRemove.parentNode.removeChild(ifrToRemove);
		}
}

/**
*   Displays an IFRAME over a combobox for showing
* a menu/submenu over comboboxes
*/
function showIframe(ifrName, ifrWidth, ifrHeight, ifrPosX, ifrPosY) {
    ifrm = document.getElementById(ifrName);

    if(ifrm)
    {
        ifrm.style.position = "absolute";
        ifrm.style.top = ifrPosY;
        ifrm.style.left = ifrPosX;
        ifrm.style.width = ifrWidth;
        ifrm.style.height = ifrHeight;
        ifrm.style.visibility = "visible";
    }
    else
    {
        createIframe(ifrName, ifrWidth, ifrHeight, ifrPosX, ifrPosY);
    }
}

/**
*   Hides an IFRAME displayed over a combobox
*/
function hideIframe(ifrName) {
    ifrm = document.getElementById(ifrName);
    if(ifrm)
        ifrm.style.visibility = "hidden";
}

/**
*   When page is loaded, the user's applications table is hidden
*/
var app_table_visible = false;

/**
*   Show/Hide the table with the user'a applications
*/
function showHideApplicationsTable() {

    if (app_table_visible == false){
        app_table_visible = true;
            document.getElementById('app_table_div').style.visibility='visible';
    }else {
        app_table_visible = false;
            document.getElementById('app_table_div').style.visibility='hidden';
    }
}


var menuAppOn = false;

function onApplicationMenuMouseOver(){
    //if(document.all)
    var x = document.getElementById('appDiv').offsetLeft;
    var y = document.getElementById('appDiv').offsetTop;

    if(browser.isIE || browser.isNS){
        if(navigator.userAgent.toLowerCase().indexOf("firefox") != -1){
            document.getElementById('app_table_div').style.left = x - 200;
            document.getElementById('app_table_div').style.top = y + 20;
        }else{
            document.getElementById('app_table_div').style.left = x + 200;
            document.getElementById('app_table_div').style.top = y + 20;
        }
    }
    document.getElementById('app_table_div').style.visibility = 'visible';

    setAppMenuOn();
}

function onApplicationMenuMouseOut(){
    setAppMenuOff();
}

function checkApplicationMenu(){
    if(!menuAppOn)
        document.getElementById('app_table_div').style.visibility = 'hidden';
}

function setAppMenuOn(){
    menuAppOn = true;
}

function setAppMenuOff(){
    menuAppOn = false;
    setTimeout('checkApplicationMenu()',1000);
}