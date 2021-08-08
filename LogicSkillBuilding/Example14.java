package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Example14 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int products[]=new int[5];
		int sum=0;
		System.out.println("Enter Products");
		for(int i=0; i<products.length; i++)
		{
			products[i]=scanner.nextInt();
			sum=sum+products[i];	
		}
		System.out.println("Products are: ");
		for(int i=0; i<products.length; i++)
		{
			System.out.print(products[i]+" ");
			
		}
		System.out.println("Total Sum of product"+sum);
		System.out.println("Total number of products present are :"+products.length);
	}

}
