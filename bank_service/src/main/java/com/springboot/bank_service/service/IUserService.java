package com.springboot.bank_service.service;

import com.springboot.bank_service.dto.request.UserDetailsDtoRequest;
import com.springboot.bank_service.dto.response.UserDetailDtoPostResponce;

public interface IUserService {

    UserDetailsDtoRequest getUserById(Integer id);
    UserDetailDtoPostResponce addUsers(UserDetailsDtoRequest userDetailsDtoRequest);

    // update data
    UserDetailsDtoRequest updateUserDetail(UserDetailsDtoRequest userDetailsDtoRequest);

    //delete user details
    UserDetailsDtoRequest deleteUser(Integer id);
}
