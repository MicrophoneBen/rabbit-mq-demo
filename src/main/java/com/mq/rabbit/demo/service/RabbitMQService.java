package com.mq.rabbit.demo.service;

/**
 * @author zhangbq
 * @since 2020-12-16 17:00
 **/
public interface RabbitMQService {

    public String sendMsg(String msg)throws Exception;
}
