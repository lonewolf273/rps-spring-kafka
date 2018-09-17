package com.techolution.rpskafkaconsumer.consumer;

import com.google.gson.Gson;
import com.techolution.rpskafkaconsumer.result.Result;
import com.techolution.rpskafkaconsumer.result.ResultRepository;

import java.util.concurrent.CountDownLatch;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	CountDownLatch latch = new CountDownLatch(1);
	
	@Autowired
	ResultRepository repository;
	
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
		Result recentMessage = new Gson().fromJson(record.value().toString(), Result.class);
		if(repository != null)
			repository.save(recentMessage);
		getLatch().countDown();
	}
}
