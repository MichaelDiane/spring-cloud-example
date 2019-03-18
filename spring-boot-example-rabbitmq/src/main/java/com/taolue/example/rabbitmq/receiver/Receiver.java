package com.taolue.example.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/** 
* @author Michael.Zhang
* @version 创建时间：2018年7月29日 上午7:19:25 
* @desc [消息消费者] 
*/
@Component
@RabbitListener(queues="hello")
public class Receiver {
	
	@RabbitHandler
	public void process(String hello) {
		System.out.println("Receiver:"+hello);
	}
}
