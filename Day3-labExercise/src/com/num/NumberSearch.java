
/*write a Java program to search for an element of an integer array of 10 elements.*/




package com.num;

public class NumberSearch {
	public boolean isSearch(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return true;
			}
		}
		return false;
	}
}