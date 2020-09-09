package com.hcl.main;
import java.util.Scanner;

import com.hcl.iter.Name;

public class NameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		Name[] name=new Name[5];
		name[0]=new Name(1,"Ravi");
		name[1]=new Name(2,"seetha");
		name[2]=new Name(3,"Rekha");
		name[3]=new Name(4,"geetha");
		name[4]=new Name(5,"Sandeep");
		System.out.println("Enter string to be search");
		String search=scanner.nextLine();
		for(int i=0;i<name.length;i++)
		{
			if(name[i].getEmployeeName().equals(search))
			{
				System.out.println(name[i].toString());
			}
		}
		

	}

}
