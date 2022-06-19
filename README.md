### Simple SpringBoot Application - To demonstrate enabling / disabling of individual controllers
* A very simple SpringBoot application.
* Starts at port 8080.
* Exposes two endpoints http://localhost:8080/dev/svc and http://localhost:8080/qa/svc

### When application is started with active profile 'qa', 
* application-qa.properties is picked up. 
* `dev.controller.enabled=false`.
* `/dev/svc` endpoint will be disabled and won't work. 
* But `qa/svc` endpoint will continue to work.

### When application is started with active profile 'dev', 
* application-dev.properties is picked up. 
* `dev.controller.enabled=true`.
* `/dev/svc` endpoint will ontinue to work. 
* `qa/svc` endpoint will continue to work.
