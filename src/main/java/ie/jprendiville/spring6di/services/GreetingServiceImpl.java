package ie.jprendiville.spring6di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greetings Everyone From Base Service using Dependencies without Injection";
    }
}
