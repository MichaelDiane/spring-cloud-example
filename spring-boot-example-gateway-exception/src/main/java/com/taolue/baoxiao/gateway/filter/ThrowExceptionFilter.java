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
* @version 创建时间：2018年7月9日 上午10:08:27 
* @desc [类说明:异常处理过滤器] 
*/
@Component
public class ThrowExceptionFilter extends ZuulFilter {
	
	private static final Logger log = LoggerFactory.getLogger(ThrowExceptionFilter.class);
	
	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		log.info("---------过滤器演示异常处理案例----------");
		RequestContext cnx  =  RequestContext.getCurrentContext();
		try {
			this.throwException();
		} catch (Exception e) {
			cnx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			cnx.set("error.exception",e);
		}
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 11;
	}
	
	
	private void throwException() throws Exception {
		throw new  RuntimeException("抛出异常~");
	}

}
