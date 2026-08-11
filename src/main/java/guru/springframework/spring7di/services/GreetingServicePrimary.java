package guru.springframework.spring7di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayHello() {
        return "primary hello say hello";
    }
}
