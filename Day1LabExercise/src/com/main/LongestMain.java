package com.main;
import java.util.Scanner;
import com.methods.Longest;
public class LongestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string");
		String sentence=scanner.nextLine();
		Longest longest=new Longest();
		System.out.println("The longest word is "+longest.LongestWord(sentence));

	}

}
