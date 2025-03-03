package ie.jprendiville.spring6di.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the Primary Bean.\n Because this is annotated @Primary Spring Tests will pick this up before GreetingService.\n But remember, Greeting Service will be picked up into the Spring Context.\n This @Primary is been given preference.";
    }
}
