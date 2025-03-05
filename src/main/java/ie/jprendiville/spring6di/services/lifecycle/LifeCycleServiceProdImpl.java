package ie.jprendiville.spring6di.services.lifecycle;

import ie.jprendiville.spring6di.LifeCycleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("lifeCycleService")
public class LifeCycleServiceProdImpl implements LifeCycleService {

    private final Logger logger = LogManager.getLogger(getClass());

    @Override
    public String sayLifeCycle() {
        return "This is the Prod Life Cycle";
    }
}
