${param user{?}}
${use service string_utils}
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="../style.css" />
    </head>
    <body>
        ${ include menu.ol user=user }
        
        <h1>Welcome, {{ user.name | toUpperCase@StringUtils }}</h1>

        <p>Your age is {{ user.age }}</p>
    </body>
</html>