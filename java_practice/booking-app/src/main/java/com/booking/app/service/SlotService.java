package com.booking.app.service;

import java.time.LocalDate;
import java.util.List;

import com.booking.app.dto.SlotRequestDTO;
import com.booking.app.dto.SlotResponseDTO;

public interface SlotService {
	SlotResponseDTO createSlot(SlotRequestDTO dto);
	List<SlotResponseDTO> getAllSlots();
	List<SlotResponseDTO> getAvailableSlots();
	List<SlotResponseDTO> getSlotsByDate(LocalDate slotDate);
	SlotResponseDTO getSlotById(Integer id);
	void deleteSlotById(Integer id);
	SlotResponseDTO updateSlotById(Integer Id, SlotResponseDTO slot);
	
}
