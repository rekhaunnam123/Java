package com.hcl.maths;

public class Calculation {
	private int result;
	public int add(int num1,int num2)
	{
		result=num1+num2;
		return result;
	}
	public int subtract(int num1,int num2)
	{
		result=num1-num2;
		return result;
	}
	public int multiply(int num1,int num2)
	{
		result=num1*num2;
		return result;
	}
	public float divide(int num1,int num2)
	{
		result=num1/num2;
		return result;
	}

}
