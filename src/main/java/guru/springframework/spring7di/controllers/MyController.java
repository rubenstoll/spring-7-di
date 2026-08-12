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
        System.out.println("Controller says ".concat(greetingService.sayHello()));
        return greetingService.sayHello();

    }

    public void beforeInit() {
        System.out.println("## - Before Init - Called by Bean Post Processor");

        System.out.println("in controller before init ... ");
    }

    public void afterInit() {
        System.out.println("## - After init called by Bean Post Processor");

        System.out.println("in controller after init ... ");
    }
}
