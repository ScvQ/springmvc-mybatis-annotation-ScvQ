package com.grace.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grace.user.dao.UserDao;
import com.grace.user.entity.User;
import com.grace.user.service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Resource
	private UserDao userDao;

	@Override
	@Transactional
	public List<User> allUser() {
		
		List<User> list = this.userDao.allUser();
		
		return list;
	}
	
	@Override
	@Transactional
	public int update(String id, String username, String password, String nickname, String realname, int sex, int age,
			String phoneno, String address, String cardid, String email){
		
		return this.userDao.update(id, username, password, nickname, realname, sex, age, phoneno, address, cardid, email);
		
	}
	
	@Override
	@Transactional
	public User userById(String id){
		return this.userDao.userById(id);
	}
	
	@Override
	@Transactional
	public int delete(String id){
		
		return this.userDao.delete(id);
		
	}

	@Override
	@Transactional
	public int insert(String id, String username, String password, String nickname, String realname, int sex, int age,
			String phoneno, String address, String cardid, String email) {
		
		return this.userDao.insert(id, username, password, nickname, realname, sex, age, phoneno, address, cardid, email);
	}

}
