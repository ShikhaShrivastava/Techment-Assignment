package com.techment.OOPs_Assignment;

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
		double i= Math.random()*3;
		int j=(int)i;
		System.out.println(j);
		switch(j)
		{
		case 1: medicine[1]=new Tablet();
				medicine[0].displayLabel();
				medicine[1].displayLabel();
				break;
		case 2: medicine[3]=new Syrup();
				medicine[2].displayLabel();
				medicine[3].displayLabel();
				break;
		case 3: medicine[5]=new Ointment();
				medicine[4].displayLabel();
				medicine[5].displayLabel();
				break;
				
		default:System.out.println("Invalid Choice");
		
		}
	}

}
