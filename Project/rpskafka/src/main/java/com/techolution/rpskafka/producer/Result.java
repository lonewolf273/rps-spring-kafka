package com.techolution.rpskafka.producer;

public class Result {
	public String playerChoice;
	public String comChoice;
	public int result;
	
	public Result()
	{
		super();
	}
	
	public Result(String playerChoice, String comChoice, int result)
	{
		this.playerChoice = playerChoice;
		this.comChoice = comChoice;
		this.result = result;
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