package com.taolue.baoxiao.gateway.filter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/** 
* @author Michael.Zhang
* @version 创建时间：2018年7月9日 上午10:50:03 
* @desc [类说明-错误异常统一处理] 
*/
@Component
public class ErrorExceptionFilter extends ZuulFilter {
	private static final Logger log = LoggerFactory.getLogger(RequestLogFilter.class);
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx= RequestContext.getCurrentContext();
		Throwable throwable= ctx.getThrowable();
		log.error("this is a ErrorFilter : {)", throwable.getCause().getMessage()); 
		ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR); 
		ctx.set("error.exception", throwable.getCause());
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "error";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 12;
	}

}
