package com.techment.ArrayFundamental;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int n= scan.nextInt();
		System.out.println("Enter the size of 2nd array");
		int m= scan.nextInt();
		int a[]= new int[n];
		int b[]= new int[m];
		System.out.print("Enter element in 1st Array");
		for(int i=0; i<=n-1; i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.print("Enter element in 2nd Array");
		for(int i=0; i<=m-1; i++)
		{
			b[i]=scan.nextInt();
		}
		scan.close();
		int[] c= new int[n+m];
		for(int i=0; i<=n-1; i++)
		{
			c[i]=a[i];
		}
		for(int i=0,k=n; i<=m-1; i++,k++)
		{
			c[k]=b[i];
		}
		System.out.println("Element present in 3rd Array");
		for(int i=0; i<=(n+m)-1; i++)
		{
			System.out.print(c[i]+" ");
		}

		


		
	}

}
