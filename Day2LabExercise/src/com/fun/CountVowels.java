package com.fun;

public class CountVowels {
	int count=0;
	public int count(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					{
				       count++;
					}
		}
		return count;
	}

}
