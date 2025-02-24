package ie.jprendiville.spring6di.controllers;

import ie.jprendiville.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
