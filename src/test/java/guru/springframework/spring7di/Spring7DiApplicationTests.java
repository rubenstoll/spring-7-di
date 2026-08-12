package guru.springframework.spring7di;

import guru.springframework.spring7di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring7DiApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private MyController myController;

    @Test
    void contextLoads() {
    }

    @Test
    void givenAutwiredAppCtx_whenGetControllerBeanSayHello_thenHelloPrinted() {
        MyController controller = applicationContext.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }

    @Test
    void givenAutowiredController_whenSayHello_thenHelloPrinted() {
        System.out.println(myController.sayHello());

    }
}
