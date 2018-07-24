package com.taolue.baoxiao.eureka.client.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taolue.baoxiao.api.dto.User;
import com.taolue.baoxiao.eureka.client.service.RefactorHelloService;

/** 
* @author Michael.Zhang
* @desc [hello-service消费者演示通过API封装调用生产者接口] 
*/
@RestController
public class HelloConsumerController {
	
	@Autowired
	private RefactorHelloService refactorHelloService;
	
	
	
	@RequestMapping("/feign-api")
	public String feignApi() {
		//备注，这样的使用也类似与zuul的聚合使用方式
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.refactorHelloService.hello("Michael")).append("\n");
		buffer.append(this.refactorHelloService.hello(("Michael"), 18, "1")).append("\n");
		buffer.append(this.refactorHelloService.hello(new User("Michael", 18, "男"))).append("\n");
		return buffer.toString();
	}
	
	@RequestMapping("/h5/feign")
	public String feign() {//网关测试方法
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.refactorHelloService.hello("Michael")).append("\n");
		Map<String,Object> map = new HashMap<>();
		map.put("month", "07");
		map.put("year", "2018");
		buffer.append(this.refactorHelloService.map(map));
		return buffer.toString();
	}

	

}
