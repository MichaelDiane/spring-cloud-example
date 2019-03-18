package com.taolue.example.stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.taolue.example.stream.sender.SinkSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaoxiaoBootExampleStreamBindApplicationTests {
	
	@Autowired
	private SinkSender sinkSender;

	@Test
	public void contextLoads() {
		//this.sinkSender.output().send(MessageBuilder.withPayload("From SinkSender").build());
	}

}
