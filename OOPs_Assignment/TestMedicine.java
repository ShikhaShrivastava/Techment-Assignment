package com.techment.OOPs_Assignment;

import java.util.Random;

abstract class Medicine
{
	float price;
	String expiryDate;
	abstract void displayLabel();
	void getDetails() 
	{
		System.out.println("Company : MedLife");
	}
}
class Tablet extends Medicine
{

	@Override
	void displayLabel() {
		System.out.println("Store in a cool dry place");
	}
	
}
class Syrup extends Medicine
{

	@Override
	void displayLabel() {
		System.out.println("Best use before 12 month");
	}
	
}
class Ointment extends Medicine
{

	@Override
	void displayLabel() {
		System.out.println("For external use only");
	}
	
}
public class TestMedicine {

	public static void main(String[] args) {
		Medicine medicine[]=new Medicine[5];
		Random random = new Random();
		if(random.nextInt(3)==3)
		{
			medicine[3]=new Ointment();
			medicine[3].getDetails();
			medicine[3].displayLabel();
		}
		else if(random.nextInt(3)==2)
		{
			medicine[2]=new Tablet();
			medicine[2].getDetails();
			medicine[2].displayLabel();
		}
		else
		{
			medicine[0]=new Syrup();
			medicine[0].getDetails();
			medicine[0].displayLabel();
		}
	}

}
