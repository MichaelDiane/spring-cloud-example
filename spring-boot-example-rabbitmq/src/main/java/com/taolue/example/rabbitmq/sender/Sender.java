package com.taolue.example.rabbitmq.sender;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** 
* @author Michael.Zhang
* @version 创建时间：2018年7月29日 上午7:15:11 
* @desc [rabbitmq消息生产者] 
*/
@Component
public class Sender {
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send() {
		String context = "hello" + new Date();
		System.out.println("Sender:"+context);
		this.amqpTemplate.convertAndSend("hello",context);
	}
	
}
