package com.techolution.rpskafkaconsumer.result;

import java.time.LocalDateTime;
import java.util.UUID;

public class Result {
	private UUID id;
	private LocalDateTime timestamp;
	private String playerChoice;
	private String comChoice;
	private int result;
	
	public Result(UUID id, LocalDateTime timestamp, String playerChoice, String comChoice, int result) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.playerChoice = playerChoice;
		this.comChoice = comChoice;
		this.result = result;
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getPlayerChoice() {
		return playerChoice;
	}

	public void setPlayerChoice(String playerChoice) {
		this.playerChoice = playerChoice;
	}

	public String getComChoice() {
		return comChoice;
	}

	public void setComChoice(String comChoice) {
		this.comChoice = comChoice;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
}
