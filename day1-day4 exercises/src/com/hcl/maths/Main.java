package com.hcl.maths;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber=scan.nextInt();
		System.out.println("Enter Second Number");
		int secondNumber=scan.nextInt();
		//
		Calculator calculator=new Calculator();
		calculator.setFirstNumber(firstNumber);
		calculator.setSecondNumber(secondNumber);
		
		Calculation calculation=new Calculation();
		System.out.println("Addition= "+calculation.add(calculator.getFirstNumber(),calculator.getSecondNumber()));
		System.out.println("Subtraction= "+calculation.subtract(calculator.getFirstNumber(),calculator.getSecondNumber()));
		System.out.println("Multiplication= "+calculation.multiply(calculator.getFirstNumber(),calculator.getSecondNumber()));
		System.out.println("Division= "+calculation.divide(calculator.getFirstNumber(),calculator.getSecondNumber()));
	}

}
