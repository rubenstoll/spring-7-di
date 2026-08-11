package guru.springframework.spring7di.controllers;

import org.junit.jupiter.api.Test;

class MyControllerTest {


    @Test
    void sayHello() {
        MyController myController = new MyController();
        myController.sayHello();

    }
}