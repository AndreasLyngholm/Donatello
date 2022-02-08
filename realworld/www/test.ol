${ use service ..app.api }
${param token:string}

<h1>Ping</h1>
<h1>{{ token }}</h1>
${ me@Api(token)(response) }
<p>{{ response }}</p>
