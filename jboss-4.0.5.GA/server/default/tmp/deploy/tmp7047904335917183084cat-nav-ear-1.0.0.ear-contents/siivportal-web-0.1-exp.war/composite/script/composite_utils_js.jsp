<%--
 *
 * composite_utils.jsp
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
    Trims whitespace from left and right sides of s.
------------------------------------------------------------------------------%>
function compositeTrim(s) {
    return s.replace( /^\s*/, "" ).replace( /\s*$/, "" );
}

<%----------------------------------------------------------------------------

----------------------------------------------------------------------------%>
function compositeGetOptionText(optionsElemId) {
    var optionsElm = document.getElementById(optionsElemId);

    if (optionsElm.selectedIndex == -1) {
        return "";
    }

    var elem = optionsElm.options[optionsElm.selectedIndex];
    return isNaN(parseInt(elem.value)) ? "" : elem.text;
}

<%----------------------------------------------------------------------------
	Invoker class definition
----------------------------------------------------------------------------%>
function Invoker(object, func, params) {
	this.object = object;
	this.func = func;
	this.params = params;
}

Invoker.prototype.getObject = function(){
	return this.object;
}

Invoker.prototype.setObject = function(object){
	this.object = object;
}

Invoker.prototype.getFunction = function(){
	return this.func;
}

Invoker.prototype.setFunction = function(func){
	this.func = func;
}

Invoker.prototype.getParams = function(){
	return this.params;
}

Invoker.prototype.setParams = function(params){
	this.params = params;
}

Invoker.prototype.invoke = function(){
	return this.func.apply(this.object, this.params);
}

<%----------------------------------------------------------------------------
	Invocation array definition
----------------------------------------------------------------------------%>
function InvocationArray(){	
}

InvocationArray.prototype.permanentHandlers = new Array();
InvocationArray.prototype.temporaryHandlers = new Array();

InvocationArray.prototype.addPermHandler = function(inv) {
	this.permanentHandlers[this.permanentHandlers.length] = inv;
}

InvocationArray.prototype.addTempHandler = function(inv) {
	this.temporaryHandlers[this.temporaryHandlers.length] = inv;
}

InvocationArray.prototype.removeTempHandler = function(inv) {
	for (var i = 0; i < this.temporaryHandlers.length; i++)
		if (inv.object == this.temporaryHandlers[i].object 
			&& inv.func == this.temporaryHandlers[i].func) {

			if (this.temporaryHandlers[i].params.length != inv.params.length) continue;
			for (var j = 0; j < this.temporaryHandlers[i].params.length ; j++)
				if (this.temporaryHandlers[i].params[j] != inv.params[j]) continue;
			this.temporaryHandlers.splice(i, 1);
			break;
		}

}

InvocationArray.prototype.run = function() {
	for (var i = 0 ; i < this.permanentHandlers.length ; i++) {
		if (! this.permanentHandlers[i].invoke())
			return false;
	}

	for (var i = 0 ; i < this.temporaryHandlers.length ; i++) {
		if (! this.temporaryHandlers[i].invoke())
			return false;
	}

	this.temporaryHandlers.length = 0;

	return true;
}

<%----------------------------------------------------------------------------
	Invocation array variable
----------------------------------------------------------------------------%>
var __invocationArray = new InvocationArray();

<%----------------------------------------------------------------------------
	Frame finding function.
----------------------------------------------------------------------------%>
function findFrame(frameName){
	var result = findFrameInWindow(top, frameName);
	return result;
}

function findFrameInWindow(win, frameName){
	for (var i = 0; i < win.frames.length; i++)
	{
		if (win.frames[i].name == frameName)
			return win.frames[i];

		var result = findFrameInWindow(win.frames[i], frameName);
		if (result != null)
			return result;		
	}
	return null;
}

<%----------------------------------------------------------------------------
	Position class definition.
----------------------------------------------------------------------------%>
function Position(elemx, elemy) {
	this.x = elemx;
	this.y = elemy;
}

Position.prototype.add = function(pos) {
	this.x += pos.x;
	this.y += pos.y;
	return this;
}

Position.prototype.toString = function() {
	return "(" + this.x + "," + this.y + ")";
}

<%----------------------------------------------------------------------------
	Position calculator function.
----------------------------------------------------------------------------%>
function calcElemPosition(elem) {
	if (elem == document.body) {
		return new Position(elem.offsetLeft, elem.offsetTop);
	}
	return (new Position(elem.offsetLeft, elem.offsetTop)).
		add(calcElemPosition(elem.offsetParent));
}