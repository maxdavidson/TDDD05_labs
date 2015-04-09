package lab2;

import org.junit.*;
import static org.junit.Assert.*;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(value = "lab2")
public class InjectionTest {

    private AbstractApplicationContext context;

    @Bean
    MessageService getMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    @Before
    public void setUp() {
        context = new AnnotationConfigApplicationContext(InjectionTest.class);
    }

    @After
    public void tearDown() {
        context.close();
    }

    @Test
    public void test() {
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        assertEquals("Hello World!", printer.getMessage1());
        assertEquals("Hello World!", printer.getMessage2());
    }
}
