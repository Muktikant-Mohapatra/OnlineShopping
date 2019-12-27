package com.shopping.registration.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.registration.dto.AdminDTO;
import com.shopping.registration.dto.MerchantDTO;
import com.shopping.registration.dto.UserDTO;
import com.shopping.registration.request.RestAdminRequest;
import com.shopping.registration.request.RestMerchantRequest;
import com.shopping.registration.request.RestUserRequest;
import com.shopping.registration.response.RestAdminResponse;
import com.shopping.registration.response.RestMerchantResponse;
import com.shopping.registration.response.RestUserResponse;
import com.shopping.registration.service.AdminService;
import com.shopping.registration.service.MerchantService;
import com.shopping.registration.service.UserService;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private MerchantService merchantService;
	@Autowired
	private UserService userService;

	@PostMapping("/admin")
	public RestAdminResponse registerAdmin(@RequestBody RestAdminRequest adminRequest) {
		ModelMapper mapper = new ModelMapper();
		AdminDTO adminDto = mapper.map(adminRequest, AdminDTO.class);
		AdminDTO savedAdmin = adminService.saveAdmin(adminDto);
		RestAdminResponse registeredAdmin = mapper.map(savedAdmin, RestAdminResponse.class);
		return registeredAdmin;
	}

	@PostMapping("/merchant")
	public RestMerchantResponse registerMerchant(@RequestBody RestMerchantRequest merchantRequest) {
		ModelMapper mapper = new ModelMapper();
		MerchantDTO merchantDto = mapper.map(merchantRequest, MerchantDTO.class);
		MerchantDTO savedMerchant = merchantService.saveMerchant(merchantDto);
		RestMerchantResponse registeredMerchant = mapper.map(savedMerchant, RestMerchantResponse.class);
		return registeredMerchant;
	}

	@PostMapping()
	public RestUserResponse registerUser(@RequestBody RestUserRequest userRequest) {
		ModelMapper mapper = new ModelMapper();
		UserDTO userDto = mapper.map(userRequest, UserDTO.class);
		UserDTO savedUser = userService.saveUser(userDto);
		RestUserResponse registeredUser = mapper.map(savedUser, RestUserResponse.class);
		return registeredUser;
	}
}
