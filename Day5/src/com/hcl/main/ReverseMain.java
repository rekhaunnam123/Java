package com.hcl.main;

import java.util.Scanner;

import com.hcl.numbers.Reverse;

public class ReverseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		Reverse reverse=new Reverse();
		System.out.println("Reverse of a number="+reverse.revert(number));
		
		

	}

}
