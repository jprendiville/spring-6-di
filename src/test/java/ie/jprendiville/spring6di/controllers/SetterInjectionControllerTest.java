package ie.jprendiville.spring6di.controllers;

import ie.jprendiville.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectionControllerTest {

    @Autowired
    SetterInjectionController setterInjectionController = new SetterInjectionController();

//    @BeforeEach
//    void setUp() {
//        setterInjectionController = new SetterInjectionController();
//        setterInjectionController.setGreetingService(new GreetingServiceImpl());
//    }

    @Test
    void sayGreeting() {
        System.out.println("This SetterInjected Test is now a Spring managed Component, using the @SpringBootTest and @Autowired stereotypes.\n JUnit will know that we need to autowire that automatically.\n Also we no longer need the setUp()");
        System.out.println(setterInjectionController.sayGreeting());
    }
}