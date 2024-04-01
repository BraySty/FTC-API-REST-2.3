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
public class Code {

	@RequestMapping("/v0")
	public String home() {
		return "API version 0";
	}
	
	@GetMapping("/codes")
	public  ResponseEntity<String> getCodes() {
		return ResponseEntity.ok("GET codes endpoint");
	}
	
	@GetMapping("/codes/{code}")
	public  ResponseEntity<String> getCode(@PathVariable("code") String code) {
		return ResponseEntity.ok("GET code: " + code);
	}
	
	@PostMapping("/codes/{code}")
	public  ResponseEntity<String> postCode(@PathVariable("code") String code) {
		return ResponseEntity.ok("POST code: " + code);
	}
	
	@PutMapping("/codes/{code}")
	public  ResponseEntity<String> putCode(@PathVariable("code") String code) {
		return ResponseEntity.ok("PUT code: " + code);
	}
	
	@GetMapping("/codes/{code}")
	public  ResponseEntity<String> deleteCode(@PathVariable("code") String code) {
		return ResponseEntity.ok("DELETE code: " + code);
	}
	
}
