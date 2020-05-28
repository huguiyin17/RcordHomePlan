package com.itheima.dao;

import org.apache.ibatis.annotations.Param;

import com.itheima.po.User;

public interface userDao {
	public User loginByUsername(@Param("user_name") String username,@Param("user_pwd")String password);
}
