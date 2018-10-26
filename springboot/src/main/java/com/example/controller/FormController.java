package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@RequestMapping("/index")
	public String toIndex() {
		return "index";
	}

	@RequestMapping("/info_show")
	public ModelAndView info_show(String name,String age) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name",name);
		modelAndView.addObject("age",age);
		modelAndView.setViewName("show");
		return modelAndView;
	}
}
