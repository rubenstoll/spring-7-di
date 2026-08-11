package guru.springframework.spring7di.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "hello from base service";

    }
}
