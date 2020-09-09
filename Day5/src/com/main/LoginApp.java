package com.main;

import java.util.Scanner;

import com.pojo.User;
import com.service.BusinessValidation;
import com.service.BusinessValidationImpl;

public class LoginApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=null;
		User userTemp = null;
		System.out.println("enter user id");
		Scanner scanner=new Scanner(System.in);
		int id=scanner.nextInt();
		
		if(id>0)
		{
			user=new User();
			System.out.println("Your user id:"+id);
			user.setUserId(id);
			
		}
		else
		{
			System.out.println("please enter a valid id");
		}
		System.out.println("Enter password");
		String pwd=scanner.next();
		try
		{
		if(pwd.length()>0)
		{
			user.setPassword(pwd);
			BusinessValidation businessValidation=new BusinessValidationImpl();
			
			  userTemp=businessValidation.CreateUser(user);
		}
		else
		{
			System.out.println("please enter valid password");
		}
		}
		catch(NullPointerException e)
		{
			System.out.println("Exceptuon");
		}
		System.out.println("User id: "+user.getUserId());
		System.out.println("welcome: "+user.getUserName());
		System.out.println("password: "+user.getPassword());
		
		
		
		}
		

	}


