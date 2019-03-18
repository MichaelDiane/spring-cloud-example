package com.taolue.example.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.taolue.example.rabbitmq.sender.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootExampleRabbitmqApplicationTests {
	
	@Autowired
	private Sender sender;
	
	@Test
	public void contextLoads() {
		sender.send();
	}

}
