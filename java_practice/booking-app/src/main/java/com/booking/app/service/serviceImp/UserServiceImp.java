package com.booking.app.service.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.app.dto.UserDTO;
import com.booking.app.entity.User;
import com.booking.app.repository.UserRepository;
import com.booking.app.service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImp(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	// create method to map/convert entity to dto.
	private UserDTO mapToDTO(User user) {
		UserDTO dto = new UserDTO();
		dto.setId(user.getId());
		dto.setName(user.getUname());
		dto.setEmail(user.getEmail());
		dto.setCity(user.getUcity());
		
		return dto;
	}
	
	
	@Override
	public UserDTO createUser(UserDTO dto) {
		// Request receive
		// convert DTO -> Entity
		User user = new User();
		user.setUname(dto.getName());
		user.setUcity(dto.getCity());
		user.setEmail(dto.getEmail());
		
		return mapToDTO(userRepository.save(user)); // response send
	}

	@Override
	public UserDTO getUserById(Integer id) {
		return mapToDTO(userRepository.findById(id).get());
	}

	@Override
	public List<UserDTO> getAllUsers() {
		// entities
		List<User> users = userRepository.findAll();
		//DTOs
		List<UserDTO> userDtos = new ArrayList<>();
		// Convert All Entities -> DTO's
		for(User user : users) {
			userDtos.add(mapToDTO(user));
		}
		
		return userDtos;
	}

	@Override
	public UserDTO updateUser(Integer id, UserDTO dto) {
		// Fetch whether the user is present or not in database.
		User user = userRepository.findById(id).orElseThrow(
				()-> new RuntimeException("User Not Found!"));
		user.setUname(dto.getName());
		user.setEmail(dto.getEmail());
		user.setUcity(dto.getCity());
		
		return mapToDTO(userRepository.save(user));
	}

	@Override
	public void deleteUser(Integer id) {
		User user = userRepository.findById(id).orElseThrow(
				()-> new RuntimeException("User Not Found!"));
		
		userRepository.delete(user);
		
	}

}
