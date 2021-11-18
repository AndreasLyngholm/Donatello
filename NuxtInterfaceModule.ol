interface NuxtInterface {
	RequestResponse: compile(string)(string)
}

outputPort Nuxt {
	interfaces: NuxtInterface
}