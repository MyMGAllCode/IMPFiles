package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/contact")
	@PostMapping
	public ModelAndView getContact()
	{
		return new ModelAndView("index1.html");
	}	

}
