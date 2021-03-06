from @simpleconcept.donatello.GatewayInterfaceModule import GatewayInterface
from runtime import Runtime
from @simpleconcept.donatello.PageInterfaceModule import PageInterface
from file import File
from json_utils import JsonUtils
from console import Console
@includes

type Params {
    location:string
    root:string
    contentDir:string
    servicesDir:string
    defaultPage:string
    routes:string
    url:string
    @params
}

service Main( params:Params ) {
    embed Runtime as Runtime
    embed File as File
    embed JsonUtils as JsonUtils
    embed Console as Console
    @embedings

    define operations {
        @operations
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

            @init_params
            @dataproviders

            operations
            response = document
        }
    }
}