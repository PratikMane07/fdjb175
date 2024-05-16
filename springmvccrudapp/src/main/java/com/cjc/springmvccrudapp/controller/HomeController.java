package com.cjc.springmvccrudapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springmvccrudapp.model.Student;
import com.cjc.springmvccrudapp.servicei.StudentServiceI;

@Controller
public class HomeController {
	
	@Autowired
	StudentServiceI ssi;
	
	@RequestMapping("/")
	public String preLogin()
	{
		System.out.println("open first page");
		return "login";
	}
	
	@RequestMapping("/openregpage")
	public String preReg()
	{
		return "register";	
	}
	
	@RequestMapping("/save")
	public String saveData(@ModelAttribute Student s)
	{
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getUsername());
		System.out.println(s.getPassword());
		
		ssi.saveStudent(s);
		
		return "login";
	}
	
	
	@RequestMapping("/login")
	public String loginStudent(@RequestParam String username, 
			                   @RequestParam String password)
	{
		ssi.loginStudent(username, password);
		
		return null;
		
	}
    // hello git dev 2 code
	
}
