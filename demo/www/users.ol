${use json data/users as data}
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="style.css" />
	</head>
	<body>
		${ include layout/header.html }

		<h1>List of all users...</h1>

		${ for user in data.users }

		<p>Hi, {{ user.name }} your age is {{ user.age }}</p>

		${ endfor }

		${ include layout/footer.html }
	</body>
</html>