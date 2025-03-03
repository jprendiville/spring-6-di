package ie.jprendiville.spring6di.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private final Logger logger = LogManager.getLogger(getClass());

    @Override
    public String sayGreeting() {
        logger.info("This is now a Spring managed Component, using the @Service stereotype");
        return "Greetings Everyone From Base Service using DI";
    }
}
