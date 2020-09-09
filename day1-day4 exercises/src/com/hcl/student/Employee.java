package com.hcl.student;

public class Employee {
	public int[] displayArray(int[] temp)
	{
		int[] returnArray=new int[4];
		for(int i=0;i<temp.length;i++)
		{
			returnArray[i]=temp[i]+100;
		}
		return returnArray;
	}

}
