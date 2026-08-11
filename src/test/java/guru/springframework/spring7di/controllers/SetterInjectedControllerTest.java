package guru.springframework.spring7di.controllers;


import static org.assertj.core.api.Assertions.assertThat;

import guru.springframework.spring7di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    void sayHello() {
        String result = controller.sayHello();
        assertThat(result).isNotNull();
    }
}