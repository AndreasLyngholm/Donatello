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
        document += "
\n<!DOCTYPE html>
\n<html>
\n\t<head>
\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />
\n\t</head>
\n\t<body>
\n\t\t"
if (request.x>5) { 
document += "
\n\t\t
\n\t\t<h1>Welcome, "
document += user.name
document += "</h1>
\n\t\t
\n\t\t"
} else { 
document += "
\n\t    
\n\t    <h1>Bye, "
document += user.name
document += "</h1>
\n
\n\t    "
} 
document += "
\n\t</body>
\n</html>"

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

            
            readFile@File( {filename = params.root + "data/user.json", format = "json"} )( user ) 


            operations
            response = document
        }
    }
}