${ include header.ol header_cookies=params.cookies }
${use service ..app.api }
${ me@Api(params.cookies.token)(user) }
<div class="settings-page">
    <div class="container page">
        <div class="row">

            <div class="col-md-6 offset-md-3 col-xs-12">
                <h1 class="text-xs-center">Your Settings</h1>

                <form>
                    <fieldset>
                        <fieldset class="form-group">
                            <input value="{{ user.user.image }}" class="form-control" type="text" placeholder="URL of profile picture">
                        </fieldset>
                        <fieldset class="form-group">
                            <input value="{{ user.user.username }}" class="form-control form-control-lg" type="text" placeholder="Your Name">
                        </fieldset>
                        <fieldset class="form-group">
                            <textarea class="form-control form-control-lg" rows="8" placeholder="Short bio about you">{{ user.user.bio }}</textarea>
                        </fieldset>
                        <fieldset class="form-group">
                            <input value="{{ user.user.email }}" class="form-control form-control-lg" type="text" placeholder="Email">
                        </fieldset>
                        <fieldset class="form-group">
                            <input class="form-control form-control-lg" type="password" placeholder="Password">
                        </fieldset>
                        <button class="btn btn-lg btn-primary pull-xs-right">
                            Update Settings
                        </button>
                    </fieldset>
                </form>

                <hr>
                <a class="btn btn-outline-danger" href="/logout">
                    Or click here to logout.
                </a>
            </div>
        </div>
    </div>
</div>
${ include layouts/footer.html }