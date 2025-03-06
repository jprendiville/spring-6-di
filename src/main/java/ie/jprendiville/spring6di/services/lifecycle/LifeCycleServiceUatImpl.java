package ie.jprendiville.spring6di.services.lifecycle;

import ie.jprendiville.spring6di.services.LifeCycleService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("lifeCycleService")
public class LifeCycleServiceUatImpl implements LifeCycleService {

    @Override
    public String sayLifeCycle() {
        return "This is the UAT Life Cycle";
    }
}
