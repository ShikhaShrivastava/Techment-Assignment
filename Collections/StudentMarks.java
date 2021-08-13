package com.techment.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		int total=0,i ;
		float avg = 0;
		System.out.println("Enter number of Students: ");
		Scanner scan= new Scanner(System.in);
		int students=scan.nextInt();
		System.out.println("Enter Marks");
		ArrayList<Integer> marks= new ArrayList<Integer>(students);
		for( i=1; i<students+1; i++)
		{
			marks.add(scan.nextInt());
		}
		
		for(int j=0; j<marks.size() ;j++)
		{
			total+=marks.get(j);
			avg=total/marks.size();
		}
		System.out.println("Highest Marks : " +Collections.max(marks));		
		System.out.println("Average Marks : "+ avg);
		for(int k=0; k<marks.size(); k++)
		{
			System.out.println(k+"-"+marks.get(k));
		}
		System.out.println("3rd Student Marks : "+marks.get(2));
		Collections.sort(marks);
		System.out.println("Sorted : "+marks);


		
		
	}

}
