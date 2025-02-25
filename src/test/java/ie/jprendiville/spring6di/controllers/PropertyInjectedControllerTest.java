package ie.jprendiville.spring6di.controllers;

import ie.jprendiville.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

//    @BeforeEach
//    void setUp() {
//        propertyInjectedController = new PropertyInjectedController();
//        propertyInjectedController.greetingService = new GreetingServiceImpl();
//    }

    @Test
    void sayGreeting() {
        System.out.println("This PropertyInjected Test is now a Spring managed Component, using the @SpringBootTest and @Autowired stereotypes.\n JUnit will know that we need to autowire that automatically.\n Also we no longer need the setUp()");
        System.out.println(propertyInjectedController.sayGreeting());
    }
}