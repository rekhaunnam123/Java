package com.main;

import java.util.Scanner;

import com.fun.MiddleChar;

public class MiddleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        MiddleChar middlechar=new MiddleChar();
        System.out.print("The middle character in the string: " + middlechar.middle(str)+"\n");
        
	}

}
