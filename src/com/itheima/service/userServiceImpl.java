package com.itheima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.dao.userDao;
import com.itheima.po.User;
@Service("userService")
public class userServiceImpl implements userService {
	@Autowired
	private userDao userdao;
	@Override
	public User loginByUsername(String username,String password) {
		User user = this.userdao.loginByUsername(username, password);
		return user;
	}

}
