package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Sum2Digit {

	public static void main(String[] args) {
		int n,digit,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a 2-digit number only:");
		n=s.nextInt();
		while(n!=0) {
			if(n>0 && n<=99) {
			digit=n%10;
			sum=sum+digit;
			n=n/10;
			}
		}
	    System.out.println(sum);

		
		
	}

}
