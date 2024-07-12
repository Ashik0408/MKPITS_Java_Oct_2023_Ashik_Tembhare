package com.springboot.bank_service.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountRequestDto {

    private Integer accountId ;
    private  Integer userId;
    private String accountType;
    private Double balance;
    private Integer createdBy;


    private LocalDateTime createdAt;


    private Integer updatedBy;


    private LocalDateTime updatedAt;
}
