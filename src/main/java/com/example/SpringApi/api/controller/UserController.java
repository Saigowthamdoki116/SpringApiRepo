package com.example.SpringApi.api.controller;

import com.example.SpringApi.api.model.User;
import com.example.SpringApi.entity.Entitis;
import com.example.SpringApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private  UserService userService;
    @GetMapping("/user")
    public Entitis getUser(@RequestParam Integer id){
        Entitis user = userService.getUser(id);
        return user;
    }
}
