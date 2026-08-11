package guru.springframework.spring7di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingServicePI")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayHello() {
        System.out.println("hello from greetingServicePropertyInjected");
        return "friend don't let friends do property injection!!!!!";
    }
}
