package com.hcl.numbers;

public class Palindrome {
	private int reverse=0;
	public int check(int number)
	{
        int tmp=number;
        while(number>0)
        {
        	int digit=number%10;
        	reverse=reverse*10+digit;
        	number=number/10;
        }
        int x=0;
		if(tmp==reverse)
        {
        	x= reverse;
        }
        else
        {
        	x= -1;
        }
		return x;
        
	}
}
        
