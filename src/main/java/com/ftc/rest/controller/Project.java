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
public class Project {

	@RequestMapping("/v0")
	public String home() {
		return "API version 0";
	}
	
	@GetMapping("/projects")
	public  ResponseEntity<String> getProjects() {
		return ResponseEntity.ok("GET projects endpoint");
	}
	
	@GetMapping("/projects/{project}")
	public  ResponseEntity<String> getProject(@PathVariable("project") String project) {
		return ResponseEntity.ok("GET project: " + project);
	}
	
	@PostMapping("/projects/{project}")
	public  ResponseEntity<String> postProject(@PathVariable("project") String project) {
		return ResponseEntity.ok("POST project: " + project);
	}
	
	@PutMapping("/projects/{project}")
	public  ResponseEntity<String> putProject(@PathVariable("project") String project) {
		return ResponseEntity.ok("PUT project: " + project);
	}
	
	@GetMapping("/projects/{project}")
	public  ResponseEntity<String> deleteProject(@PathVariable("project") String project) {
		return ResponseEntity.ok("DELETE project: " + project);
	}
	
}
