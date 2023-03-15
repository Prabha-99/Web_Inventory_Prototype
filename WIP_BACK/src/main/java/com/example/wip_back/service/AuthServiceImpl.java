//package com.example.wip_back.service;
//
//import com.example.wip_back.model.User;
//import com.example.wip_back.repository.AuthServices;
//import com.example.wip_back.repository.userRepo;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthServiceImpl implements AuthServices {
//
//    private final userRepo userrepo;
//    private final PasswordEncoder passwordEncoder;
//
//    public AuthServiceImpl(userRepo userrepo, PasswordEncoder passwordEncoder) {
//        this.userrepo = userrepo;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public User login(String email, String password)throws Exception {
//        User user=userrepo.findByEmail(email);
//
//        if (user==null){
//            throw new Exception("Invalid Email or Password");
//        }if(!passwordEncoder.matches(password,user.getPassword())){
//            throw new Exception("Invalid email or password.");
//        }
//        return user;
//    }
//
//}
