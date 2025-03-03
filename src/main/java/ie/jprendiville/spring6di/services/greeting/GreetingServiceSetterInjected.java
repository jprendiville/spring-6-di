package ie.jprendiville.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceSetterInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends do Setter Injection";
    }
}
