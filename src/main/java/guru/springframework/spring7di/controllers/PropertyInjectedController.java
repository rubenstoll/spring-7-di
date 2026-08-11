package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingServicePI")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        System.out.println("say hello from property injected controller");
        return greetingService.sayHello();
    }
}
