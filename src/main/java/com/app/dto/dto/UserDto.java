package com.app.dto.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String email;
    private Date createDate;
    private String phoneNo;

}
