package com.chainsys.springproject.beans;

public class ScoreBoard {
	public int targetScore;
	
	private ScoreBoard() {
		System.out.println("scoreboard object is created");
		
	}
	private ScoreBoard(int runs) {
		targetScore=runs;
		System.out.println("scoreboard object is created");
		
	}
// factory method - the method are static here
	public static ScoreBoard createObject() {
		
		return new ScoreBoard();
	}
public static ScoreBoard createObject(int runs) {
		
		return new ScoreBoard(runs);
	}

}
