package com.example.testtask.service;

import com.example.testtask.mapper.UserMapper;
import com.example.testtask.model.entity.User;
import com.example.testtask.model.dto.UserDto;
import com.example.testtask.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper mapper;

    @Override
    public void create(UserDto userDto) {
        User user = mapper.mapToEntity(userDto);
        userRepository.save(user);
    }

    @Override
    public List<UserDto> readAll() {
        return userRepository.findAll().stream()
                .map(mapper::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto read(Long id) {
        return userRepository.findById(id)
                .stream()
                .map(mapper::mapToDto)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(UserDto userDto, Long id) {
        User user = mapper.mapToEntity(userDto);
        userRepository.save(user);
    }

    @Override
    public Boolean delete(Long id) {
        return userRepository.findById(id)
                .map(entity -> {
                    userRepository.delete(entity);
                    return true;
                })
                .orElse(false);
    }
}
