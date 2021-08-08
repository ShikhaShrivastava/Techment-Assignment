package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class No_in_Series {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int i = 1;
		while(i<=n)
		{
			System.out.print(i*i*i+"");
			i++;
		}
	}

}
