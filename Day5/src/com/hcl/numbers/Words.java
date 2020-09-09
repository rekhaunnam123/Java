package com.hcl.numbers;

public class Words {
	 public static int countWords(String str)
	    {
		 int count = 0;
	        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
	        {
	            for (int i = 0; i < str.length(); i++)
	            {
	                if (str.charAt(i) == ' ')
	                {
	                    count++;
	                }
	            }
	            count = count + 1; 
	        }
	        return count;
}
}
