package com.grace.user.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grace.user.entity.User;
import com.grace.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;

	@RequestMapping("list")
	public void list(HttpServletRequest request, Model model) {

		List<User> list = this.userService.allUser();

		for (User user : list) {
			System.out.println(user.getId());
		}

		model.addAttribute("list", list);

	}

}
