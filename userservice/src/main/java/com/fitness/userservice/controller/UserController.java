package com.fitness.userservice.controller;


import com.fitness.userservice.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class UserController {
    private UserService userService;
}
