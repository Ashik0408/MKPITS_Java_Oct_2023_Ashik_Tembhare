package com.springboot.bank_service.controller;

import com.springboot.bank_service.dto.request.UserDetailsDtoRequest;
import com.springboot.bank_service.dto.response.UserDetailDtoPostResponce;
import com.springboot.bank_service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/api/user/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id)
    {
        UserDetailsDtoRequest userDetailsDtoRequest =userService.getUserById(id);
        return ResponseEntity.ok(userDetailsDtoRequest);
    }

    @PostMapping("/api/user")
    public ResponseEntity<Object> addUsers(@RequestBody UserDetailsDtoRequest userDetailsDtoRequest)
    {
        UserDetailDtoPostResponce userDetailDtoPostResponce =userService.addUsers(userDetailsDtoRequest);
        return ResponseEntity.ok(userDetailDtoPostResponce);
    }

    @PutMapping("/api/user/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserDetailsDtoRequest userDetailsDtoRequest)
    {
        userDetailsDtoRequest.setId(id);
        UserDetailsDtoRequest userDetailsDtoRequest1 =userService.updateUserDetail(userDetailsDtoRequest);
        return ResponseEntity.ok().body(userDetailsDtoRequest1);
    }

    //delete mapping
    @DeleteMapping("api/user/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id)
    {
        UserDetailsDtoRequest userDetailsDtoRequest =userService.deleteUser(id);
        if(userDetailsDtoRequest != null)
        {
            return new ResponseEntity<>("User with ID " + id + " deleted successfully", HttpStatus.OK);

        }
        else {
            return new ResponseEntity<>("User with ID " + id + " not found", HttpStatus.OK);
        }
    }
}
