package com.booking.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.app.dto.BookingRequestDTO;
import com.booking.app.dto.BookingResponseDTO;
import com.booking.app.service.serviceImp.BookingServiceImp;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	private BookingServiceImp service;
	
	@Autowired
	public BookingController(BookingServiceImp service) {
	this.service = service;
	}
	
	// add booking
	@PostMapping
	public ResponseEntity<BookingResponseDTO> createBooking(@RequestBody BookingRequestDTO dto){
		return new ResponseEntity<>(service.createBooking(dto), HttpStatus.CREATED);
	}
	
	// get booking by user
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<BookingResponseDTO>> getBookingByUserId(@PathVariable Integer userId){
		return new ResponseEntity<List<BookingResponseDTO>>(service.getBookingByUserId(userId), HttpStatus.OK);
	}
	
	// Cancel Booking
	@PutMapping("/{bId}/cancel")
	public ResponseEntity<BookingResponseDTO> cancelBooking(@PathVariable Integer bId){
		return new ResponseEntity<BookingResponseDTO>(service.cancelBooking(bId), HttpStatus.OK);
	}

}
