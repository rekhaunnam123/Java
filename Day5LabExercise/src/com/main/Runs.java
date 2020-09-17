
/*Given total runs scored and  total overs faced as the input. Write a program to calculate the run rate with the formula,
Run rate= total runs scored/total overs faced.
Use BufferedReader class to get the inputs from user.
 This program may generate Arithmetic Exception / NumberFormatException. Use exception handling mechanisms to handle this exception. Use a single catch block. In the catch block, print the class name of the exception thrown.

*/

package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader r=new InputStreamReader(System.in); 
		BufferedReader br=new BufferedReader(r); 
		try {
		System.out.println("Enter the total runs scored"); 
		int runs=Integer.parseInt(br.readLine());
		System.out.println("Enter the total overs faced");
		int overs=Integer.parseInt(br.readLine());
		int runrate=runs/overs;
		System.out.println("RunRate= "+runrate);
		}
		catch(ArithmeticException ae)
		{
			System.err.println(ae);
		}

}
}
