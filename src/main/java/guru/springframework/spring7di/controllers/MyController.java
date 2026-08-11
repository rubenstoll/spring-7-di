package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.services.GreetingService;
import guru.springframework.spring7di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

//    doesnt work if in package above spring boot annotated app
    public String sayHello() {
        System.out.println("in controller returning hello ... ");

        System.out.println(greetingService.sayHello());
        return greetingService.sayHello();

    }
}
