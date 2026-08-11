package guru.springframework.spring7di.controllers.i18n;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
class MyI18NControllerTestES {

    @Autowired
    MyI18NController controller;

    @Test
    void sayHello() {
        System.out.println("ES controller test ...");
        String result = controller.sayHello();
        System.out.println(result);
        assertThat(result).isNotNull();

    }
}