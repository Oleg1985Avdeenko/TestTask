package com.example.testtask.mapper;

import com.example.testtask.model.entity.User;
import com.example.testtask.model.dto.UserDto;

public class UserMapper implements Mapper<User, UserDto> {
    @Override
    public User mapToEntity(UserDto object) {
        String fullName = object.getFullName();
        String[] words = fullName.split("\\s");
        return User.builder()
                .name(words[2])
                .surname(words[1])
                .lastName(words[3])
                .email(object.getEmail())
                .role(object.getRole()).build();
    }

    @Override
    public UserDto mapToDto(User object) {
        return UserDto.builder()
                .fullName(object.getName() + object.getSurname() + object.getLastName())
                .email(object.getEmail())
                .role(object.getRole()).build();
    }
}
