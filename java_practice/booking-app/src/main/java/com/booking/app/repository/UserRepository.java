package com.booking.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
