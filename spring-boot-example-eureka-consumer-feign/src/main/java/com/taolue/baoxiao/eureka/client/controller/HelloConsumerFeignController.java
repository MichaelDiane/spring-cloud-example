package com.taolue.baoxiao.eureka.client.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taolue.baoxiao.eureka.client.model.User;
import com.taolue.baoxiao.eureka.client.service.HelloService;

/** 
* @author Michael.Zhang
* @desc [hello-service消费者调用生产者接口Feign方式演示] 
*/
@RestController
public class HelloConsumerFeignController {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/feign")
	public String index() {
		return this.helloService.hello();
	}
	
	@RequestMapping("/feign2")
	public String feign() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(this.helloService.hello("Michael")).append("\n");
		buffer.append(this.helloService.hello(("Diane"), 18, "1")).append("\n");
		buffer.append(this.helloService.hello(new User("Michael", 18, "男"))).append("\n");
		
		return buffer.toString();
	}
	

}
