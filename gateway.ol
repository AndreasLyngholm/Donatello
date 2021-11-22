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
    root:string
    contentDir:string
    servicesDir:string
    defaultPage:string

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
        // protocol: http { format = "json", default = "default" }
        location: params.location
        interfaces: GatewayInterface
    }

    outputPort Page {
        interfaces: PageInterface
    }

    outputPort Nuxt {
        interfaces: NuxtInterface
    }

    outputPort FileUtils {
        interfaces: NuxtInterface
    }

    define loadNuxt {
        loadEmbeddedService@Runtime( {
            filepath = "nuxt.runtime.Compiler"
            type = "Java"
        } )( Nuxt.location )

        loadEmbeddedService@Runtime( {
            filepath = "nuxt.runtime.FileUtils"
            type = "Java"
        } )( FileUtils.location )
    }

    define buildService {
        isUpdated = false

        exists@File(params.servicesDir + path)(serviceExists)
        if(serviceExists) {
            getLastModified@FileUtils(params.contentDir + path)(pageModified)
            getLastModified@FileUtils(params.servicesDir + path)(serviceModified)

            if(serviceModified >= pageModified) {
                isUpdated = true
            }
        }

        if(isUpdated == false) {
            synchronized(compile) {
                println@Console("Recompiling " + path)()
                file.filename = params.contentDir + path
                readFile@File(file)(data.contents)

                base.filename = "services/base.ol"
                readFile@File(base)(data.base)
                compile@Nuxt(data)(code)

                writefile.content = code
                writefile.filename = params.servicesDir + path
                writeFile@File(writefile)()
            }
        }
    }

    init {
        loadNuxt
    }

    main {
        [ default(request)(response) {

            scope( computeResponse ) {
                install(FileNotFound =>
                    println@Console("File not found: " + file.filename)()
                )
                
                s = request.operation
                s.regex = "\\?"
                split@StringUtils(s)(s)
                
                // Default page
                path = s.result[0]
                if (path == "") {
                    path = params.defaultPage
                }

                // Check file ending
                endsWithReq = path
                endsWithReq.suffix = ".ol"
                endsWith@StringUtils(endsWithReq)(isService)

                if(isService) {
                    buildService

                    loadEmbeddedService@Runtime({
                        filepath = params.servicesDir + path
                        service = "Main"
                        params -> params
                    })(Page.location)

                    getDocument@Page(request.data)(response)
                    format = "html"
                } else {
                    file.filename = params.contentDir + path

                    getMimeType@File(file.filename)(mime)
                    mime.regex = "/"
                    split@StringUtils(mime)(s)
                    if (s.result[0] == "text") {
                        file.format = "text"
                        format = "html"
                    } else {
                        file.format = format = "binary"
                    }

                    readFile@File(file)(response)
                }
            }
        }]
    }
}