package com.techment.LogicSkillBuilding;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter first string:");
		 	String str1=scan.next(); 
		    System.out.println("Enter second string:");
	        String str2=scan.next();  
	        System.out.println("Before converting to uppercase:" +str1);
	        System.out.println("Before converting to uppercase:" +str2);
	        str1 = str1.toUpperCase();  
	        str2 = str2.toUpperCase();  
	        System.out.println("After converting to uppercase:" +str1);
	        System.out.println("After converting to uppercase:" +str2);

	  
	        if (str1.length() != str2.length())
	        {  
	            System.out.println("****Both the strings are not anagram****");  
	        }  
	        else 
	        {  
	            char[] string1 = str1.toCharArray();  
	            char[] string2 = str2.toCharArray();  
	  
	            Arrays.sort(string1);  
	            Arrays.sort(string2);  
	  
	            if(Arrays.equals(string1, string2) == true) {  
	                System.out.println("Both the strings are anagram");  
	            }  
	            else {  
	                System.out.println("Both the strings are not anagram");  
	            }  
	        }  
	}

}
