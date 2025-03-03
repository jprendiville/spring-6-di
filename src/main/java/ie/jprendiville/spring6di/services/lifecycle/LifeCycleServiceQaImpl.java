package ie.jprendiville.spring6di.services.lifecycle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service("lifeCycleService")
public class LifeCycleServiceDevImpl implements  LifeCycleService {

    private final Logger logger = LogManager.getLogger(getClass());

    @Override
    public String sayLifeCycle() {
        return "This is the Life Cycle";
    }
}
