package com.shopping.registration.service;

import org.modelmapper.ModelMapper;

import com.shopping.registration.dto.AdminDTO;
import com.shopping.registration.entity.AdminEntity;
import com.shopping.registration.repository.AdminRepository;

public class AdminServiceImpl implements AdminService {
	private AdminRepository adminRepository;

	@Override
	public AdminDTO saveAdmin(AdminDTO adminDTO) {
		ModelMapper mapper = new ModelMapper();
		AdminEntity newAdmin = mapper.map(adminDTO, AdminEntity.class);
		AdminEntity savedAdmin = adminRepository.save(newAdmin);
		AdminDTO returnValue = mapper.map(savedAdmin, AdminDTO.class);
		return returnValue;
	}

}
