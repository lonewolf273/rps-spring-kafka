package com.techolution.rpskafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private static final String TOPIC = "example";
	
	@PostMapping("/")
	public String home(@RequestBody Result message)
	{
		System.out.print(message);
		kafkaTemplate.send(TOPIC, message);
		return "";
	}
}
