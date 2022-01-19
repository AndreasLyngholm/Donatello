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
document += "
document += "
document += "
document += "
document += "
for ( tag in tags.tags ) { 
document += "
if (request.tags!=null) { 
document += "

                                    t = request.tags
                                    t.substring = tag
                                    contains@StringUtils( t )( is_selected )
                                document += "
} else { 
document += "
is_selected=false
document += "
} 
document += "
if (is_selected==false) { 
document += "
if (request.tags!=null) { 
document += request.tags
document += ","
} 
document += tag
document += "\" class=\"tag-pill tag-default\">"
document += tag
document += "</a>
} 
document += "
} 
document += "
if (request.tags!=null) { 
document += "

                        split@StringUtils( request.tags {.regex = ","} )( tags )
                    document += "
for ( tag in tags.result ) { 
document += "

                            replaceAll@StringUtils( request.tags {.regex = "," + tag, .replacement = ""} )( new_request )
                        document += "
document += new_request
document += "\">"
document += tag
document += "</a>
} 
document += "
} 
document += "
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