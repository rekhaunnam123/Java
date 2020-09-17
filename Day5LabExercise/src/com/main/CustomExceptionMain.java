/*Write a program to get the name and age of the player from the user and  display it. 
player name is a string 
player age is an integer value 
Note : The player is eligible to participate in IPL when their age is 19 and above 
  This program may generate   
1. InvalidAgeRange Custom Exception when the player's age is below 19 
 Use exception handling mechanisms to handle these exceptions 

 Create a class called CustomException which extends Exception and it includes constructor to initialize the message. 
 */
package com.main;

import java.util.Scanner;

import com.fun.InvalidAgeRangeException;

public class CustomExceptionMain {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter player name");
		String name=scanner.nextLine();
		System.out.println("Enter player age");
		int age=scanner.nextInt();
		try {
			if(age < 19)
            {
                throw new InvalidAgeRangeException(); 
            }
			else
			{
				System.out.println("name "+name);
				System.out.println("age "+age);
			}
        }
        catch(InvalidAgeRangeException ex)
        {
            System.out.println(ex);   
        }

	}

}
