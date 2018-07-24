package com.taolue.baoxiao.eureka.client.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/** 
* @author Michael.Zhang
* @desc [hello-service消费者演示调用生产者接口] 
*/
@RestController
public class HelloConsumerController {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/consumer")
	public String index() {
		return this.restTemplate.getForEntity("http://SPRING-BOOT-EXAMPLE-EUREKA-CLIENT/hello", String.class).getBody();
	}
	

}
