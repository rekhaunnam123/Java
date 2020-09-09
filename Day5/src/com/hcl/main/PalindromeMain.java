package com.hcl.main;

import java.util.Scanner;

import com.hcl.numbers.Palindrome;

public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		Palindrome palindrome=new Palindrome(); 
		System.out.println("Palindrome of a number is"+palindrome.check(num));
	}

}
