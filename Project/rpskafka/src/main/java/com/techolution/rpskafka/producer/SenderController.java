package com.techolution.rpskafka.producer;

import com.techolution.rpskafka.producer.record.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {
	
	/*This is one way to do dependency injection*/
	@Autowired
	private Sender sender;
	
	@PostMapping(value="/", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResultRecord home(@RequestBody Result message)
	{
		
		ResultRecord record = new ResultRecord(message);
		sender.send(record);
		return record;
	}
}
