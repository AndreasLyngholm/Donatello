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
        document += "<!DOCTYPE html>
\n<html>
\n\t<head>
\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />
\n\t</head>
\n\t<body>
\n\t\t<h1>Welcome to Jolie Dynamic Webserver</h1>
\n
\n\t\t<a href=\"testing\">Goto \"Testing\"</a>
\n\t\t<br>
\n\t\t<a href=\"users\">Goto \"Users\"</a>
\n\t\t<br>
\n\t\t<a href=\"conditional\">Goto \"Conditional\"</a>
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

            
            

            operations
            response = document
        }
    }
}