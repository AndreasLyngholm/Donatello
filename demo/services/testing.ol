include "services/base.ol"
define operations {
	document += "<!DOCTYPE html>
x = request.x
document += "<p>Request param x = " + x + "</p>\n"
a = 1
b = 3
c = a + b
document += c
	document += "</body>
	nullProcess
}