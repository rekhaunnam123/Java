package com.hcl.iter;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,number3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		number1=scanner.nextInt();
		System.out.println("Enter second number");
		number2=scanner.nextInt();
		System.out.println("Enter third number");
		number3=scanner.nextInt();
		
		Greater greater=new Greater();
		System.out.println("Largest number is"+greater.find(number1,number2,number3));
		 scanner.close();
		
		
	}

}
