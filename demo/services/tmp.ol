include "services/base.ol"
define operations {
	document += "<!DOCTYPE html>
\n<html>
\n\t<head>
\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />
\n\t</head>
\n\t<body>";
document += "<p>x = " + request.x + "</p>\n";
	document += "</body>
\n</html>";
	nullProcess
}