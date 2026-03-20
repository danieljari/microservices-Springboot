package com.easybytes.accounts.entity;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {

    private Long customerId;

    @Id
    private String accountNumber;

    private String email;

    private String mobileNumber;
}


