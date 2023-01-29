package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//	@GetMapping("home")
//	public ModelAndView home(@RequestParam("name") String myName) 
//	{
//		ModelAndView mv = new ModelAndView();
//		System.out.println(myName);
//		mv.addObject("name",myName);
//		mv.setViewName("home");
//		//we write view name as home not home.jsp because it can change in future from jsp to sth
//		//so mention the suffix in application.properties.
//		return mv;
//	}
	
	@GetMapping("home")
	public ModelAndView home(Alien alien) 
	{
		ModelAndView mv = new ModelAndView();
		System.out.println(alien);
		mv.addObject("alien",alien);
		mv.setViewName("home");
		//we write view name as home not home.jsp because it can change in future from jsp to sth
		//so mention the suffix in application.properties.
		return mv;
	}
	
	
}
