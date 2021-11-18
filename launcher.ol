from runtime import Runtime
from file import File

service Launcher {
	embed Runtime as runtime
	embed File as file

	main {
		config.location = "socket://localhost:8000"
		config.contentDir = "www/"
		config.servicesDir = "services/"
		config.defaultPage = "index.ol"

		getRealServiceDirectory@file()( home )
		getFileSeparator@file()( sep )

		loadEmbeddedService@runtime( {
			filepath = home + sep + "gateway.ol"
			service = "Gateway"
			params -> config
		} )()

		linkIn( Shutdown )
	}
}