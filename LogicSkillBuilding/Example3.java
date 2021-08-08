package com.techment.LogicSkillBuilding;

import java.util.Scanner;

class BestHorse
{
	Scanner scanner = new Scanner(System.in); 
	int horseWeight[] = new int[3];		
	
	public void input()
	{
		for(int i=0;i<3;i++)
		{
		   System.out.println("Enter the weight of "+(i+1)+" horse : ");
			horseWeight[i] = scanner.nextInt();  
		}
		for(int i=0; i<3;i++)
		{
			for(int j=i+1;j<3;j++)
			{
				if(horseWeight[i]==horseWeight[j])
				{
					System.out.println("Entered weights are not distinct values");
					break;
				}
			}
		}
			
	}
	
	public void checkWeight()
	{
		if(horseWeight[0]>horseWeight[1] && horseWeight[0]>horseWeight[2])
				
				System.out.println("Best Horse is"+horseWeight[0]);
		
			else if(horseWeight[1]>horseWeight[2])
					System.out.println("Best Horse is: "+horseWeight[1]);

			else
				System.out.println("Best Horse is: "+horseWeight[2]);

}
}

public class Example3 {

	public static void main(String[] args) {
		BestHorse besthorse=new BestHorse();
		besthorse.input();
		besthorse.checkWeight();
	}

}
