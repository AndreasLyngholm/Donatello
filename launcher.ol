from runtime import Runtime
from file import File

service Launcher {
	embed Runtime as runtime
	embed File as file

	main {
		config.location = "socket://localhost:8000"
		config.root = "/home/vagrant/Coding/thesis/new_demo/"
		config.contentDir = "/home/vagrant/Coding/thesis/new_demo/www/"
		config.servicesDir = "/home/vagrant/Coding/thesis/new_demo/services/"
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