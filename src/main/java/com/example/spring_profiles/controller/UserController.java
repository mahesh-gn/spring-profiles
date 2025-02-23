package com.example.spring_profiles.controller;

import com.example.spring_profiles.model.User;
import com.example.spring_profiles.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAllUsers")
    public List<User> findAllUsers(){
        return userService.getAllUsers();
    }
}
