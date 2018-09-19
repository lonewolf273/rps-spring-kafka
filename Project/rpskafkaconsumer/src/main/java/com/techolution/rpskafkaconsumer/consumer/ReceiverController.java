package com.techolution.rpskafkaconsumer.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techolution.rpskafkaconsumer.result.Result;
import com.techolution.rpskafkaconsumer.result.ResultService;

@RestController
public class ReceiverController {
	
	@Autowired
	Receiver receiver;
	
	@Autowired
	ResultService result;
	
	@GetMapping("/")
	private Object home()
	{
		return result.getLast();
	}
	
	@GetMapping("/list")
	private List<Result> list()
	{
		return result.getResults();
	}
	
}
