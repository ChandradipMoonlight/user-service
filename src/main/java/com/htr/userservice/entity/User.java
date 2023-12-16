package com.htr.userservice.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class User {

    private Integer userId;
    private String fName;
    private String mName;
    private String lName;
    private String userEmail;
    private String userPassword;
    private String userMobile;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
