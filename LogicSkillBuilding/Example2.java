package com.techment.LogicSkillBuilding;

import java.util.Scanner;
class TrafficCongestion
{
	int todayDay;
	Scanner scan = new Scanner(System.in); 
	
	public void input()
	{
		System.out.println("Enter the day value");
		todayDay = scan.nextInt(); 
		if(todayDay<=31 && todayDay>=1)
			check();
		else
			System.out.println("Invalid Input");
	}
	
	public void check()
	{   
	     if(todayDay%2==0)
	    	 System.out.println("Cars with Even registration numbers are permitted today");
	     else
	    	 System.out.println("Cars with Odd registration numbers are permitted today");

	}
}

public class Example2 {

	public static void main(String[] args) {
		TrafficCongestion tc=new TrafficCongestion();
		tc.input();
	}

}
