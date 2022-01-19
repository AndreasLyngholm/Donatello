from GatewayInterfaceModule import GatewayInterface
from runtime import Runtime
from PageInterfaceModule import PageInterface
from file import File


type Params {
    location:string
    root:string
    contentDir:string
    servicesDir:string
    defaultPage:string
    routes:string
    
}

service Main( params:Params ) {
    embed Runtime as Runtime
    embed File as File
    

    define operations {
        document += layouts_header.html 
document += "
\n<div class=\"auth-page\">
\n    <div class=\"container page\">
\n        <div class=\"row\">
\n
\n            <div class=\"col-md-6 offset-md-3 col-xs-12\">
\n                <h1 class=\"text-xs-center\">Login</h1>
\n                <p class=\"text-xs-center\">
\n                    <a href=\"signup\">Need an account?</a>
\n                </p>
\n
\n                <form>
\n                    <fieldset class=\"form-group\">
\n                        <input class=\"form-control form-control-lg\" type=\"text\" placeholder=\"Email\">
\n                    </fieldset>
\n                    <fieldset class=\"form-group\">
\n                        <input class=\"form-control form-control-lg\" type=\"password\" placeholder=\"Password\">
\n                    </fieldset>
\n                    <button class=\"btn btn-lg btn-primary pull-xs-right\">
\n                        Login
\n                    </button>
\n                </form>
\n            </div>
\n
\n        </div>
\n    </div>
\n</div>
\n"
document += layouts_footer.html 

    }

    execution { single }

    inputPort Local {
        location: "local"
        interfaces: PageInterface
    }

    outputPort Gateway {
        location: "socket://localhost:8000"
        protocol: http { format = "json" }
        interfaces: GatewayInterface
    }

    outputPort Page {
        interfaces: PageInterface
    }

    init {
        getLocalLocation@Runtime()(Page.location)
        document = ""
    }

    main {
        getDocument(request)(response) {

            
            default@Gateway( {operation = "layouts/header.html", compile = false} )( layouts_header.html ) 
default@Gateway( {operation = "layouts/footer.html", compile = false} )( layouts_footer.html ) 


            operations
            response = document
        }
    }
}