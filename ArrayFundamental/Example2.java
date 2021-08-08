package com.techment.ArrayFundamental;

public class Example2 {

	public static void main(String[] args) 
	{
		int arr[]=new int[] {1,4,34,56,7};
		int searchElement=90;
		int index= -1;
		boolean found=false;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==searchElement)
			{
				found=true;
				index=i;
				break;
			}
		}
		if(found)
		{
			System.out.println("Index of element is:"+index);
		}
		else
		{
		System.out.println(-1);

		}
			

	}

}
