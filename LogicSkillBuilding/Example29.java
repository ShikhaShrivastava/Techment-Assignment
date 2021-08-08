package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Example29 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the height");
		  int h=scan.nextInt();
		  System.out.println("Enter the base");
		  int b=scan.nextInt();
		  double hyp=Math.sqrt((h*h)+(b*b));
		  System.out.println("Sum of Right Angle-Triangle:"+hyp);
	}

}
