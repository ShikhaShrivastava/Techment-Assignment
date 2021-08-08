package com.techment.LogicSkillBuilding;

import java.util.Random;

public class Example27 {

	public static void main(String[] args) {
		Random random= new Random();
		int a= random.nextInt(50);
		System.out.println("Enter 1st Random number :"+a);
		int b= random.nextInt(50);
		System.out.println("Enter 2nd Random number :"+b);
		if(a%2==0)
		{
			System.out.println("1st number is Even");
		}
		else if(b%2==0)
		{
			System.out.println("2nd number is Even");

		}
		else if(a%2==0 && b%2==0)
		{
			int c=a+b;
			System.out.println("Both even number added "+c);
		}
		else if(a%2!=0 && b%2!=0)
		{
			int d=a-b;
			System.out.println("Both odd number subtracted "+d);
		}
		else
		{
			System.out.println("Any one of them is odd");
		}
	}

}
