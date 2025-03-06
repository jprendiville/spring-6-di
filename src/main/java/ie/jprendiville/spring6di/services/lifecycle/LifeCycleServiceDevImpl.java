package ie.jprendiville.spring6di.services.lifecycle;

import ie.jprendiville.spring6di.services.LifeCycleService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("lifeCycleService")
public class LifeCycleServiceDevImpl implements LifeCycleService {

    @Override
    public String sayLifeCycle() {
        return "This is the Dev Life Cycle";
    }
}
