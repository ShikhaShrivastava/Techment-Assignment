package com.techment.LogicSkillBuilding;

import java.util.Scanner;

public class MultiplyTable5 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int limit=10, table=5;
		for(int i = 1; i<=limit;i++)
		{
			System.out.println(table+"*"+i+"="+table*i);
		}

	}

}
