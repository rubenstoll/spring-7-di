package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.services.GreetingService;

//@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
