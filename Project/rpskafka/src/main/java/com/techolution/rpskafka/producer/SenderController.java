package com.techolution.rpskafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {
	
	@Autowired
	private Sender sender;
	
	@PostMapping(value="/", consumes=MediaType.APPLICATION_JSON_VALUE)
	public Result home(@RequestBody Result message)
	{
		sender.send(message);
		return message;
	}
}
