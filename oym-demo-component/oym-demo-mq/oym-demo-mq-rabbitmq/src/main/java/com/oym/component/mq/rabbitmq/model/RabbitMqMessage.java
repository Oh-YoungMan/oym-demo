package com.oym.component.mq.rabbitmq.model;

import com.oym.component.mq.model.MqMessage;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhangyd
 * @date 2019/11/21 10:50
 * @desc
 */
@Data
@Accessors(chain = true)
public class RabbitMqMessage extends MqMessage {

    private String queue;
    private String exchange;
    private String routingKey;
    private Object o;
}
