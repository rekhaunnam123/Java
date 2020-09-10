package com.main;
import java.util.Scanner;
import com.num.Sort;
public class SortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter n value");
		n=scanner.nextInt();
		System.out.println("Enter array elements");
		int arr[]=new int[n];
		for( i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		Sort sor=new Sort();
		int[] output=sor.traverse(arr);
		for(i=0;i<arr.length;i++)
		{
			System.out.println(output[i]);
		}
		scanner.close();
}
}