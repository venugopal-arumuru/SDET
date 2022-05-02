package com.java.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String LoginPage(Model m)
	{
		return "Login";
	}
	
	@RequestMapping(value="/loginprocess", method=RequestMethod.POST)
	public String LoginPage(@RequestParam("txtUser") String user,  
			@RequestParam("txtPass") String pswd,
			Model m)
	{
		System.out.println(user + "  " + pswd);
		if(user.equals("venugopal") && pswd.equals("12345"))
		{
			return "Welcome";
		}
		else
			m.addAttribute("loginfo", "Please check username / password");
		return "Login";
	}
}
