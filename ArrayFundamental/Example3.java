package com.techment.ArrayFundamental;

import java.util.Scanner;
import java.util.Arrays;


public class Example3 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter 10 integers");
		for(int i=0; i<a.length; i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println("10 Entered integers are:");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.print("After sorting in ascending orders are: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
