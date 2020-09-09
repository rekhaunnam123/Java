package com.main;

import java.util.Scanner;

import com.methods.EvenDigitSquare;

public class SquareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int no=sc.nextInt();
		EvenDigitSquare even=new EvenDigitSquare();
		System.out.println("Squares= "+even.evenSquare(no));
		}

	}


