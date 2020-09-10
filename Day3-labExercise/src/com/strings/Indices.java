
/*	Accept a string, and two indices(integers), and print the substring consisting of all characters inclusive range from ..to . 

*/

package com.strings;

import java.util.Scanner;

public class Indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter a string");
	        String string = scanner.next();
	        System.out.println("enter start string");
	        int start = scanner.nextInt();
	        System.out.println("enter end string");
	        int end = scanner.nextInt();
	        
	        System.out.println(string.substring(start,end));

	}

}
