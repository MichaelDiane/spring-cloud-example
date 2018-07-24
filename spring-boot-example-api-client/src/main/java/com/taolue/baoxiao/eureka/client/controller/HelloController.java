package com.taolue.baoxiao.eureka.client.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taolue.baoxiao.api.dto.User;
import com.taolue.baoxiao.api.service.HelloService;


/** 
* @author Michael.Zhang
* @desc [类说明] 
*/
@RestController
public class HelloController implements HelloService {

	@Override
	public String hello(@RequestParam("name") String name) {
		return "Hello" +name;
	}

	@Override
	public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age,@RequestHeader("sex") String sex) {
		return new User(name, age, sex);
	}

	@Override
	public String hello(@RequestBody User user) {
		return "Hello "+ user.getName() +","+user.getSex()+","+user.getAge();
	}

	@Override
	public String map(@RequestParam Map<String,Object> map) {
		if(map.containsKey("year")) {
			return "Year="+map.get("year")+",MONTH="+map.get("month");
		}
		return null;
	}

}
