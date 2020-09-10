package com.cn.component.mq.rabbitmq;

import com.cn.component.mq.Main;
import com.cn.component.mq.rabbitmq.model.RabbitMqSuit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.charset.StandardCharsets;

/**
 * @author zyd
 * @date 2019/11/21 14:29
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class SimpleConsumerTest {

    @Autowired
    private RabbitConsumer baseConsumer;

    @Test
    public void testConsumer() throws InterruptedException {
        RabbitMqSuit rabbitMqSuit = new RabbitMqSuit();
        rabbitMqSuit.setQueue("queue");
        baseConsumer.consumer(rabbitMqSuit, x -> {
            String msg = new String(x.getBytes(), StandardCharsets.UTF_8);
            System.out.println(msg);
        });
        Thread.sleep(10000L);
    }
}
