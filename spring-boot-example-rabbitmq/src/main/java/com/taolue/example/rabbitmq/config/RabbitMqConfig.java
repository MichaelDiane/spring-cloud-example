package com.taolue.example.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/** 
* @author Michael.Zhang
* @version 创建时间：2018年7月29日 上午7:10:44 
* @desc [rabbitmq配置类] 
*/
@Configuration
public class RabbitMqConfig {
	
	@Bean
	public Queue helloQueue() {
		return new Queue("hello");
	}
	
}
