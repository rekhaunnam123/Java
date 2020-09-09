package com.hcl.strings;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("your first argument is:"+args[0]);
		System.out.println("Int data"+args[1]);
				int val=Integer.parseInt(args[1]);
				System.out.println(val+100);

	}

}
