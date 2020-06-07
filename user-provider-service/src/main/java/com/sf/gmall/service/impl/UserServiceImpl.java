package com.sf.gmall.service.impl;

import com.sf.gmall.bean.UserAddress;
import com.sf.gmall.service.UserService;
import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....old...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "深圳市南山区深投控创智天地大厦", "1", "李连胜", "18510793777", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市南山区软件产业基地", "1", "李连胜", "010-18510793777", "N");
		return Arrays.asList(address1,address2);
	}

}
