package com.main;

import java.util.Scanner;

public class AsciiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char search=scanner.next().charAt(0);
		int asciicode=search;
		int asciiValue=(int)search;
		System.out.println("Ascii of given word"+asciiValue);

	}

}
