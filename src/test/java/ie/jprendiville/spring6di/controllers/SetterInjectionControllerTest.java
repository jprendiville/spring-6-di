package ie.jprendiville.spring6di.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.slf4j.LoggerFactory;

@SpringBootTest
class SetterInjectionControllerTest {

    private final Logger logger = LogManager.getLogger(getClass());

    @Autowired
    SetterInjectionController setterInjectionController = new SetterInjectionController();

    @Test
    void sayGreeting() {
        logger.info("This SetterInjected Test is now a Spring managed Component, using the @SpringBootTest and @Autowired stereotypes.\n JUnit will know that we need to autowire that automatically.\n Also we no longer need the setUp()");
        logger.info(setterInjectionController.sayGreeting());
    }
}