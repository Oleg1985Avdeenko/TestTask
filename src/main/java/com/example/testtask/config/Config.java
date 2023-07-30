package com.example.testtask.config;

import com.example.testtask.mapper.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public UserMapper mapper(){
        return new UserMapper();
    }
}
