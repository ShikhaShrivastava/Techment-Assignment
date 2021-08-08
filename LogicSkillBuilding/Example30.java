package com.techment.LogicSkillBuilding;

public class Example30 {

	public static void main(String[] args) {
		String str="Hey This is Shikha";
		int n=str.length();
		char first=str.charAt(0);
		char last =str.charAt(n-1);
		int count=0,a;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
				count++;
		}
		for(a=0; a<str.length(); a++)
		{
			for(int j=1; j<str.length(); j++)
			{
				if(str.charAt(a)!=str.charAt(j))
				{
					break;
				}
			}
		}
		System.out.println("here"+a);
		System.out.println("Total number of character in above Message: "+ count);
		System.out.println("First character is: "+first+ " which is in position: "+str.indexOf('H')+ " & the last character in message is: "+last+ " which is in position: " +str.indexOf('a'));


	}

}
