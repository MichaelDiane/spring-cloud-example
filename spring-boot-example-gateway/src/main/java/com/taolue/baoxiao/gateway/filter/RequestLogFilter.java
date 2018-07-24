package com.taolue.baoxiao.gateway.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import io.reactivex.netty.protocol.http.server.HttpServerRequest;

/** 
* @author Michael.Zhang
* @version 创建时间：2018年7月2日 上午6:49:28 
* @desc [自定义过滤器使用，集成zuul网关定义的过滤器即可] 
*/
public class RequestLogFilter extends ZuulFilter {
	
	private static final Logger log = LoggerFactory.getLogger(RequestLogFilter.class);

	@Override
	public Object run() throws ZuulException {//具体的过滤器处理逻辑
		RequestContext ctx =  RequestContext.getCurrentContext();
		HttpServerRequest request=(HttpServerRequest) ctx.getRequest();
		log.info(String.format("send %s request to %s", request.getHttpMethod(),request.getUri().toString()));
		Object  accessToken = request.getQueryParameters().get("accessToken");
		if(accessToken==null) {//验证token完整性
			log.warn(" access token is empty!! ");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
		}
		return null;
	}

	@Override
	public boolean shouldFilter() {//判断该过滤器是否需要被执行
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int filterOrder() {//过滤器的执行顺序，适用多个过滤器，数值越小优先级越高
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String filterType() {//过滤器类型
		// TODO Auto-generated method stub
		return "pre";
	}

}
