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
    user{?} 

}

service Main( params:Params ) {
	embed Runtime as Runtime
	embed File as File
	

	define operations {
		document += layouts_header.html 
document += "\n"
document += "\n<div class=\"profile-page\">\n\n    <div class=\"user-info\">\n        <div class=\"container\">\n            <div class=\"row\">\n\n                <div class=\"col-xs-12 col-md-10 offset-md-1\">\n                    <img src=\""
document += user.image
document += "\" class=\"user-img\"/>\n                    <h4>"
document += user.name
document += "</h4>\n                    <p>\n                        "
document += user.motto
document += "\n                    </p>\n                    <button class=\"btn btn-sm btn-outline-secondary action-btn\">\n                        <i class=\"ion-plus-round\"></i>\n                        &nbsp;\n                        Follow "
document += user.name
document += "\n                    </button>\n                </div>\n\n            </div>\n        </div>\n    </div>\n\n    <div class=\"container\">\n        <div class=\"row\">\n\n            <div class=\"col-xs-12 col-md-10 offset-md-1\">\n                <div class=\"articles-toggle\">\n                    <ul class=\"nav nav-pills outline-active\">\n                        <li class=\"nav-item\">\n                            <a class=\"nav-link active\" href=\"\">My Articles</a>\n                        </li>\n                        <li class=\"nav-item\">\n                            <a class=\"nav-link\" href=\"\">Favorited Articles</a>\n                        </li>\n                    </ul>\n                </div>\n\n                <div class=\"article-preview\">\n                    <div class=\"article-meta\">\n                        <a href=\"\"><img src=\"http://i.imgur.com/Qr71crq.jpg\"/></a>\n                        <div class=\"info\">\n                            <a href=\"\" class=\"author\">Eric Simons</a>\n                            <span class=\"date\">January 20th</span>\n                        </div>\n                        <button class=\"btn btn-outline-primary btn-sm pull-xs-right\">\n                            <i class=\"ion-heart\"></i> 29\n                        </button>\n                    </div>\n                    <a href=\"\" class=\"preview-link\">\n                        <h1>How to build webapps that scale</h1>\n                        <p>This is the description for the post.</p>\n                        <span>Read more...</span>\n                    </a>\n                </div>\n\n                <div class=\"article-preview\">\n                    <div class=\"article-meta\">\n                        <a href=\"\"><img src=\"http://i.imgur.com/N4VcUeJ.jpg\"/></a>\n                        <div class=\"info\">\n                            <a href=\"\" class=\"author\">Albert Pai</a>\n                            <span class=\"date\">January 20th</span>\n                        </div>\n                        <button class=\"btn btn-outline-primary btn-sm pull-xs-right\">\n                            <i class=\"ion-heart\"></i> 32\n                        </button>\n                    </div>\n                    <a href=\"\" class=\"preview-link\">\n                        <h1>The song you won't ever stop singing. No matter how hard you try.</h1>\n                        <p>This is the description for the post.</p>\n                        <span>Read more...</span>\n                        <ul class=\"tag-list\">\n                            <li class=\"tag-default tag-pill tag-outline\">Music</li>\n                            <li class=\"tag-default tag-pill tag-outline\">Song</li>\n                        </ul>\n                    </a>\n                </div>\n\n\n            </div>\n\n        </div>\n    </div>\n\n</div>\n"
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

			user << params.user 

			default@Gateway( {operation = "layouts/header.html", compile = false} )( layouts_header.html ) 
default@Gateway( {operation = "layouts/footer.html", compile = false} )( layouts_footer.html ) 


			operations
			response = document
		}
	}
}