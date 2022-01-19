${use json data/user as user}
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        ${ if request.x > 5 }
        
        <h1>Welcome, {{ user.name }}</h1>
        
        ${ else }
        
        <h1>Bye, {{ user.name }}</h1>

        ${ endif }
    </body>
</html>