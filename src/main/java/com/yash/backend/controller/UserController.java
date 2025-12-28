package com.yash.backend.controller;

import com.yash.backend.Service.UserService;
import com.yash.backend.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    //we used final to make object reference immutable & will not be assigned by other object and make it safe
    private final UserService userService;

    //constructor injection instead of Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveuser(user);
    }

    @GetMapping
    public List<User> getUser(){
        return userService.getAllUser();
    }


}
