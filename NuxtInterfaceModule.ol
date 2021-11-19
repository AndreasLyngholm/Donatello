interface NuxtInterface {
	RequestResponse: compile(string)(string),
	RequestResponse: getLastModified(string)(long)
}

outputPort Nuxt {
	interfaces: NuxtInterface
}