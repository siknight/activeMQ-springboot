package activemqspringboot.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQServer {
    @JmsListener(destination = "xiaosi")
    public void receive(String message) {
        System.out.println("1收到的 message 是：" + message);
    }
}
