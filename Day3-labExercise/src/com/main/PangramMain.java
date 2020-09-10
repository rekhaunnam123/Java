package com.main;

import java.util.Scanner;

import com.strings.Pangram;

public class PangramMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string");
		String search=scanner.nextLine();
		Pangram pangram=new Pangram();
		boolean check=pangram.isPangram(search.toLowerCase());
		if(check)
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("Not a pangram");
		}

	}

}
