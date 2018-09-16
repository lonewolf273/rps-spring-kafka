package com.techolution.rpskafka.producer.record;

import java.time.LocalDateTime;
import java.util.UUID;


/*
 * 	RESULTRECORD CLASS:
 * 		uses Result class to properly record the event
 */
public class ResultRecord {
	
	public final UUID id;
	public final LocalDateTime timestamp;
	public final String playerChoice;
	public final String comChoice;
	public final int result;
	
	public ResultRecord(Result r)
	{
		id = UUID.randomUUID();
		timestamp = LocalDateTime.now();
		playerChoice = r.getPlayerChoice();
		comChoice = r.getComChoice();
		result = r.getResult();
	}
}
