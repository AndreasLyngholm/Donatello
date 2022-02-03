${ include header.ol header_cookies=params.cookies }
${use service ..app.api }
<div class="auth-page">
    <div class="container page">
        <div class="row">

            <div class="col-md-6 offset-md-3 col-xs-12">
                <h1 class="text-xs-center">Login</h1>
                <p class="text-xs-center">
                    <a href="register">Need an account?</a>
                </p>

                <form name="login-form">
                    <fieldset class="form-group">
                        <input id="email" class="form-control form-control-lg" type="text" placeholder="Email">
                    </fieldset>
                    <fieldset class="form-group">
                        <input id="password" class="form-control form-control-lg" type="password" placeholder="Password">
                    </fieldset>
                    <button type="submit" class="btn btn-lg btn-primary pull-xs-right">
                        Login
                    </button>
                </form>
            </div>
        </div>
    </div>
</div>

<script>
$( document ).ready( function() {
  $("form[name=login-form]").submit(function(e) {
    e.preventDefault();

        $.post( "https://api.realworld.io/api/users/login", { user: { email: $("#email").val(), password: $("#password").val() } })
            .done(function( data ) {
                document.cookie = "token=" + data.user.token;
                window.location.replace("/");
        });
  })
});
</script>

${ include layouts/footer.html }