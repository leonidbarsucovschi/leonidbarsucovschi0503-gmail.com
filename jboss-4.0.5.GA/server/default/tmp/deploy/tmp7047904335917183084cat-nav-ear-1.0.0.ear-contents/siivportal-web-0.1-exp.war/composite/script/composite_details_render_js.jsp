<%--
 *
 * composite_details_render_js.jsp
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

<%-- imports --%>
<%@ page import="ro.uti.jpf.base.composite.util.CompositePresentationConst"%>

<%------------------------------------------------------------------------------
    The JavaScript class that encapsulates the properties for a detail.
------------------------------------------------------------------------------%>

  <%-- Constructs a "CompositeDetailBean" instance. --%>
function CompositeDetailBean(id, label) {
    this.detailID = id;
    this.detailLabel = label;
}

  <%-- Getter for detail's ID --%>
CompositeDetailBean.prototype.getID = function() {
    return this.detailID;
}
  <%-- Getter for detail's label --%>
CompositeDetailBean.prototype.getLabel = function() {
    return this.detailLabel;
}

<%------------------------------------------------------------------------------
    Constructs a new "CompositeDetailsTabs" instance.

    This class handles scripting functionality when the details are rendered
    using tabs.

    @param details    the array with details; each element must be
                      a "CompositeDetailBean" instance
    @param currDetID  the ID of current detail
------------------------------------------------------------------------------%>

function CompositeDetailsTabs(details, currDetID) {
    this.detailsList = details;
    this.currentDetailID = currDetID;

    this.compositeTabs = null;
}

<%------------------------------------------------------------------------------
    The mirror class of "CompositeDetailsTabs" class, which must be used
    when extending this class.
------------------------------------------------------------------------------%>

function __CompositeDetailsTabs() {}
__CompositeDetailsTabs.prototype = CompositeDetailsTabs.prototype;
__CompositeDetailsTabs.prototype.CompositeDetailsTabs = CompositeDetailsTabs;

<%------------------------------------------------------------------------------
    Called after the HTML code used for rendering the details is loaded.
------------------------------------------------------------------------------%>

CompositeDetailsTabs.prototype.pageLoaded = function() {
    this.compositeTabs =
            new CompositeTabs("tabs_row", this.getChangeDetailHandler());

    for (i = 0; i < this.detailsList.length; i++) {
        this.compositeTabs.addTab(
                new CompositeTabBean(this.detailsList[i].getID(),
                        this.detailsList[i].getLabel()));
    }

    this.compositeTabs.renderTabs();
    this.currentDetailPageLoaded(this.currentDetailID);
}

<%------------------------------------------------------------------------------
    Called when the user clicks on a tab.
------------------------------------------------------------------------------%>

function onCompositeChangeDetail(tabID) {
    compositeChangeCurrentDetail(tabID, false);
    return false;
}

<%------------------------------------------------------------------------------
    Getter for the method that is called when the user click on a tab.
------------------------------------------------------------------------------%>

CompositeDetailsTabs.prototype.getChangeDetailHandler = function() {
    return onCompositeChangeDetail;
}

<%------------------------------------------------------------------------------
    Called after the HTML code for current detail is loaded by browser.

    @param detailID   the ID of the current detail
------------------------------------------------------------------------------%>

CompositeDetailsTabs.prototype.currentDetailPageLoaded = function(detailID) {
    this.currentDetailID = detailID;

    compositeCallComponentPageLoadedFunction(detailID);
    this.compositeTabs.selectTab(detailID);

    compositeReplaceFocusFunction(detailID);
}

<%------------------------------------------------------------------------------
    Getter for the ID of current detail.
------------------------------------------------------------------------------%>

CompositeDetailsTabs.prototype.getCurrentDetailID = function() {
    return this.currentDetailID;
}

<%------------------------------------------------------------------------------
    Called to validate the properties for current component.

    Returns TRUE if validation succeeds, FALSE if at least one property
    contains an invalid value.
------------------------------------------------------------------------------%>

CompositeDetailsTabs.prototype.validateDetailsFormData = function() {
    if (compositeComponentRequiresValidation(this.currentDetailID)) {
        return compositeValidateComponentFormData(this.currentDetailID);
    }

    return true;
}

<%------------------------------------------------------------------------------
    Called to set the error flag for a detail.

    @param detailID   the ID of the detail
    @param errorFlag  TRUE if the detail has error flag set, FALSE otherwise
------------------------------------------------------------------------------%>

CompositeDetailsTabs.prototype.setDetailErrorFlag = function(detailID,
        errorFlag) {
    this.compositeTabs.setErrorFlag(detailID, errorFlag);
}

<%------------------------------------------------------------------------------
    Constructs a new "CompositeDetailsList" instance.

    This class handles scripting functionality when the details are rendered
    as a list.


    @param details    the array with details; each element must be
                      a "CompositeDetailBean" instance
------------------------------------------------------------------------------%>

function CompositeDetailsList(details) {
    this.detailsList = details;
}

<%------------------------------------------------------------------------------
    The mirror class of "CompositeDetailsList" class, which must be used
    when extending this class.
------------------------------------------------------------------------------%>

function __CompositeDetailsList() {}
__CompositeDetailsList.prototype = CompositeDetailsList.prototype;
__CompositeDetailsList.prototype.CompositeDetailsList = CompositeDetailsList;

<%------------------------------------------------------------------------------
    Called after the HTML code used for rendering the details is loaded.
------------------------------------------------------------------------------%>

CompositeDetailsList.prototype.pageLoaded = function() {
    for (var i = 0; i < this.detailsList.length; i++) {
        compositeCallComponentPageLoadedFunction(this.detailsList[i].getID());
        compositeReplaceFocusFunction(this.detailsList[i].getID());
    }
}

<%------------------------------------------------------------------------------
    Called to validate the properties for current component.

    Returns TRUE if validation succeeds, FALSE if at least one property
    contains an invalid value.
------------------------------------------------------------------------------%>

CompositeDetailsList.prototype.validateDetailsFormData = function() {
    for (var i = 0; i < this.detailsList.length; i++)  {
        if (compositeComponentRequiresValidation(this.detailsList[i].getID())) {
            if (!compositeValidateComponentFormData(
                    this.detailsList[i].getID())) {
                return false;
            }
        }
    }

    return true;
}

<%------------------------------------------------------------------------------
    Called to set the error flag for a detail.

    @param detailID   the ID of the detail
    @param errorFlag  TRUE if the detail has error flag set, FALSE otherwise
------------------------------------------------------------------------------%>

CompositeDetailsList.prototype.setDetailErrorFlag = function(detailID,
        errorFlag) {
    var element = document.getElementById(
            "<%=CompositePresentationConst.COMPONENT_TITLE_ELEMENT_ID_PREFIX%>"
                    + detailID);

    element.className = "composite-detail-title-cell"
            + (errorFlag ? " error" : "");
}
