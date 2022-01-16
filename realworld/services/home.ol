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
    
}

service Main( params:Params ) {
	embed Runtime as Runtime
	embed File as File
	embed StringUtils as StringUtils 


	define operations {
		document += layouts_header.html 
document += "\n"
document += "\n"
document += "\n<div class=\"home-page\">\n\n    <div class=\"banner\">\n        <div class=\"container\">\n            <h1 class=\"logo-font\">conduit</h1>\n            <p>A place to share your knowledge.</p>\n        </div>\n    </div>\n\n    <div class=\"container page\">\n        <div class=\"row\">\n\n            <div class=\"col-md-9\">\n                <div class=\"feed-toggle\">\n                    <ul class=\"nav nav-pills outline-active\">\n                        <li class=\"nav-item\">\n                            <a class=\"nav-link disabled\" href=\"\">Your Feed</a>\n                        </li>\n                        <li class=\"nav-item\">\n                            <a class=\"nav-link active\" href=\"\">Global Feed</a>\n                        </li>\n                    </ul>\n                </div>\n\n                "
for ( article in data.articles ) { 
document += "\n                    <div class=\"article-preview\">\n                        <div class=\"article-meta\">\n                            <a href=\"/profiles/"
document += article.author.id
document += "\"><img src=\""
document += article.author.image
document += "\"/></a>\n                            <div class=\"info\">\n                                <a href=\"/profiles/"
document += article.author.id
document += "\" class=\"author\">"
document += article.author.name
document += "</a>\n                                <span class=\"date\">"
document += article.date
document += "</span>\n                            </div>\n                            <button class=\"btn btn-outline-primary btn-sm pull-xs-right\">\n                                <i class=\"ion-heart\"></i> "
document += article.likes
document += "\n                            </button>\n                        </div>\n                        <a href=\"/articles/"
document += article.author.id
document += "\" class=\"preview-link\">\n                            <h1>"
document += article.title
document += "</h1>\n                            <p>"
document += article.content
document += "</p>\n                            <span>Read more...</span>\n                        </a>\n                    </div>\n                "
} 
document += "\n\n            </div>\n\n            <div class=\"col-md-3\">\n                <div class=\"sidebar\">\n                    <p>Popular Tags</p>\n\n                    <div class=\"tag-list\">\n                        <a href=\"?tags="
if (request.tags!=null) { 
document += request.tags
document += ","
} 
document += "programming\" class=\"tag-pill tag-default\">programming</a>\n                        <a href=\"?tags="
if (request.tags!=null) { 
document += request.tags
document += ","
} 
document += "javascript\" class=\"tag-pill tag-default\">javascript</a>\n                        <a href=\"?tags="
if (request.tags!=null) { 
document += request.tags
document += ","
} 
document += "emberjs\" class=\"tag-pill tag-default\">emberjs</a>\n                        <a href=\"?tags="
if (request.tags!=null) { 
document += request.tags
document += ","
} 
document += "angularjs\" class=\"tag-pill tag-default\">angularjs</a>\n                        <a href=\"?tags="
if (request.tags!=null) { 
document += request.tags
document += ","
} 
document += "react\" class=\"tag-pill tag-default\">react</a>\n                        <a href=\"?tags="
if (request.tags!=null) { 
document += request.tags
document += ","
} 
document += "mean\" class=\"tag-pill tag-default\">mean</a>\n                        <a href=\"?tags="
if (request.tags!=null) { 
document += request.tags
document += ","
} 
document += "node\" class=\"tag-pill tag-default\">node</a>\n                        <a href=\"?tags="
if (request.tags!=null) { 
document += request.tags
document += ","
} 
document += "rails\" class=\"tag-pill tag-default\">rails</a>\n                    </div>\n                </div>\n\n                "
if (request.tags!=null) { 
document += "\n                    <b>Selected tags: "
document += request.tags
document += "</b>\n                "
} 
document += "\n            </div>\n\n        </div>\n    </div>\n\n</div>\n"
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
readFile@File( {filename = params.root + "data/articles.json", format = "json"} )( data ) 
default@Gateway( {operation = "layouts/footer.html", compile = false} )( layouts_footer.html ) 


			operations
			response = document
		}
	}
}