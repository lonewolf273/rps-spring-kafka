package com.techolution.rpskafkaconsumer.consumer;

import com.google.gson.Gson;
import com.techolution.rpskafkaconsumer.result.Result;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	public Result recentMessage;
	CountDownLatch latch = new CountDownLatch(1);
	
	CountDownLatch getLatch()
	{
		return latch;
	}
		
	@KafkaListener(topics = "${kafka.topics}")
	public void receive(ConsumerRecord<?, ?> record)
	{
		System.out.println(record.value());
		///TODO: DO SOMETHING WITH THIS VALUE AND DON'T STORE IT HERE FOR FREAK'S SAKE
		///TODO: Possibly think about making an entity and uploading the file to a database
		recentMessage = new Gson().fromJson(record.value().toString(), Result.class);
		getLatch().countDown();
	}
}
