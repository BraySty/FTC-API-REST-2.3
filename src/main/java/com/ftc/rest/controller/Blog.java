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
public class Blog {

	@RequestMapping("/v0")
	public String home() {
		return "API version 0";
	}
	
	@GetMapping("/blogs")
	public  ResponseEntity<String> getBlogs() {
		return ResponseEntity.ok("GET blogs endpoint");
	}
	
	@GetMapping("/blogs/{blog}")
	public  ResponseEntity<String> getBlog(@PathVariable("blog") String blog) {
		return ResponseEntity.ok("GET blog: " + blog);
	}
	
	@PostMapping("/blogs/{blog}")
	public  ResponseEntity<String> postBlog(@PathVariable("blog") String blog) {
		return ResponseEntity.ok("POST blog: " + blog);
	}
	
	@PutMapping("/blogs/{blog}")
	public  ResponseEntity<String> putBlog(@PathVariable("blog") String blog) {
		return ResponseEntity.ok("PUT blog: " + blog);
	}
	
	@GetMapping("/blogs/{blog}")
	public  ResponseEntity<String> deleteBlog(@PathVariable("blog") String blog) {
		return ResponseEntity.ok("DELETE blog: " + blog);
	}
	
}
