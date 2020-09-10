package com.main;

import java.util.Scanner;

import com.fun.CountVowels;

public class CountVowelsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a string");
		String sentence=scanner.nextLine();
		CountVowels countvowel=new CountVowels();
		System.out.println("No.of vowels in our string is "+countvowel.count(sentence));
        scanner.close();
	}

}
