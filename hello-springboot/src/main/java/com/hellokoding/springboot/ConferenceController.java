package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConferenceController {
	@RequestMapping("/conference")
	public String conference()
	{
		return "jsp/WELCOME TO ICSSE 2017";
	}

}
