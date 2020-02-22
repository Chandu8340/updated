package com.capg.onlinetestmanagement.dao;

import com.capg.onlinetestmanagement.bean.User;

public interface IUserDAO {

	boolean registerUser(User u);

	boolean deleteUser(long key);

	void showUsers();

}
