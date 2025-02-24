package ie.jprendiville.spring6di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void sayHello() {
        System.out.println("Dependencies without Injection");
        MyController myController = new MyController();
        System.out.println(myController.sayGreeting());
    }
}