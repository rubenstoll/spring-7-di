package guru.springframework.spring7di.controllers.i18n;

import guru.springframework.spring7di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18NController {

    private final GreetingService greetingService;

    public MyI18NController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("in i18n controller returning hello ... ");
//        System.out.println(greetingService.sayHello());
        return greetingService.sayHello();

    }

}
