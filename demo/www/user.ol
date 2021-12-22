${use json data/user as user}
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="style.css" />
	</head>
	<body>
		${ include menu.ol user=user.name }

		<h1>Welcome, {{ user.name }}</h1>

		<p>Your age is {{ user.age }}</p>
	</body>
</html>