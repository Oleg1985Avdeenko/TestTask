package com.example.testtask.model.dto;


import com.example.testtask.model.entity.Role;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonDeserialize
public class UserDto {

    private Long id;
    @Size(min = 5, max = 102, message = "Name length must be from 5 to 100")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name must contain only letters a-z and A-Z")
    private String fullName;
    @Email
    @Size(min = 2, max = 50, message = "Email length must be from 5 to 50")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Email must contain only letters a-z and A-Z")
    private String email;
    @Pattern(regexp = "Administrator, Sale User, Customer User, Secure API User",
            message = "Role can only be Administrator, Sale User, Customer User, Secure API User")
    private Role role;
}
