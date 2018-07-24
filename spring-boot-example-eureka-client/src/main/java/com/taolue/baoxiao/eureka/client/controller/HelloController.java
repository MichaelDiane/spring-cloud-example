package com.taolue.baoxiao.eureka.client.controller;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taolue.baoxiao.eureka.client.model.User;

/** 
* @author Michael.Zhang
* @desc [类说明] 
*/
@RestController
public class HelloController {
	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/hello")
	public String index() {
        List<ServiceInstance> list = discoveryClient.getInstances("STORES");
        logger.info("===================================>size="+list!=null?list.size():0);
        if(CollectionUtils.isEmpty(list)) {
        	for (ServiceInstance instance : list) {
        		logger.info("===================================>host="+instance.getHost()+",service_id="+instance.getServiceId());
			}
        }
        
		return "Hello 伙伴们！相聚是缘！";
	}
	
	@RequestMapping("/hello2")
	public String hello(@RequestParam String name) {
		return "Hello "+ name;
	}
	
	@RequestMapping(value="/hello3",method=RequestMethod.GET)
	public User hello(@RequestHeader String name,@RequestHeader Integer age,@RequestHeader String sex) {
		return new User(name, age, sex);
	}
	
	@RequestMapping(value="/hello4",method=RequestMethod.POST)
	public String hello(@RequestBody User user) {
		return "Hello "+ user.getName() +","+user.getSex()+","+user.getAge();
	}
	
	

}
