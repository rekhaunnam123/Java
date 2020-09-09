package com.methods;

public class EvenDigitSquare {
	public static int evenSquare(int n)
	{
	int sum=0;
	while(n!=0)
	{
	int r=n%10;
	if(r%2==0)
	{
	sum=sum+(r*r);
	}
	n=n/10;
	}
	return sum;
	}

}
