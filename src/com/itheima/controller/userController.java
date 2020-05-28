package com.itheima.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.po.User;
import com.itheima.service.userService;
@Controller
public class userController {
	@Autowired
	private userService userService;
	
	@RequestMapping(value="/firstpage")
	public String firstpage() {
		return "userLogin";
	}
	
	@RequestMapping(value="/loginByUsername",method=RequestMethod.POST)
	public String loginByUsername(String username,String password,Model model,HttpSession session) {
			User user = userService.loginByUsername(username,password);
			System.out.println(username + password);
			if(user!=null) {
				session.setAttribute("USER_SESSION", user);
				return "userHomePage";
			}
			model.addAttribute("msg","账户或密码错误，请重新输入！");
			return "userLogin";
	}
}