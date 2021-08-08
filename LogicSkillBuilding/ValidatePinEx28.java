package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class ValidatePinEx28 {

	public static void main(String[] args) {
		int correctPin = 12345;
		  
        Scanner scan = new Scanner(System.in);
        
        int enteredpin = 0;
		while(enteredpin!=correctPin) {
     	   System.out.println("Enter Correct Pin :");
     	    enteredpin = scan.nextInt();
     	   
     	    if(enteredpin==correctPin)
     	    	System.out.println("Pin Accepted");
        }
	}

}
