<%--
 *
 * jportal_http_request_js.jsp
 *
 * Copyright (c) 2006 UTI Systems. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of UTI Systems.
 *
--%>

<%@ page language="java" %>
<%@ page contentType="text/javascript; charset=iso-8859-2"%>

<%------------------------------------------------------------------------------

    Sends synchronous HTTP requests to server and receives back the
    responses. Usage is very simple:

      var request = new JpfHttpRequest("http://.../resource", "p1=v1&p2=v2");
      var response = request.send();

    By default POST requests are sent to server and responses must
    use UTF-8 char encoding.

------------------------------------------------------------------------------%>


<%------------------------------------------------------------------------------
    Constructs a new "JpfHttpRequest" instance.

    url     the absolute or relative URL to server side resource to which
            the HTTP request will be sent
    data    the data to be sent to server; can be NULL
------------------------------------------------------------------------------%>

function JpfHttpRequest(url, data) {
    if (JpfHttpRequest.httpRequest == null) {
        throw "Class initialization failed: no XMLHttpRequest";
    }

    this.requestURL = url;
    this.requestData = data;

    /* Default values for request attributes */
    this.method = "POST";
    this.contentType = "application/x-www-form-urlencoded";
    this.acceptCharset = "UTF-8";
}

<%------------------------------------------------------------------------------
    Mirror class, to be used for extending "JpfHttpRequest" class.
------------------------------------------------------------------------------%>

function __JpfHttpRequest() {}
__JpfHttpRequest.prototype = JpfHttpRequest.prototype;
__JpfHttpRequest.prototype.JpfAjax = JpfHttpRequest;

<%------------------------------------------------------------------------------
    The JavaScript object used for sending requests to server.
------------------------------------------------------------------------------%>

if (typeof (JpfHttpRequest.httpRequest) == "undefined") {
    try {
        if (typeof(XMLHttpRequest) == "undefined") {
            JpfHttpRequest.httpRequest = function() {
                return new ActiveXObject("Microsoft.XMLHTTP");
            };
        } else {
            JpfHttpRequest.httpRequest = XMLHttpRequest;
        }
    } catch (exc) {
        JpfHttpRequest.httpRequest = null;
    }
}

<%------------------------------------------------------------------------------
    Sends the request to server.

    Returns the response, NULL if fails (the status != 200).
------------------------------------------------------------------------------%>

JpfHttpRequest.prototype.send = function() {
    var req = new JpfHttpRequest.httpRequest();

    req.open(this.method, this.requestURL, false);
    this.setRequestHeaders(req);

    try {
        req.send(this.requestData);
        var succeeded = req.status == 200;
    } catch (e) {
        var succeeded = false;
    }

    return succeeded ? req.responseText : null;
}

<%------------------------------------------------------------------------------
    Sets request headers.

    Warning: it seems that Opera v8.01 does not support custom headers.

    req   the XMLHttpRequest instance for which the headers
          must be set
------------------------------------------------------------------------------%>

JpfHttpRequest.prototype.setRequestHeaders = function(req) {
    req.setRequestHeader("Accept-Charset", this.acceptCharset);
    req.setRequestHeader("Content-Type", this.contentType);
}

<%------------------------------------------------------------------------------
    Setter for the method to be used for sending the request. Can
    be "POST" (default value) or "GET".

    value   the value
------------------------------------------------------------------------------%>

JpfHttpRequest.prototype.setMethod = function(value) {
    this.method = value;
}

<%------------------------------------------------------------------------------
    Setter for the value of "Content-Type" request header.

    value   the value
------------------------------------------------------------------------------%>

JpfHttpRequest.prototype.setContentType = function(value) {
    this.contentType = value;
}

<%------------------------------------------------------------------------------
    Setter for the value of "Accept-Charset" request header.

    value   the value
------------------------------------------------------------------------------%>

JpfHttpRequest.prototype.setAcceptCharset = function(value) {
    this.acceptCharset = value;
}
