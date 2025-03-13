def call(Map params) {
	def pom = 'pom.xml'
	if (params != null) {
		pom = params.get('pom', 'pom.xml')
	}
	echo "Building ${pom} ..."
	sh "echo ${pom}"
	echo "Added echo"
}
