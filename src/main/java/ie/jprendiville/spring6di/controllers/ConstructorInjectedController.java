package ie.jprendiville.spring6di.controllers;

import ie.jprendiville.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        System.out.println("This is now a Spring managed Component, using the @Component stereotype.\n Because it has a Constructor of the GreetingService and only that Constructor, Spring will know that we need to autowire that automatically.");
        return greetingService.sayGreeting();
    }
}
