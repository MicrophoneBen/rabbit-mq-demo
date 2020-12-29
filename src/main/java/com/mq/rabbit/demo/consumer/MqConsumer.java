package com.mq.rabbit.demo.consumer;

import com.mq.rabbit.demo.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhangbq
 * @since 2020-12-16 17:13
 **/
@Component
@RabbitListener(queuesToDeclare = @Queue(RabbitMQConfig.RABBITMQ_TOPIC))
public class MqConsumer {

    @RabbitHandler
    public void handlerMsg(Map map){
        System.out.println("收到来自RabbitMq的消息数据 " + map.toString());
    }
}
