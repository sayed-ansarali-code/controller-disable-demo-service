### Simple SpringBoot Application - To demonstrate enabling / disabling of individual controllers
* A very simple SpringBoot application.
* Starts at port 8080.
* Exposes two endpoints http://localhost:8080/dev/svc and http://localhost:8080/qa/svc demonstrating enabling/disabling of endpoints via a property. Uses `@ConditionalOnProperty` to achieve the same.
* Exposes one more endpoint http://localhost:8080/dev/profile/svc which is enabled only when `dev` profile is active. Uses `@Profile` annotation to achieve the same.

### When application is started with active profile 'qa', 
* application-qa.properties is picked up. 
* `dev.controller.enabled=false`.
* `/dev/svc` endpoint will be disabled and won't work. 
* `/dev/profile/svc` endpoint will be disabled and won't work. 
* But `qa/svc` endpoint will continue to work.

### When application is started with active profile 'dev', 
* application-dev.properties is picked up. 
* `dev.controller.enabled=true`.
* `/dev/svc` endpoint will continue to work. 
* `/dev/profile/svc` endpoint will continue to work. 
* `qa/svc` endpoint will continue to work.
