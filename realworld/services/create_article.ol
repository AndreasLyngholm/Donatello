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
		document += layouts_header.html 
document += "\n<div class=\"editor-page\">\n    <div class=\"container page\">\n        <div class=\"row\">\n\n            <div class=\"col-md-10 offset-md-1 col-xs-12\">\n                <form>\n                    <fieldset>\n                        <fieldset class=\"form-group\">\n                            <input type=\"text\" class=\"form-control form-control-lg\" placeholder=\"Article Title\">\n                        </fieldset>\n                        <fieldset class=\"form-group\">\n                            <input type=\"text\" class=\"form-control\" placeholder=\"What's this article about?\">\n                        </fieldset>\n                        <fieldset class=\"form-group\">\n                            <textarea class=\"form-control\" rows=\"8\"\n                                      placeholder=\"Write your article (in markdown)\"></textarea>\n                        </fieldset>\n                        <fieldset class=\"form-group\">\n                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter tags\">\n                            <div class=\"tag-list\"></div>\n                        </fieldset>\n                        <button class=\"btn btn-lg pull-xs-right btn-primary\" type=\"button\">\n                            Publish Article\n                        </button>\n                    </fieldset>\n                </form>\n            </div>\n\n        </div>\n    </div>\n</div>\n"
document += layouts_footer.html 

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

			
			default@Gateway( {operation = "layouts/header.html", compile = false} )( layouts_header.html ) 
default@Gateway( {operation = "layouts/footer.html", compile = false} )( layouts_footer.html ) 


			operations
			response = document
		}
	}
}