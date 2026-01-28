package com.ratnadip.demoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratnadip.demoapp.model.Test;

public interface TestRepository extends JpaRepository<Test, Integer> {
	// select , delete, update, save/insert
}
