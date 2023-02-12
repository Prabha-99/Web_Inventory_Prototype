package com.example.wip_back.repository;

import com.example.wip_back.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User,Integer> {
}
