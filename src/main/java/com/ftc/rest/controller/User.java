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
public class User {

	@RequestMapping("/v0")
	public String home() {
		return "API version 0";
	}
	
	@GetMapping("/users")
	public  ResponseEntity<String> getDetails() {
		return ResponseEntity.ok("GET users endpoint");
	}
	
	@GetMapping("/users/{user}")
	public  ResponseEntity<String> getUser(@PathVariable("user") String user) {
		return ResponseEntity.ok("GET user: " + user);
	}
	
	@PostMapping("/users/{user}")
	public  ResponseEntity<String> postUser(@PathVariable("user") String user) {
		return ResponseEntity.ok("POST user: " + user);
	}
	
	@PutMapping("/users/{user}")
	public  ResponseEntity<String> putUser(@PathVariable("user") String user) {
		return ResponseEntity.ok("PUT user: " + user);
	}
	
	@GetMapping("/users/{user}")
	public  ResponseEntity<String> deleteUser(@PathVariable("user") String user) {
		return ResponseEntity.ok("DELETE user: " + user);
	}
	
}
