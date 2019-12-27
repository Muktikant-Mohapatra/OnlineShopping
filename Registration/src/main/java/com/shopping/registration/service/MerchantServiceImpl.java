package com.shopping.registration.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.shopping.registration.dto.MerchantDTO;
import com.shopping.registration.entity.MerchantEntity;
import com.shopping.registration.repository.MerchantRepository;

public class MerchantServiceImpl implements MerchantService {
	@Autowired
	private MerchantRepository merchantRepository;

	@Override
	public MerchantDTO saveMerchant(MerchantDTO merchantDTO) {
		ModelMapper mapper = new ModelMapper();
		MerchantEntity newMerchant = mapper.map(merchantDTO, MerchantEntity.class);
		MerchantEntity savedMerchant = merchantRepository.save(newMerchant);
		MerchantDTO returnValue = mapper.map(savedMerchant, MerchantDTO.class);
		return returnValue;
	}

}
