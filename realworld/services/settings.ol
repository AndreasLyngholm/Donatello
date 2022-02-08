from GatewayInterfaceModule import GatewayInterface
from runtime import Runtime
from PageInterfaceModule import PageInterface
from file import File
from json_utils import JsonUtils
from console import Console
from ..app.api import Api 


type Params {
    location:string
    root:string
    contentDir:string
    servicesDir:string
    defaultPage:string
    routes:string
    token?:undefined
    
}

service Main( params:Params ) {
    embed Runtime as Runtime
    embed File as File
    embed JsonUtils as JsonUtils
    embed Console as Console
    embed Api as Api 


    define operations {
        document += "
document += header.ol 
document += "
document += "
me@Api(token)(user)
document += "
document += user.image
document += "\" class=\"form-control\" type=\"text\" placeholder=\"URL of profile picture\">
document += user.username
document += "\" class=\"form-control form-control-lg\" type=\"text\" placeholder=\"Your Name\">
document += user.bio
document += "</textarea>
document += user.email
document += "\" class=\"form-control form-control-lg\" type=\"text\" placeholder=\"Email\">
if (request.error!=null) { 
document += "
document += params.cookies.error
document += "</i>
} 
document += "
document += token
document += "'
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

            token = params.token 

            default@Gateway( {operation = "header.ol", token << token, compile = false} )( header.ol ) 
default@Gateway( {operation = "layouts/footer.html", compile = false} )( layouts_footer.html ) 


            operations
            response = document
        }
    }
}