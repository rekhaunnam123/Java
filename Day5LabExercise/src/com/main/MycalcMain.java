/*You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers, and , as parameters and finds . If either or is negative, then the method must throw an exception which says "". Also, if both and are zero, then the method must throw an exception which says ""
For example, -4 and -5 would result in .
Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above. 


*/
package com.main;

import java.util.Scanner;

import com.fun.MyCalculator;

public class MycalcMain {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number1");
		int number1=scanner.nextInt();
		System.out.println("Enter number2");
		int number2=scanner.nextInt();
		MyCalculator mycalc=new MyCalculator();
		long result = 0;
		try {
			result = mycalc.power(number1,number2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
			System.out.println("numbers="+result);
		
	}
}