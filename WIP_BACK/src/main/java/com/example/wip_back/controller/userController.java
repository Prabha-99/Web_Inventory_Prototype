package com.example.wip_back.controller;

import com.example.wip_back.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.wip_back.service.userService;

import javax.swing.table.TableModel;
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
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


}
