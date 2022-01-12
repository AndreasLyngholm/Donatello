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
		document += "\n<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n\t</head>\n\t<body>\n\t\t"
document += layout_header.html 
document += "\n\n\t\t<h1>List of all users...</h1>\n\n\t\t"
for ( user in data.users ) { 
document += "\n\n\t\t<p>Hi, "
document += user.name
document += " your age is "
document += user.age
document += "</p>\n\n\t\t"
} 
document += "\n\n\t\t"
document += layout_footer.html 
document += "\n\t</body>\n</html>"

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

			readFile@File( {filename = params.root + "data/users.json", format = "json"} )( data ) 
default@Gateway( {operation = "layout/header.html", compile = false} )( layout_header.html ) 
default@Gateway( {operation = "layout/footer.html", compile = false} )( layout_footer.html ) 

			

			operations
			response = document
		}
	}
}