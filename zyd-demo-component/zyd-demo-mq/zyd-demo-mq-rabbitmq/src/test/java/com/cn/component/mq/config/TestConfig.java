package com.cn.component.mq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zyd
 * @date 2019/11/21 15:15
 * @desc
 */
@Configuration
public class TestConfig {

    @Bean
    public Binding binding() {
        Queue queue = new Queue("queue");
        return BindingBuilder.bind(queue).to(new FanoutExchange("fanout"));
    }

}
