package com.methods;

public class SumOfOddDigits {
	public static int checkodd(int n)
	{ 
		int sum=0,result;
		 while(n!=0)
		 { 
			 int r=n%10;
			 if(r%2!=0)
			 {
				 sum=sum+r;
				 }
			 n=n/10;
			 }
		 if(sum%2!=0)
		 {
			 result=1;
	}
	
	
	else
	{
		result=-1;
		}
	return result;

}
}
	
