package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Example34 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size");
		  int n=scan.nextInt();
		  for(int i=1;i<=n;i++)
		  {
			  for(int j=n;j>=i;j--)
			  {

				  System.out.print(j+" ");
			  }
			  System.out.println();
		  }
	}

}
