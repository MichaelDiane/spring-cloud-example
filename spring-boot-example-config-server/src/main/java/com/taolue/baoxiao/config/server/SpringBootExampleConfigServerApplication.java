package com.taolue.baoxiao.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/***
 * 说明: TODO
 * @author Michael.Zhang
 * @version 配置中心服务演示
 */
@EnableConfigServer
@SpringBootApplication
public class SpringBootExampleConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleConfigServerApplication.class, args);
	}
}
