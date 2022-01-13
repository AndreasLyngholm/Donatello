from GatewayInterfaceModule import GatewayInterface
from runtime import Runtime
from PageInterfaceModule import PageInterface
from file import File
from string_utils import StringUtils 


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
	embed StringUtils as StringUtils 


	define operations {
		document += "\n"
document += "\n<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../style.css\" />\n\t</head>\n\t<body>\n\t\t"
document += menu.ol 
document += "\n\t\t\n\t\t<h1>Welcome, "
toUpperCase@StringUtils(user.name)(print74c0) 
document += print74c0 
document += "</h1>\n\n\t\t<p>Your age is "
document += user.age
document += "</p>\n\t</body>\n</html>"

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

			default@Gateway( {operation = "menu.ol", user << user, compile = false} )( menu.ol ) 


			operations
			response = document
		}
	}
}