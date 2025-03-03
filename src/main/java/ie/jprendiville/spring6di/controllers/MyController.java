package ie.jprendiville.spring6di.controllers;

import ie.jprendiville.spring6di.services.GreetingService;
import ie.jprendiville.spring6di.services.GreetingServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final Logger logger = LogManager.getLogger(getClass());

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayGreeting(){
        logger.info("I'm in the controller");
        return greetingService.sayGreeting();
    }

}
