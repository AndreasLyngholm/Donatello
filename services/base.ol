from runtime import Runtime
from PageInterfaceModule import PageInterface

service Base {
	embed Runtime as Runtime

	execution { single }

	inputPort Local {
		location: "local"
		interfaces: PageInterface
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