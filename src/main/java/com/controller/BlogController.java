package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/hello")
public class BlogController {
	
	@RequestMapping(value="/helloworld",method=RequestMethod.GET)
	public String Hello() {
		System.out.println("in Hello method of Hello");
		return "hello";
	}

}
