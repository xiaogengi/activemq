package com.xg.activemqdemo;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqdemoApplication {



    public static void main(String[] args) {
        SpringApplication.run(ActivemqdemoApplication.class, args);
    }

}
