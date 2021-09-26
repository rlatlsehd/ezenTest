package com.ezen.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class mainController {
	@RequestMapping(value = "/serviceCenter.do")
	public String serviceCenter() {
		
		
		
		return "serviceCenter";
	}
	
	@RequestMapping(value = "/serviceIntroduction.do")
	public String serviceIntroduction() {
		
		
		
		return "serviceIntroduction";
	}
	

	@RequestMapping(value = "/costGuide.do")
	public String costGuide() {
		
		
		
		return "costGuide";
	}
	
	@RequestMapping(value = "/calculate.do")
	public String calculate() {
		
		
		
		return "calculate";
	}
	
}
