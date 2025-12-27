package com.yash.backend.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getMessage(){
        return "Hello , this response is from service layer";
    }

    public String testMessage(){
        return "Testing from Service layer";
    }
}
