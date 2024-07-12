package com.springboot.bank_service.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name = "accounts")

public class AccountModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "acc_id")
    private Integer accountId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "acc_type")
    private String accountType;
    @Column(name = "balance")
    private double balance;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_by")
    private Integer updatedBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
