from GatewayInterfaceModule import GatewayInterface
from runtime import Runtime
from PageInterfaceModule import PageInterface
from file import File
from ..app.api import Api 


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
    embed Api as Api 


    define operations {
        document += "\n\n<h1>Ping</h1>\n"
ping@Api()(response)
document += "\n<p>"
document += response
document += "</p>\n\n<hr>\n\n<h1>Login</h1>\n"

	login@Api({ .email = "alp@pensopay.com", .password = "efg94pjd" })(token)
document += "\n<p>"
document += token
document += "</p>\n\n<hr>\n\n<h1>User</h1>\n"
me@Api()(user)
document += "\n<p>"
document += user
document += "</p>"

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

            
            

            operations
            response = document
        }
    }
}