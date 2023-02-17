package com.app.dto.dto;

import lombok.Data;

@Data
public class UserUpdateDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
