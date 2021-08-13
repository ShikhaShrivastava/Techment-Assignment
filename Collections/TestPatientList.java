package com.techment.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;


class Patient implements Comparable<Patient>
{
	private int patientId;
	private String name;
	private int age;
	
	
	public Patient(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Patient p) {
		if (name == null && p.getName() == null) {
            return 0;
        } else if (name != null && p.getName() == null) {
            return -1;
        } else if (name == null && p.getName() != null) {
            return 1;
        } else {
            return name.compareToIgnoreCase(p.getName());
        }		
  }
}
public class TestPatientList 
{

	public static void main(String[] args) 
	{
		ArrayList<Patient>patients= new ArrayList<Patient>();
		patients.add(new Patient(1,"Shikha",24));
		patients.add(new Patient(2,"Raina",34));
		patients.add(new Patient(3,"Anup",28));

		
		for(Patient pat : patients)
		{
			System.out.println(pat.getPatientId()+" "+pat.getName()+ " " +pat.getAge());
		}
		System.out.println("after sorting");
		Collections.sort(patients);
		for(Patient pat : patients) 
		{
			System.out.println(pat.getPatientId()+" "+pat.getName()+ " " +pat.getAge());
		}
		
		Patient p1= new Patient(1,"Shikha",24);
		Patient p2= new Patient(2,"Raina",34);
		Patient p3= new Patient(3,"Anup",28);

		TreeSet<Patient> ts= new TreeSet<Patient>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		System.out.println(ts);
		
				
   }
}
