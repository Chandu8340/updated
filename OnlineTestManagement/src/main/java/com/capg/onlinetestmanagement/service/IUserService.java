package com.capg.onlinetestmanagement.service;

import com.capg.onlinetestmanagement.bean.User;

public interface IUserService {

	boolean registerUser(User u);

	boolean deleteUser(long key);

	void showUsers();

}
