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
public class Phone {

	@RequestMapping("/v0")
	public String home() {
		return "API version 0";
	}
	
	@GetMapping("/phones")
	public  ResponseEntity<String> getPhones() {
		return ResponseEntity.ok("GET phones endpoint");
	}
	
	@GetMapping("/phones/{phone}")
	public  ResponseEntity<String> getPhone(@PathVariable("phone") String phone) {
		return ResponseEntity.ok("GET phone: " + phone);
	}
	
	@PostMapping("/phones/{phone}")
	public  ResponseEntity<String> postPhone(@PathVariable("phone") String phone) {
		return ResponseEntity.ok("POST phone: " + phone);
	}
	
	@PutMapping("/phones/{phone}")
	public  ResponseEntity<String> putPhone(@PathVariable("phone") String phone) {
		return ResponseEntity.ok("PUT phone: " + phone);
	}
	
	@GetMapping("/phones/{phone}")
	public  ResponseEntity<String> deletePhone(@PathVariable("phone") String phone) {
		return ResponseEntity.ok("DELETE phone: " + phone);
	}
	
}
