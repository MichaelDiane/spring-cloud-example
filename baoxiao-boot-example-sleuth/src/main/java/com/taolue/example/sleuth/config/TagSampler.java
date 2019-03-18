package com.taolue.example.sleuth.config;

import brave.sampler.Sampler;

/** 
* @author Michael.Zhang
* @version 创建时间：2018年8月15日 下午4:48:06 
* @desc [类定义收集指定tag的跟踪记录信息] 
*/
public class TagSampler extends Sampler {
	
	private String tag;
	
	public TagSampler(String tag) {
		super();
		this.tag = tag;
	}



	@Override
	public boolean isSampled(long arg0) {
		return true;
	}

}
