package com.example.wip_back.controller;

import com.example.wip_back.model.User;
import com.example.wip_back.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.wip_back.service.userService;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/tables")
public class userController {

    private  userService userService;

    @Autowired
    private userRepo userrepo;

    @Autowired
    public userController(userService userService) {
        this.userService = userService;
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    @PostMapping("/addUser")
    public ResponseEntity<String> submitData(@RequestBody User user) {
        userrepo.save(user);
        return ResponseEntity.ok("Data saved successfully");
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int userID) {
        userService.deleteUser(userID);
        return ResponseEntity.noContent().build();
    }


}
