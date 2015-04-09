package lab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessagePrinter {

    // Injected via constructor
    final private MessageService service1;

    // Injected directly
    @Autowired
    private MessageService service2;

    @Autowired
    public MessagePrinter(final MessageService service) {
        this.service1 = service;
    }

    public String getMessage1() {
        return service1.getMessage();
    }

    public String getMessage2() {
        return service2.getMessage();
    }
}
