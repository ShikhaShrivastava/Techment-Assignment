package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter first num: ");
			int first = sc.nextInt();
			System.out.print("Enter last num: ");
			int last = sc.nextInt();

			for(int i = first;i<=last;i++)
			{
				System.out.println("Soldier "+i);	
		}
				
	}

}
