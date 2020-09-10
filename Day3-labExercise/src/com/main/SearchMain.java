package com.main;

import java.util.Scanner;

import com.num.NumberSearch;

public class SearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter n value");
		int n=scanner.nextInt();
		System.out.println("Enter array elements");
		int array[]=new int[n];
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		//int first=array[0];
		System.out.println("Enter key");
		int key=scanner.nextInt();
		NumberSearch number=new NumberSearch();
		boolean check=number.isSearch(array, key);
				if(check)
				{
			System.out.println(key+" "+"is found");
				}
				else
				{
					System.out.println(key+" "+"is not found");
				}

	}

}
