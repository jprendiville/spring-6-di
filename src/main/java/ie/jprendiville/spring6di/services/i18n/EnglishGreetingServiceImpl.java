package ie.jprendiville.spring6di.services.i18n;

import ie.jprendiville.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class EnglishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {return "Hello in English!";}
}
