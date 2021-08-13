package com.techment.Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyzer {

	private LinkedList<Integer> runData=new LinkedList<Integer>();

	public ScoreAnalyzer(LinkedList<Integer> runData) {
		super();
		this.runData = runData;
	}
		
	public void addRunsToList()
	{
		System.out.println("Run Scored : ");
		for(Integer i :runData)
		{
			System.out.println(i + " ");
		}
	}
	public void  calcRunRate()
	{
		float average = 0; Integer highestScore=0;
		for(Integer i : runData)
		{
			highestScore+=i;
			average=1.0f*highestScore/50;
		}
		System.out.println("RunRate : "+average);

	}
	public void lowestRunsScored()
	{
		System.out.println("Lowest Run : "+Collections.min(runData));
	}
		
}

public class TestScoreAnalyzer{
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter no. of player");
		int player=scanner.nextInt();
		LinkedList<Integer> li= new LinkedList<Integer>();
		System.out.println("Enter the player score:");
		for(int i=0; i<player; i++)
		{
			li.add(scanner.nextInt());
		}
		ScoreAnalyzer score= new ScoreAnalyzer(li);
		score.addRunsToList();
		score.calcRunRate();
		score.lowestRunsScored();
		System.out.println("Count of player who batted : "+player);
		
	}
	
}