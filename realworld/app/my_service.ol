type MyServiceParam {
    factor: int
    protocol: string
}

interface MyServiceInterface {
    RequestResponse: multiply( int )( int )
}

service MyService ( p: MyServiceParam ) {
    inputPort IP {
        location: "local"
        protocol: p.protocol
        interfaces: MyServiceInterface
    }

    main {
        multiply ( number )( result ) {
            result = number * p.factor
        }
    }
}