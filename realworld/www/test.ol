${ use service ..app.api }

<h1>Ping</h1>
${ ping@Api()(response) }
<p>{{ response }}</p>

<hr>

<h1>Login</h1>
${ raw }
	login@Api({ .email = "alp@pensopay.com", .password = "<PASSWORD>" })(token)
${ endraw }
<p>{{ token }}</p>

<hr>

<h1>User</h1>
${ me@Api()(user) }
<p>{{ user }}</p>