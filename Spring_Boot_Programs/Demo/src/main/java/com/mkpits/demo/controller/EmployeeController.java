package com.mkpits.demo.controller;

import com.mkpits.demo.dto.AddressDto;
import com.mkpits.demo.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("/employee")
public ResponseEntity<Object> getEmployee()
{
    EmployeeDto employeeDto=new EmployeeDto();
    employeeDto.setName("Ashik");
    employeeDto.setDepartment("IT");
    employeeDto.setDesignation("Software Developer");

    AddressDto addressDto1=new AddressDto('P',"128 street","Nagpur","Maharashtra","India");
    AddressDto addressDto2=new AddressDto('C',"street no. 12","Pune","Maharashtra","India");

    employeeDto.setAddressDto(new AddressDto[]{addressDto1,addressDto2});

    return ResponseEntity.ok(employeeDto);
}

}
