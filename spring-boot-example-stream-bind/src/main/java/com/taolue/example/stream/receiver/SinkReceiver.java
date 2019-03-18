package com.taolue.example.stream.receiver;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

import com.taolue.example.stream.sender.SinkSender;

import lombok.extern.slf4j.Slf4j;


/** 
* @author Michael.Zhang
* @version 创建时间：2018年8月1日 上午10:50:11 
* @desc [RabbitMQ消息接收者] 
*/
@Slf4j
@EnableBinding(value= {Sink.class,SinkSender.class})
public class SinkReceiver {
	
	@ServiceActivator(inputChannel=Sink.INPUT)
	public void receive(Object payload) {
		log.info("========================>Receive:"+payload);
	}
	
}
