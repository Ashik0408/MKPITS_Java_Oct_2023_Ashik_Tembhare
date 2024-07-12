package com.springboot.bank_service.dto.request;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsDtoRequest {

    private Integer id;
    private String full_Name;
    private String email;
    private String gender;
    private LocalDate dateOfBirth;
    private String mobileNumber;
    private Integer createdBy;
    private LocalDateTime createdAt;
    private Integer updatedBy;
    private LocalDateTime updatedAt;

    // acc data

    private Integer accountId ;
    private  Integer userId;
    private String accountType;
    private Double balance;

}
