def call(Map params) {
	def pom = params.get('pom', 'pom.xml')
	echo "Building ${pom} ..."
	sh "echo ${pom}"
}
