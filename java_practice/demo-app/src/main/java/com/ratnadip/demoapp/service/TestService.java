package com.ratnadip.demoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratnadip.demoapp.model.Test;
import com.ratnadip.demoapp.repository.TestRepository;

@Service
public class TestService {
	private TestRepository repo;
	
	@Autowired
	public TestService(TestRepository repo) {
		this.repo = repo;
	}
	
	// insert
	public Test addGreeting(Test t) {
		return repo.save(t);
	}
	
	// get all greeting
	public List<Test> getAll(){
		return repo.findAll();
	}
}
