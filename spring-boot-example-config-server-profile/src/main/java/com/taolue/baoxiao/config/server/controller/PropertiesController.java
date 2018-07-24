package com.taolue.baoxiao.config.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @author Michael.Zhang
* @version 创建时间：2018年7月9日 下午4:15:34 
* @desc [类说明-属性字段值获取演示] 
*/
@RefreshScope
@RestController
public class PropertiesController {
	
	@Value("${from}") 
	private String from;
	
	@Autowired
	private Environment ent;
	
	
	@RequestMapping("/from")
	public String from() {
		return this.from;
	}
	
	@RequestMapping("/from2")
	public String from2() {
		return  ent.getProperty("from");
	}
}
