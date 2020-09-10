
/*Write a Java program to replace all the 'd' occurrence characters with ‘h’ characters in each string.
*/
package com.strings;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String string1=scanner.nextLine();
		System.out.println("Replaced string is: "+string1.replace('d', 'h'));

	}

}
