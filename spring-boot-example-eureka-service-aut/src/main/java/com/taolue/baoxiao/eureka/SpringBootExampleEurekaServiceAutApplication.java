package com.taolue.baoxiao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/***
 * 说明: 用户认证注册中心演示
 * @author Michael.Zhang
 * @version
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringBootExampleEurekaServiceAutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleEurekaServiceAutApplication.class, args);
	}
}
