package com.green.miracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HrController {
	
	@GetMapping("/hr")
	public String list() {
		return "views/emp/hrm";
	}
	
	
}
