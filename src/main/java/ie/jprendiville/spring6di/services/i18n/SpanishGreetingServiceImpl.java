package ie.jprendiville.spring6di.services.i18n;

import ie.jprendiville.spring6di.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {return "Hola en Espanol!";}
}
