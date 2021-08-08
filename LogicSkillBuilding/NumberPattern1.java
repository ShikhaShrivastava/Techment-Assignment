package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int n=s.nextInt();
		for(int i=n; i>=1;i--)  //5,4,3,2,1
		{
			for(int j=1; j<=i; j++)  
			{
				System.out.print(j + "");
			}
			System.out.println();
		}
		s.close();
	}

}
