package com.main;

import java.util.Scanner;

import com.entry.Calculator;
import com.methods.CalcMethods;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter two numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		Calculator calculator=new Calculator();
		calculator.setNumber1(number1);
		calculator.setNumber2(number2);
		CalcMethods calcmethods=new CalcMethods();
		System.out.println("Addition= "+calcmethods.addition(calculator.getNumber1(), calculator.getNumber2()));
		System.out.println("subtraction= "+calcmethods.subtraction(calculator.getNumber1(), calculator.getNumber2()));
		System.out.println("Multiplication= "+calcmethods.multiplication(calculator.getNumber1(), calculator.getNumber2()));
		System.out.println("Division= "+calcmethods.division(calculator.getNumber1(), calculator.getNumber2()));




	}

}
