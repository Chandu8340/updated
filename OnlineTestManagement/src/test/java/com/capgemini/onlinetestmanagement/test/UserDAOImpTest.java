package com.capgemini.onlinetestmanagement.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.onlinetestmanagement.bean.User;
import com.capg.onlinetestmanagement.dao.UserDAOImp;

class UserDAOImpTest {
	User userDetails = new User();
	static UserDAOImp user;

	@BeforeAll
	public static void user() {
		user = new UserDAOImp();

	}

	@Test
	void testRegisterUser() {
		userDetails.setUserId(10);
		userDetails.setPhoneNumber(8125241259l);
		Map<Long, User> map = new HashMap<Long, User>();
		map.put(userDetails.getPhoneNumber(), userDetails);
		map.put(userDetails.getUserId(),userDetails);
		boolean b = user.registerUser(userDetails);
		System.out.println(b);
		assertEquals(true, b);
	}

	@Test
	void testDeleteUser() {
		userDetails.setUserId(222);
		Map<Long, User> map = new HashMap<Long, User>();
		map.put(userDetails.getUserId(), userDetails);
		boolean b = user.registerUser(userDetails);
		System.out.println(b);
		assertEquals(true, b);

	}

}
