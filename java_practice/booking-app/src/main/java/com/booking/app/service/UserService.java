package com.booking.app.service;

import java.util.List;

import com.booking.app.dto.UserDTO;

public interface UserService {
	UserDTO createUser(UserDTO dto);
	UserDTO getUserById(Integer id);
	List<UserDTO> getAllUsers();
	UserDTO updateUser(Integer id, UserDTO dto);
	void deleteUser(Integer id);
}
