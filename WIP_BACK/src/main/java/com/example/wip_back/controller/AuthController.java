package com.example.wip_back.controller;

import com.example.wip_back.model.LoginRequest;
import com.example.wip_back.model.User;
import com.example.wip_back.repository.userRepo;
import com.example.wip_back.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private userRepo userRepo;

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid LoginRequest loginRequest) throws AuthenticationException {


        try{
            User user=userRepo.findByEmail(loginRequest.getEmail());

            if(user == null){
                throw new AuthenticationException("Invalid email or Password");
            }
            if(!authService.checkPassword(loginRequest.getPassword(), user.getPassword())){
                throw new AuthenticationException("Invalid email or password");
            }

            String token=authService.generateAccessToken(user);
            return ResponseEntity.ok(token);

        }catch(AuthenticationException e){
            // Return error response in case of authentication failure
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }

    }

}
