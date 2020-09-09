package com.hcl.iter;
import java.util.Scanner;
public class avgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   // int marks1,marks2;
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("enter marks1");
	    int marks1=scanner.nextInt();
	    System.out.println("enter marks2");
	    int marks2=scanner.nextInt();
	    Avg avg=new Avg();
	    System.out.println("Percentage="+avg.average(marks1, marks2));
	    scanner.close();
	    	

	}

}
