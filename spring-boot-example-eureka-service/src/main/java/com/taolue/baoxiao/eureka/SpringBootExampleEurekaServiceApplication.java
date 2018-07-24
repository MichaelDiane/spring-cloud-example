package com.taolue.baoxiao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/***
 * 说明: 单机器注册中心
 * @author Michael.Zhang
 * @version
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringBootExampleEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleEurekaServiceApplication.class, args);
	}
	
}
