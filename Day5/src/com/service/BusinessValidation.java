package com.service;

import com.pojo.User;

public interface BusinessValidation {
	User CreateUser(User user);
	User readUserById(int userId);
	User readUserByName(String name);
	User readUserIdAndPassword(User user);
	User updateUser(User user);
	boolean deleteUserById(int userID);


}
