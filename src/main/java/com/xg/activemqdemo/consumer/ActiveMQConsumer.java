package com.xg.activemqdemo.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @program: activemqdemo
 * @description: 消费者
 * @author: gzk
 * @create: 2019-12-27 17:36
 **/
@Component
public class ActiveMQConsumer {


    @JmsListener(destination = "bank")
    public void test(String consumer){
        System.out.println("bank:" + consumer);
    }
    @JmsListener(destination = "credit")
    public void test1(String consumer){
        System.out.println("credit:" + consumer);
    }

}
