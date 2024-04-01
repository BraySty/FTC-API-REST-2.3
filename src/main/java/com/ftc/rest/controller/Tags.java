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
public class Tags {

	@RequestMapping("/v0")
	public String home() {
		return "API version 0";
	}
	
	@GetMapping("/tags")
	public ResponseEntity<String> getTags() {
		return ResponseEntity.ok("GET tags endpoint");
	}
	
	@GetMapping("/tags/{tag}")
	public  ResponseEntity<String> getTag(@PathVariable("tag") String tag) {
		return ResponseEntity.ok("GET tag: " + tag);
	}
	
	@PostMapping("/tags/{tag}")
	public ResponseEntity<String> postTag(@PathVariable("tag") String tag) {
		return ResponseEntity.ok("POST tag: " + tag);
	}
	
	@PutMapping("/tags/{tag}")
	public ResponseEntity<String> putTag(@PathVariable("tag") String tag) {
		return ResponseEntity.ok("PUT tag: " + tag);
	}
	
	@GetMapping("/tags/{tag}")
	public ResponseEntity<String> deleteTag(@PathVariable("tag") String tag) {
		return ResponseEntity.ok("DELETE tag: " + tag);
	}
	
}
