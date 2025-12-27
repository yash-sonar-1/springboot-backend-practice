package com.yash.backend.controller;

import com.yash.backend.Service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    //we used final to make object reference immutable & will not be assigned by other object and make it safe
    private final HelloService helloService;

    //constructor injection instead of Autowired
    public HelloController(HelloService helloService){
        this.helloService=helloService;
    }

    @GetMapping("/hello")
    public String hello(){
        return helloService.getMessage();
    }

    @GetMapping("/test")
    public String test(){
        return helloService.testMessage();
    }
}
