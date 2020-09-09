package com.hcl.iter;

public class Greater {
	private int number1;
	private int number2;
	private int number3;
	public int find(int number1,int number2,int number3)
	{
		if(number1>number2&&number1>number3)
		{
			return number1;
		}
		else if(number2>number1&&number2>number3)
		{
			return number2;
		}
		else
		{
			return number3;
		}
	}
	
	}