package com.caps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.caps.spring.beans.UserDTO;
import com.caps.spring.service.UserService;

@Controller
@RequestMapping("/controller")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello()
	{
		return "Register";
	}

	@RequestMapping(value = "/hai",method = RequestMethod.GET)
	public String hai()
	{
		return "Login";
	}



	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView  registerUser(@ModelAttribute UserDTO userdto) {


		boolean result=userService.createUser(userdto);

		if(result)
		{
			System.out.println(userdto);
			return new ModelAndView("Login");

		}
		else
		{
			return new ModelAndView("Register");
		}

	}

	@RequestMapping(value="/loginuser",method=RequestMethod.POST)
	public ModelAndView  loginUser(@ModelAttribute UserDTO userdto) {


		UserDTO user=userService.login(userdto);

		if(user!=null)
		{
			if(user.getRole().equalsIgnoreCase("admin"))
			{
				System.out.println(user);
				return new ModelAndView("AdminHomePage");
			}else if(user.getRole().equalsIgnoreCase("employee"))
			{
				return new ModelAndView("UserHomepage");
			}else 
			{
				return new ModelAndView("UserHomepage");
			}

		}
		else
		{
			return new ModelAndView("Login");
		}

	}

	@RequestMapping(value="/updateuser",method=RequestMethod.GET)
	public ModelAndView updateUser(@ModelAttribute UserDTO userdto)
	{
		
		boolean user=userService.updateUser(userdto);
		if(user)
		{
			if(userdto.getRole().equalsIgnoreCase("admin"))
			{
				return new ModelAndView("AdminHomePage");
			}else if(userdto.getRole().equalsIgnoreCase("employee"))
			{
				return new ModelAndView("UserHomepage");
			}else
			{
				return new ModelAndView("UserHomepage");
			}
		}
		else
		{
			return new ModelAndView("Update");
		}

	}

	@RequestMapping(value="/deleteuser",method=RequestMethod.GET)
	public ModelAndView deleteUser(@RequestParam("") String email) {

		boolean result=userService.deleteUser(email);

		if(result)
		{

			return new ModelAndView("Register");
		}

		else
		{
			return new ModelAndView("Delete");
		}

	}




}
