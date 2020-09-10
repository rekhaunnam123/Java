/*Write a program to read a string and a character, and reverse the string and convert it in a format
 *  such that each character is separated by the given character.
 *  Print the final string.*/

package com.num;

public class UserMainCode {
	public static String getstring(String str,String sym){
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<str.length();i++)
	{
		sb.append(str.charAt(i)).append(sym);
		}
	String result;
	result=sb.substring(0,sb.length()-1);
	return result;
	}
}


