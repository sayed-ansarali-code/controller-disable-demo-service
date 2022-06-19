### Simple SpringBoot Application - To demonstrate enabling / disabling of individual controllers
* A very simple SpringBoot application.
* Starts at port 8080.
* Exposes two endpoints http://localhost:8080/dev/svc and http://localhost:8080/qa/svc
* When dev.controller.enabled=false, '/dev/svc' endpoint will be disabled and won't work. But 'qa/svc' endpoint will continue to work.
* When dev.controller.enabled=true, both the endpoints will work
