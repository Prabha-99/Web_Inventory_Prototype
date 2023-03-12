package com.example.wip_back.repository;

import com.example.wip_back.model.User;

public interface UserService {
    User login(String email, String password)throws Exception;
}
