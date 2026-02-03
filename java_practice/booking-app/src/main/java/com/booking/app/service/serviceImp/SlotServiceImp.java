package com.booking.app.service.serviceImp;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.app.dto.SlotRequestDTO;
import com.booking.app.dto.SlotResponseDTO;
import com.booking.app.entity.Slot;
import com.booking.app.repository.SlotRepository;
import com.booking.app.service.SlotService;

@Service
public class SlotServiceImp implements SlotService {
	private SlotRepository repo ;
	 @Autowired
	public SlotServiceImp(SlotRepository repo) {
		this.repo = repo;
	}
	 
	 private SlotResponseDTO mapToDto(Slot slot) {
		 SlotResponseDTO dto = new SlotResponseDTO();
		 dto.setId(slot.getSid());
		 dto.setSlotDate(slot.getSlotDate());
		 dto.setStartTime(slot.getStartTime());
		 dto.setEndTime(slot.getEndTime());
		 dto.setAvailable(slot.isAvailable());
		 
		 return dto;
	 }

	@Override
	public SlotResponseDTO createSlot(SlotRequestDTO dto) {
		Slot slot = new Slot();
		slot.setSlotDate(dto.getSlotDate());
		slot.setStartTime(dto.getStartTime());
		slot.setEndTime(dto.getEndTime());
		slot.setAvailable(true);
		return mapToDto(repo.save(slot));
	}

	@Override
	public List<SlotResponseDTO> getAllSlots() {
		return repo.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
	}

	@Override
	public List<SlotResponseDTO> getAvailableSlots() {
		return repo.findByAvailableTrue().stream().map(this::mapToDto).collect(Collectors.toList());
	}

	@Override
	public List<SlotResponseDTO> getSlotsByDate(LocalDate slotDate) {
		return repo.findBySlotDate(slotDate).stream().map(this::mapToDto).collect(Collectors.toList());
	}

	@Override
	public SlotResponseDTO getSlotById(Integer id) {
		Slot slot = repo.findById(id).orElseThrow(()-> new RuntimeException("No Slot Found!"));
		return mapToDto(slot);
	}

	@Override
	public void deleteSlotById(Integer id) {
		repo.deleteById(id);		
	}

	@Override
	public SlotResponseDTO updateSlotById(Integer Id, SlotResponseDTO slot) {
		Slot slot2 = repo.findById(Id).orElseThrow(()-> new RuntimeException("No Slot Found!"));
		slot2.setAvailable(false);
		slot2.setSlotDate(slot.getSlotDate());
		slot2.setStartTime(slot.getStartTime());
		slot2.setEndTime(slot.getEndTime());
		repo.save(slot2);
		return null;
	}

}
