package com.taolue.baoxiao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/***
 * 说明: 负债均衡演示
 * @author Michael.Zhang
 * @version
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringBootExampleEurekaConsumerApplication {
	
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleEurekaConsumerApplication.class, args);
	}
	
}
