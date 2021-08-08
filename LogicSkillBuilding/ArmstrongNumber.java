package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int x,temp,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		temp=n;
		while(n!=0)
		{
			x=temp%10;
			sum+=Math.pow(x, 3);
			temp/=10;	
		}
		if(sum==n)
			System.out.println(n+"Armstrong Number");
		else
			System.out.println(n+"Not Armstrong Number");
	}

}
