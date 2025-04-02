package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;

@Controller
public class HomeController {

@RequestMapping("/log")	
public String login(@RequestParam("username") String username, @RequestParam("password") String password,Model m) {

	System.out.println(username);
	System.out.println(password);
	m.addAttribute("u", username);
	m.addAttribute("p", password);
	m.addAttribute("id", 100);
	
	Student s=new Student();
	
	s.setUsername(username);
	s.setPassword(password);
	s.setRollno(122);
	s.setName("rinks");
    m.addAttribute("stu", s);
	return "SUCCESS";
	
}
}
