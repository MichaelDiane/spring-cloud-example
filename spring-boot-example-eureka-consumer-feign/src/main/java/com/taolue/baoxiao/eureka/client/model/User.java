package com.taolue.baoxiao.eureka.client.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/** 
* @author Michael.Zhang
* @version 创建时间：2018年7月1日 下午10:58:14 
* @desc [实体对象] 
*/
public class User implements Serializable {
	/**
	 * 说明: 
	 * 类型:long 名称:serialVersionUID  
	 */
	private static final long serialVersionUID = -8673982732393573468L;
	
	@Getter@Setter
	private String name;
	
	@Getter@Setter
	private Integer age;
	
	@Getter@Setter
	private String sex;
	

	public User() {
		super();
	}


	public User(String name, Integer age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "name="+name+",age="+age+",sex="+sex;
	}
	
	
	
	
}
