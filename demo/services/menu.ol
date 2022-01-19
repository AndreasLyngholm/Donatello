from GatewayInterfaceModule import GatewayInterface
from runtime import Runtime
from PageInterfaceModule import PageInterface
from file import File
from console import Console 


type Params {
    location:string
    root:string
    contentDir:string
    servicesDir:string
    defaultPage:string
    routes:string
    user{?} 

}

service Main( params:Params ) {
    embed Runtime as Runtime
    embed File as File
    embed Console as Console 


    define operations {
        document += "
\n"
document += "
\n
\n<h4>Test menu, param user = "
document += user.name
document += "</h4>"

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

            user << params.user 

            

            operations
            response = document
        }
    }
}