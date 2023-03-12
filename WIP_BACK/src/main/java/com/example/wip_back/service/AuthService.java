package com.example.wip_back.service;

import com.example.wip_back.model.User;
import com.example.wip_back.repository.userRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthService implements UserDetailsService {


    private final userRepo userrepo;
    private final PasswordEncoder passwordEncoder;

    public AuthService(userRepo userrepo, PasswordEncoder passwordEncoder) {
        this.userrepo = userrepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userrepo.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException("Invalid email or password.");
        }

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());
    }

//    public User login(String email, String password)throws Exception{
//        User user=userrepo.findByEmail(email);
//
//        if (user==null){
//            throw new Exception("Invalid Email or Password");
//        }if(!passwordEncoder.matches(password,user.getPassword())){
//            throw new Exception("Invalid email or password.");
//        }
//        return user;
//    }


}
