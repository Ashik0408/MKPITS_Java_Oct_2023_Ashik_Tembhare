package com.mkpits.demo.controller;

import com.mkpits.demo.dto.UserDto;
import com.mkpits.demo.service.UserService;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // creating object for constructor injection
    UserService userServicecConstructor=new UserService();

    // creating the obj for setter injection
    UserService userServiceSetter=new UserService();

    // parameterised constructor
    public UserController(UserService userServicecConstructor) {
        this.userServicecConstructor = userServicecConstructor;
    }

    // setter
    public void setUserServiceSetter(UserService userServiceSetter) {
        this.userServiceSetter = userServiceSetter;
    }

    @RequestMapping("controller/user")
    public ResponseEntity<Object> getUser()
    {
        UserDto userDtoConstructor =userServicecConstructor.getAllUsers();
        System.out.println("Constructor Services :"+userServicecConstructor.hashCode());
        UserDto userDtoSetter =userServiceSetter.getAllUsers();
        System.out.println("Setter Services :"+userServiceSetter.hashCode());
        return ResponseEntity.ok(userDtoConstructor);
    }
}
