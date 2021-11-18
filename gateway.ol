from GatewayInterfaceModule import GatewayInterface
from PageInterfaceModule import PageInterface
from NuxtInterfaceModule import NuxtInterface

from runtime import Runtime
from file import File
from console import Console
from string_utils import StringUtils

/// Configuration parameters
type Params {
    location:string
    contentDir?:string
    servicesDir?:string

    /// configuration parameters for the HTTP input port
    httpConfig? {
        /// default = false
        debug?:bool { 
            showContent?:bool //< default = false
        }
    }
    /// Redirections to sub-services
    // redirection* {
    //     name:string //< name of the service
    //     binding:LeonardoBinding //< Binding to the target service
    // }
}

service Gateway( params:Params ) {
    embed Runtime as Runtime
    embed File as File
    embed Console as Console
    embed StringUtils as StringUtils

    execution: concurrent

    inputPort GatewayPort {
        protocol: http {
            keepAlive = true // Keep connections open
            debug = is_defined( params.httpConfig.debug ) && params.httpConfig.debug
            debug.showContent = is_defined( params.httpConfig.debug.showContent ) && params.httpConfig.debug.showContent
            format -> format
            contentType -> mime
            statusCode -> statusCode
            redirect -> redirect
            cacheControl.maxAge -> cacheMaxAge

            default = "default"
        }
        location: params.location
        interfaces: GatewayInterface
    }

    // inputPort GatewayPort {
    //     location: "socket://localhost:8000"
    //     protocol: http { format = "json" }
    //     interfaces: GatewayInterface
    // }

    outputPort Page {
        interfaces: PageInterface
    }

    define buildService {
        exists@File(ServicesDirectory + path)(serviceExists)

        if(serviceExists) {
            synchronized(compile) {
                println@Console("Recompiling " + path)()
                file.filename = ContentDirectory + path
                readFile@File(file)(contents)
                // compile@Josep(contents)(code)

                writefile.content = code;
                writefile.filename = ServicesDirectory + path
                writeFile@File(writefile)()
            }
        }
    }

    define loadNuxt {
        loadEmbeddedService@Runtime( {
            filepath = "nuxt.runtime.Compiler"
            type = "Java"
        } )( NuxtInterface.location )
    }

    init {
        loadNuxt
    }

    main {
        [ default( request )( result ) {

            println@Console( request.file )()

            //Generate@JolieNuxtOutputPort( request )( jolieFile )

            // Render@JolieNuxtOutputPort( request )( response )

            //println@Console( response )()

            result.file = "somefile.ol"
        }]
    }
}