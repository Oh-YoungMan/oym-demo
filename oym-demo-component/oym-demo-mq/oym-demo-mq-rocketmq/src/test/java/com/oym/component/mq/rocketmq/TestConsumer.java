package com.oym.component.mq.rocketmq;

import com.oym.component.mq.TestRocketMqApplication;
import com.oym.component.mq.rocketmq.config.RocketMqSuit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.charset.StandardCharsets;

/**
 * @author zhangyd
 * @date 2019/11/21 14:29
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestRocketMqApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class TestConsumer {

    @Autowired
    private RocketConsumer rocketConsumer;

    @Test
    public void testConsumer() throws InterruptedException {
        RocketMqSuit rocketMqSuit = new RocketMqSuit();
        rocketMqSuit.setTopic("topic1");
        rocketMqSuit.setTags("*");
        rocketConsumer.consumer(rocketMqSuit, x -> {
            String msg = new String(x.getBytes(), StandardCharsets.UTF_8);
            System.out.println(msg);
        });
        Thread.sleep(30000L);
    }
}
