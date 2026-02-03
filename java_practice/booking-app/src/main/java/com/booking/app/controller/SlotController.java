package com.booking.app.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.app.dto.SlotRequestDTO;
import com.booking.app.dto.SlotResponseDTO;
import com.booking.app.service.serviceImp.SlotServiceImp;

@RestController
@RequestMapping("/api/slots")
public class SlotController {
	private SlotServiceImp service;
	@Autowired
	public SlotController(SlotServiceImp service) {
		this.service = service;
	}
	
	// add
	@PostMapping
	public ResponseEntity<SlotResponseDTO> createSlot(@RequestBody SlotRequestDTO dto){
		return new ResponseEntity<>(service.createSlot(dto), HttpStatus.CREATED);
	}
	
	// delete
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteSlot(@PathVariable Integer id){
		service.deleteSlotById(id);
		return new ResponseEntity<String>("Slot Deleted Successfully!", HttpStatus.OK);
	}
	
	// get by id
	@GetMapping("/{id}")
	public ResponseEntity<SlotResponseDTO> getSlotById(@PathVariable Integer id){
		return new ResponseEntity<>(service.getSlotById(id), HttpStatus.OK);
	}	
	
	// get all
	 @GetMapping
	 public ResponseEntity<List<SlotResponseDTO>> getAllSlots(){
		 return new ResponseEntity<List<SlotResponseDTO>>(service.getAllSlots(), HttpStatus.OK);
	 }
	
	// get all by available
	 @GetMapping("/available")
	 public ResponseEntity<List<SlotResponseDTO>> getAllAvailableSlots(){
		 return new ResponseEntity<List<SlotResponseDTO>>(service.getAvailableSlots(), HttpStatus.OK);
	 }
	
	// get all by slot date.
	 @GetMapping("/date/{slotDate}")
	 public ResponseEntity<List<SlotResponseDTO>> getAllSlotsByDate(@PathVariable LocalDate slotDate){
		 return new ResponseEntity<List<SlotResponseDTO>>(service.getSlotsByDate(slotDate), HttpStatus.OK);
	 }
}
