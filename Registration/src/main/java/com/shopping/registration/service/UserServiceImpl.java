package com.shopping.registration.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.shopping.registration.dto.UserDTO;
import com.shopping.registration.entity.UserEntity;
import com.shopping.registration.repository.UserRepository;

public class UserServiceImpl implements UserService{
@Autowired
	private UserRepository userRepository;
	@Override
	public UserDTO saveUser(UserDTO userDTO) {
		ModelMapper mapper = new ModelMapper();
		UserEntity newUser = mapper.map(userDTO, UserEntity.class);
		UserEntity savedUser = userRepository.save(newUser);
		UserDTO returnValue = mapper.map(savedUser, UserDTO.class);
		return returnValue;
	}

}
