package ie.jprendiville.spring6di.controllers;

import ie.jprendiville.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayGreeting() {
        System.out.println("Property Injection without. The least preferred way along with Setter Injection.");
        System.out.println(propertyInjectedController.sayGreeting());
    }
}