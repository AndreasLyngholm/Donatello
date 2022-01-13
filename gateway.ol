from GatewayInterfaceModule import GatewayInterface
from PageInterfaceModule import PageInterface
from NuxtInterfaceModule import NuxtInterface
from types.Binding import Binding

from runtime import Runtime
from file import File
from console import Console
from string_utils import StringUtils
from uri_templates import UriTemplates

/// Configuration parameters
type Params {
    location:string
    root:string
    contentDir:string
    servicesDir:string
    defaultPage:string
    routes:string

    /// configuration parameters for the HTTP input port
    httpConfig? {
        debug?:bool { 
            showContent?:bool
        }
    }
}

service Gateway( params:Params ) {
    execution: concurrent

    embed Runtime as Runtime
    embed File as File
    embed Console as Console
    embed StringUtils as StringUtils
    embed UriTemplates as UriTemplates

    inputPort GatewayPort {
        location: params.location
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

    define setCacheHeaders {
        shouldCache = false
        if( s.result[0] == "image" ) {
            shouldCache = true
        } else {
            e = file.filename
            e.suffix = ".js"
            endsWith@StringUtils( e )( shouldCache )
            if( !shouldCache ) {
                e.suffix = ".css"
                endsWith@StringUtils( e )( shouldCache )
                if( !shouldCache ) {
                        e.suffix = ".woff"
                        endsWith@StringUtils( e )( shouldCache )
                }
            }
        }

        if( shouldCache ) {
            cacheMaxAge = 60 * 60 * 2 // 2 hours
        }
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

                if(isService) {
                    base.filename = "services/base.ol"
                    readFile@File(base)(data.base)

                    data.type = "service"
                } else if(isMarkdown) {
                    data.type = "markdown"
                    data.base = "none"
                }

                compile@Nuxt(data)(code)

                writefile.content = code
                writefile.filename = params.servicesDir + path
                writeFile@File(writefile)()
            }
        }
    }

    define findRoute {
        foreach( route : routes ) {

            t.template = route
            t.uri = s.result[0]
            match@UriTemplates( t )( response )

            if(response) {
                path = routes.(route).service

                f.template = route
                expand@UriTemplates(f)(expansion)

                replaceFirst@StringUtils(request.operation {.regex = expansion, .replacement = ""})(id)

                if(is_defined(routes.(route).data)) {
                    foreach( p : routes.(route).data ) {

                        readFile@File( {
                            filename = params.root + routes.(route).data.(p)
                            format = "json"
                        } )( jd )

                        foreach( d : jd ) {
                            for( u in jd.(d) ) {
                                if(u.id == id) {
                                    params.(p) << u
                                }
                            }
                        }
                        
                    }
                }
            }
        }

        if (path == null) {
            path = s.result[0]
        }
    }

    define unsetParams {
        undef(params.data)
        undef(params.requestUri)
        undef(params.operation)
        undef(params.cookies)
        undef(params.userAgent)
        undef(params.compile)
    }

    init {
        readFile@File( {
            filename = params.routes
            format = "json"
        } )( routes )
    }

    init {
        loadNuxt

        getFileSeparator@File()( sep )
        getServiceParentPath@File()( dir )
        setMimeTypeFile@File( dir + sep + "internal" + sep + "mime.types" )()

        format = "ol"
    }

    main {
        [ default(request)(response) {

            scope( computeResponse ) {
                install(
                    FileNotFound =>
                        println@Console( "File not found: " + file.filename )()
                        statusCode = 404,
                    MovedPermanently =>
                        statusCode = 301
                )
                
                s = request.operation
                s.regex = "\\?"
                split@StringUtils(s)(s)

                findRoute

                // Check file ending
                endsWithReq = path
                endsWithReq.suffix = ".ol"
                endsWith@StringUtils(endsWithReq)(isService)

                // Check file ending
                endsWithReq = path
                endsWithReq.suffix = ".markdown"
                endsWith@StringUtils(endsWithReq)(isMarkdown)

                params << request
                
                unsetParams

                if(isService) {
                    buildService

                    loadEmbeddedService@Runtime({
                        filepath = params.servicesDir + path
                        service = "Main"
                        params -> params
                    })(Page.location)

                    getDocument@Page(request.data)(response)
                    format = "html"
                } else if (isMarkdown) {
                    buildService

                    file.filename = params.servicesDir + path
                    file.format = "text"
                    format = "html"

                    readFile@File( file )( response )

                    with( decoratedResponse ) {
                        .config.wwwDir = params.wwwDir;
                        .request.path = requestPath;
                        if ( file.format == "text" ) {
                            .content -> response
                        }
                    }

                } else {
                    file.filename = params.contentDir + path

                    if(request.compile == false) {
                        readFile@File( file )( response )
                    } else {
                        isDirectory@File( file.filename )( isDirectory )
                        if( isDirectory ) {
                            redirect = requestPath + "/"
                            throw( MovedPermanently )
                        }

                        getMimeType@File( file.filename )( mime )

                        split@StringUtils( mime { .regex = "/" } )( s )
                        if( s.result[0] == "text" ) {
                            file.format = "text"
                            format = "html"
                        } else {
                            file.format = format = "binary"
                        }

                        readFile@File( file )( response )

                        with( decoratedResponse ) {
                            .config.wwwDir = params.wwwDir;
                            .request.path = requestPath;
                            if ( file.format == "text" ) {
                                .content -> response
                            }
                        }
                    }
                    
                }
            }
        } ]
    }
}