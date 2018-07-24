package com.taolue.baoxiao.eureka.client.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.taolue.baoxiao.api.service.HelloService;

/** 
* @author Michael.Zhang
* @version 创建时间：2018年7月2日 上午7:35:11 
* @desc [api接口封装调用演示列子] 
*/
@FeignClient(name="HELLO-SERVICE")
public interface RefactorHelloService extends HelloService {
	
}
