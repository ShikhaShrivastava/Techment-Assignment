package com.techment.LogicSkillBuilding;

import java.util.Scanner;

class Demo
{
	void fun() throws ArithmeticException
	{
		System.out.println("Connection1 Established");
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=scan.nextInt();
		System.out.println("Enter value of b");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Connection1 Terminated");
	}
}

public class Example18 {
	public static void main(String[] args)
	{	
		Demo d=new Demo();
		System.out.println("Connection Established");
		try 
		{
		d.fun();
	    }
		catch(Exception e)
		{
			System.out.println("");
		}
		finally {
			System.out.println("Inside Finally Block");
		}
		System.out.println("Connection Terminated");
	}
}
