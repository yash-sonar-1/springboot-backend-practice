package com.yash.backend.controller;

import com.yash.backend.Service.UserService;
import com.yash.backend.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id){
        return userService.getUserById(id)
                .orElseThrow(()->new RuntimeException("User Not Found By Given Id"));

    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}
