package com.hcl.strings;

import java.util.Scanner;

public class DuplicateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Duplicate duplicate = new Duplicate(); 
	       Scanner scanner=new Scanner(System.in);
	       System.out.println("enter the string");
	       String search=scanner.next();
	        duplicate.findIt(search);  
	    }  

	}


