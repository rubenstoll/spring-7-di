package guru.springframework.spring7di.controllers;



import static org.assertj.core.api.Assertions.assertThat;

import guru.springframework.spring7di.services.GreetingService;
import guru.springframework.spring7di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController  controller;

    @BeforeEach
    void setUp() {

        GreetingService service = new GreetingServiceImpl();
        this.controller = new ConstructorInjectedController(service);

    }

    @Test
    void sayHello() {
        String result = controller.sayHello();
        assertThat(result).isNotNull();

    }
}