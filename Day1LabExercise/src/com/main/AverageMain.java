package com.main;

import java.util.Scanner;

import com.entry.Average;
import com.methods.AverageCalc;

public class AverageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter second number");
		int secondNumber=scanner.nextInt();
		System.out.println("Enter third number");
		int thirdNumber=scanner.nextInt();
		//creating obj for Average class
		Average average=new Average();
		average.setFirstNumber(firstNumber);
		average.setSecondNumber(secondNumber);
		average.setThirdNumber(thirdNumber);
		//creating obj for AverageMethod
		AverageCalc averagecalc=new AverageCalc();
		System.out.println("Average of Three Numbers= "+averagecalc.findAvg(average.getFirstNumber(), average.getSecondNumber(),average.getThirdNumber())); 
		

	}

}
