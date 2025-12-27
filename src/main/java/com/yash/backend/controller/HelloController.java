package com.yash.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello world , Backend is working!";
    }

    @GetMapping("/test")
    public String test(){
        return "Testing the Second API";
    }
}
