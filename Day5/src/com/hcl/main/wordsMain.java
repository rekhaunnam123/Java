package com.hcl.main;

import java.util.Scanner;

import com.hcl.numbers.Words;

public class wordsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        Words words=new Words();
        System.out.print("Number of words in the string: " + words.countWords(sentence)+"\n");

	}

}
