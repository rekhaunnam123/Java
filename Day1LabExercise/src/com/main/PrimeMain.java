package com.main;

import java.util.Scanner;

import com.entry.Prime;
import com.methods.PrimeMethod;

public class PrimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=scanner.nextInt();
		Prime prime=new Prime();
		prime.setNumber(num1);
		PrimeMethod primemethod=new PrimeMethod();
		boolean check=primemethod.check(num1);
		if(check)
		{
			System.out.println(num1+" "+"is a prime number");
		}
		else
		{
			System.out.println(num1+" "+"is not a prime number");
		}
	}

}
