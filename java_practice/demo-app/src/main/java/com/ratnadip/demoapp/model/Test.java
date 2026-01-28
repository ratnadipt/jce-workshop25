package com.ratnadip.demoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Test {
	@Id
	private int id;
	
	private int greeting;
}
