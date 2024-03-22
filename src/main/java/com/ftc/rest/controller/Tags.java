package com.ftc.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V0")
public class Tags {

	@RequestMapping("/v0")
	public String home() {
		return "API version 0";
	}
	
	@GetMapping("/tags")
	public String getTags() {
		return "GET tags endpoint";
	}
	
	@PostMapping("/tags/{tag}")
	public String postTags(@PathVariable("tag") String tag) {
		return "POST tag: " + tag;
	}
	
	@PutMapping("/tags/{tag}")
	public String putTags(@PathVariable("tag") String tag) {
		return "PUT tag: " + tag;
	}
	
	@GetMapping("/tags/{tag}")
	public String deleteTags(@PathVariable("tag") String tag) {
		return "DELETE tag: " + tag;
	}
	
}
