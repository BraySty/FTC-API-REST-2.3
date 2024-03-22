package com.ftc.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V0")
public class Project {

	@RequestMapping("/v0")
	public String home() {
		return "API version 0";
	}
	
}
