package com.main;

import java.util.Scanner;
public class SwapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		System.out.println("Before swapping "+num1+" "+num2);
		System.out.println("\n");
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping "+num1+" "+num2);
		scanner.close();

	}

}
