${ use service ..app.api }

<h1>Ping</h1>
${ me@Api(cookies.token)(response) }
<p>{{ response }}</p>
