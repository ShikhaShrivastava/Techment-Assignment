package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		isPrime(n);
	}

	private static void isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("is Prime number");
		}
		else
		{
			System.out.println("is Not a prime Number");
		}
		
	}

}
