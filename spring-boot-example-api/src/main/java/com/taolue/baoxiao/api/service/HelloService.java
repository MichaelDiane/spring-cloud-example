package com.taolue.baoxiao.api.service;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.taolue.baoxiao.api.dto.User;

/** 
* @author Michael.Zhang
* @version 创建时间：2018年7月1日 下午10:45:48 
* @desc [绑定接口封装,该层可以提至api层] 
*/
@RequestMapping("/refactor")
public interface HelloService {
	@RequestMapping(value="/hello5",method=RequestMethod.GET)
	public String hello(@RequestParam("name") String name);
	
	@RequestMapping(value="/hello6",method=RequestMethod.GET)
	public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age,@RequestHeader("sex") String sex);
	
	@RequestMapping(value="/hello7",method=RequestMethod.POST)
	public String hello(@RequestBody User user);
	
	@RequestMapping(value = "/map", method = RequestMethod.POST)
	public String map(@RequestParam Map<String,Object> map);
	
	
}
