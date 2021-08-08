package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Example37 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size");
		  int n=scan.nextInt();
		   int x = n / 2, y = 1;
		        for (int i = 1; i <= n; i++)
		        {
		            for (int j = 1; j <= x; j++) 
		            {
		                System.out.print(" ");
		            }
		            int count = y / 2 + 1;
		            for (int k = 1; k <= y; k++) {
		                System.out.print(count);
		                if (k <= y / 2)
		                    count--;
		                else
		                    count++;
		            }
		            System.out.println();
		            if (i <= n / 2)
		            {
		                x = x - 1;
		                y = y + 2;
		            }
		            else {
		                x = x + 1;
		                y = y - 2;
		            }

		        }

		  
	}

}
