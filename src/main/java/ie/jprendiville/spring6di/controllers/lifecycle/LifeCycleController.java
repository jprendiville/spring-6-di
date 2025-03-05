package ie.jprendiville.spring6di.controllers.lifecycle;

import ie.jprendiville.spring6di.LifeCycleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class LifeCycleController {
    private final Logger logger = LogManager.getLogger(getClass());

    private final LifeCycleService lifeCycleService;

    public LifeCycleController(@Qualifier("lifeCycleService") LifeCycleService lifeCycleService) {
        this.lifeCycleService = lifeCycleService;
    }

    public String sayLifeCycle() {
        return lifeCycleService.sayLifeCycle();
    }

}
