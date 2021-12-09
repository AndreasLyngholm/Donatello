${use service time}
${use json data/users as users}
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="style.css" />
	</head>
	<body>
		${getCurrentDateTime@Time()(time.test)}
		${@print "<p>My name is " + users.name + " and I am " + users.age + " years old.</p>" }
		${@print "<p>The time right now is " + time + "</p>"}
	</body>
</html>