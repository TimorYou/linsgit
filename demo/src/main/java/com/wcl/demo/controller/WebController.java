package com.wcl.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcl.demo.service.IWebService;

@RestController
public class WebController {

	@Autowired
	private IWebService webService;
	
	@RequestMapping("/")
	public String home() {
		return "Fuck sb!";
	}
	
	@RequestMapping("/s")
	public String getStudent() {
		try {
			String str = webService.getStudent().toString();
			return str;
		}
		catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}
