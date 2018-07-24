package com.taolue.baoxiao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootExampleEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleEurekaClientApplication.class, args);
	}
	
}
