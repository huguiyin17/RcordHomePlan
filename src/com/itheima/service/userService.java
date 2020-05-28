package com.itheima.service;


import com.itheima.po.User;

public interface userService {
	public User loginByUsername(String username,String password);
}
