package ie.jprendiville.spring6di.controllers;

import ie.jprendiville.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayGreeting() {
        System.out.println("Constructor Injection without Spring. Preffered way, but what we are doing here is mimicking what Spring DI does.");
        System.out.println(constructorInjectedController.sayGreeting());
    }
}