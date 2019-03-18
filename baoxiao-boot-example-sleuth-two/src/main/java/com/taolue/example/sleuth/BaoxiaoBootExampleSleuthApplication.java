package com.taolue.example.sleuth;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
/***
 * 说明:服务调用追踪演示
 * @author Michael.Zhang
 * @version
 */
@Slf4j
@RestController
@EnableEurekaClient
@SpringBootApplication
public class BaoxiaoBootExampleSleuthApplication {
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@RequestMapping(value = "/trace-2", method = RequestMethod.GET)
	public String trace(HttpServletRequest request) {
	     log.info("<=========spring-boot-example-eureka-sleuth-02===========>",request.getHeader("X-B3-TraceId"),request.getHeader("X-B3-SpanId"));
	
	return "Trace";
	}

	public static void main(String[] args) {
		SpringApplication.run(BaoxiaoBootExampleSleuthApplication.class, args);
	}
	
}
