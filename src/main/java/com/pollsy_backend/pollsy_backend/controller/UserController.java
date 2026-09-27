package com.pollsy_backend.pollsy_backend.controller;

import com.pollsy_backend.pollsy_backend.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @PostMapping("register")
    private ResponseEntity<String> registerUser(@RequestBody User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.registerUser(user);
        return new ResponseEntity<>("User Registered", HttpStatus.OK);

    }
}
