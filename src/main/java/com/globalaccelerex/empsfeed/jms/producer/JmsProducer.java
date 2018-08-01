package com.globalaccelerex.empsfeed.jms.producer;

import com.globalaccelerex.empsfeed.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Component
public class JmsProducer {
	@Autowired
	JmsTemplate jmsTemplate;

	@Value("${jsa.activemq.queue.producer}")
	String queue;

	public void send(String json){
//		jmsTemplate.convertAndSend(queue, message, new MessagePostProcessor() {
//	        public Message postProcessMessage(Message message) throws JMSException {
//	            //message.setStringProperty("company", companyName);
//	            return message;
//	        }
//	    });
        //Map<String, String> map = Collections.singletonMap(MessageParams.URL_PARAM.toString(), url);
         jmsTemplate.convertAndSend(queue,json);
	}
}