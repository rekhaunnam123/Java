package com.main;

import java.util.Scanner;

import com.fun.SmallFind;

public class SmallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();
		SmallFind smallfind=new SmallFind();
		System.out.println("Smallest of three numbers "+smallfind.fun(number1, number2, number3));
		scanner.close();

	}

}
