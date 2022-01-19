interface ChuckInterface {
    RequestResponse: random( undefined )( undefined )
}

service Chuck() {
    execution: concurrent

    inputPort IP {
    	location: "local"
        protocol: p.protocol
        interfaces: ChuckInterface
    }

    outputPort ChuckPort {
        location: "socket://api.chucknorris.io:443/"
        protocol: https {
            osc << {
            	random << {alias = "jokes/random" method = "get" }
            }
        }
        interfaces: ChuckInterface
    }

    main {
        random ( request )( response ) {

        	random@ChuckPort( {
        		category = "dev"
        	} )(joke)

            response = joke.value

        }
    }

}