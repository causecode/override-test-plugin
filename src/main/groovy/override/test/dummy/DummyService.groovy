package override.test.dummy

/**
  * This interface declares the methods required for DefaultService.
 *
  * This plugin defines a DefaultService class which implements this interface and is registered as the
  * dummyService bean.
 *
  * To override the default implementation of dummyService bean, the installing application should create a
  * class(say CustomService) which implements this interface and finally inject your
  * custom class (CustomService) as dummyService in resources.groovy.
  */
interface DummyService {

    def myMethod()
}
