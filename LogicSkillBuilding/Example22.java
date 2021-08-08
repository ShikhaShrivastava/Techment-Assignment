package com.techment.LogicSkillBuilding;
import java.util.ArrayList;
import java.util.Collections;


public class Example22 {
 public static void main(String[] args) {
		ArrayList<String> name =new ArrayList<String>(5);
	    name.add("Shikha");
	    name.add("Raina");
	    name.add("Shubham");
	    name.add("Anup");
	    name.add("Kinjol");
	    System.out.println("Names before sort"+name);
	    Collections.sort(name);
	    System.out.println("Names After sort"+name);



}	


}
