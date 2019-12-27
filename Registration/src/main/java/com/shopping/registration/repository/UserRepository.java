package com.shopping.registration.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shopping.registration.entity.UserEntity;

public interface UserRepository extends PagingAndSortingRepository<UserEntity, String> {

}
