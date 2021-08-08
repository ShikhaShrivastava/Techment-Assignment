package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Year : ");
		int year=s.nextInt();
		boolean output=false;
		if(year%400==0)
		{
			output=true;
		}
		else if(year%100==0)
		{
			output=false;
		}
		else if(year%4==0)
		{
			output=true;
		}
		else
		{
			output=false;
		}
		if(output)
		{
			System.out.println("year "+year+ " is leap year");
		}
		else
		{
			System.out.println("year "+year+ " is not a leap year");

		}
	}

}
