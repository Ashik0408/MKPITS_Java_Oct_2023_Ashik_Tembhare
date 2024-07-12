package com.springboot.bank_service.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetailDtoPostResponce {
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

}
