package com.main;

import java.util.Scanner;

//import com.entry.FizzBuzz;
public class FizzMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		for(int i=1;i<=num;i++)
		{
		if ((i % 3 == 0)&&(i%5!=0))
		{ 
			System.out.println("Fizz");
		} 
		else if ((i % 3 != 0)&&(i%5==0)) 
		{
			System.out.println("Bizz");
		} 
		else if ((i % 3 == 0)&&(i%5==0))
		{ 
			System.out.println("FizzBuzz");
			} 
		else
		{
			System.out.println(i);
		}
		}
	}
}