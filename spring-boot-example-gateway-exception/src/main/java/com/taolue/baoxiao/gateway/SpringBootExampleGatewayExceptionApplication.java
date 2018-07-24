package com.taolue.baoxiao.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

import com.taolue.baoxiao.gateway.filter.RequestLogFilter;
/***
 * 说明: 网关调用例子演示
 * @author Michael.Zhang
 * @version
 */
@EnableZuulProxy
@SpringBootApplication
public class SpringBootExampleGatewayExceptionApplication {
	
	//实现了自定义过滤器之后并不会直接生效，需要为其创建具体的Bean实例化让其生效
	@Bean
	public RequestLogFilter requestLogFilter() {
		return new RequestLogFilter();
	}
	
	/***
	 * @Title SpringBootExampleGatewayExceptionApplication.serviceRouteMapper
	 * @Description: 自定义服务与路由映射的生成关系
	 * @return
	 * @version: 1.0 
	 * @author Michael.Zhang
	 * 修改历史: 
	 * 修改人: Michael.Zhang, 修改日期 : 2018年07月07日 下午4:20:51
	 * 修改内容 :
	 */
	@Bean
	public PatternServiceRouteMapper serviceRouteMapper() {
	return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)", "${version}/${name}");  
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleGatewayExceptionApplication.class, args);
	}
}
