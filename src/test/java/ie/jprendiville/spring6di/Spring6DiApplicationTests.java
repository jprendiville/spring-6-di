package ie.jprendiville.spring6di;

import ie.jprendiville.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    MyController myController;

    @Test
    void testAutowireOfController() {
        System.out.println("Testing the autowire of the controller. We're telling Spring to autowire the bean into our test.");
        System.out.println(myController.sayGreeting());
    }

    @Test
    void testGetControllerFromCtx() {
        System.out.println("Testing getting the controller from the context. Because of DI, we're asking the appcontext for an instance of the Controller.");
        MyController myController = ctx.getBean(MyController.class);
        System.out.println(myController.sayGreeting());
    }

    @Test
    void contextLoads() {

    }

}
