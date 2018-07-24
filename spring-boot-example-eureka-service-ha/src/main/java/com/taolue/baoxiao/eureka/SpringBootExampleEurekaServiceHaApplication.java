package com.taolue.baoxiao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/***
 * 说明: 集群高可用演示
 * @author Michael.Zhang
 * @version
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringBootExampleEurekaServiceHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleEurekaServiceHaApplication.class, args);
	}
}
