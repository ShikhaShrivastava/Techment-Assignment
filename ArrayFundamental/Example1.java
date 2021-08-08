package com.techment.ArrayFundamental;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a[]=new int[5];
		int max=a[0], min=a[0], secondMax=0;
		int size=a.length-1;
		System.out.println("Enter your 5 integer");

		for(int i=0; i<a.length; i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.print("Entered Integers are: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		//Second highest
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secondMax=max;
				max=a[i];
			}
			else if(a[i]>secondMax)
			{
				secondMax=a[i];
			}
			
		}

		//Highest (using for loop)
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		//Lowest (By Using Sorting Techniques)
		Arrays.sort(a);
		
		System.out.println("2 Highest Num: "+max+" & "+secondMax);
		System.out.println("2 Lowest Num: "+a[0] +" & "+ a[1]);

	}

}
