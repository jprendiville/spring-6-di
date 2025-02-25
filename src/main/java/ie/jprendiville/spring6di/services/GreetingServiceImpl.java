package ie.jprendiville.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        System.out.println("This is now a Spring managed Component, using the @Service stereotype");
        return "Greetings Everyone From Base Service using DI";
    }
}
