package com.grace.user.controller;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grace.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class AddUserController {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("add")
	public void add(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("nickname") String nickname,@RequestParam("realname") String realname,@RequestParam("sex") String sex,@RequestParam("age") String age,@RequestParam("phoneno") String phoneno,@RequestParam("address") String address,@RequestParam("cardid") String cardid,@RequestParam("email") String email, Model model){
		
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		
		int sex1 = Integer.parseInt(sex);
		
		int age1 =Integer.parseInt(age);
		
		this.userService.insert(id, username, password, nickname, realname, sex1, age1, phoneno, address, cardid, email);
		
	}
	
}
