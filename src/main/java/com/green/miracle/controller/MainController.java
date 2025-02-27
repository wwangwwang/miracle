package com.green.miracle.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.green.miracle.domain.dto.DateRequestDTO;
import com.green.miracle.domain.dto.ScheduleDTO;
import com.green.miracle.security.CustomUserDetails;
import com.green.miracle.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequiredArgsConstructor
public class MainController {
	
	private final MainService service;
	
	@GetMapping("/")
	public String list(Model model, @AuthenticationPrincipal CustomUserDetails user) {
		
		//service.sessionTime(model, session); //GlobalControllerAdvice에 추가
        service.findAllProcess(model, user);
        service.todaySchedule(model, user);
        
		return "index";
	}
	
	@PostMapping("/api/date")
	@ResponseBody
	public List<ScheduleDTO> date(@RequestBody DateRequestDTO dateRequest, @AuthenticationPrincipal CustomUserDetails user) {
		LocalDate clickDate = dateRequest.getDate();
		return service.selectedSchedule(clickDate, user);
	}
	
}
