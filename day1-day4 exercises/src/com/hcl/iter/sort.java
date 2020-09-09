package com.hcl.iter;

public class sort {
	private int i;
	private int j;
	private int tmp;
	public int[] traverse(int[] array)
	{
		for(i=0;i<array.length;i++)
		{
			for(j=i+1;j<array.length;j++)
			{
				if(array[j]<array[i])
				{
					tmp=array[i];
					array[i]=array[j];
					array[j]=tmp;
					
				}
			}
		}
		return array;
	}

}
