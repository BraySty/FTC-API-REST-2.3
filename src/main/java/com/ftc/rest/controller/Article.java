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
public class Article {

	@RequestMapping("/v0")
	public String home() {
		return "API version 0";
	}
	
	@GetMapping("/articles")
	public  ResponseEntity<String> getArticles() {
		return ResponseEntity.ok("GET articles endpoint");
	}
	
	@GetMapping("/articles/{article}")
	public  ResponseEntity<String> getArticle(@PathVariable("article") String article) {
		return ResponseEntity.ok("GET article: " + article);
	}
	
	@PostMapping("/articles/{article}")
	public  ResponseEntity<String> postArticle(@PathVariable("article") String article) {
		return ResponseEntity.ok("POST article: " + article);
	}
	
	@PutMapping("/articles/{article}")
	public  ResponseEntity<String> putArticle(@PathVariable("article") String article) {
		return ResponseEntity.ok("PUT article: " + article);
	}
	
	@GetMapping("/articles/{article}")
	public  ResponseEntity<String> deleteArticle(@PathVariable("article") String article) {
		return ResponseEntity.ok("DELETE article: " + article);
	}
	
}
