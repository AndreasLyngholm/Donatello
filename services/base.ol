from GatewayInterfaceModule import GatewayInterface
from runtime import Runtime
from PageInterfaceModule import PageInterface
from file import File
@includes

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
	@embedings

	define operations {
		@operations
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

			@dataproviders

			operations
			response = document
		}
	}
}