${use json data/users as users}
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="style.css" />
	</head>
	<body>
		${ if request.x > 5 }
		
		<h1>Welcome, {{ users.name }}</h1>
		
		${ else }
	    
	    <h1>Bye, {{ users.name }}</h1>

	    ${ endif }
	</body>
</html>