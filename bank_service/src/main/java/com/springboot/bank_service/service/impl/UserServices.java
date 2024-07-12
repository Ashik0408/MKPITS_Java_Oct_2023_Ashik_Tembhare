package com.springboot.bank_service.service.impl;

import com.springboot.bank_service.dto.request.UserDetailsDtoRequest;
import com.springboot.bank_service.dto.response.UserDetailDtoPostResponce;
import com.springboot.bank_service.model.AccountModel;
import com.springboot.bank_service.model.UserDetailsModel;
import com.springboot.bank_service.repository.AccRepo;
import com.springboot.bank_service.repository.UserDetailsRepo;
import com.springboot.bank_service.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServices implements IUserService {

    @Autowired
    UserDetailsRepo userDetailsRepo;
    @Autowired
    AccRepo accRepo;

    @Override
    public UserDetailsDtoRequest getUserById(Integer id) {
        Optional<UserDetailsModel> userDetailsModel = userDetailsRepo.findById(id);
        UserDetailsDtoRequest userDetailsDtoRequest = new UserDetailsDtoRequest();
        if (userDetailsModel.isPresent()) {
            userDetailsDtoRequest = convertUserModelToDto(userDetailsModel.get());
        }
        return userDetailsDtoRequest;
    }

    private UserDetailsDtoRequest convertUserModelToDto(UserDetailsModel userDetailsModel) {
        UserDetailsDtoRequest userDetailsDtoRequest = new UserDetailsDtoRequest();
        userDetailsDtoRequest.setId(userDetailsModel.getId());
        userDetailsDtoRequest.setFull_Name(userDetailsModel.getFullName());
        userDetailsDtoRequest.setEmail(userDetailsModel.getEmail());
        userDetailsDtoRequest.setGender(userDetailsModel.getGender());
        userDetailsDtoRequest.setMobileNumber(userDetailsModel.getMobileNumber());
        userDetailsDtoRequest.setDateOfBirth(userDetailsModel.getDateOfBirth());
        userDetailsDtoRequest.setCreatedBy(userDetailsModel.getCreatedBy());
        userDetailsDtoRequest.setCreatedAt(userDetailsModel.getCreatedAt());
        userDetailsDtoRequest.setUpdatedAt(userDetailsModel.getUpdatedAt());
        userDetailsDtoRequest.setUpdatedBy(userDetailsModel.getUpdatedBy());

        return userDetailsDtoRequest;
    }


    // add users
    @Override
    @Transactional
    public UserDetailDtoPostResponce addUsers(UserDetailsDtoRequest userDetailsDtoRequest) {
        UserDetailsModel userDetailsModel = new UserDetailsModel();
        userDetailsModel = convertUserDtoToModel(userDetailsDtoRequest, userDetailsModel);
        userDetailsModel = userDetailsRepo.save(userDetailsModel);
        UserDetailDtoPostResponce userDetailDtoPostResponce=UserDetailDtoPostResponce.builder()
                .full_Name(userDetailsModel.getFullName())
                .email(userDetailsModel.getEmail())
                .mobileNumber(userDetailsModel.getMobileNumber())
                .dateOfBirth(userDetailsModel.getDateOfBirth())
                .build();
        // account add
        AccountModel accountModel= AccountModel.builder()
                .userId(userDetailsModel.getId())
                .accountType(userDetailsDtoRequest.getAccountType())
                .balance(userDetailsDtoRequest.getBalance())
                .build();
        // repository to genrate to save data
        accRepo.save(accountModel);

        return userDetailDtoPostResponce;
    }

    private UserDetailsModel convertUserDtoToModel(UserDetailsDtoRequest userDetailsDtoRequest, UserDetailsModel userDetailsModel) {

        // userDetailsModel.setFullName(userDetailsDto.getFull_Name());

        userDetailsModel = UserDetailsModel.builder()
                .fullName(userDetailsDtoRequest.getFull_Name())
                .email(userDetailsDtoRequest.getEmail())
                .dateOfBirth(userDetailsDtoRequest.getDateOfBirth())
                .mobileNumber(userDetailsDtoRequest.getMobileNumber())
                .gender(userDetailsDtoRequest.getGender())
                .createdAt(LocalDateTime.now())
                .createdBy(1)
                .updatedAt(LocalDateTime.now())
                .updatedBy(1)
                .build();
        return userDetailsModel;

    }

    // update data
    @Override
    public UserDetailsDtoRequest updateUserDetail(UserDetailsDtoRequest userDetailsDtoRequest) {
        Optional<UserDetailsModel> userDetailsModel = userDetailsRepo.findById(userDetailsDtoRequest.getId());
        if (userDetailsModel.isEmpty()) {
            System.out.println("Data ch Nahi Aahe.....");
        } else {
            UserDetailsModel userDetailsModel1 = new UserDetailsModel();
            userDetailsModel1 = convertUpdateUserDtoToModel(userDetailsDtoRequest, userDetailsModel.get());
            userDetailsModel1.setId(userDetailsDtoRequest.getId());

           // System.out.println(userDetailsDto.getId());

            userDetailsModel1 = userDetailsRepo.save(userDetailsModel1);
            return convertUserModelToDto(userDetailsModel1);
        }
        return userDetailsDtoRequest;
    }

//    private UserDetailsDto convertUserModelToUpdateDto(UserDetailsModel userDetailsModel1) {
//        UserDetailsDto userDetailsDto = new UserDetailsDto();
////        userDetailsDto.setId(userDetailsModel1.getId());
//        userDetailsDto.setFull_Name(userDetailsModel1.getFullName());
//        userDetailsDto.setEmail(userDetailsModel1.getEmail());
//        userDetailsDto.setGender(userDetailsModel1.getGender());
//        userDetailsDto.setMobileNumber(userDetailsModel1.getMobileNumber());
//        userDetailsDto.setDateOfBirth(userDetailsModel1.getDateOfBirth());
//        userDetailsDto.setCreatedBy(userDetailsModel1.getCreatedBy());
//        userDetailsDto.setCreatedAt(userDetailsModel1.getCreatedAt());
//        userDetailsDto.setUpdatedAt(userDetailsModel1.getUpdatedAt());
//        userDetailsDto.setUpdatedBy(userDetailsModel1.getUpdatedBy());
//
//        return userDetailsDto;
//    }

    private UserDetailsModel convertUpdateUserDtoToModel(UserDetailsDtoRequest userDetailsDtoRequest, UserDetailsModel userDetailsModel) {
        userDetailsModel = UserDetailsModel.builder()
                .fullName(userDetailsDtoRequest.getFull_Name())
                .email(userDetailsDtoRequest.getEmail())
                .dateOfBirth(userDetailsDtoRequest.getDateOfBirth())
                .mobileNumber(userDetailsDtoRequest.getMobileNumber())
                .gender(userDetailsDtoRequest.getGender())
                .createdAt(LocalDateTime.now())
                .createdBy(1)
                .updatedAt(LocalDateTime.now())
                .updatedBy(userDetailsDtoRequest.getUpdatedBy())
                .build();
        return userDetailsModel;
    }

    //delete user details
    @Override
    public UserDetailsDtoRequest deleteUser(Integer id)
    {
        Optional<UserDetailsModel> userDetailsModel=userDetailsRepo.findById(id);
        if(userDetailsModel.isEmpty())
        {
            System.out.println("Data is not Found");
            return null;
        }
        else
        {
            userDetailsRepo.deleteById(id);
            return convertUserModelToDto(userDetailsModel.get());
        }

    }
}
