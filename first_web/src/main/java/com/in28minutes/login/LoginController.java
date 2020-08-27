package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController 
{
	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String showLoginPage()
	{
		// Resolve it to view using viewresolver....
		return "login";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String handleloginrequest(
			@RequestParam String uname,
			@RequestParam String psw, 
			ModelMap model)
	{
		if(service.validateUser(uname, psw))
		{
		model.put("uname", uname);
		model.put("psw", psw);
		
		//logger.info(dao.retrievesomething())
		
		// Resolve it to view using viewresolver....
		return "welcome";
		}
		else
		{
			model.put("errorMessage","Invalid Credentials");
			return "login";
		}
	}
}
