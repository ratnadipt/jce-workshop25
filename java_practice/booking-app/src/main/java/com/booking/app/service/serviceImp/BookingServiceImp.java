package com.booking.app.service.serviceImp;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.app.dto.BookingRequestDTO;
import com.booking.app.dto.BookingResponseDTO;
import com.booking.app.entity.Booking;
import com.booking.app.entity.Slot;
import com.booking.app.entity.User;
import com.booking.app.repository.BookingRepository;
import com.booking.app.repository.SlotRepository;
import com.booking.app.repository.UserRepository;
import com.booking.app.service.BookingService;

@Service
public class BookingServiceImp implements BookingService{
	private BookingRepository repo;
	private UserRepository userRepo;
	private SlotRepository slotRepo;
	
	@Autowired
	public BookingServiceImp(BookingRepository repo,UserRepository userRepo, SlotRepository slotRepo) {
		this.repo = repo;
		this.userRepo = userRepo;
		this.slotRepo = slotRepo;
	}
	
	private BookingResponseDTO mapToDTO(Booking booking) {
		BookingResponseDTO dto = new BookingResponseDTO();
		dto.setBookingId(booking.getBid());
		dto.setUserId(booking.getUser().getId());
		dto.setSlotId(booking.getSlot().getSid());
		dto.setSlotDate(booking.getSlot().getSlotDate());
		dto.setStartTime(booking.getSlot().getStartTime());
		dto.setEndTime(booking.getSlot().getEndTime());
		dto.setStatus(booking.getStatus());
		return dto;
	}

	@Override
	public BookingResponseDTO createBooking(BookingRequestDTO dto) {
		User user = userRepo.findById(dto.getUserId()).orElseThrow(
				()-> new RuntimeException("User not Found!")
				);
		Slot slot = slotRepo.findById(dto.getSlotId()).orElseThrow(
				()-> new RuntimeException("Slot not Found!"));
		
		// check slot availability
		if(!slot.isAvailable()) {
			throw new RuntimeException("Slot already booked!");
		}
		
		slot.setAvailable(false);
		Booking booking = new Booking();
		booking.setUser(user);
		booking.setSlot(slot);
		booking.setStatus("CONFIRMED");
		booking.setBookingTime(LocalTime.now());
		return mapToDTO(repo.save(booking));
	}

	@Override
	public List<BookingResponseDTO> getBookingByUserId(Integer userId) {
		
		return repo.findByUserId(userId)
				.stream()
				.map(this::mapToDTO)
				.collect(Collectors.toList());
	}

	@Override
	public BookingResponseDTO cancelBooking(Integer bookingId) {
		Booking booking = repo.findById(bookingId).orElseThrow(
				()-> new RuntimeException("Booking Not Available")
				);
				
		if(booking.getStatus().equals("CANCELLED")) {
			throw new RuntimeException("Booking is already cancelled!");
		}
		
		Slot slot = booking.getSlot();
		slot.setAvailable(true);
		booking.setStatus("CANCELLED");
		return mapToDTO(repo.save(booking));
	}
	
	
}
