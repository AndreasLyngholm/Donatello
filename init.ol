#!/usr/bin/env jolie

from runtime import Runtime
from file import File
from console import Console
from string_utils import StringUtils

type InitConfig: void {
  location?: string
}

service Launcher (config : InitConfig ) {
    embed Runtime as Runtime
    embed File as File
    embed Console as Console
    embed StringUtils as StringUtils

    init {
        getRealServiceDirectory@File()( home )
        getFileSeparator@File()( sep )

        if(#args < 1) {
            root = home + sep + "donatello" + sep
        } else {
            root = args[0]

            endsWith@StringUtils( root {.suffix = sep})( response )
            if(! root) {
                root = root + sep
            }
        }

        www = root + "www" + sep
        services = root + "services" + sep

        mkdir@File( root )( response )
        mkdir@File( www )( response )
        mkdir@File( services )( response )

        writeFile@File( {.filename = root + "www" + sep + "welcome.ol", .content = "<h1>Welcome!</h1>"} )( response )

        // Routes
        writeFile@File( {
            filename = root + "routes.json"
            format = "json"
            content << {
                welcome << {
                    service = "welcome.ol"
                }
            }
        } )()

        // Config
        writeFile@File( {
            filename = root + "config.json"
            format = "json"
            content << {
                root = root
                contentDir = www
                servicesDir = services
                routes = root + "routes.json"
            }
        } )()

        println@Console( "Donatello was initialized at " + root )()
        halt@Runtime()()
    }

  main {
        linkIn( Shutdown )
    }
}