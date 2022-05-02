package com.java.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value="/page1", method=RequestMethod.GET)
	public String FirstWebPage(Model m)
	{		
		m.addAttribute("msg", "This is Spring Web MVC");
		return "WebPage1";
	}
	
	@RequestMapping(value="/page2", method=RequestMethod.GET)
	public String SecondWebPage(Model m)
	{
		m.addAttribute("msg", "Demo Pages");
		return "WebPage2";
	}
	
	
	
}
