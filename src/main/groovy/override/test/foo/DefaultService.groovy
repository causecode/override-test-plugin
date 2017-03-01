package override.test.foo

import override.test.dummy.DummyService

/**
  * This class is the default implementation of DummyService. This class is injected as dummyService bean.
  * Check Plugin descriptor file (OverrideTestPluginGrailsPlugin.groovy) for bean override.
  */
class DefaultService implements DummyService {

    def myMethod() {
        // Default method definition.
    }
}
