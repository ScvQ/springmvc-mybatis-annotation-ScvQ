package com.grace.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grace.user.service.IUserService;

@Controller
@RequestMapping("/user")
public class DeleteUserController {

	@Resource
	private IUserService userService;

	@RequestMapping("delete")
	public void delete(@RequestParam("id") String id, Model model) {

		this.userService.delete(id);

		model.addAttribute("id", id);

	}

}
