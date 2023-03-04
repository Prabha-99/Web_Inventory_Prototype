package com.example.wip_back.service;

import com.example.wip_back.model.User;
import com.example.wip_back.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class userService {
    private static userRepo userrepo;

    @Autowired
    public userService(userRepo userrepo) {

        this.userrepo = userrepo;
    }

    public List<User> getAllUsers(){
        return userrepo.findAll();
    }

    public static void deleteUser(int userID) {
        userrepo.deleteById(userID);
    }

}
