package com.booking.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.app.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
	List<Booking> findByUserId(Integer userId);
	
	boolean existsBySlotIdAndStatus(Integer slotId, String status);
}
