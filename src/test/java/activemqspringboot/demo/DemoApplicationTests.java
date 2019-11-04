package activemqspringboot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    ActiveMQClient client;

    @Test
    void contextLoads() {
        client.sendMessage("nihao");
    }

}
