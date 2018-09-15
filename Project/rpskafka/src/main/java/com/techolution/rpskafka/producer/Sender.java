package com.techolution.rpskafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class Sender {

	@Autowired
	private KafkaTemplate<String, Object> template;
	
	public static final String TOPIC = "example";
	
	public void send(Result message)
	{
		Gson g = new Gson();
		
		template.send(TOPIC, g.toJson(message));
	}
}
