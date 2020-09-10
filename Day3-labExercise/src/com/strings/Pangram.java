
/*	Write a program to find the given string is pangram or not.*/


package com.strings;
public class Pangram {
	public static boolean isPangram(String teststr)
	{
		if(teststr.length()<26)
		{
			return false;
		}
		else {
			for(char ch='a';ch<='z';ch++)
			{
				if(teststr.indexOf(ch)<0)
				{
					return false;
				}
			}
		}
		return true;
	}
}


