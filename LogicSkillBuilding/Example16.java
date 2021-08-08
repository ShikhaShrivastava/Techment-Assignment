package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Example16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			if(i%3==0 && i%8==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
