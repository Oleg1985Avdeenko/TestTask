package com.example.testtask.service;

import com.example.testtask.model.dto.UserDto;

import java.util.List;

public interface UserService {

    /**
     * Create new user
     * @param userDto - new user
     */
    void create(UserDto userDto);

    /**
     * Returns a list of all existing users
     * @return list of users
     */
    List<UserDto> readAll();

    /**
     * Returns a user by its ID
     * @param id - user id
     * @return - user object with given ID
     */
    UserDto read(Long id);

    /**
     * Updates the user with the given ID,
     * according to the referred customer
     * @param userDto - user according to which you need to update the data
     * @param id - id of the user to be updated
     */
    void update(UserDto userDto, Long id);

    /**
     * Deletes the user with the given ID
     *
     * @param id - id of the user to be deleted
     * @return
     */
    Boolean delete(Long id);
}
