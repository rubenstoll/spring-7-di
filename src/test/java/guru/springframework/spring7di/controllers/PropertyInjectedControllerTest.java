package guru.springframework.spring7di.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import guru.springframework.spring7di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new PropertyInjectedController();
//        controller.greetingService = new GreetingServiceImpl();
//    }

    @Test
    void sayHello() {
        String greeting = controller.sayHello();
        System.out.println(greeting);
        assertThat(greeting).isNotNull();
//        assertThat(greeting).isEqualTo("hello from base service");
    }
}