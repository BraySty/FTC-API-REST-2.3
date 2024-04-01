package com.ftc.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V0")
public class Detail {

	@RequestMapping("/v0")
	public String home() {
		return "API version 0";
	}
	
	@GetMapping("/details")
	public  ResponseEntity<String> getDetails() {
		return ResponseEntity.ok("GET details endpoint");
	}
	
	@GetMapping("/details/{detail}")
	public  ResponseEntity<String> getDetail(@PathVariable("detail") String detail) {
		return ResponseEntity.ok("GET detail: " + detail);
	}
	
	@PostMapping("/details/{detail}")
	public  ResponseEntity<String> postDetail(@PathVariable("detail") String detail) {
		return ResponseEntity.ok("POST detail: " + detail);
	}
	
	@PutMapping("/details/{detail}")
	public  ResponseEntity<String> putDetail(@PathVariable("detail") String detail) {
		return ResponseEntity.ok("PUT detail: " + detail);
	}
	
	@GetMapping("/details/{detail}")
	public  ResponseEntity<String> deleteDetail(@PathVariable("detail") String detail) {
		return ResponseEntity.ok("DELETE detail: " + detail);
	}
	
}
