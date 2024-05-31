package com.mkpits.demo.service;

import com.mkpits.demo.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //
    public UserDto getAllUsers()
    {
        UserDto userDto=new UserDto();
        userDto.setId(1L);
        userDto.setUsername("Ashik");
        userDto.setAge(67);
        return userDto;
    }
}
