package com.hcl.student;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=scanner.nextInt();
		int[] intArray=new int[n];
		System.out.println("Enter array values");
		for(int i=0;i<n;i++)
		{
			intArray[i]=scanner.nextInt();
		}
		//int[] intArray={4,5,7,9};
		Employee employee=new Employee();
		int[] output=employee.displayArray(intArray);
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(output[i]);
		}
		

	}

}
