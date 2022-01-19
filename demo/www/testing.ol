${use service time}
${use json data/user as user}
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <!-- Testing comment... -->
        
        ${getCurrentDateTime@Time()(time)}
        <h1>Welcome, {{ user.name }}</h1>

        ${a = 7}
        ${b = 3}
        <h1>{{ a }} + {{ b }} = {{ a+b }}</h1>
        <h1>{{ a }} / {{ b }} = {{ a/b }}</h1>
        <h1>{{ a }} * {{ b }} = {{ a*b }}</h1>
        <h1>{{ a }} - {{ b }} = {{ a-b }}</h1>

        <p>The time is: {{ time }}</p>
    </body>
</html>