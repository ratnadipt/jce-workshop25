package com.ratnadip.demoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ratnadip.demoapp.model.Test;
import com.ratnadip.demoapp.service.TestService;

@RestController
public class TestController {
	private TestService service;
	
	@Autowired
	public TestController(TestService service) {
		this.service = service;
	}
	
	// post handler
	@PostMapping("/add")
	public Test insertGreeting(@RequestBody Test test) {
		return service.addGreeting(test);
	}
	
	
	// get all
	@GetMapping("/get")
	public List<Test> getGreeting(){
		return service.getAll();
	}
	
}
