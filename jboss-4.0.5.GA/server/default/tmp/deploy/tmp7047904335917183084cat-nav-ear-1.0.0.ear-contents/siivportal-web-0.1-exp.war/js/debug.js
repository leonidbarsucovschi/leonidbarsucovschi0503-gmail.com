/**
*   Creates an IFRAME where required logs will be displayed
*/
function debuggerObj(objName, objPosX, objPosY, objWidth, objHeight) {
   objIfrm = document.createElement("IFRAME");
   objIfrm.name = objName;
   objIfrm.id = objName;
   objIfrm.style.position="absolute";
   objIfrm.style.top = objPosY;
   objIfrm.style.left = objPosX;
   objIfrm.style.width = objWidth;
   objIfrm.style.height = objHeight;
   objIfrm.src="";
   document.body.appendChild(objIfrm);

   this.name = objName;
}

/**
*   Writes a log into the debugger IFRAME
*
*/
debuggerObj.prototype.log = function(ifrName, paramName, paramValue) {
   ifrm = document.frames[ifrName];
   if(ifrm)
   {
       document.frames(ifrName).document.write("<br>"+paramName+" = "+paramValue);
   }
}

/**
*   Example of using debuggerObj
*

    objDebug = new debuggerObj("objDebug",300,300,300,300);
    objDebug.log(objDebug.name, "Iframe name",objDebug.name);

*/
