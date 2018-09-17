package com.techolution.rpskafkaconsumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiverController {
	
	@Autowired
	Receiver receiver;
	
	@GetMapping("/")
	private String home()
	{
		///TODO: receive the last value from the DB (when you make one)
		return receiver.recentMessage;
	}
	
}
