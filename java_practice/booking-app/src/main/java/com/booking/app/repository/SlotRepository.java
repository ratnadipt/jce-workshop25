package com.booking.app.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.app.entity.Slot;

public interface SlotRepository extends JpaRepository<Slot, Integer>{
	// save(), findAll(), findById(), deleteById(), etc
	
	// Custom SQL Query with JPA
	// 1. Derived JPA Query :- keywords and field name 
	// 2. Native SQL
	// 3. SQL Query
	
	// to get all slots based on availability
	// select * from Slot WHERE available=true 
	List<Slot> findByAvailableTrue();
	
	// get all slots based on date.
	// select * from slot where slotdate=slotdate;
	List<Slot> findBySlotDate(LocalDate slotDate);
}
