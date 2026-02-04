package com.booking.app.service;

import java.util.List;

import com.booking.app.dto.BookingRequestDTO;
import com.booking.app.dto.BookingResponseDTO;

public interface BookingService {
	BookingResponseDTO createBooking(BookingRequestDTO dto);
	List<BookingResponseDTO> getBookingByUserId(Integer userId);
	BookingResponseDTO cancelBooking(Integer bookingId);
}
