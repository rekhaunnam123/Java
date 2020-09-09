package com.main;

import java.util.Scanner;

import com.methods.SumOfOddDigits;

public class CheckOddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int no=sc.nextInt(); 
		SumOfOddDigits sum=new SumOfOddDigits();
		int res=sum.checkodd(no); 
		if(res==1)
		{
			System.out.println("Sum of odd digits is odd.");
			}
		else
		{
			System.out.println("Sum of odd digits is even.");
			}}


	}


