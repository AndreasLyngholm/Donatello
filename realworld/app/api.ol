from console import Console
from json_utils import JsonUtils

type LoginRequest: void {
  email: string
  password: string
}

type MeResponse {
  ?
}

interface ApiInterface {
    RequestResponse: login( LoginRequest )( string )
    RequestResponse: ping( void )( string )
    RequestResponse: me( void )( undefined )
}

service Api() {
    execution: concurrent

    embed Console as Console
    embed JsonUtils as JsonUtils

    inputPort IP {
    	location: "local"
        protocol: p.protocol
        interfaces: ApiInterface
    }

    outputPort ApiPort {
        location: "socket://shipping.pensopay.dev:443/"
        protocol: https {
            osc << {
                ping << { alias = "v1/ping" method = "get" }
            	login << { alias = "v1/sanctum/token" method = "post" }
                me << { alias = "v1/user" method = "get" }
            }
        }
        interfaces: ApiInterface
    }

    main {
        [ ping ( request )( response ) {

            ping@ApiPort()(response)

        } ]

        [ login ( request )( token ) {

            ApiPort.protocol.format = "x-www-form-urlencoded"
            login@ApiPort(request)(token)

        } ]

        [ me ( request )( response ) {

            ApiPort.protocol.addHeader.header << "Authorization" { value = "Bearer 7|Zp6p4UtWaw23h6G0b5FhWvVnLfPErEUuY59LJOhO" }

            me@ApiPort()(json_string)

            getJsonString@JsonUtils( json_string )( response )

        } ]
    }

}