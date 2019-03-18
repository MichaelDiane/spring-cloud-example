package com.taolue.example.stream.sender;
/** 
* @author Michael.Zhang
* @version 创建时间：2018年8月1日 下午4:17:41 
* @desc [消息生产者] 
*/

import java.util.Date;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableBinding(value= {SinkSender.class})
public class SinkSender {
	
	@Bean
	@InboundChannelAdapter(value=SinkOutput.OUTPUT,poller=@Poller(fixedDelay="2000"))
	public MessageSource<Date> tiMessageSource(){
		return ()->new GenericMessage<>(new Date());
	}
   
	public interface SinkOutput{
		String OUTPUT="input";
		
		@Output(SinkOutput.OUTPUT)
		MessageChannel output();
	}
	
}
