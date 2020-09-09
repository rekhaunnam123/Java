package com.hcl.numbers;

public class Reverse {
	private  int reverse=0;
	public  int revert(int num)
	{
		while(num!=0)
		{
			int digit =num%10;
			reverse = reverse*10+digit;
			num=num/10;
			
		}
		return reverse;
	}

}
