package com.techolution.rpskafka.producer;

import com.techolution.rpskafka.producer.record.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

/*
 * 	SENDER CLASS:
 * 		uses kafkaTemplate to produce a result to the server
 * 
 */
@Component
public class Sender {

	//KAFKATEMPLATE: Simple, injectable way to produce messages
	@Autowired
	private KafkaTemplate<String, String> template;
	
	//using @Value allows the usage of application.yml to make topic not hard-coded
	@Value("${spring.kafka.topic}")
	private String topic;
	
	/*
	 * SEND METHOD:
	 * 		converts the record to JSON
	 * 		then produces the message to the partition
	 */
	public void send(ResultRecord message)
	{
		//template.send(topic, message);
		template.send(topic, new Gson().toJson(message));
	}
}
