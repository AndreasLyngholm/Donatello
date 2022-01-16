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
    article{?} 

}

service Main( params:Params ) {
	embed Runtime as Runtime
	embed File as File
	

	define operations {
		document += layouts_header.html 
document += "\n"
document += "\n<div class=\"article-page\">\n\n    <div class=\"banner\">\n        <div class=\"container\">\n\n            <h1>"
document += article.title
document += "</h1>\n\n            <div class=\"article-meta\">\n                <a href=\"/profiles/"
document += article.author.id
document += "\"><img src=\""
document += article.author.image
document += "\"/></a>\n                <div class=\"info\">\n                    <a href=\"/profiles/"
document += article.author.id
document += "\"></a>\n                    <span class=\"date\">"
document += article.date
document += "</span>\n                </div>\n                <button class=\"btn btn-sm btn-outline-secondary\">\n                    <i class=\"ion-plus-round\"></i>\n                    &nbsp;\n                    Follow "
document += article.author.name
document += " <span class=\"counter\">(10)</span>\n                </button>\n                &nbsp;&nbsp;\n                <button class=\"btn btn-sm btn-outline-primary\">\n                    <i class=\"ion-heart\"></i>\n                    &nbsp;\n                    Favorite Post <span class=\"counter\">(29)</span>\n                </button>\n            </div>\n\n        </div>\n    </div>\n\n    <div class=\"container page\">\n\n        <div class=\"row article-content\">\n            <div class=\"col-md-12\">\n                <p>\n                    "
document += article.content
document += "\n                </p>\n            </div>\n        </div>\n\n        <hr/>\n\n        <div class=\"article-actions\">\n            <div class=\"article-meta\">\n                <a href=\"/profiles/"
document += article.author.id
document += "\"><img src=\""
document += article.author.image
document += "\"/></a>\n                <div class=\"info\">\n                    <a href=\"/profiles/"
document += article.author.id
document += "\" class=\"author\">"
document += article.author.name
document += "</a>\n                    <span class=\"date\">"
document += article.date
document += "</span>\n                </div>\n\n                <button class=\"btn btn-sm btn-outline-secondary\">\n                    <i class=\"ion-plus-round\"></i>\n                    &nbsp;\n                    Follow Eric Simons\n                </button>\n                &nbsp;\n                <button class=\"btn btn-sm btn-outline-primary\">\n                    <i class=\"ion-heart\"></i>\n                    &nbsp;\n                    Favorite Post <span class=\"counter\">(29)</span>\n                </button>\n            </div>\n        </div>\n\n        <div class=\"row\">\n\n            <div class=\"col-xs-12 col-md-8 offset-md-2\">\n\n                <form class=\"card comment-form\">\n                    <div class=\"card-block\">\n                        <textarea class=\"form-control\" placeholder=\"Write a comment...\" rows=\"3\"></textarea>\n                    </div>\n                    <div class=\"card-footer\">\n                        <img src=\"http://i.imgur.com/Qr71crq.jpg\" class=\"comment-author-img\"/>\n                        <button class=\"btn btn-sm btn-primary\">\n                            Post Comment\n                        </button>\n                    </div>\n                </form>\n\n                <div class=\"card\">\n                    <div class=\"card-block\">\n                        <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n                    </div>\n                    <div class=\"card-footer\">\n                        <a href=\"\" class=\"comment-author\">\n                            <img src=\"http://i.imgur.com/Qr71crq.jpg\" class=\"comment-author-img\"/>\n                        </a>\n                        &nbsp;\n                        <a href=\"\" class=\"comment-author\">Jacob Schmidt</a>\n                        <span class=\"date-posted\">Dec 29th</span>\n                    </div>\n                </div>\n\n                <div class=\"card\">\n                    <div class=\"card-block\">\n                        <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n                    </div>\n                    <div class=\"card-footer\">\n                        <a href=\"\" class=\"comment-author\">\n                            <img src=\"http://i.imgur.com/Qr71crq.jpg\" class=\"comment-author-img\"/>\n                        </a>\n                        &nbsp;\n                        <a href=\"\" class=\"comment-author\">Jacob Schmidt</a>\n                        <span class=\"date-posted\">Dec 29th</span>\n                        <span class=\"mod-options\">\n              <i class=\"ion-edit\"></i>\n              <i class=\"ion-trash-a\"></i>\n            </span>\n                    </div>\n                </div>\n\n            </div>\n\n        </div>\n\n    </div>\n\n</div>\n"
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

			article << params.article 

			default@Gateway( {operation = "layouts/header.html", compile = false} )( layouts_header.html ) 
default@Gateway( {operation = "layouts/footer.html", compile = false} )( layouts_footer.html ) 


			operations
			response = document
		}
	}
}