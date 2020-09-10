package com.main;

import java.util.Scanner;

import com.strings.DeFront;

public class DefrontMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String string=scanner.nextLine();
		DeFront defron=new DeFront();
		System.out.println("Result= "+defron.deFront(string));
		scanner.close();
		

	}

}
