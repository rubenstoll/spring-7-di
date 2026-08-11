package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService service) {
        System.out.println("--------------------> setGreetingService method invoked");
        this.greetingService = service;
    }

    public String sayHello() {
        System.out.println("say hello from setter injected controller");
        return greetingService.sayHello();
    }

}
