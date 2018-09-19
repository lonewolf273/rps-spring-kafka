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
		Result recentMessage = new Gson().fromJson(record.value().toString(), Result.class);
		repository.save(recentMessage);
		getLatch().countDown();
	}
}
