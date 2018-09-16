package com.techolution.rpskafka.producer.record;

/*
 * 	RESULT CLASS:
 * 		Simple POJO
 * 		used to grab posted JSON
 */
public class Result{
	
	private String playerChoice;
	private String comChoice;
	private int result;
	
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