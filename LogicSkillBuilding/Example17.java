package com.techment.LogicSkillBuilding;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public String getMessage()
	{
		return "You are not Eligible to Vote..!!";
	}
}
class Voting
{
	int age;
	void input()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your age to apply for Voting");
		age=scan.nextInt();
	}
	void compare() throws InvalidAgeException
	{
		if(age>=18 && age<=60)
		{
			System.out.println("Welcome to Vote..!!");
		}
		else if(age<18 || age>60)
		{
			InvalidAgeException iae= new InvalidAgeException();
			System.out.println(iae.getMessage());
		}
	}
}
class Eligible
{
	void process()
	{
		Voting vt =new Voting();
		vt.input();
		try {
			vt.compare();
		} 
		catch (InvalidAgeException iae) {
			System.out.println(iae.getMessage());
		}
	}
}
public class Example17 {

	public static void main(String[] args) throws InvalidAgeException {
		
		Eligible eg= new Eligible();
		eg.process();

	}

}
