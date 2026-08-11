package guru.springframework.spring7di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

//@ActiveProfiles("EN")
@SpringBootTest
class MyI18NControllerTestEN {

    @Autowired
    MyI18NController myI18NController;

    @Test
    void sayHello() {
        var result = myI18NController.sayHello();
        System.out.println(result);

    }
}