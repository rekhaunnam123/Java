package com.methods;
public class Longest {
	public static String LongestWord(String str) 
    { 
		String[] s=str.split(" ");
		String longest="";
		for(String s1:s)
		{
			if(s1.length()>longest.length())
			{
				longest=s1;
			}
		}
		return longest;
		
    }
}
