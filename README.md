# grails-410-multiple-ds-service-error

Application will not boot due to some change between grails-data-mapping 7.1.0.M2 and 7.1.0.M3.

In `grails-app/services/com/example` comment out all `@Transactional` and `@ReadOnly` annotations on non-abstract methods and the application will boot.
