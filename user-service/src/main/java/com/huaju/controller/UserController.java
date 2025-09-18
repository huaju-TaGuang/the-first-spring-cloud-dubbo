package com.huaju.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.annotation.Resource;

import com.huaju.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/userRegister")
    public long userRegister(){
        return userService.userRegister("", "", "");
    }
    
}
