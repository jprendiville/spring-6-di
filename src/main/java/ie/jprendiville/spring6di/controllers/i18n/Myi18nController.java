package ie.jprendiville.spring6di.controllers.i18n;

import ie.jprendiville.spring6di.services.GreetingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18nController {
    private final Logger logger = LogManager.getLogger(getClass());

    private final GreetingService greetingService;

    public Myi18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        logger.info("This is greeting controller that will use profiles");
        return greetingService.sayGreeting();
    }
}
