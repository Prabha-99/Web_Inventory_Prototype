package com.example.wip_back.controller;

import com.example.wip_back.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.wip_back.service.userService;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/tables")
public class userController {
    private final userService userService;

    @Autowired
    public userController(userService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/tables/allUsers")
    public List<User> getAllTableData(){
        return userService.getAllTableData();
    }


}
