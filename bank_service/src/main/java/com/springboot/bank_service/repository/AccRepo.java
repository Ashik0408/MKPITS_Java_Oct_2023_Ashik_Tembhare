package com.springboot.bank_service.repository;

import com.springboot.bank_service.model.AccountModel;
import org.springframework.data.repository.CrudRepository;

public interface AccRepo extends CrudRepository<AccountModel,Integer> {
}
