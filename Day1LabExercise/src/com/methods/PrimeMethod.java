package com.methods;

public class PrimeMethod {
	public boolean check(int n)
	{
		if(n>1)
		{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
			     return false;
			}	
		}
		return true;
		}
		return false;	

}
}
