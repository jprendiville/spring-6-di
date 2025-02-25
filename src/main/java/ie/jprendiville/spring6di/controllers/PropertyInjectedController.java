package ie.jprendiville.spring6di.controllers;

import ie.jprendiville.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String sayGreeting() {
        System.out.println("This is now a Spring managed Component, using the @Component and @Autowired stereotypes.\n Spring will know that we need to autowire that automatically, but again, this is not recommended for Property Injection.");
        return greetingService.sayGreeting();
    }
}
