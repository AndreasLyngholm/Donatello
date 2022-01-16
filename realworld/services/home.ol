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
document += "\n<div class=\"home-page\">\n\n    <div class=\"banner\">\n        <div class=\"container\">\n            <h1 class=\"logo-font\">conduit</h1>\n            <p>A place to share your knowledge.</p>\n        </div>\n    </div>\n\n    <div class=\"container page\">\n        <div class=\"row\">\n\n            <div class=\"col-md-9\">\n                <div class=\"feed-toggle\">\n                    <ul class=\"nav nav-pills outline-active\">\n                        <li class=\"nav-item\">\n                            <a class=\"nav-link disabled\" href=\"\">Your Feed</a>\n                        </li>\n                        <li class=\"nav-item\">\n                            <a class=\"nav-link active\" href=\"\">Global Feed</a>\n                        </li>\n                    </ul>\n                </div>\n\n                <div class=\"article-preview\">\n                    <div class=\"article-meta\">\n                        <a href=\"profile.html\"><img src=\"http://i.imgur.com/Qr71crq.jpg\"/></a>\n                        <div class=\"info\">\n                            <a href=\"\" class=\"author\">Eric Simons</a>\n                            <span class=\"date\">January 20th</span>\n                        </div>\n                        <button class=\"btn btn-outline-primary btn-sm pull-xs-right\">\n                            <i class=\"ion-heart\"></i> 29\n                        </button>\n                    </div>\n                    <a href=\"\" class=\"preview-link\">\n                        <h1>How to build webapps that scale</h1>\n                        <p>This is the description for the post.</p>\n                        <span>Read more...</span>\n                    </a>\n                </div>\n\n                <div class=\"article-preview\">\n                    <div class=\"article-meta\">\n                        <a href=\"profile.html\"><img src=\"http://i.imgur.com/N4VcUeJ.jpg\"/></a>\n                        <div class=\"info\">\n                            <a href=\"\" class=\"author\">Albert Pai</a>\n                            <span class=\"date\">January 20th</span>\n                        </div>\n                        <button class=\"btn btn-outline-primary btn-sm pull-xs-right\">\n                            <i class=\"ion-heart\"></i> 32\n                        </button>\n                    </div>\n                    <a href=\"\" class=\"preview-link\">\n                        <h1>The song you won't ever stop singing. No matter how hard you try.</h1>\n                        <p>This is the description for the post.</p>\n                        <span>Read more...</span>\n                    </a>\n                </div>\n\n            </div>\n\n            <div class=\"col-md-3\">\n                <div class=\"sidebar\">\n                    <p>Popular Tags</p>\n\n                    <div class=\"tag-list\">\n                        <a href=\"\" class=\"tag-pill tag-default\">programming</a>\n                        <a href=\"\" class=\"tag-pill tag-default\">javascript</a>\n                        <a href=\"\" class=\"tag-pill tag-default\">emberjs</a>\n                        <a href=\"\" class=\"tag-pill tag-default\">angularjs</a>\n                        <a href=\"\" class=\"tag-pill tag-default\">react</a>\n                        <a href=\"\" class=\"tag-pill tag-default\">mean</a>\n                        <a href=\"\" class=\"tag-pill tag-default\">node</a>\n                        <a href=\"\" class=\"tag-pill tag-default\">rails</a>\n                    </div>\n                </div>\n            </div>\n\n        </div>\n    </div>\n\n</div>\n\n"
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