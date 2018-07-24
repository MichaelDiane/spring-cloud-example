package com.taolue.test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootExampleTestApplicationTests {


	private MockMvc mvc;
	
	@Autowired
	private WebApplicationContext  context;
	
	
	@Before
	public void setUp() throws Exception {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}
	
	/**
	 * 
	 * 测试报销列表
	 * 
	 */
	@Test
	public void testReimbursePage() {
		
		try {
			Map<String,Object> map = new HashMap<>();
			 
			//map.put("startDate", "2018-07-10");
			map.put("cause", "2018-07-10");
			String requestJson = JSONObject.toJSONString(map);
			System.out.println("========>JSON串===={"+requestJson+"}");
			//and_the_rest_of_validation_part
			MvcResult result = this.mvc.perform(MockMvcRequestBuilders.post("/tbReimburse/reimbPage").contentType(MediaType.APPLICATION_FORM_URLENCODED).content(requestJson)).andExpect(status().isOk()).andReturn();
			System.out.println("return data ={"+result.getResponse().getContentAsString()+"}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void testOther() {
		
		try {
			Map<String,Object> map = new HashMap<>();
			
			//map.put("startDate", "2018-07-10");
			map.put("cause", "2018-07-10");
			String requestJson = JSONObject.toJSONString(map);
			System.out.println("========>JSON串===={"+requestJson+"}");
			//and_the_rest_of_validation_part
			MvcResult result = this.mvc.perform(MockMvcRequestBuilders.post("/tbReimburse/add").contentType(MediaType.APPLICATION_FORM_URLENCODED).content(requestJson)).andExpect(status().isOk()).andReturn();
			System.out.println("return data ={"+result.getResponse().getContentAsString()+"}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
