package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class Example20 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    int a[]=new int [5];
    	System.out.println("Enter 5 numbers");
	    for(int i=0; i<=a.length-1;i++)
	    {
	    	a[i]= scan.nextInt();
	    }
	    System.out.println(" Entered numbers are:");
        for(int i=0; i<=a.length-1;i++)
        {
        	System.out.println(a[i]+ " ");
        }
        try {
        System.out.println("Value of 3rd index: "+a[2]);
        System.out.println("Value of 7th index: "+a[7]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The index you have entered is invalid");
        }
	}

}
