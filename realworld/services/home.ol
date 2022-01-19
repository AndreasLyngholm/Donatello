from GatewayInterfaceModule import GatewayInterface
from runtime import Runtime
from PageInterfaceModule import PageInterface
from file import File
from string_utils import StringUtils 
from ..app.chuck import Chuck 


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
embed Chuck as Chuck 


    define operations {
        document += layouts_header.html 
document += "\n"
document += "\n"
document += "\n"
document += "\n"
document += "\n\n<div class=\"home-page\">\n\n    <div class=\"banner\">\n        <div class=\"container\">\n            <h1 class=\"logo-font\">conduit</h1>\n            <p>A place to share your knowledge.</p>\n        </div>\n    </div>\n\n    <div class=\"container page\">\n        <div class=\"row\">\n\n            <div class=\"col-md-9\">\n                <div class=\"feed-toggle\">\n                    <ul class=\"nav nav-pills outline-active\">\n                        <li class=\"nav-item\">\n                            <a class=\"nav-link disabled\" href=\"\">Your Feed</a>\n                        </li>\n                        <li class=\"nav-item\">\n                            <a class=\"nav-link active\" href=\"\">Global Feed</a>\n                        </li>\n                    </ul>\n                </div>\n            </div>\n\n            <div class=\"col-md-3\">\n                <div class=\"sidebar\">\n                    <p>Popular Tags</p>\n\n                    <div class=\"tag-list\">\n                        "
for ( tag in tags.tags ) { 
document += "\n                            "
if (request.tags!=null) { 
document += "\n                                "

                                    t = request.tags
                                    t.substring = tag
                                    contains@StringUtils( t )( is_selected )
                                document += "\n                            "
} else { 
document += "\n                                "
is_selected=false
document += "\n                            "
} 
document += "\n\n                            "
if (is_selected==false) { 
document += "\n                                <a href=\"?tags="
if (request.tags!=null) { 
document += request.tags
document += ","
} 
document += tag
document += "\" class=\"tag-pill tag-default\">"
document += tag
document += "</a>\n                            "
} 
document += "\n                        "
} 
document += "\n                    </div>\n                </div>\n\n                "
if (request.tags!=null) { 
document += "\n                    <hr>\n                    <h4>Selected tags:</h4>\n                    "

                        split@StringUtils( request.tags {.regex = ","} )( tags )
                    document += "\n\n                    "
for ( tag in tags.result ) { 
document += "\n\n                        "

                            replaceAll@StringUtils( request.tags {.regex = "," + tag, .replacement = ""} )( new_request )
                        document += "\n\n                        <a href=\"?tags="
document += new_request
document += "\">"
document += tag
document += "</a>\n                        <br>\n\n                    "
} 
document += "\n                "
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
readFile@File( {filename = params.root + "data/tags.json", format = "json"} )( tags ) 
default@Gateway( {operation = "layouts/footer.html", compile = false} )( layouts_footer.html ) 


            operations
            response = document
        }
    }
}