package com.shopping.registration.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shopping.registration.entity.AdminEntity;

public interface AdminRepository extends PagingAndSortingRepository<AdminEntity, String>{

}
