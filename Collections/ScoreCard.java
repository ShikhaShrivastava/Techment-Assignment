package com.techment.Collections;

import java.util.Map;
import java.util.TreeMap;

public class ScoreCard {

	public static void main(String[] args) {
		int sum=0;
		Map.Entry<String, Integer> max=null;
		Map<String,Integer> runs = new TreeMap<String,Integer>();
		runs.put("Rahane",20);
		runs.put("Rahul",30);
		runs.put("Kohli",150);
		runs.put("Dhoni",50);
		runs.put("Lokesh",2);
		System.out.println("Player who batted");
		for(Map.Entry<String, Integer> e: runs.entrySet())
		{
			System.out.println(e.getKey());
		}
		System.out.println();
		System.out.println("Scores by Player");
		for(Map.Entry<String, Integer> e: runs.entrySet())
		{
			System.out.println(e);
		}
		for(Map.Entry<String, Integer> e: runs.entrySet())
		{
			Integer scores=e.getValue();
			sum+=scores;
		}
		for(Map.Entry<String, Integer> e: runs.entrySet())
		{
			if(max==null || e.getValue().compareTo(max.getValue())>0)
			{
				max=e;
			}
		}
		System.out.println("Total Score : "+sum);
		System.out.println("Name of highest score : "+max.getKey());
		System.out.println("Run scored by Dhoni : "+runs.get("Dhoni"));


	}

}
