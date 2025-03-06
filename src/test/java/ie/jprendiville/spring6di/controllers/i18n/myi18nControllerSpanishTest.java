package ie.jprendiville.spring6di.controllers.i18n;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev","ES"})
@SpringBootTest
public class myi18nControllerSpanishTest {

    private final Logger logger = LogManager.getLogger(getClass());

    @Autowired
    Myi18nController myi18nController;

    @Test
    public void sayGreeting() {
        logger.info("Using a profile to say hello in Spanish");
        logger.info(myi18nController.sayGreeting());
    }
}
