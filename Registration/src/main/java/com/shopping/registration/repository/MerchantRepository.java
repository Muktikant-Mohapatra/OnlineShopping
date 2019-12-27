package com.shopping.registration.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shopping.registration.entity.MerchantEntity;

public interface MerchantRepository extends PagingAndSortingRepository<MerchantEntity, String>{

}
