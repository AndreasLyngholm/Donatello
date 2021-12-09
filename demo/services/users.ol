from runtime import Runtime
from PageInterfaceModule import PageInterface
from file import File
from time import Time 


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
	embed Time as Time 


	define operations {
		

	document += "<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n\t</head>\n\t<body>"
getCurrentDateTime@Time()(time.test)
document += "<p>My name is " + users.name + " and I am " + users.age + " years old.</p>"
document += "<p>The time right now is " + time + "</p>"
	document += "</body>\n</html>"

	}

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

			readFile@File( {filename = params.root + "data/users.json", format = "json"} )( users ) 


			operations
			response = document
		}
	}
}