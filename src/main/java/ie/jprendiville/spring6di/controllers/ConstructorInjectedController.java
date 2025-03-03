package ie.jprendiville.spring6di.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ie.jprendiville.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final Logger logger = LogManager.getLogger(getClass());

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        logger.info("We are now @Qualifying this controller giving a name to specify which Service to implement");
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        logger.info("This is now a Spring managed Component, using the @Component stereotype.\n Because it has a Constructor of the GreetingService and only that Constructor, Spring will know that we need to autowire that automatically.");
        return greetingService.sayGreeting();
    }
}
