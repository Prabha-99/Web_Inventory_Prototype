package com.example.wip_back.service;

import com.example.wip_back.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AuthService {


    @Autowired
    private PasswordEncoder passwordEncoder;


    public boolean checkPassword(String plainPassword, String hashedPassowrd){
        return passwordEncoder.matches(plainPassword,hashedPassowrd);
    }

    public String generateAccessToken(User user){
        // Generate access token using user information
        String token=user.getEmail()+":"+new Date().getTime();

        // Hash access token using BCrypt algorithm
        String hashedToken=passwordEncoder.encode(token);

        return hashedToken;
    }
}
