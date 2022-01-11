${use json data/user as user}
${use service string_utils}
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="style.css" />
	</head>
	<body>
		${ x = user.name | toUpperCase@StringUtils }
		
		<h1>Welcome, {{ x }}</h1>

		<p>Your age is {{ user.age }}</p>
	</body>
</html>