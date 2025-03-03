package ie.jprendiville.spring6di.controllers.i18n;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

//@ActiveProfiles("EN")
@SpringBootTest
public class myi18nControllerEnglishTest {

    private final Logger logger = LogManager.getLogger(getClass());

    @Autowired
    Myi18nController myi18nController;

    @Test
    public void sayGreeting() {
        logger.info("Using a profile to say hello in English");
        logger.info(myi18nController.sayGreeting());
    }
}
