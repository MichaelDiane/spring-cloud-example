package com.taolue.baoxiao.eureka.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.taolue.baoxiao.eureka.client.model.User;

/** 
* @author Michael.Zhang
* @version 创建时间：2018年7月1日 下午10:45:48 
* @desc [绑定接口封装,该层可以提至api层] 
*/
@FeignClient(name="spring-boot-example-eureka-client")
public interface HelloService {
	
	@RequestMapping("/hello")
	public String hello();
	
	@RequestMapping(value="/hello2",method=RequestMethod.GET)
	public String hello(@RequestParam("name") String name);
	
	@RequestMapping(value="/hello3",method=RequestMethod.GET)
	public String hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age,@RequestHeader("sex") String sex);
	
	@RequestMapping(value="/hello4",method=RequestMethod.POST)
	public String hello(@RequestBody User user);
	
	
}
