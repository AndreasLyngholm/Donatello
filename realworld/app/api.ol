from json_utils import JsonUtils
from file import File
from console import Console

type LoginRequest: void {
  email: string
  password: string
}

type MeResponse {
  ?
}

type TagsResponse {
    tags*:string
}

type ArticlesResponse {?}

interface ApiInterface {
    RequestResponse: ping( void )( string )
    RequestResponse: login( LoginRequest )( string )
    RequestResponse: register( LoginRequest )( string )
    RequestResponse: logout( void )( void )
    RequestResponse: me( undefined )( undefined )
    RequestResponse: isAuth( undefined )( bool )

    RequestResponse: tags( void )( TagsResponse )
    RequestResponse: articles( undefined )( ArticlesResponse )
    RequestResponse: myArticles( undefined )( ArticlesResponse )
}

service Api() {
    execution: concurrent

    embed JsonUtils as JsonUtils
    embed File as File
    embed Console as Console

    inputPort IP {
    	location: "local"
        protocol: p.protocol
        interfaces: ApiInterface
    }

    outputPort ApiPort {
        location: "socket://api.realworld.io:443/api/"
        protocol: https {
            osc << {
                ping << { alias = "ping" }
                register << { alias = "users" method = "post" }
            	login << { alias = "users/login" method = "post" }
                me << { alias = "user" method = "get" }
                tags << { alias = "tags" method = "get" }
                articles << { alias = "articles" method = "get" }
                myArticles << { alias = "articles/feed" method = "get" }
            }
        }
        interfaces: ApiInterface
    }

    main {
        [ logout ( request )( response ) {
            ApiPort.protocol.addHeader.header << null
            global.isAuth = false
        } ]

        [ isAuth ( cookies )( response ) {

            response = cookies.token != null

        } ]

        [ ping ( request )( response ) {

            response = "pong"

        } ]

        [ tags ( request )( response ) {

            tags@ApiPort()(response)

        } ]

        [ articles ( tag )( response ) {

            if( tag != null) {
                request.tag = tag
                articles@ApiPort(request)(response)
            } else {
                articles@ApiPort()(response)
            }

        } ]

        [ myArticles ( cookie )( response ) {

            ApiPort.protocol.addHeader.header << "Authorization" { value = "Bearer " + cookie }

            myArticles@ApiPort()(response)

        } ]

        [ login ( request )( token ) {

            ApiPort.protocol.format = "x-www-form-urlencoded"
            login@ApiPort(request)(token)

        } ]

        [ me ( cookie )( response ) {

            ApiPort.protocol.addHeader.header << "Authorization" { value = "Bearer " + cookie }

            me@ApiPort()(response)
        } ]
    }

}