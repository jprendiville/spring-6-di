package ie.jprendiville.spring6di.controllers.lifecycle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
public class lifeCycleDevTest {

    private final Logger logger = LogManager.getLogger(getClass());

    @Autowired
    LifeCycleController lifeCycleController;

    @Test
    public void sayLifeCycle() {
        logger.info(lifeCycleController.sayLifeCycle());
    }
}
