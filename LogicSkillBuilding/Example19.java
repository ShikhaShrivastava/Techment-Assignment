package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Example19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the rows : ");
		int n=sc.nextInt();
		int count=n;
		for (int i=0; i<=n; i++)
		{
		  for (int j=1; j<=i*2; j++)
		  {
		  System.out.print(" ");
		  }
		 
		  for(int j=1; j<=count; j++) 
		  {
		   System.out.print(j+" ");
		  }
		  for(int j=count-1; j>=1; j--)
		  {
		  System.out.print(j+" ");
		  }
		 System.out.println();   
		 count--;  
		}
	}

}
