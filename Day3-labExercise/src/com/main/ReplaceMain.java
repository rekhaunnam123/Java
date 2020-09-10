package com.main;

import java.util.Scanner;

public class ReplaceMain{
			public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String replace = scanner.nextLine();
			reShape(replace);
			}
			public static String reShape(String s) {
			 
			StringBuffer stringbuffer = new StringBuffer(s);
			StringBuffer stringbuffer1 = new StringBuffer();
			String string2 = stringbuffer1.reverse().toString();
			for (int i = 0; i < string2.length(); i++) {
			stringbuffer1.append(string2.charAt(i));
			stringbuffer1.append("-");
			}
			stringbuffer1.deleteCharAt(stringbuffer1.length() - 1);
			System.out.println(stringbuffer1.toString());
			return stringbuffer1.toString();
			}
			}


	


