package com.green.miracle.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.green.miracle.domain.dto.EmployeeUpdateDTO;
import com.green.miracle.security.CustomUserDetails;
import com.green.miracle.service.impl.MyPageServiceProcess;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MyPageController {
	
	private final MyPageServiceProcess service;
	
	@GetMapping("/mypage")
	public String list(Model model, @AuthenticationPrincipal CustomUserDetails user) {
		System.out.println(user);
		System.out.println(model);
		service.readProcess(model, user);
		return "views/user/mypage";
	}
	
	@ResponseBody
	@PutMapping("/mypage")
	public void update(@RequestBody EmployeeUpdateDTO dto, @AuthenticationPrincipal CustomUserDetails user) {
		service.updateProcess(dto, user);
	}
	
}
