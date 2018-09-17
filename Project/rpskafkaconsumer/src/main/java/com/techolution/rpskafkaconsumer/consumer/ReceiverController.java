package com.techolution.rpskafkaconsumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techolution.rpskafkaconsumer.result.Result;

@RestController
public class ReceiverController {
	
	@Autowired
	Receiver receiver;
	
	@GetMapping("/")
	private Object home()
	{
		///TODO: receive the last value from the DB (when you make one)
		return receiver.recentMessage;
	}
	
}
