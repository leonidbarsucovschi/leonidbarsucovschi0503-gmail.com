//
// Capture mouse positions
//

var is_ie = ((agt.indexOf("msie") != -1) && (agt.indexOf("opera") == -1));

if (!is_ie) {
	document.captureEvents(Event.MOUSEMOVE)
}

document.onmousemove = getMouseXY;

var mousePosX = 0;
var mousePosY = 0;

function getMouseXY(e) {
	if (is_ie) {
		mousePosX = event.clientX + document.body.scrollLeft;
		mousePosY = event.clientY + document.body.scrollTop;
	}
	else {
		mousePosX = e.pageX;
		mousePosY = e.pageY;
	}

	if (mousePosX < 0) {
		mousePosX = 0;
	}

	if (mousePosY < 0) {
		mousePosY = 0;
	}

	return true;
}