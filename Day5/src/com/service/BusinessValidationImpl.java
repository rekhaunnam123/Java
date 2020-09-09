package com.service;

import com.pojo.User;

public class BusinessValidationImpl implements BusinessValidation {

	@Override
	public User CreateUser(User user) {
		// TODO Auto-generated method stub
		if(user.getUserId()==10&& user.getPassword().equals("happy"))
		{
			user.setUserName("happy person");
		}
		if(user.getUserId()==20 && user.getPassword().equals("lunch"))
		{
			user.setUserName("Good Afternoon");
		}
		return null;
	}

	@Override
	public User readUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserIdAndPassword(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	
}

	