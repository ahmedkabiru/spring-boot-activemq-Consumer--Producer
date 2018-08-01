package com.globalaccelerex.empsfeed.jms.consumer;

import com.globalaccelerex.empsfeed.model.Email;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class JmsConsumer {


    @JmsListener(destination = "${jsa.activemq.queue.producer}", containerFactory = "jsaFactory")
    public void receiveMessage(String json) {
        System.out.println("Received <" + json + ">");
    }



}