
/*Write a program to read a string and return a modified string based on the following rules.
Return the String without the first 2 characters except when
a.	Keep the first char if it is 'k'
b.	Keep the second char if it is 'b'.
*/

package com.strings;

public class DeFront {
	public static String deFront(String str) {

	    if(str == null) return "";
	    else if(str.equals("k")) return str;
	    else if(str.length() < 2) return "";

	    boolean keepFirst = str.charAt(0) == 'k';
	    boolean keepSecond = str.charAt(0) == 'b';

	    if(!keepFirst && !keepSecond) return str.substring(2);
	    else if(!keepFirst && keepSecond) return str.substring(1);
	    else if(keepFirst && !keepSecond) return str.charAt(0) + str.substring(2);
	    else return str;
	}

}
