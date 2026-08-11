package guru.springframework.spring7di.services.i18n;

import guru.springframework.spring7di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        System.out.println("SERVICIO EN ESPANOL");
        return "Hola Mundo en Espaniol";
    }
}
