package guru.springframework.spring7di.services.i18n;

import guru.springframework.spring7di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
//@Profile({"EN"})
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        System.out.println("EN SERVICEgreeting service");
        return "Say Hello in English EN";
    }
}
