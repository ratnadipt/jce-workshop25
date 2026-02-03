package com.booking.app.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "slots")
public class Slot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "slot_id")
	private Integer sid;
	
	//@NotEmpty(message = "Slot Date should not Empty!")
	//@NotNull(message = "Slot Date can not be null!")
	private LocalDate slotDate;
	
	//@NotEmpty(message = "Start time should not empty!")
	//@NotNull(message = "Start time can not be null!")
	private LocalTime startTime;
	
	//@NotEmpty(message = "End time should not empty!")
	//@NotNull(message = "End time can not be null!")
	private LocalTime endTime;
	
	private boolean available = true;
	
	// constructor
	public Slot() {}
	
	public Slot(LocalDate slotDate, LocalTime startTime, LocalTime endTime, boolean available) {
		this.slotDate = slotDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.available = available;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public LocalDate getSlotDate() {
		return slotDate;
	}

	public void setSlotDate(LocalDate slotDate) {
		this.slotDate = slotDate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
}
