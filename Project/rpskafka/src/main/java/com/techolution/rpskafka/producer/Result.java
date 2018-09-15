package com.techolution.rpskafka.producer;

public class Result{
	
	private String playerChoice;
	private String comChoice;
	private String result;
	
	public Result()
	{
		super();
	}
	
	public Result(String playerChoice, String comChoice, String result)
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public String toString()
	{
	    return new StringBuilder()
	    		.append("{")
	            .append("\"playerChoice\":\""+playerChoice+"\",")
	            .append("\"comChoice\":\""+comChoice+"\",")
	            .append("\"result\":\""+result+"\"}")
	            .toString();
	}

}