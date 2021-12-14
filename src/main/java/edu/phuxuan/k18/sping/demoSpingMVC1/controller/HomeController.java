package edu.phuxuan.k18.sping.demoSpingMVC1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.phuxuan.k18.sping.demoSpingMVC1.model.User;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/hello")
	public String hello(Model model) {
		User userr = new User();
		userr.setFullname("Nguyen Van Hoang");
		model.addAttribute("myuser", userr);
		return "hello";
	}
	
}
