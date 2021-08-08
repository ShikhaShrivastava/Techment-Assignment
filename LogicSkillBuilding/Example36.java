package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Example36 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size");
		  int n=scan.nextInt();
		  for(int i=n;i>=1;i--)
		  {
			  for(int j=1;j<=i;j++)
			  {

				  System.out.print(j+" ");
			  }
			  for(int k=i; k>=1;k--)
			  {
				  System.out.print(k+ " ");
			  }
			  System.out.println();
		  }
	}

}
