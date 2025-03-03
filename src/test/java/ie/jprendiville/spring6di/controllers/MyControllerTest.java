package ie.jprendiville.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void sayHello() {
        logger.info("Dependencies without Injection");
        MyController myController = new MyController();
        logger.info(myController.sayGreeting());
    }
}