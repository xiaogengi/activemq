package com.xg.activemqdemo.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.ConnectionFactory;

/**
 * @program: activemqdemo
 * @description: 配置类
 * @author: gzk
 * @create: 2019-12-27 17:19
 **/
@Component
public class ActiveMQConfig {


    @Bean
    public ActiveMQQueue bank() {
        return new ActiveMQQueue("bank");
    }

    @Bean
    public ActiveMQQueue credit() {
        return new ActiveMQQueue("credit");
    }




    @Bean
    ConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory();
    }

    @Bean
    JmsTemplate jmsTemplate(ConnectionFactory connectionFactory) {
        JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
        jmsTemplate.setPriority(999);
        return jmsTemplate;
    }

    @Bean(value="jmsMessagingTemplate")
    JmsMessagingTemplate jmsMessagingTemplate(JmsTemplate jmsTemplate) {
        JmsMessagingTemplate messagingTemplate = new JmsMessagingTemplate(jmsTemplate);
        return messagingTemplate;
    }


}
