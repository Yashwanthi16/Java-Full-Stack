package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Alien;
import com.example.demo.model.AlienRepo;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	//this method is very important as this helps us to see the home page.
	//in spring boot, we can't see home page by just running home.jsp, instead we must have a 
	//controller method that returns home view. Only then we can see the home page
	@RequestMapping("home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	//this request is coming from form, so we need a "/" before the name in request mapping
	//also we can accept the from information directly into the method
	@RequestMapping("/addAlien")
	public ModelAndView addAlien(Alien alien) {
		ModelAndView mv = new ModelAndView();
		repo.save(alien);
		mv.setViewName("home");
		mv.addObject(alien);
		System.out.println(alien);
		return mv;
	}
	
	@GetMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("welcome");
		System.out.println(aid);
		Alien alien = repo.findById(aid).orElse(new Alien());
		System.out.println(alien);
		System.out.println(repo.findByTech("Java"));
		System.out.println(repo.findByTechSorted("Java"));
		mv.addObject(alien);
		return mv;
	}
	
}
