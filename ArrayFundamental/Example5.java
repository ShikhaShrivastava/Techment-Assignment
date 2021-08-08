package com.techment.ArrayFundamental;

public class Example5 {

	public static void main(String[] args) 
	{
		int a[][]={{9,5,3},{4,1,6},{2,7,4}};    
		int b[][]={{3,8,1},{5,3,2},{7,1,6}};    
		    
		int c[][]=new int[3][3];  
		    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];   
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();   
		}
	}

}
