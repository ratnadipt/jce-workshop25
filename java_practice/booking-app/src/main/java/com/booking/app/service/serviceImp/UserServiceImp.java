package com.booking.app.service.serviceImp;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO updateUser(Integer id, UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
