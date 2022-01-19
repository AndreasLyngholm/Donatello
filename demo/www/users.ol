${use json data/users as data}
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        ${ include layout/header.html }
        <hr>

        <h1>List of all users...</h1>

        ${ for user in data.users }

        Go to <a href="users/{{ user.id }}">{{ user.name }}</a>
        <br>

        ${ endfor }

        <hr>
        ${ include layout/footer.html }
    </body>
</html>