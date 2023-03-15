//package com.example.wip_back.controller;
//
//import com.example.wip_back.model.User;
//import com.example.wip_back.service.AuthServiceImpl;
//import lombok.Data;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("api/auth")
//public class AuthController {
//
//
//   private final AuthServiceImpl authServiceImpl;
//
//
//    public AuthController(AuthServiceImpl authServiceImpl) {
//        this.authServiceImpl = authServiceImpl;
//
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<User>login(@RequestBody LoginRequest loginRequest){
//        try{
//            User user = authServiceImpl.login(loginRequest.getEmail(),loginRequest.getPassword());
//            return ResponseEntity.ok(user);
//        }catch(Exception e){
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
//    }
//
//    @Data
//    public static class LoginRequest {
//        private String email;
//        private String password;
//    }
//}
