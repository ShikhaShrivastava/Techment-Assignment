package com.techment.LogicSkillBuilding;

import java.util.ArrayList;
import java.util.Scanner;

class Product
{
	private int id;
	private String name;
	private float cost;
	
	public Product(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Products are: [id="+ id + ", name=" + name + ", cost=" + cost + "]";
	}
	
}

public class Example21 {

	public static void main(String[] args) 
	{
		ArrayList<Product> ar=new  ArrayList<Product>();
		ar.add(new Product(1,"Maybelline Lipstick",399));
		ar.add(new Product(2,"Patanjali Toothpaste",150));
		ar.add(new Product(3,"Himalayan Facewash",69));
		System.out.println(ar);

	}

}
