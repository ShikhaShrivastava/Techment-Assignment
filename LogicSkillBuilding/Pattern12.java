package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size");
		  int n=scan.nextInt();
		  
		  for(int i=n;i>=1;i--)
		  {
			  for(int j=1; j<=n;j++)
			  {
				  if(j>=i)
				  {
					  System.out.print(j);
				  }
				  else
				  {
					  System.out.print(" ");
				  }
			  }
			  for(int k=4; k>=i; k--)
			  {
				  System.out.print(k);
			  }
			  System.out.println();
			 
		  }
		  
		  
		  
	}

}
