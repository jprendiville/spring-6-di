package ie.jprendiville.spring6di;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import ie.jprendiville.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    private static final Logger logger = LogManager.getLogger(Spring6DiApplication.class);

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);
//        MyController controller = ctx.getBean(MyController.class);
//        logger.info("In the main method");
//        logger.info(controller.sayGreeting());
    }

}
