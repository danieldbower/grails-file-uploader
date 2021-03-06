grails.project.work.dir = 'target'
grails.project.source.level = 1.6

grails.project.dependency.resolution = {
	
    inherits("global")
	
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
    }
	plugins {
		build ':release:2.2.1', ':rest-client-builder:1.0.3', {
			export = false
		}
		
		runtime(":hibernate:$grailsVersion") {
			export = false
		}
	}
}
