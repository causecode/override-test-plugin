package override.test.plugin

import grails.plugins.*
import override.test.foo.DefaultService

class OverrideTestPluginGrailsPlugin extends Plugin {

    def grailsVersion = "3.2.0 > *"
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Override Test Plugin" // Headline display name of the plugin
    def author = "CauseCode"
    def authorEmail = ""
    def description = '''\
            Plugin for demo purpose.
    '''

    def documentation = "http://grails.org/plugin/override-test-plugin"

    Closure doWithSpring() { {->
        // Injecting bean for DefaultService class
            dummyService(DefaultService)
        }
    }

    void doWithDynamicMethods() {
        // TODO Implement registering dynamic methods to classes (optional)
    }

    void doWithApplicationContext() {
        // TODO Implement post initialization spring config (optional)
    }

    void onChange(Map<String, Object> event) {
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    void onConfigChange(Map<String, Object> event) {
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    void onShutdown(Map<String, Object> event) {
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
