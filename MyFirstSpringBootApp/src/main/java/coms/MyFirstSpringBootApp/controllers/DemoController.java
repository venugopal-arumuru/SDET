package coms.MyFirstSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/p1")
	public String DemoPage1()
	{
		return "Page1";
	}
	
	@GetMapping("/p2")
	public String DemoPage2()
	{
		return "Page2";
	}
}
