${ use service ..app.api }
${param header_cookies{?}}
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Conduit</title>
    <!-- Import Ionicon icons & Google Fonts our Bootstrap theme relies on -->
    <link href="//code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" rel="stylesheet" type="text/css">
    <link href="//fonts.googleapis.com/css?family=Titillium+Web:700|Source+Serif+Pro:400,700|Merriweather+Sans:400,700|Source+Sans+Pro:400,300,600,700,300italic,400italic,600italic,700italic"
          rel="stylesheet" type="text/css">
    <!-- Import the custom Bootstrap 4 theme from our hosted CDN -->
    <link rel="stylesheet" href="//demo.productionready.io/main.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</head>
<body>

<nav class="navbar navbar-light">
    <div class="container">
        <a class="navbar-brand" href="/">conduit</a>
        <ul class="nav navbar-nav pull-xs-right">
            <li class="nav-item">
                <!-- Add "active" class when you're on that page" -->
                <a class="nav-link active" href="/">Home</a>
            </li>
            ${ isAuth@Api(header_cookies)(isAuth) }
            ${ if isAuth == false }
                <li class="nav-item">
                    <a class="nav-link" href="/login">Sign in</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/register">Sign up</a>
                </li>
            ${else}
                <li class="nav-item">
                    <a class="nav-link" href="/articles/create">
                        <i class="ion-compose"></i>&nbsp;New Article
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/settings">
                        <i class="ion-gear-a"></i>&nbsp;Settings
                    </a>
                </li>
                ${ me@Api(header_cookies.token)(user) }
                <li class="nav-item">
                    <a class="nav-link ng-binding" href="/settings">
                      <img class="user-pic" src="{{ user.user.image }}">
                      {{ user.user.username }}
                    </a>
                  </li>
            ${endif}
        </ul>
    </div>
</nav>

