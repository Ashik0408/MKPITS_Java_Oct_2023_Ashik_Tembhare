package com.springboot.bank_service.repository;

import com.springboot.bank_service.model.UserDetailsModel;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailsRepo extends CrudRepository<UserDetailsModel,Integer>{
}
