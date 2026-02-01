package com.booking.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.app.entity.Slot;

public interface SlotRepository extends JpaRepository<Slot, Integer>{

}
