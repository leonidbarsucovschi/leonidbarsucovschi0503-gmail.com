<%--
 *
 * composite_tabs_js.jsp
 *
 * Copyright (c) 2005 UTI Systems. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of UTI Systems.
 *
--%>

<%@ page language="java" %>
<%@ page contentType="text/javascript; charset=iso-8859-2" %>

<%------------------------------------------------------------------------------
    A JavaScript class that encapsulates the properties for a tab element.
------------------------------------------------------------------------------%>

  <%-- Constructs a new CompositeTabBean instance --%>
function CompositeTabBean(tabID, tabLabel) {
    this.id = tabID;
    this.label = tabLabel;
}

  <%-- Getter for tab's ID --%>
CompositeTabBean.prototype.getID = function() {
    return this.id;
}

  <%-- Getter for tab's label --%>
CompositeTabBean.prototype.getLabel = function() {
    return this.label;
}

<%------------------------------------------------------------------------------
    Constructs a new "CompositeTabs" instance.

    @rowID            the ID of the table row (TR element) to which tabs will
                      be added
    @onclick          the function to be called when the user clicks on
                      a tab
------------------------------------------------------------------------------%>
function CompositeTabs(rowID, onclick) {
    if (arguments.length != 2) {
        alert("CompositeTabs: invalid number of arguments!");
        return;
    }

    this.tableRowId = rowID;
    this.onclickHandler = onclick;

    // the TD element for currently selected tab
    this.selectedTabElement = null;

    // the list with tabs TD elements
    this.tabsList = new Array();

    // TRUE if tabs were rendered, FALSE otherwise
    this.tabsRendered = false;
}

<%------------------------------------------------------------------------------
    Adds a new tab element.

    Note that the tab element is not rendered yet. After adding all tabs,
    the "renderTabs" method must be called.

    @tabBean          a "CompositeTabBean" instance
------------------------------------------------------------------------------%>
CompositeTabs.prototype.addTab = function(tabBean) {
    if (this.tabsRendered) {
        alert("CompositeTabs::addTab-Tabs cannot be added after "
                + "calling 'renderTabs' method!");

        return;
    }

    this.tabsList.push(this.createTabElement(tabBean));
}

<%------------------------------------------------------------------------------
    Creates the HTML element (TD) for a tab.

    @tabBean          the "CompositeTabBean" instance with tab's details
------------------------------------------------------------------------------%>
CompositeTabs.prototype.createTabElement = function(tabBean) {
    <%-- creates the TD element --%>
    var elm = document.createElement("TD");

    elm.noWrap = true;
    elm.appendChild(document.createTextNode(tabBean.getLabel()));

    <%-- sets the ID and class name for the TD element --%>
    elm.className = "composite-tab-normal";

    <%-- sets handlers  --%>
    elm.onclick = onCompositeTabClicked;

    elm.onmouseover = onCompositeTabMouseOver;
    elm.onmouseout = onCompositeTabMouseOut;

    <%-- sets element's tab specific properties --%>
    elm.compositeTabsInstance = this;
    elm.compositeTabBean = tabBean;
    elm.compositeIsMouseOver = false;
    elm.compositeErrorFlag = false;

    return elm;
}

<%------------------------------------------------------------------------------
    Renders the tabs. After calling this method, no other tabs can be
    added anymore.

    @selectTabID      the ID of the tab that must be selected; if not specified,
                      all tabs will be unselected
------------------------------------------------------------------------------%>
CompositeTabs.prototype.renderTabs = function(selectTabID) {
    if (this.tabsList.length == 0) {
        alert("CompositeTabs::renderTabs-There're no tabs to render!");
        return;
    }

    var rowelm = document.getElementById(this.tableRowId);

    for (var i = 0; i < this.tabsList.length; i++) {
        if (i > 0) {
            rowelm.appendChild(this.createSeparatorCellElement());
        }

        rowelm.appendChild(this.tabsList[i]);
    }

    this.tabsRendered = true;

    if (typeof(selectTabID) == "string") {
        this.selectTab(selectTabID);
    }
}

<%------------------------------------------------------------------------------
    Creates the table cell used as separator between tab cells.
