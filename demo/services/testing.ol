include "services/base.ol"
define operations {
	document += "<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n\t</head>\n\t<body>";
x = request.x
document += "<p>Request param x = " + x + "</p>\n"
a = 1
b = 3
c = a + b
document += c
	document += "</body>\n</html>";
	nullProcess
}