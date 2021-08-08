package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int quantities[]=new int[5];
		int max=quantities[0];
		System.out.println("Enter quantities");
		for(int i=0; i<quantities.length; i++)
		{
			quantities[i]=scanner.nextInt();
		}
		System.out.println("Quantities are: ");
		for(int i=0; i<quantities.length; i++)
		{
			System.out.print(quantities[i]+" ");
			if(quantities[i]>max)
			{
				max=quantities[i];
			}
		}
		System.out.println("Maxmimum Quantities "+max);

	}

}
