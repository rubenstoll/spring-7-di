package guru.springframework.spring7di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"default", "EN", "ES"})
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        System.out.println("say hello from base service implementation");
        return "hello from base service";

    }
}
