package com.ratnadip.demoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Test {
	@Id
	private int id;
	
	private String greeting;
	
	public Test() {}
	
	public Test(int id, String greeting) {
		this.id = id;
		this.greeting = greeting;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
}
