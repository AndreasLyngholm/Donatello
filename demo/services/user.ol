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
    
}

service Main( params:Params ) {
	embed Runtime as Runtime
	embed File as File
	embed StringUtils as StringUtils 


	define operations {
		document += "
document += "
document += menu.ol 
document += "
toUpperCase@StringUtils(user.name)(print2978) 
document += print2978 
document += "</h1>
document += user.age
document += "</p>

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
default@Gateway( {operation = "menu.ol", user=user.name} )( menu.ol ) 

			

			operations
			response = document
		}
	}
}