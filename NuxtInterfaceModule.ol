type CompileRequest: void {
  contents: string
  base: string
}

interface NuxtInterface {
	RequestResponse: compile(CompileRequest)(string),
	RequestResponse: getLastModified(string)(long)
}

outputPort Nuxt {
	interfaces: NuxtInterface
}