package com.xg.activemqdemo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * @program: activemqdemo
 * @description: 生产者
 * @author: gzk
 * @create: 2019-12-27 17:31
 **/
@RestController
public class ActiveMQProducer {


    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue bank;
    @Autowired
    private Queue credit;

    @RequestMapping("test")
    public void test(){
        for (int i = 0; i < 50; i++) {
            jmsMessagingTemplate.convertAndSend(this.bank,"我在哪" + i);
        }
    }

    @RequestMapping("test1")
    public void test1(){
        for (int i = 0; i < 50; i++) {
            jmsMessagingTemplate.convertAndSend(this.credit,i);
        }
    }


}
