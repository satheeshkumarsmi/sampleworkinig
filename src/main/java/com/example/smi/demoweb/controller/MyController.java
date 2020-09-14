package com.example.smi.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MyController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(Model model,@RequestParam String uname,@RequestParam String upass) {
		ModelAndView mav=new ModelAndView();
		if(uname.equals(upass)) {
			mav.addObject("name", uname);
			mav.setViewName("success");
			return mav;
		}
		else{
			mav.addObject("name", uname);
			mav.setViewName("fail");
			return mav;
		}
	}

}
