package com.main;

import java.util.Scanner;

import com.num.UserMainCode;

public class UserMain1 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		String string1=scanner.next();
		UserMainCode usermain=new UserMainCode();
		String output=usermain.getstring(string,string1);
		System.out.println(output);
	}

}
