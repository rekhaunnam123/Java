package com.hcl.strings;
import java.util.Scanner;
public class SearchByCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String");
        String string=scanner.nextLine();
        System.out.println("Enter the character ");
        char ch=scanner.next().charAt(0);
        int index=string.indexOf(ch);
        System.out.println("index of the letter is:"+index);
	}

}
