<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="style.css" />
	</head>
	<body>
		${x = request.x}
		${@print "<p>Request param x = " + x + "</p>\n"}

		${a = 1}
		${b = 3}
		${c = a + b}
		${@print c}
	</body>
</html>