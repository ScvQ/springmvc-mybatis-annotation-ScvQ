package com.grace.user.service;

import java.util.List;

import com.grace.user.entity.User;

public interface IUserService {
	
	List<User> allUser();
	
	int update(String id,String username,String password,String nickname,String realname,int sex,int age,String phoneno,String address,String cardid,String email);
	
	User userById(String id);
	
	int delete(String id);
	
	int insert(String id,String username,String password,String nickname,String realname,int sex,int age,String phoneno,String address,String cardid,String email);

}