------------------------------------------------------------------------------%>
CompositeTabs.prototype.createSeparatorCellElement = function() {
    var elm = document.createElement("TD");

    elm.className = "composite-tab-separator";
    elm.innerHTML = "<img src='composite/image/pixel.gif'/>";

    return elm;
}

<%------------------------------------------------------------------------------
    Getter for the ID of currently selected tab.
------------------------------------------------------------------------------%>
CompositeTabs.prototype.getSelectedTabId = function() {
    return this.selectedTabElement == null
            ? null : this.selectedTabElement.compositeTabBean.getID();
}

<%------------------------------------------------------------------------------
    Selects a tab.

    @tabID            the ID of the tab to select; if its not found, no tab
                      will be selected
------------------------------------------------------------------------------%>
CompositeTabs.prototype.selectTab = function(tabID) {
    if (!this.tabsRendered) {
        alert("CompositeTabs::selectTab - tabs aren't rendered");
        return;
    }

    if (this.getSelectedTabId() == tabID) {
        return;
    }

    var prevSelTabElm = this.selectedTabElement;

    for (i = 0, this.selectedTabElement = null; i < this.tabsList.length; i++) {
        if (this.tabsList[i].compositeTabBean.getID() == tabID) {
            this.selectedTabElement = this.tabsList[i];
            break;
        }
    }

    if (prevSelTabElm) {
        compositeUpdateTabElementStyleClass(prevSelTabElm);
    }

    if (this.selectedTabElement) {
        compositeUpdateTabElementStyleClass(this.selectedTabElement);
    }
}

<%------------------------------------------------------------------------------
    Updates a tab. It is called when tab is selected/unselected or when
    tab's error flag is changed.

    @tabElement       tab's TD element
------------------------------------------------------------------------------%>
function compositeUpdateTabElementStyleClass(tabElement) {
    var isSelected =
        (tabElement.compositeTabsInstance.selectedTabElement == tabElement);

    var className = "composite-tab-" + (isSelected ? "selected" : "normal");

    if (tabElement.compositeIsMouseOver) {
        className = className + "-mouseover";
    }

    if (tabElement.compositeErrorFlag) {
        className = className + " composite-tab-error";
    }

    if (tabElement.className != className) {
        tabElement.className = className;
    }
}

<%------------------------------------------------------------------------------
    Setter for the error flag for a tab.

    @tabID            the ID of the tab for which to set the error flag
    @errorFlag        the flag (TRUE/FALSE)
------------------------------------------------------------------------------%>
CompositeTabs.prototype.setErrorFlag = function(tabID, errorFlag) {
    for (var i = 0; i < this.tabsList.length; i++) {
        if (this.tabsList[i].compositeTabBean.getID() == tabID) {
            this.tabsList[i].compositeErrorFlag = errorFlag;
            compositeUpdateTabElementStyleClass(this.tabsList[i]);

            break;
        }
    }
}

<%------------------------------------------------------------------------------
    Called when the user moves the mouse cursor over a tab.

    The function is setted as event for tab's cell element, so "this" points
    to TD cell.
------------------------------------------------------------------------------%>
function onCompositeTabMouseOver() {
    this.compositeIsMouseOver = true;
    compositeUpdateTabElementStyleClass(this);
}

<%------------------------------------------------------------------------------
    Called when the mouse cursor leaves the area of a tab.

    The function is setted as event for tab's cell element, so "this" points
    to TD cell.
------------------------------------------------------------------------------%>
function onCompositeTabMouseOut () {
    this.compositeIsMouseOver = false;
    compositeUpdateTabElementStyleClass(this);
}

<%------------------------------------------------------------------------------
    Called when the user clicks over a tab.

    The function is setted as event for tab's cell element, so "this" points
    to TD cell.
------------------------------------------------------------------------------%>
function onCompositeTabClicked() {
    var id = this.compositeTabBean.getID();
    var isSelected = id == this.compositeTabsInstance.getSelectedTabId();

    var changeTab = isSelected
            ? false : this.compositeTabsInstance.onclickHandler(id);

    if (changeTab) {
        this.compositeTabsInstance.selectTab(id);
    }
}
