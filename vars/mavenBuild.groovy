def call(Map params) {
	def pom = 'pom.xml'
	if (param != null) {
		pom = params.get('pom', 'pom.xml')
	}
	echo "Building ${pom} ..."
	sh "echo ${pom}"
}
